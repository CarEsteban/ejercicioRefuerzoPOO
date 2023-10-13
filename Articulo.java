public class Articulo extends Publicacion {

    String autor;


    public Articulo(int id, int cantidadEjemplares, String titulo, String materia, String autor) {
        super(id, cantidadEjemplares, titulo, materia);
        this.tipo = "Articulo";
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
    public void setEstado(boolean estado){ 
        this.estado = estado;
    }
    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString(){
        return super.toString() + "de autor: "+ autor + " y se encuentra " + getEstado();
    }



}
