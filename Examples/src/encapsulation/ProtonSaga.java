package encapsulation;

public class ProtonSaga extends Proton {
	//fuel consumption
	String Fuel;
	private String radio;
	
	ProtonSaga() { 
		this.Fuel="Save Fuel Consumption";
	}
	public void Fuel() {
		System.out.println(Fuel);
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
		System.out.println("Proton Saga is Runnig!!");
	}
	
	void sum(int base, int standart) {
		System.out.println(base+standart);
	}
	void sum(int base, int premium, int luxury) {
		System.out.println(base+premium+luxury);
	}
}
