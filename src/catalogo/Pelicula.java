
package catalogo;

public class Pelicula extends Producto{
    //Atributos
    public int duracion;
    
    //Constructor
    public Pelicula(String nombre, String genero, int anio, double rating, int duracion){
        super( nombre, genero, anio, rating);
        this.duracion = duracion;
    }
    @Override
    public String toString(){
        String lista = "\tPelícula - nombre:" + this.nombre + "\n";
        lista += "\tgénero: " + this.genero + "\n";
        lista += "\taño: " + this.anio + "\n";
        lista += "\trating: " + this.rating + "\n";
        lista += "\tduración: " + this.duracion + "\n";
        return lista;
    }
}

