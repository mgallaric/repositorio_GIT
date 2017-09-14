package ejercicio3;

public class Cliente {

    private String nombre;
    private String nif;
    private String direccion;

    private Cliente() {
    }

    public static Cliente crearInstancias(){
        return new Cliente();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre123   =" + nombre + "nif222=" + nif + "direccionrewrwerwerew=" + direccion + '}';
    }

}
