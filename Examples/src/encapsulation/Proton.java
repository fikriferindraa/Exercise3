package encapsulation;

public class Proton {
	
	String Window, Door, Light,Tyre;
	int TyreSize;
	
	Proton() {
		this.Tyre="Dunlop";
		this.TyreSize=10;
	}
	
	Proton(String d,String l,String w) {
		this.Door=d;
		this.Light=l;
		this.Window=w;
	}

}
