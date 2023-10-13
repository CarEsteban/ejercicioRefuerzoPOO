import java.util.ArrayList;

public class Cliente {
    int ID, cantidadPrestamosR, cantidadPrestamosL, cantidadPrestamosA;
    String nombre, direccion, fechaSolicitud, fechaDevolucion;
    ArrayList<Publicacion> prestamos;
    
    public Cliente(int iD, String nombre, String direccion) {
        ID = iD;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public boolean solicitarPrestamo(Publicacion publicacion, String fechaSolicitud, String fechaDevolucion){
        if(prestamos.size()<5){
            publicacion.setEstado(false);
            this.fechaDevolucion = fechaDevolucion;
            this.fechaSolicitud = fechaSolicitud;
            prestamos.add(publicacion);
            return true;
        }else{
            return false;
        }

    }

    public boolean devolverEjemplar(Publicacion publicacion){
        publicacion.setEstado(true);


        if(prestamos.size()>0){
            for (int i = 0; i < prestamos.size(); i++) {
                if (prestamos.get(i).getTitulo().equals(publicacion.getTitulo())) {
                    prestamos.remove(i);
                    i--; 
                }
            }
            return true;
        }else{
            return true;
        }


    }

    public int getID() {
        return ID;
    }

    public int getCantidadPrestamos(){
        return prestamos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }


    @Override
    public String toString() {
        for(int i=0; i<prestamos.size();i++){
            if(prestamos.get(i).getTipo().equals("Libro")){
                cantidadPrestamosL+=1;
            }else if(prestamos.get(i).getTipo().equals("Revista")){
                cantidadPrestamosR+=1;
            }else if(prestamos.get(i).getTipo().equals("Articulo")){
                cantidadPrestamosA+=1;
            }
        }
        return "---------------------------------------------------------\n"+"Cliente " + nombre + ", en la direccion " + direccion + " se identifica con el ID: " + ID + "\nTiene una cantidad de prestamos de: " + prestamos.size() + ", en la que se desglosa:\n\tArticulos: " + cantidadPrestamosA + "\n\tRevistas: " + cantidadPrestamosR + "\n\tLibros: " + cantidadPrestamosL+"\n---------------------------------------------------------";
    }
}
