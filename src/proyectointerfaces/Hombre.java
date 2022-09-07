
package proyectointerfaces;

public class Hombre extends Humano
{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cumpleaños()
    {
        System.out.println("Hola soy "+nombre+" y cumplo el 29 de agosto");
    }
    
    
}
