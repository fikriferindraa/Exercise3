package encapsulation;

public class ProtonPesona extends Proton{
	//spacing bonnet
	String boot;
	private String radio;
	
	ProtonPesona() {
		this.boot = "Big Boot";
	}
	public void boot() { 
		System.out.println(boot);
	}
	void run() { 
		System.out.println("Proton Pesona is Runnig!!");
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
	
	void sum(int base, int standart) {
		System.out.println(base+standart);
	}
	
	void sum(int base, int premium, int executive) {
		System.out.println(base+premium+executive);
	}
}
