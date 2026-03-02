package relationship;

class Passport1 {
	String passportId;
	Passport1(String passportId){
		this.passportId = passportId;
	}

}
class Person{
	String name;
	Passport1 passport;
	Person(String name,Passport1 passport){
		this.name=name;
		this.passport=passport;
	}
	void show() {
		System.out.println(name+" "+passport.passportId);
	}
}
public class Passport{
	public static void main(String[] args) {
		Passport1 pass = new Passport1("INDIA1");
		Person person = new Person("Ayushi",pass);
		person.show();
	}
}