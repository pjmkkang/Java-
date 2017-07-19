
public class Array5 {

	public static void main(String[] args) {
		int sum=0;
		double average = 0d;
		 
		int[] score={100, 88, 100, 100, 90};
		for(int i =0; i<score.length; i++){
			sum = score[i]+sum; //sum+=score[i];
			
		}
		average = sum /(double)score.length;
		System.out.println("ÃÑÁ¡: " +sum);
		System.out.println("Æò±Õ: " +average);
	}//main ¸Þ¼Òµå Á¾·á

}
