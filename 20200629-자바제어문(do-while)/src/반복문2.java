// do~while
// 사용자가 입력한 정수에 해당되는 구구단 

import java.util.*; // 키보드 입력값을 받아오는 기능 ==> Scanner
					// BufferedReader => 예외처리 필요

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수설정
		int user=0; // 사용자가 입력한 값 저장
		int i=9; //1~9까지 변경하는 변수 ==> 9번 수행
		
		Scanner scan=new Scanner(System.in);
		// 모든 클래스는 메모리에 저장할 때 new 이용
		// 예외 => Math.random() => static 메소드 : 시작과 동시에 메모리 자동 저장
		System.out.print("2~9까지 사이의 정수 입력:");
		// scanner => 공백, enter 일 때 값을 메모리에 저장
		user=scan.nextInt();
		// 사용자가 키보드로 입력한 정수를 읽어와서 'user' 공간에 저장
		do
		{   
			System.out.printf("%d * %d = %d\n",user,i,user*i);
			i--;
		}while(i>=1);
		
		
		
		

	}

}
