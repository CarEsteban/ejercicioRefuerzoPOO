import java.util.ArrayList;
import java.util.Scanner;

//@autor Esteban Cárcamo

public class Biblioteca{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, opcMenu, cantidad,num=0;
        boolean continuar=true,decision,continuarSubMenu=true;
        ArrayList<String> nombresPublicaciones = new ArrayList<String>();
        ArrayList<String> materias = new ArrayList<String>();
        nombresPublicaciones.add("Libro");
        nombresPublicaciones.add("Revista");
        nombresPublicaciones.add("Articulo");
        materias.add("Romance");
        materias.add("Ciencia");
        materias.add("Ficcion");
        ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
        
        while (continuar) {
            System.out.println("--------------MENÚ DE LA BIBLIOTECA--------------:");
            System.out.println("1) Ingresar nuevos documentos");
            System.out.println("2) Solicitar o devolver una publicacion");
            System.out.println("3) Calcular la cantidad de documentos de una materia");
            System.out.println("4) Determinar la cantidad de revistas de una materia");
            System.out.println("5) Mostrar la información de todos los libros");
            System.out.println("6) Salir");
            System.out.println("Por favor, seleccione una opción: ");
            System.out.println("--------------------------------------------------");

            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        System.out.println("INGRESAR ALGUNA PUBLICACION");
                        System.out.println("Ingrese el numero de la publicacion que desea agregar:");
                        for(int i=0; i<nombresPublicaciones.size(); i++){
                            System.out.println((i+1)+") " + nombresPublicaciones.get(i));
                        }

                        try {
                            opcMenu =  Integer.parseInt(scanner.nextLine());
                            switch(opcMenu){
                                case 1:
                                    
                                    while (true) {
                                        System.out.print("Ingrese el ID del libro (6 dígitos): ");
                                        int id = scanner.nextInt();
                            
                                        System.out.print("Ingrese la cantidad de ejemplares: ");
                                        int cantidadEjemplares = scanner.nextInt();
                                        scanner.nextLine();
                            
                                        System.out.print("Ingrese el título del libro: ");
                                        String titulo = scanner.nextLine();
                                        for(int i=0; i<materias.size(); i++){
                                            System.out.println(materias.get(i));
                                        }
                                        System.out.print("Ingrese la materia del libro: ");
                                        String materia = scanner.nextLine();
                            
                                        System.out.print("Ingrese la editorial del libro: ");
                                        String editorial = scanner.nextLine();
                            
                                        System.out.print("Ingrese el autor del libro: ");
                                        String autor = scanner.nextLine();
                            
                                        Publicacion l = new Libro(id, cantidadEjemplares, titulo, materia, editorial, autor);
                                        publicaciones.add(l);
                            
                                        System.out.print("¿Quieres agregar otro libro? (Sí: 1, No: 0): ");
                                        if (scanner.nextInt() == 0) {
                                            break;
                                        }
                                    }
                                    

                                    break;
                                case 2:
                                    while (true) {
                                        System.out.print("Ingrese el ID de la Revista (6 dígitos): ");
                                        int id = scanner.nextInt();
                            
                                        System.out.print("Ingrese la cantidad de ejemplares: ");
                                        int cantidadEjemplares = scanner.nextInt();
                                        scanner.nextLine();
                            
                                        System.out.print("Ingrese el título de la revista: ");
                                        String titulo = scanner.nextLine();
                                        for(int i=0; i<materias.size(); i++){
                                            System.out.println(materias.get(i));
                                        }
                                        System.out.print("Ingrese la materia  de la revista: ");
                                        String materia = scanner.nextLine();
                            
                                        System.out.print("Ingrese el año de la revista: ");
                                        String anio = scanner.nextLine();
                            
                                        System.out.print("Ingrese el numero de la revista: ");
                                        String numero = scanner.nextLine();
                            
                                        Publicacion r = new Revista(id, cantidadEjemplares, titulo, materia, anio, numero);
                                        publicaciones.add(r);
                            
                                        System.out.print("¿Quieres agregar otra Revista? (Sí: 1, No: 0): ");
                                        if (scanner.nextInt() == 0) {
                                            break;
                                        }
                                    }
                                    
                                    break;
                                case 3:
                                    while (true) {
                                        System.out.print("Ingrese el ID del Articulo (6 dígitos): ");
                                        int id = scanner.nextInt();
                            
                                        System.out.print("Ingrese la cantidad de ejemplares: ");
                                        int cantidadEjemplares = scanner.nextInt();
                                        scanner.nextLine();
                            
                                        System.out.print("Ingrese el título del Articulo: ");
                                        String titulo = scanner.nextLine();
                                        for(int i=0; i<materias.size(); i++){
                                            System.out.println(materias.get(i));
                                        }
                                        System.out.print("Ingrese la materia del Articulo: ");
                                        String materia = scanner.nextLine();
                            
                                        System.out.print("Ingrese el autor del Articulo: ");
                                        String autor = scanner.nextLine();
                            
                                        Publicacion a = new Articulo(id, cantidadEjemplares, titulo, materia, autor);
                                        publicaciones.add(a);
                            
                                        System.out.print("¿Quieres agregar otro Articulo? (Sí: 1, No: 0): ");
                                        if (scanner.nextInt() == 0) {
                                            break;
                                        }
                                    }
                                    

                                    break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Opción no válida. Por favor, ingrese un número válido.");
                        }


                        continuar = volverAlMenu(scanner);
                        break;
                    case 2:
                        System.out.println("SOLICITUD O DEVOLUCACIÓN DE PUBLICACION POR ID");

                        continuarSubMenu=true;
                        while(continuarSubMenu){
                            num+=1;
                            System.out.println("Creacion del usuario "+num);

                            System.out.println("ID numero : " + num);

                            System.out.println("Ingrese el nombre: ");
                            String nombre = scanner.nextLine();

                            System.out.println("Ingrese la dirección: ");
                            String direccion = scanner.nextLine();

                            Cliente cl = new Cliente(num, nombre, direccion);

                            
                            System.out.println("BIENVENIDO " + cl.getNombre());

                            System.out.println("1) Solicitar un ejemplar");
                            System.out.println("2) Devolver un ejemplar");
                            System.out.print("Por favor, seleccione una opción: ");


                            opcMenu = scanner.nextInt();
                            scanner.nextLine();
                
                            switch (opcMenu) {
                                case 1:
                                    System.out.println("Ingrese el ID EXACTO del ejemplar que desea solicitar: ");
                                    int idSolicitud = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.println("Ingrese la fecha de solicitud del ejemplar: ");
                                    String fechaSolicitud = scanner.nextLine();

                                    System.out.println("Ingrese la fecha a devolver del ejemplar: ");
                                    String fechaDevolucion = scanner.nextLine();



                                    for(int i=0; i<publicaciones.size(); i++){
                                        if(publicaciones.get(i).getId() == idSolicitud){
                                            Publicacion pubi = publicaciones.get(i);
                                            decision = cl.solicitarPrestamo(pubi, fechaSolicitud, fechaDevolucion);
                                            System.out.println(decision);
                                            if(decision){
                                                System.out.println(cl.getNombre()+", el libro " + publicaciones.get(i).getTitulo() + " ahora ya se encuentra " + publicaciones.get(i).getEstado());
                                            }
                                            break;
                                        }
                                    }

                                    break;
                                case 2:
                                
                                    System.out.println("Ingrese el ID EXACTO del ejemplar que desea devolver: ");
                                    int idDevolucion = scanner.nextInt();
                                    scanner.nextLine();


                                    for(int i=0; i<publicaciones.size(); i++){
                                        if(publicaciones.get(i).getId() == idDevolucion){
                                            Publicacion pubi = publicaciones.get(i);
                                            decision = cl.devolverEjemplar(pubi);
                                            System.out.println(decision);
                                            if(decision){
                                                System.out.println(cl.getNombre()+", el libro " + publicaciones.get(i).getTitulo() + " ahora ya se encuentra " + publicaciones.get(i).getEstado());
                                            }
                                            break;
                                        }
                                    }
                                
                                    break;
                            }

                            continuarSubMenu = volverAlMenu(scanner);


                        }

                           






                        continuar = volverAlMenu(scanner);
                        break;
                    case 3:
                        System.out.println("CANTIDAD DE PUBLICACIONES X MATERIA DADA");

                        if(materias.size() != 0){

                            for (int i = 0; i < materias.size(); i++) {
                                System.out.println("--------------------------------------");
                                System.out.print(materias.get(i)+" tiene: ");
                                cantidad = 0;
                                for (int j = 0; j < publicaciones.size(); j++) {
                                    if(publicaciones.get(j).getMateria().equals(materias.get(i))){
                                        cantidad +=1;
                                    }
                                }
                                System.out.println(cantidad +" publicacion(es)");
                                System.out.println("--------------------------------------");
                            }
                        }else{
                            System.out.println("No hay publicaciones");
                        }
                        continuar = volverAlMenu(scanner);
                        break;
                    case 4:
                        System.out.println("CANTIDAD DE REVISTAS X MATERIA DADA");
                        
                        if(materias.size() != 0){

                            for (int i = 0; i < materias.size(); i++) {
                                System.out.println("--------------------------------------");
                                System.out.print(materias.get(i)+" tiene: ");
                                cantidad = 0;
                                for (int j = 0; j < publicaciones.size(); j++) {
                                    if(publicaciones.get(j).getMateria().equals(materias.get(i))){
                                        if(publicaciones.get(j).getTipo().equals("Revista")){
                                            cantidad +=1;
                                        }
                                    }
                                }
                                System.out.println(cantidad +" publicacion(es)");
                                System.out.println("--------------------------------------");
                            }
                        }else{
                            System.out.println("No hay revistas");
                        }
                        
                        continuar = volverAlMenu(scanner);
                        break;
                    case 5:
                        System.out.println("LISTADO DE LIBROS DE LA BIBLIOTECA");
                        
                        if(publicaciones.size() != 0){
                            for (Publicacion pub : publicaciones) {
                                if(pub.getTipo().equals("Libro")){
                                    System.out.println("---------------------------------------");
                                    System.out.println(pub);
                                    System.out.println("---------------------------------------");
                                
                                }
                                
                            }
                        }else{
                            System.out.println("No hay libros");
                        }


                        continuar = volverAlMenu(scanner);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa.");
                        continuar=false;
                        break;
                    default:
                        System.out.println("Opción no disponible. Por favor, seleccione una opción válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, ingrese un número válido.");
            }
        }
        scanner.close();


    }

    
    private static boolean volverAlMenu(Scanner scanner) {
        System.out.println("¿Desea volver al menú? (1: Sí, 0: No): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion == 0) {
            System.out.println("Saliendo del programa.");
            
            return false;
        } else {
            
            return true;
        }
        
    }
    
}