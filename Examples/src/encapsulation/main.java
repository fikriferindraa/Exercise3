package encapsulation;

public class main 
{
	public static void main(String[] args) 
	{
		Proton obj1 = new Proton(); //contructor
		Proton obj2 = new Proton("Open","On","Down");
		Proton obj3 = new Proton("Clsoe", "Off","Up");
		
		System.out.println("Tyre Brand : "+obj1.Tyre+"\n"+"Size Tyre : "+obj1.TyreSize);
		System.out.println("Door : "+obj2.Door+"\n"+"Light : "+obj2.Light+"\n"+"Window : "+obj2.Window);
		System.out.println("Door : "+obj3.Door+"\n"+"Light : "+obj3.Light+"\n"+"Window : "+obj3.Window);
		
		ProtonX70 p1 = new ProtonX70();
		System.out.println("\n"+"Proton X70 Features :");
		p1.Drive();
		p1.setRadio("Sony"); //encapsulation
		p1.sum(35000, 15000); //overloading
		p1.sum(35000, 60000, 100000); //overloading
		p1.run(); //polymorphism
		System.out.println();
		
		ProtonX50 p2 = new ProtonX50();
		System.out.println("Proton X50 Features :");
		p2.Parking();
		p2.Drive();
		p2.setRadio("JBL"); //encapsulation
		p2.sum(25000, 15000); //overloading
		p2.sum(25000, 35000, 65000); //overloading
		p2.run(); //polymorphism
		System.out.println();
		
		ProtonSaga p3 = new ProtonSaga();
		System.out.println("Proton Saga Features : ");
		p3.Fuel();
		p3.setRadio("Apple"); //encapsulation
		p3.sum(20000, 15000); //overloading
		p3.sum(20000, 30000, 45000); //overloading
		p3.run(); //polymorphism
		System.out.println();
		
		ProtonPesona p4 = new ProtonPesona();
		System.out.println("Proton Pesona Features :");
		p4.boot();
		p4.setRadio("Samsung"); //encapsulation
		p4.sum(30000, 15000); //overloading
		p4.sum(30000, 30000,50000); //overloading
		p4.run(); //polymorphism
		System.out.println();
	}
}
