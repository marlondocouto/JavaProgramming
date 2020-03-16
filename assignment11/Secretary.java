
public class Secretary extends Employee{
	public void takeDication(String text) {
		System.out.println("Dictating Text: "+text);
	}
	public double getSalary() {
		return super.getSalary();
	}
}
