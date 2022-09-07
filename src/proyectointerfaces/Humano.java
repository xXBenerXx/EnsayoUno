
package proyectointerfaces;

public class Humano implements AccionesGrales
{
    private String cedula;
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula)
    {
        this.cedula=cedula;
    }
    public void estudiar()
    {
        System.out.println("Estoy estudiando desde la clase  ");
    }

    @Override
    public void comunicarse() {
        System.out.println("Hola mi cedula es "+cedula+" y me estoy comunicando");
    }

    @Override
    public void desplazarse() {
        System.out.println("Estoy caminando");
    }
            
}
