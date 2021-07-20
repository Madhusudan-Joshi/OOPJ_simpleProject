package Start;

class contactinfo{
	String phno;
	String email;
}
class values{
	void fieldvalues(contactinfo c,String p,String e) {
		c.phno=p;
		c.email=e;
	}
	void display(contactinfo c) {
		System.out.println("Thank you for reaching out!");
		System.out.println("This version of Siri is under development,You feedbacks and suggestions will be valuable.");
		System.out.println("Contact information:\n\nEMAIL:"+c.email+"\nPhone:"+c.phno);
	}
}
public class serviceContact {

	public static void main(String[] args) {
		contactinfo c=new contactinfo();
		values v=new values();
		v.fieldvalues(c, "+91 8277751052", "4ni19is044_b@nie.ac.in");
		v.display(c);
	}

}
