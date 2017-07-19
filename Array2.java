import java.util.Random;
public class Array2 {

	public static void main(String[] args) {
		new Random().ints(1,46)//1~45 사이의 정수 46포함안됨
					.distinct()//중복제거
					.limit(6)//6개만
					.sorted()//정렬
					.forEach(System.out::println);
	}//main 메소드 종료

}
