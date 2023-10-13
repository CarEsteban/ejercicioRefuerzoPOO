public abstract class Publicacion {
    protected int id, cantidadEjemplares;
    protected String titulo, materia, tipo;
    protected boolean estado; //disponible:true ; agotado:false
    
    public Publicacion(int id, int cantidadEjemplares, String titulo, String materia) {
        this.id = id;
        this.cantidadEjemplares = cantidadEjemplares;
        this.titulo = titulo;
        this.materia = materia;
        this.estado = true;
    }

    public abstract int getId();

    public abstract int getCantidadEjemplares();

    public abstract String getTitulo() ;

    public abstract String getMateria();

    public abstract String getEstado();

    public abstract void setEstado(boolean estado);

    public abstract String getTipo();

    @Override
    public String toString() {
        return tipo + ", con el ID: " + id + ", es de una materia: " + materia + ", tiene una cantidad de ejemplares de: " + cantidadEjemplares ;
    }
    



}
