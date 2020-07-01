/*
 *     20 10 40 50 30
 *     
 *     => DESC(내림차순)  50 40 30 20 10
 *     => ASC(올림차순)   10 20 30 40 50
 *     
 *     1. 선택정렬 ==> 왼쪽 고정  ==> 맨마지막까지 검색 
 *        20 10 40 50 30
 *        ==
 *           == 
 *        10 20
 *        ==    ==  
 *        10    40
 *        ==       ==
 *        10       50
 *        ==          ==
 *        10          30
 *        ====================== 1 round  4
 *        10 20 40 50 30
 *           == ==
 *           20 40
 *           ==    ==
 *           20    50
 *           ==       ==
 *           20       30
 *        ====================== 2 round  3
 *        10 20 40 50 30
 *              == ==
 *              40 50
 *              ==    ==
 *              30    40
 *        ====================== 3 round 2
 *        10 20 30 50 40
 *                 == ==
 *                 40 50
 *        ====================== 4 round 1
 *        10 20 30 40 50
 *                     ===> n ==> n-1
 *     2. 버블정렬 
 *        20 10 40 50 30
 *        == ==
 *        10 20
 *           == ==
 *           20 40
 *              == ==
 *              40 50
 *                 == ==
 *                 30 50
 *        ==================
 *        10 20 40 30 50
 *        == ==
 *        10 20
 *           == ==
 *           20 40
 *              == ==
 *              30 40
 *        ===================
 *        10 20 30 40 50
 *        == ==
 *        10 20
 *           == ==
 *           20 30
 *        ===================
 *        10 20 30 40 50
 *        == ==
 *        10 20
 *        ===================
 *        10 20 30 40 50
 *           
 */
public class 배열_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={30,10,40,20,50}; // ASC => DESC
        System.out.println("정렬전:");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println("\n정렬후:");
        /*
         *    20  30  10  40  50
         *    ==
         *    i=0  j=1
         *    20 30 10 40 50
         *       ==
         *       i=1 j=2
         *       
         *       라면 
         *        => 라면 / 달걀 
         */
        // 선택 정렬 
        /*
         *    int a=10;
         *    int b=20;
         *       
         *    a=b;  ==> a=20
         *      =>20
         *    b=a;  ==> b=20
         *    
         *    
         *    int temp=a;
         *    a=b;
         *     ==
         *     20  ==> a=20;
         *    b=temp;
         *      ====
         *       10 ==> b=10
         */
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}

}





