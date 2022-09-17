package package2;
import package1.DataType;
public class Calculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataType d = new DataType(14,0);
		d.setAddition();
		d.setSubtraction();
		d.setMultiplication();
		d.setDivision();
		
		System.out.println("addition is="+d.getAddition());
		System.out.println("Subtraction is="+d.getSubtraction());
		System.out.println("Multiplication is="+d.getMultiplication());
		System.out.println("Division is="+d.getDivision());
	}

}
