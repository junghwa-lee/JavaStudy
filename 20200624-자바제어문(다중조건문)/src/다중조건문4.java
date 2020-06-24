/*
 *   사용자 => 정수입력 (1~12)
 *   12,1,2 => 겨울입니다
 *   3,4,5  => 봄입니다
 *   6,7,8  => 여름입니다
 *   9,10,11=> 가을입니다
 *   
 *   
 *   ========================
 *   문자 => ch=scan.next().charAt(0);
 *   문자를 입력 받아서 char ch
 *     = 숫자  ch>='0' && ch<='9'
 *     = 알파벳 ch>='A' && ch<='Z' || ch>='a' && ch<='z'
 *     = 한글 ch>='가' && ch<='힣'
 *     = 특수문자  else
 *     
 *   
 */
import java.util.*;
public class 다중조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("월을 입력하세요:");
		month=scan.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println("겨울입니다");
		}
		else if(month==3 || month==4 || month==5) {
			System.out.println("봄입니다");
		}
		else if(month==6 || month==7 || month==8) {
			System.out.println("여름입니다");
		}
		else if(month==9 || month==10 || month==11) {
			System.out.println("가을입니다");
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
		*/
		
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.print("문자를 입력하세요:");
		ch=scan.next().charAt(0);
		
		if(ch>='0' && ch<='9') {
			System.out.println("숫자");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println("알파벳");
		}
		else if(ch>='가' && ch<='힣') {
			System.out.println("한글");
		}
		else {
			System.out.println("특수문자");
		}
			
	}

}
