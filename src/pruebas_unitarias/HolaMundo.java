package pruebas_unitarias;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(suma(5,5));
		System.out.println(resta(5, 6));
	}

	public static long suma(long a, long b) {
		long res = a + b;
		return res;
	}
	
	public static long resta(long a, long b) {
		long res = a - b;
		return res;
	}
	
}