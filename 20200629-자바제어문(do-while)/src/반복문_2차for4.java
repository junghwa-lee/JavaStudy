/*
 *     A
 *     AB
 *     ABC
 *     ABCD
 *     ABCDE
 *     ========== 변수 초기값의 위치
 *     ABCDE
 *     ABCD
 *     ABC
 *     AB
 *     A
 *     
 *     1####
 *     #2###
 *     ##3##
 *     ###4#
 *     ####5
 *     
 *     25 24 23 22 21
 *     20 19 18 17 16
 *     15 14 13 12 11
 *     10  9  8  7  6
 *     5   4  3  2  1
 *     
 *     
 *     
 */
public class 반복문_2차for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i=1;i<=5;i++)
		{
			c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		
		c='A';
		for(int i=1;i<=5;i++)
		{
			c='A';
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}

	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();
		}
		
		
		int a=25;   // 변수의 초기값 중요!
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%2d\t",a);
				a--;
			}
			System.out.println();
		}
		
		a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%2d\t",a);
				a++;
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		/*
		 *               줄수(i)  공백(j)  별표(k)
		 *    *****  		1		0		5
		 *     ****			2		1		4
		 *      ***			3		2		3
		 *       **			4		3		2
		 *        *			5		4		2
		 *        			i와 j의 관계
		 *        			j+1=i  ==> j=i-1
		 *        			i와 k의 관계
		 *        			i+k=6  ==> k=6-i
		 *        
		 *        *
		 *       **
		 *      ***
		 *     ****
		 *    *****
		 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
