package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작"); //1
		try 
		{
			System.out.println("정수 저장 int i=10;"); //2
			System.out.println("정수 저장 int j=0;"); //3
			System.out.println(10/0); //error => catch 이동
			System.out.println("결과값 출력:"+(10/0)); //제외
		}catch(Exception ex)
		{
			System.out.println("나누기 문제 발생(/zero)"); //4
		}
		finally
		{
			System.out.println("다시 입력하시오"); //5 => try, catch 상관 없이 무조건 수행하는 문장
		}
		System.out.println("프로그램 종료!!"); //6
		
		
		
		
		
		
	}

}
