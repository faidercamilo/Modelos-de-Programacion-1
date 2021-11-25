package catalogo;

public class Serie extends Producto{
    //Atributos
    public int temporadas;
    
    //constructor

    public Serie(String nombre, String genero, int anio, double rating, int temporadas) {
        super(nombre, genero, anio, rating);
        this.temporadas = temporadas;
    } 
    @Override
    public String toString(){
        String lista = "\tSerie - nombre:" + this.nombre + "\n";
        lista += "\tgénero: " + this.genero + "\n";
        lista += "\taño: " + this.anio + "\n";
        lista += "\trating: " + this.rating + "\n";
        lista += "\ttemporadas: " + this.temporadas + "\n";
        return lista;
    }
}
