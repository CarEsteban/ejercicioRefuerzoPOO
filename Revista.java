public class Revista extends Publicacion {

    String anio, numero;

    public Revista(int id, int cantidadEjemplares, String titulo, String materia, String anio, String numero) {
        super(id, cantidadEjemplares, titulo, materia);
        this.tipo = "Revista";
        this.anio = anio;
        this.numero = numero;
    }

    public String getAnio() {
        return anio;
    }

    public String getNumero() {
        return numero;
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
    public void setEstado(boolean estado){ 
        this.estado = estado;
    }
    public String getTipo() {
        return tipo;
    }


    @Override
    public String getEstado() {        
        String estadoStr = estado ? "disponible" : "agotado";
        return estadoStr;
    }

    
    @Override
    public String toString(){
        return super.toString() + "del año: "+ anio + ", con numero: " +numero+  " y se encuentra " + getEstado();
    }
    
    
}
