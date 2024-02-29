public class Autor {
    String nombre;
    String apellido;
    public Autor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String mostrar(){
        return this.nombre+" "+this.apellido;
    }
    public Autor(){
        this.nombre = "";
        this.apellido = "";
    }
}
