//import java.util.*;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score = 0;
	char grade =' ', opt='0';
	System.out.println("점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		System.out.printf("당신의 점수는 %d입니다. %n", score);
		if(score>=90){ //score가 90점보다 크거나 같으면 A학점(grade)
			grade = 'A';
			if(score>=98) {//98점 이상은 A+
				opt = '+';
			}else if (score <94){ //90점 이상 94점 미만은 A-
				opt = '-';
			}
		}else if(score >=80){ //score가 80점보다 같거나 크면 B학점(grade)
			grade = 'B';
			if(score >=88){
				opt = '+';
			}else if(score <84){
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다. %n, grade, opt");
		
	} //main 의 끝

}
