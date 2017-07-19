
public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = new int[5];
		for(int i=0; i<5; i++){
			System.out.println(i);
		}
	int[] score1 = new int[0];  //길이가 0인 배열
	int[] score2 = new int[]{}; //길이가 0인 배열
	int[] score3 = {};          //길이가 0인 배열
	
	int[] iArr = {100, 95, 80, 70, 60};
		for(int i =0; i<iArr.length; i++){
		System.out.println(iArr[i]);
	}
	
	int[] iArr1 = {100, 95, 80, 70, 60, 86};
	
		for(int i=0; i<iArr1.length; i++){
			
			if(i == (iArr1.length-1)){
				System.out.print(iArr1[i]);
			}else{
				System.out.print(iArr1[i]+",");
			}
		}
	
	
	} //main 종료

}
