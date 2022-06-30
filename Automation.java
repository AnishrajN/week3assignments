package week3.day1;

public class Automation extends MultipleLanguage implements TestTool {

	@Override
	public void selenium() {      //un-implimented methods from Interface is overridden in this Class
		System.out.println("Iam Selenium from Execution Class");
	}

	@Override
	public void ruby() {          //un-implimented methods from Abstract Class is overridden in this Class 
		System.out.println("Iam Ruby From Abstract Class");	
	}
	public static void main(String[] args) {
		Automation call = new Automation();
		call.selenium();
		call.ruby();
		call.python();
	}
	
	
	

}
