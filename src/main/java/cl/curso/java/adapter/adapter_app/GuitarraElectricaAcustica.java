/**
 * 
 */
package cl.curso.java.adapter.adapter_app;

/**
 * @author matia
 *
 */
public class GuitarraElectricaAcustica implements Guitarra {
	
	private GuitarraAcustica guitarraAcustica;
	/**
	 * 
	 */
	public GuitarraElectricaAcustica() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.adapter_app.Guitarra#encender()
	 */

	public GuitarraAcustica getGuitarraAcustica() {
		return guitarraAcustica;
	}

	/**
	 * @param guitarraAcustica
	 */
	public GuitarraElectricaAcustica(GuitarraAcustica guitarraAcustica) {
		super();
		this.guitarraAcustica = guitarraAcustica;
	}

	public void setGuitarraAcustica(GuitarraAcustica guitarraAcustica) {
		this.guitarraAcustica = guitarraAcustica;
	}
	
	public void encender() {
		guitarraAcustica.tocar();
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.adapter_app.Guitarra#apagar()
	 */
	public void apagar() {
		guitarraAcustica.dejarDeTocar();
	}

}
