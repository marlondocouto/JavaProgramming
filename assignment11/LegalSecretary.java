
public class LegalSecretary extends Secretary{
	public double getSalary() {
		return super.getSalary()+5000;
	}
	public void fileLegalBriefs() {
		System.out.println("I could file all day!");
	}

}
