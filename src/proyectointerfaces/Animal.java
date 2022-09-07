
package proyectointerfaces;

public class Animal implements AccionesGrales
{
    private String raza;
    
    public String getRaza()
    {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void comunicarse() {
         System.out.println("Estoy haciendo sonido");
    }

    @Override
    public void desplazarse() {
         System.out.println("Estoy caminando en 4 patas");
    }
    
}
