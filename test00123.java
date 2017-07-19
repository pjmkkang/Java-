
public class test00123 {
	public static void main(String[] args) {
	
		
		
		int [] a = new int[20];
		
		try {
			
			System.out.println(a[20]);
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("해결");
		} finally {
			System.out.println("무조건");
		}
		
		
	}
}
