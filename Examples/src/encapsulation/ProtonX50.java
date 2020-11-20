package encapsulation;

public class ProtonX50 extends ProtonX70{
	//auto parking
	String Parking;
	private String radio;
	
	ProtonX50() {
		this.Parking="Auto Parking";
	}
	public void Parking() {
		System.out.println(Parking);
	}
	
	//method setter
	public void setRadio(String newradio) {
		this.radio = newradio;
		System.out.println("Brand Radio : "+radio);
	}
		
	//method getter
	public String getRadio() { 
		return radio;
	}
	
	void run() { 
		System.out.println("Proton X50 is Runnig!!");
	}
	
	void sum(int base, int standart) {
		System.out.println(base+standart);
	}
	void sum(int base, int premium, int luxury) {
		System.out.println(base+premium+luxury);
	}
}
