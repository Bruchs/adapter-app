package cl.curso.java.adapter.adapter_app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GuitarraElectrica nuevaElectrica = new GuitarraElectrica();
        nuevaElectrica.encender();
        nuevaElectrica.apagar();
        
        GuitarraAcustica nuevaAcustica = new GuitarraAcustica();
        GuitarraElectricaAcustica nuevaElectroAcustica = new GuitarraElectricaAcustica();
        nuevaElectroAcustica.setGuitarraAcustica(nuevaAcustica);
        
        nuevaElectroAcustica.encender();
        nuevaElectroAcustica.apagar();

        Musico nuevoMusico = new Musico();
        nuevoMusico.tocar(nuevaElectroAcustica);
    }
}
