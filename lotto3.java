import java.util.Arrays;

public class lotto3 {

	public static void main(String[] args) {
		//45���� �������� �����ϱ� ���� �迭 ����.
	int[] ball = new int[45];
//	System.out.println(Arrays.toString(ball));
	
	//�迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
	for(int i=0; i<ball.length; i++){
		ball[i]=i+1; //ball[0]�� 1�� ����ȴ�.
//		System.out.println(Arrays.toString(ball));
	}
//	System.out.println(Arrays.toString(ball));
	
	int temp =0; //�� ���� �ٲٴµ� ����� �ӽú���
	int j= 0;    // ������ ���� �� ������ ����

	//�迭�� ����� ���� �� ���̵��� ����� ū �ݺ�Ƚ���� �����Ѵ�.
	//�迭�� ù��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
	
	for(int i=0; i<100; i++){
		j =(int)(Math.random() *45); //�迭���� (0~44)�� ������ ���� ��´�.
		temp = ball[0];
		ball[0]=ball[j];
		ball[j]=temp;
		System.out.println(Arrays.toString(ball));
		
	}//for i
	//�迭 ball�� �տ������� 6���� ��Ҹ� ����Ѵ�.
	for(int i=0; i<6; i++)
		System.out.println(ball[i]);
			
	
	}//main �޼ҵ� ����

}
