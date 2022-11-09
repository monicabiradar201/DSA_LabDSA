import java.util.Stack;

public class StackBracket {
	public static boolean CheckBracket(String input) {
		Stack <Character> Stack= new Stack<> ();
		char k;
		for(int i=0; i<input.length();i++) {
			k=input.charAt(i);
			if (k=='('|| k=='[' || k=='['|| k=='{') {
				Stack.push(k);
				continue;
			}
			if(Stack.isEmpty() )
				return false;
			char z;
			switch(k) 
			{
			case '}':
				z=Stack.pop();
				if(z=='['|| z=='(')
				{
					return false;
				}
					break;
				
			case ']':
				z=Stack.pop();
				if(z=='{'|| z=='(')
				{
					return false;
				}
					break;
			
			
				
			case ')':
							z=Stack.pop();
							if(z=='['|| z=='{')
							{
								return false;
							}
								break;
						
			}
		}
		return(Stack.isEmpty());
	}
		
				
			
			

			public static void main(String[] args) {
		String input="([[{}]])";
		boolean result=CheckBracket(input);
		if(result)
		{ 
			System.out.println("Valid Input");
		}
		else
			{
			System.out.println(" Not  A Valid Input");
			}
				
			}
			

			}




