
public class Array3 {

	public static void main(String[] args) {
		int[] score = new int[] {33, 88, 91, 79, 100, 55, 95}; //new int[] �� ���������ϴ�
		
		int max = score[0];
		int min = score[0];
		
	for(int i = 1; i<score.length; i++)
		if(score[i]>max){
			max = score[i];
		}else if(score[i]<min){
			min = score[i];
		} //end of for
	System.out.println("�ִ밪:" +max);
	System.out.println("�ּҰ�:"+min); 
	
	}//main �޼ҵ� ����

}
