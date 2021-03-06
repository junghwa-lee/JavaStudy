package com.sist.cgv;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager {
	static MovieVO[] movies=new MovieVO[7];
	static 
	{
		try
		{
			// <a href="/movies/detail-view/?midx=83160"> ==>attr
			// <a>aaaa</a> ==> text
			Document doc=Jsoup.connect("http://www.cgv.co.kr/movies/").get();
			Elements link=doc.select("div.box-contents a");
			int j=0;
			for(int i=0;i<7;i++)
			{
				movies[i]=new MovieVO();
				//System.out.println("http://www.cgv.co.kr"+link.get(j).attr("href"));
				Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get();
				Element title=doc2.selectFirst("div.title strong"); // doc2.select().get(0);
				Element poster=doc2.selectFirst("span.thumb-image img");
				Element grade=doc2.selectFirst("span.ico-grade");
				Element reserve=doc2.selectFirst("strong.percent span");
				
				//System.out.println(title.text());
				movies[i].setTitle(title.text());
				//System.out.println(poster.attr("src"));
				movies[i].setPoster(poster.attr("src"));
				//System.out.println(grade.text());
				movies[i].setGrade(grade.text());
				//System.out.println(reserve.text());
				movies[i].setReserve(reserve.text());
				movies[i].setMno(i+1);
				
				Element director=doc2.select("div.spec dd").get(0);
				//System.out.println(director.text());
				movies[i].setDirector(director.text());
				
				Element actor=doc2.select("div.spec dd").get(2);
				//System.out.println(actor.text());
				movies[i].setActor(actor.text());
				
				Element etc=doc2.select("div.spec dd").get(4); // etc :grade[0]+time[1]+from[2]
				//System.out.println(etc.text());
				// 12세 이상, 092분, 일본 
				String[] temp=etc.text().split(",");
				movies[i].setTime(temp[1].trim());
				movies[i].setFrom(temp[2].trim());
				
				Element regdate=doc2.select("div.spec dd").get(5);
				//System.out.println(regdate.text());
				movies[i].setRegdate(regdate.text());
				
				if(i==0)
				{
					Element genre=doc2.select("div.spec dt").get(3);
					//System.out.println(genre.text());
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1)); //장르 : 액션, 드라마  => 액션,드라마
				}
				else
				{
					Element genre=doc2.select("div.spec dt").get(2);
					//System.out.println(genre.text());
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1)); 
				}
				
				Element story=doc2.selectFirst("div.sect-story-movie");
				movies[i].setStory(story.text());
						
				
				j+=2; // a 클래스가 겹치기 때문에 필요한부분만 가져옴 (0,2,4.. 번째 값)
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		MovieManager m=new MovieManager();
		for(MovieVO vo:movies)
		{
			System.out.println("============================");
			System.out.println("영화번호:"+vo.getMno());
			System.out.println("제목:"+vo.getTitle());
			System.out.println("감독:"+vo.getDirector());
			System.out.println("출연:"+vo.getActor());
			System.out.println("장르:"+vo.getGenre());
			System.out.println("등급:"+vo.getGrade());
			System.out.println("상영시간:"+vo.getTime());
			System.out.println("국가:"+vo.getFrom());
			System.out.println("상영일:"+vo.getRegdate());
			System.out.println("예매율:"+vo.getReserve());
			System.out.println("줄거리:"+vo.getStory());
		}
	}
}
