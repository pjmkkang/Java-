//import java.util.*;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score = 0;
	char grade =' ', opt='0';
	System.out.println("������ �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		System.out.printf("����� ������ %d�Դϴ�. %n", score);
		if(score>=90){ //score�� 90������ ũ�ų� ������ A����(grade)
			grade = 'A';
			if(score>=98) {//98�� �̻��� A+
				opt = '+';
			}else if (score <94){ //90�� �̻� 94�� �̸��� A-
				opt = '-';
			}
		}else if(score >=80){ //score�� 80������ ���ų� ũ�� B����(grade)
			grade = 'B';
			if(score >=88){
				opt = '+';
			}else if(score <84){
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�. %n, grade, opt");
		
	} //main �� ��

}
