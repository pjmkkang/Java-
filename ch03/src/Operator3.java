
 class Operator3 {

	public static void main(String[] args) {
		
		
		//�Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�. ����
		//����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ���
		//�� �ʿ��� ���̴�. (1)�� �˸��� �ڵ带 �����ÿ�.
		
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		
		int numOfBucket =
		numOfApples/sizeOfBucket + (/* (1) */numOfApples%sizeOfBucket > 0 ? 1 : 0) ;
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		
		int num = 24;
		System.out.println(30- num%30);
		
	}

}
 