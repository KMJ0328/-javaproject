
public class Test2 {

	public static void main(String[] args) {
		Car c1 = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		Ambulance am1 = new Ambulance();
		Ambulance am2 = null;
		
		
		
		fe1.water();
		c1=fe1; // FireEngine(자식) -> Car(조상), Upcasting (자동형변환) 
		// c1.water(); 는 error!
		
		fe2 = (FireEngine)c1; // Car(조상) -> FireEngine(자식) Downcasting (강제형변환)
		fe2.water();
		
		am1.siren();
		c1=am1;
		am2 = (Ambulance)c1;
		am2.siren();
	}

}
