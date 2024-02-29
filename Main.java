public class Main {
    public static void main(String[] args) {
        Libro [] libros = new Libro [3];
        int p;
        int e;
        String autor;
        String apellido;
        for(int i = 0; i<libros.length;i++){
            p = Leer.leerEntero("Introduce el número de páginas del libro número "+(i+1)+": ");
            e = Leer.leerEntero("Introduce el número de la edición del libro número "+(i+1)+": ");
            autor = Leer.leerTexto("Introduce el nombre del autor del libro número "+(i+1)+": ");
            apellido = Leer.leerTexto("Introduce el apellido del autor del libro número "+(i+1)+": ");
            Autor autorN = new Autor(autor,apellido);
            libros[i] = new Libro(p,e,autorN);
        }
        for(Libro l:libros){
            l.mostrar();
        }

    }
}