public class Libro extends Publicacion {
    String editorial, autor;

    public Libro(int id, int cantidadEjemplares, String titulo, String materia, String editorial, String autor) {
        super(id, cantidadEjemplares, titulo, materia);
        this.tipo = "Libro";
        this.editorial = editorial;
        this.autor = autor;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getMateria() {
        return materia;
    }

    @Override
    public String getEstado() {        
        String estadoStr = estado ? "disponible" : "agotado";
        return estadoStr;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }
    public void setEstado(boolean estado){ 
        this.estado = estado;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString(){
        return super.toString() + "de autor: "+ autor + ", de una editorial: " +editorial+  " y se encuentra " + getEstado();
    }
    
}
