
public class for01 {

	public static void main(String[] args) {
	//1부터 10까지의 정수 더하기
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum+=i;  // sum = sum+i;
			
		}
		System.out.println(sum);
		
		  //for문을 이용해서 1부터 100까지 숫자 중 짝수만 출력해 보세요
		   for(int i =2; i<=100; i+=2){
		     System.out.println(i);
		    }
		   
		   
		   for (int i=1; i<=3; i++)
			   for(int j=1; j<=3; j++)
				   for(int k=1; k<=3; k++)
					   System.out.println(""+i+j+k);
		   
		   //while문을 for문으로 바꿨을때
		   int i=10;
		   while(i>=0){
			   System.out.println(i--);
		   }
		   
		   for(int i1=10; i1>=0; i1--){
			   System.out.println(i1);
			  
			  
		   }
	}

}
