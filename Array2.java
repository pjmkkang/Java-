import java.util.Random;
public class Array2 {

	public static void main(String[] args) {
		new Random().ints(1,46)//1~45 ������ ���� 46���Ծȵ�
					.distinct()//�ߺ�����
					.limit(6)//6����
					.sorted()//����
					.forEach(System.out::println);
	}//main �޼ҵ� ����

}
