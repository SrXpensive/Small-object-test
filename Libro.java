public class Libro {
    int paginas;
    int edicion;
    Autor autor = new Autor();
    public Libro(int paginas, int edicion, Autor autor){
       this.paginas = paginas;
       this.edicion = edicion;
       this.autor = autor;
    }
    public void mostrar(){
        System.out.println("Número de páginas: "+this.paginas);
        System.out.println("Edición: "+edicion);
        System.out.println("Autor: "+this.autor.mostrar());
    }
}
