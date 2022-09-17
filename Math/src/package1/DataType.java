package package1;

public class DataType {
	private double num1;
	private double num2;
	private double Addition;
	private double Subtraction;
	private double Multiplication;
	private double Division;
	
	public DataType(double n1,double n2) {
		this.num1=n1;
		this.num2=n2;
	}

	public double getAddition() {
		return Addition;
	}

	public void setAddition() {
		this.Addition = this.num1+this.num2;
	}

	public double getSubtraction() {
		return Subtraction;
	}

	public void setSubtraction() {
		this.Subtraction = this.num1-this.num2;
	}

	public double getMultiplication() {
		return Multiplication;
	}

	public void setMultiplication() {
		this.Multiplication = this.num1*this.num2;
	}

	public double getDivision() {
		return Division;
	}

	public void setDivision() {
		if(num2==0) {
			this.Division=0;
		}
		else
		{
			this.Division=this.num1/this.num2;
		}
	}
	
}
