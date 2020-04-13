package HelloWorld;

public class DynInit {

	public static void main(String[] args) {
		
		double a = 3.0, b=4.0;
		
		//declare c, uses method sqrt() of Math class
		double c = Math.sqrt(a*a+b*b);
		
		System.out.println("Hypotenuse is "+c);
	}

}
