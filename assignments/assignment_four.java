
public class assignment_four {
	//Assignment Four
	//By: Marlon Do Couto
	//Feb 3, 2016

	public static void main(String[] args) {
		// Method name: MAIN
		//Testing the method:
		System.out.println(repl("Hello",3));
		//Testing for int=0 to print empty string:
		System.out.println(repl("Simon",0));
		System.out.println(repl("Marlon",4));
		
	}
	//Method name: REPL
	//It takes a string and it prints it as many times as int times
	
	public static String repl(String word, int times) {
		String concatenation = "";
		if (times<=0) { //it returns the empty string:
			return concatenation;
			}
		else {
			for (int i=1; i<=times;i++) { 
				//it adds the word as many times as int times:
				concatenation = concatenation + word;
			}
			//returns the new concatenated String concatenation:
			return concatenation;
		}
		}
	}
		
		