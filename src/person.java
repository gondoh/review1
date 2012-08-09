
class Person {

	public String uji = "氏";
	public String na = "名";

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void showName() {
		System.out.println(this.uji + "：" + this.lastName + " " + this.na + "：" + this.firstName);
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setLastName("渡辺");
		person1.setFirstName("高志");
		person1.showName();

		Person person2 = new Person();
		person2.setLastName("和田");
		person2.setFirstName("充史");
		person2.showName();

	}

}