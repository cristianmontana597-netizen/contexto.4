package co.edu.poli.contexto4.vista;

import java.util.Arrays;
import java.util.Scanner;
import co.edu.poli.contexto4.modelo.*;
import co.edu.poli.contexto4.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.contexto4.servicios.OperacionCRUD;

public class Principal {
    public static void main(String[] args) {
        // Instanciamos el servicio
    	ImplementacionOperacionCRUD gestor = new ImplementacionOperacionCRUD();
        Scanner sc = new Scanner(System.in);
        
        /**

     // 1. PROBAR CREAR (Agregamos 3 para forzar la expansión del arreglo de 2)
     System.out.println(gestor.crear(new AstronautaEspecialista("Juan", "001",1 ,1,1,1,1,1,"especialista")));
     System.out.println(gestor.crear(new Personal("Ana", "002", 1,1,1,1,"")));
     System.out.println(gestor.crear(new AstronautaEspecialista("Pedro", "003", 1 ,1,1,1,1,1,"especialista")));
     
     // 2. PROBAR LEER
     Persona buscada = gestor.leer("001");
     System.out.println("Encontrado: " + (buscada != null ? buscada.getNombre() : "No existe"));
     
     // 3. PROBAR ACTUALIZAR
     System.out.println(gestor.actualizar("001", new AstronautaEspecialista("Juan nuevo", "001", 1 ,1,1,1,1,1,"especialista")));
     
     // 4. PROBAR ELIMINAR
     Persona borrada = gestor.eliminar("002");
     System.out.println("Se borró a: " + (borrada != null ? borrada.getNombre() : "Nada"));

     // 5.PROBAR LEERTODO
     System.out.println(Arrays.toString(gestor.leerTodo()));

     */
        
        // Variables para archivos
        String patch = "";
        String name = "Tripulacion.bin";
        
        int opcion;

        do {
            System.out.println("\n--- MENÚ MISIÓN ESPACIAL ---");
            System.out.println("1. Crear objeto");
            System.out.println("2. Leer todo (Listar)");
            System.out.println("3. Leer uno (por ID)");
            System.out.println("4. Modificar objeto");
            System.out.println("5. Eliminar objeto");
            System.out.println("6. Serializar (Guardar)");
            System.out.println("7. Deserializar (Cargar)");
            System.out.println("8. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // CREAR
                    System.out.println("\n--- REGISTRO DE TRIPULACIÓN ---");
                    System.out.println("1. Crear Astronauta Especialista");
                    System.out.println("2. Crear Personal de Apoyo");
                    System.out.print("Seleccione tipo: ");
                    int tipoTripulante = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer

                    Persona nuevoTripulante = null;

                    switch (tipoTripulante) {
                        case 1:
                            // Valores quemados iniciales
                            nuevoTripulante = new AstronautaEspecialista("S/N", "000", 0, 0, 0, 0, 0, 0, "Especialista");
                            System.out.println("Configurando Astronauta...");
                            break;
                        case 2:
                            // Valores quemados iniciales
                            nuevoTripulante = new Personal("S/N", "000", 0, 0, 0, 0, "Mantenimiento");
                            System.out.println("Configurando Personal...");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }

                    if (nuevoTripulante != null) {
                        System.out.print("Ingrese el nuevo Nombre: ");
                        nuevoTripulante.setNombre(sc.nextLine());
                        System.out.print("Ingrese el nuevo ID: ");
                        nuevoTripulante.setId(sc.nextLine());
                        System.out.print("Ingrese la nueva Edad: ");
                        nuevoTripulante.setEdad(sc.nextInt());
                        System.out.print("Ingrese el nuevo Peso: ");
                        nuevoTripulante.setPeso(sc.nextDouble());
                        System.out.print("Ingrese la nueva Estatura: ");
                        nuevoTripulante.setAltura(sc.nextDouble());

                        System.out.println(gestor.crear(nuevoTripulante));
                    }
                    break;

                case 2: // LEER TODO
                    System.out.println("\n--- LISTADO COMPLETO ---");
                    System.out.println(Arrays.toString(gestor.leerTodo()));
                    break;

                case 3: // LEER UNO
                    System.out.print("ID a buscar: ");
                    String idB = sc.next();
                    Persona encontrada = gestor.leer(idB);
                    System.out.println(encontrada != null ? encontrada : "No encontrado.");
                    break;

                case 4: // MODIFICAR
                    System.out.println("\n--- MODIFICAR TRIPULANTE POR ID ---");
                    System.out.print("Ingrese el ID a modificar: ");
                    String idMod = sc.next();
                    sc.nextLine(); // Limpiar buffer

                    Persona pMod = gestor.leer(idMod);
                    if (pMod != null) {
                        System.out.println("Editando a: " + pMod.getNombre());
                        System.out.print("Nuevo Nombre: ");
                        pMod.setNombre(sc.nextLine());
                        System.out.print("Nueva Edad: ");
                        pMod.setEdad(sc.nextInt());
                        System.out.print("Nuevo Peso: ");
                        pMod.setPeso(sc.nextDouble());
                        
                        System.out.println(gestor.actualizar(idMod, pMod));
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                    break;

                case 5: // ELIMINAR
                    System.out.println("\n--- ELIMINAR TRIPULANTE POR ID ---");
                    System.out.print("Ingrese el ID a borrar: ");
                    String idEli = sc.next();
                    Persona eliminado = gestor.eliminar(idEli);
                    if (eliminado != null) {
                        System.out.println("Éxito: Se ha eliminado a " + eliminado.getNombre());
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                    break;

                case 6: // SERIALIZAR
                    System.out.println("\n--- GUARDANDO ARCHIVO ---");
                    Persona[] datosAGuardar = gestor.leerTodo();
                    System.out.println(gestor.serializar(datosAGuardar, patch, name));
                    break;

                case 7: // DESERIALIZAR
                    System.out.println("\n--- CARGANDO ARCHIVO ---");
                    Persona[] datosCargados = gestor.deserializar(patch, name);
                    if (datosCargados != null) {
                        // Limpiamos o recorremos para cargar al gestor actual
                        for (Persona p : datosCargados) {
                            if (p != null) {
                                gestor.crear(p);
                            }
                        }
                        System.out.println("Datos recuperados con éxito.");
                    } else {
                        System.out.println("El archivo está vacío o no existe.");
                    }
                    break;

                case 8: // SALIR
                    System.out.println("Saliendo del sistema de la Misión...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 8);
    }
}