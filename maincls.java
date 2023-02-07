package abstraction;

public class maincls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l= new Login();
		l.printLoginUsername();
		l.printLoginPassword();
		
		System.out.println("       ");
		
		  Loginabstract L= new Login();
		  L.printLoginUsername(); 
		  L.printLoginPassword();
		   
		 System.out.println("       ");
		 
		  LoginInterface L1= new LoginInterface();
			L1.printLoginUsername();
			L1.printLoginPassword();
			 }

}
