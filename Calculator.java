import java.util.*;
//include all the require methods in the interface 
interface Operations{
	//place the operational details hide the implementation
	//a is number1 b is number 2
  int add(int a,int b);
  int subtract(int a,int b);
  int multiply(int a,int b);
  int division(int a,int b);
}
//implement this interface with a class
class OperationImplementor implements Operations{
	//write Business logic here 
	public int add(int a,int b){
		return(a+b);
	}
	public int subtract(int a,int b){
		return(a-b);
	}
 public int multiply(int a,int b){
		return(a*b);
	}
	public int division(int a,int b){
		return(a/b);
	}
}
public class Calculator{
	//presentation logic here 
	Operations operation;
	
	Calculator(Operations operation)
	{
		this.operation=operation;
		//with this we will achieve loose coupling
		
	
	}
	void performAddition(int a,int b){
		System.out.println("result:"+operation.add(a,b));
	}
	void performMultiplication(int a,int b){
		System.out.println("result:"+operation.multiply(a,b));
	}
	void performSubtraction(int a,int b){
		System.out.println("result:"+operation.subtract(a,b));
	}
	void performDivision(int a,int b){
		System.out.println("result:"+operation.division(a,b));
		
	}
	public static void main(String args[]){
		Calculator calculator=new Calculator(new OperationImplementor());
		//presentation logic
		int a;//number 1
		
		int b;//number 2
		Scanner sc=new Scanner(System.in);
		//read two numbers
		int choice;
		while(true){
		System.out.println("Enter First number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		System.out.println(".................................");
		
		System.out.println("Enter 1 to perform addition");
		System.out.println("Enter 2 to perform subtraction");
		System.out.println("Enter 3 to perform multiplication");
		System.out.println("Enter 4 to perform division");
		System.out.println("Enter 5 to exit");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		if(choice==1){
			calculator.performAddition(a,b);
		}
		else if(choice==2){
			calculator.performSubtraction(a,b);
		}
		else if(choice==3){
			calculator.performMultiplication(a,b);
		}
		else if(choice==4){
			calculator.performDivision(a,b);
		}
		else
			break;
		}
		
			
		
		}
}

		
	
		
	
			
		
		