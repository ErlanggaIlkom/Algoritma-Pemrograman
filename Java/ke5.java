package Java;

public class ke5 {
    static int plusMethodeInt(double d, double e){
	    return (int) (d + e); 
	}
	
	public static void main(String[]args){
	    int myNum1 = plusMethodeInt(8, 5);
	    double myNum2 = plusMethodeInt(4.3, 6.26);
	    System.out.println("int: " + myNum1);
	    System.out.println("int: " + myNum2);
    }
}
