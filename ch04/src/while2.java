
public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//for문에 Loop1이라는 이름을 붙엿다.
		Loop: for(int i=2; i<=9; i++){
			for (int j=1; j<=9; j++){
				if(j==5)
					break Loop;
				System.out.println(i+"*"+j+"="+i*j);
			
			} // end of for i
		System.out.println();
		}//end of Loop1
		
	}
 
}
