package one.digitalinnovation.gof.singleton;
/**
 * Singleton "apreçado".
 * @author Edison Lemes dos Santos
 *
 */

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	public static SingletonEager getInstancia(){
		return instancia;
		
	}
	
}
