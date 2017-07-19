import java.util.Arrays;

public class lotto {

	public static void main(String[] args) {
		int[] ball = new int[6];  //배열생성
		
		for(int i=0; i<ball.length; i++){
			ball[i]=(int)((Math.random()*45)+1);
			System.out.println(ball[i]);
			for(int j=0; j<i; j++){
				if(ball[i]==ball[j]){
					i--;
					break;
				}//if
			}//for j
			
		}//for i
		
		System.out.println(Arrays.toString(ball));
		
	}//main 메소드 종료

}
