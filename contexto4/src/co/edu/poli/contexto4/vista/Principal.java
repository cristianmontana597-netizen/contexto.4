package co.edu.poli.contexto4.vista;

import java.util.Arrays;
import java.util.Scanner;
import co.edu.poli.contexto4.modelo.*;
import co.edu.poli.contexto4.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.contexto4.servicios.OperacionArchivo;

public class Principal {
    public static void main(String[] args) {
        ImplementacionOperacionCRUD gestor = new ImplementacionOperacionCRUD();
        Scanner sc = new Scanner(System.in);
        
        String patch = "";
        String name = "Tripulacion.bin";
        int opcion = 0;

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
            
            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("¡Error! Debe ingresar un número del 1 al 8.");
                sc.nextLine(); // Limpiar el buffer
                opcion = 0;    
                continue;      
            }
            sc.nextLine(); // Limpiar buffer después de un nextInt

            switch (opcion) {
                case 1: // CREAR
                    System.out.println("\n--- REGISTRO DE TRIPULACIÓN ---");
                    System.out.println("1. Crear Astronauta Especialista");
                    System.out.println("2. Crear Personal de Apoyo");
                    System.out.print("Seleccione tipo: ");
                    int tipoTripulante = 0;
        
                    try {
                        tipoTripulante = sc.nextInt(); 
                    } catch (Exception e) {
                        System.out.println("¡Error! Solo se permiten números (1 o 2).");
                        sc.nextLine(); 
                        break; // Sale del case 1 y vuelve al menú
                    }
                    sc.nextLine(); 

                    Persona nuevoTripulante = null;
                    switch (tipoTripulante) {
                        case 1:
                            nuevoTripulante = new AstronautaEspecialista("S/N", "000", 0, 0, 0, 0, 0, 0, "Especialista");
                            System.out.println("Configurando Astronauta...");
                            break;
                        case 2:
                            nuevoTripulante = new Personal("S/N", "000", 0, 0, 0, 0, "Mantenimiento");
                            System.out.println("Configurando Personal...");
                            break;
                        default:
                            System.out.println("Opción de tipo inválida.");
                            break;
                    }

                    if (nuevoTripulante != null) {
                        try {
                            System.out.print("Ingrese el nuevo Nombre: ");
                            nuevoTripulante.setNombre(sc.nextLine());
                            
                            System.out.print("Ingrese el nuevo ID: ");
                            nuevoTripulante.setId(sc.nextLine());
                            
                            System.out.print("Ingrese Edad: ");
                            nuevoTripulante.setEdad(sc.nextInt());
                            
                            System.out.print("Ingrese el nuevo Peso: ");
                            nuevoTripulante.setPeso(sc.nextDouble());
                            
                            System.out.print("Ingrese la nueva Estatura: ");
                            nuevoTripulante.setAltura(sc.nextDouble());
                            sc.nextLine(); // Limpiar buffer final

                            System.out.println(gestor.crear(nuevoTripulante));
                        } catch (Exception e) {
                            System.out.println("¡Error de datos! Asegúrese de usar números para edad, peso y estatura.");
                            sc.nextLine(); // Limpiar buffer tras error
                        }
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
                    sc.nextLine(); 

                    Persona pMod = gestor.leer(idMod);
                    if (pMod != null) {
                        try {
                            System.out.println("Editando a: " + pMod.getNombre());
                            System.out.print("Nuevo Nombre: ");
                            pMod.setNombre(sc.nextLine());
                            
                            System.out.print("Nueva Edad: ");
                            pMod.setEdad(sc.nextInt());
                            
                            System.out.print("Nuevo Peso: ");
                            pMod.setPeso(sc.nextDouble());
                            sc.nextLine(); 
                            
                            System.out.println(gestor.actualizar(idMod, pMod));
                        } catch (Exception e) {
                            System.out.println("¡Error! Datos numéricos inválidos.");
                            sc.nextLine();
                        }
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                    break;

                case 5: // ELIMINAR
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
                    try {
                        System.out.println("\n--- GUARDANDO ---");
                        Persona[] lista = gestor.leerTodo();
                        System.out.println(((OperacionArchivo)gestor).serializar(lista, patch, name));
                    } catch (Exception e) {
                        System.out.println("Error al guardar en archivo: " + e.getMessage());
                    }
                    break;

                case 7: // DESERIALIZAR
                    try {
                        System.out.println("\n--- CARGANDO ---");
                        Persona[] cargados = ((OperacionArchivo)gestor).deserializar(patch, name);
                        if (cargados != null) {
                            for (Persona p : cargados) {
                                if (p != null) gestor.crear(p);
                            }
                            System.out.println("Datos cargados en el sistema.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al cargar archivo: " + e.getMessage());
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
        sc.close();
    }
}