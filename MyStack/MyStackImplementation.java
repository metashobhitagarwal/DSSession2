package MyStack;

import java.util.Scanner;

/**
 * This class implements the stack operations
 * and interacts with the user
 * @author shobhit agarwal
 */
public class MyStackImplementation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);   
		MyStack<Integer> stack = new MyStack<Integer>();  
        char ch; 
        try{
        	do 
	        {
	            System.out.println("Implementations of Stack Operations!!!");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Check Empty");
	            System.out.println("5. Size");    
	            System.out.println("6. Convert Infix to Postfix");
	            System.out.println("7. Display Stack");
	            System.out.println("Enter your choice : ");
	            int userChoice = scan.nextInt();
	            switch (userChoice) {
	            case 1 :
	                System.out.println("Enter integer element to push : ");
	                stack.push(scan.nextInt()); 
	                break;                         
	            case 2 : 
	            	System.out.println("Popped Element : " + stack.pop());   
	                break;                         
	            case 3 : 
	                System.out.println("Peek Element : " + stack.peek());
	                break;                         
	            case 4 : 
	                System.out.println("Empty status : " + stack.isEmpty());
	                break;                
	            case 5 : 
	                System.out.println("Size : " + stack.size()); 
	                break;                
	            case 6 : 
	                System.out.println("Enter infix operation : ");
	                System.out.println("Postfix string : " + new InToPost().getPostfix(scan.next()));
	                break;  
	            case 7:
	            	System.out.println("Stack is : ");
	            	stack.display();
	            	break;
	            default: 
	                System.out.println("Wrong Entry");
	                break;
	            }        
	            /* display stack */    
	            stack.display();            
	            System.out.println("Do you want to continue (Type y or n) : ");
	            ch = scan.next().charAt(0);       
	        } while (ch == 'Y'|| ch == 'y');          
        }
        catch(Exception e){
        	e.getMessage();
        	main(args);
        }
        scan.close();
	}
}