import java.util.Arrays;

public class lotto2 {

	public static void main(String[] args) {
		 // 45���� �������� �����ϱ� ���� �迭 ����.
		  int [] ball = new int[45];// �迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.	  
		  for (int i=0; i < ball.length ;i++ ) 
		   ball[i] = i+1;	
//		  System.out.println(Arrays.toString(ball));
		  int temp = 0; //�� ���� �ٲٴµ� ����� �ӽú���
		  int j = 0;    // ������ ���� �� ������ ����
		  // �迭�� i ��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		  for(int i=0; i <6; i++){ 
	
		   j = (int)(Math.random() * 45);
		   temp = ball[i];
		   ball[i] = ball[j];
		   ball[j] = temp;
		   System.out.println(Arrays.toString(ball));
		  }
		  // �迭 ball�� �տ������� 6���� ��Ҹ� ����Ѵ�.
		  for(int i=0; i < 6; i++)

		   System.out.println(ball[i]);

			
	}//main �޼ҵ� ����

}
