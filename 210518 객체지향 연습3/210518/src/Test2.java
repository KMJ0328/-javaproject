
public class Test2 {

	public static void main(String[] args) {
		Car c1 = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		Ambulance am1 = new Ambulance();
		Ambulance am2 = null;
		
		
		
		fe1.water();
		c1=fe1; // FireEngine(�ڽ�) -> Car(����), Upcasting (�ڵ�����ȯ) 
		// c1.water(); �� error!
		
		fe2 = (FireEngine)c1; // Car(����) -> FireEngine(�ڽ�) Downcasting (��������ȯ)
		fe2.water();
		
		am1.siren();
		c1=am1;
		am2 = (Ambulance)c1;
		am2.siren();
	}

}
