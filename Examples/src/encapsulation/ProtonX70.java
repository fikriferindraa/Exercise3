package encapsulation;

public class ProtonX70 extends Proton {
	//auto drive
	String Drive;
	private String radio;
	
	ProtonX70() {
		this.Drive="Auto Driving";
	}
	
	public void Drive() {
		System.out.println(Drive);
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
		System.out.println("Proton X70 is Runnig!!");
	}
	
	void sum(int base, int standart) {
		System.out.println(base+standart);
	}
	void sum(int base, int premium, int luxury) {
		System.out.println(base+premium+luxury);
	}
}
