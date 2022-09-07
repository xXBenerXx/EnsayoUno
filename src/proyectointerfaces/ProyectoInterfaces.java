
package proyectointerfaces;

public class ProyectoInterfaces {

    public static void main(String[] args) 
    {
        Humano humano = new Humano();
        //Asigno calor a la variable Cedula
        humano.setCedula("1234");
        //Implemento los metodos de la clase por medio del
        humano.comunicarse();
        humano.desplazarse();
        humano.estudiar();
        
        //Objeto clase Hombre
        Hombre hombre = new Hombre();
        hombre.setNombre("Juan");
        hombre.setCedula("567");
        hombre.cumpleaños();
        hombre.comunicarse();
    }
    
}
