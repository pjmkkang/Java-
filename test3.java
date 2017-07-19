//5-4
public class test3 {
	 public static void main(String[] args) {
		
		 int[][] arr = {
					 { 5, 5, 5, 5, 5},
					 {10,10,10,10,10},
			  		 {20,20,20,20,20},
					 {30,30,30,30,30}
				 };
		 int total = 0;		 
		
		 int count =0;
		 
		 for(int i=0;i<arr.length;i++){
			 
			 count = count + arr[i].length;
			 
			 for(int j=0;j<arr[i].length;j++){  
				 total += arr[i][j];

			 }
		 }
		 
		 
		 System.out.println("count : " + count);
//		 String result = df.format(total/average);
		 
		 System.out.println("total : " + total);
		 System.out.println("average : " + (float)total/count);
	}
}
