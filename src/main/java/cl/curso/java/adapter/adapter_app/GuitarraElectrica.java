/**
 * 
 */
package cl.curso.java.adapter.adapter_app;

/**
 * @author matia
 *
 */
public class GuitarraElectrica implements Guitarra {

	/**
	 * 
	 */
	public GuitarraElectrica() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.adapter_app.Guitarra#encender()
	 */
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendida");
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.adapter_app.Guitarra#apagar()
	 */
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagada");
	}

}
