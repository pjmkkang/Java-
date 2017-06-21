import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		String input;
		String str = "";
		
		input =scanner.nextLine();
		num1 = Integer.parseInt(input);
		System.out.println(num1);
		
		str = scanner.nextLine();
		System.out.println(str);
		
		input =scanner.nextLine();
		num2 = Integer.parseInt(input);
		System.out.println(num2);
		
		
		int aaa = 0;
		
		if(str.equals("+")){
			
			aaa = cal.sum(num1, num2);
			
		}
		else if(str.equals("-")){
			
			aaa= cal.minus(num1, num2);
			
		}else if (str.equals("*")){
			aaa= cal.multi(num1, num2);
			
		}else if(str.equals("/")){
			aaa= cal.div(num1, num2);
		}
		else{
			
		}
		
		
		System.out.println(aaa);
		
//		Calculator cal = new Calculator();
//		
//		 int  asd =  cal.sum(num1, num2);	
//		 
//		 System.out.println(asd);
		 

		 scanner.close();
		 
		 
		 
	}
	
	
	
	
}//end
