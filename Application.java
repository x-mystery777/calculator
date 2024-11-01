 public class Application{
  public static void main(String... args){
  	calculator cal = new calculator();

	System.out.println(cal.addition(5,6));
	// should be 11
	
	System.out.println(cal.addition(6,3.5));
	// should be 9.5
	
	System.out.println(cal.subtraction(5.5,3.5));
	// should be 2.0
	

  }
 }
