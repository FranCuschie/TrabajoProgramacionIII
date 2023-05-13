import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> ListaAnimales = new ArrayList<Animal>();
        Scanner sc = new Scanner(System.in);
        boolean ciclo;
        int menu = 0;
        int tipoAnimal = 0;

        do {
            do {
                ciclo = false;
                try {
                    System.out.println("-----------[ Guarderia TeloCuido ]-----------");
                    System.out.println("1) Ingresar un Animal");
                    System.out.println("2) Retirar un Animal");
                    System.out.println("3) Cantidad de Animales en la guarderia");
                    System.out.println("4) Listado de Animales presentes en la guarderia");
                    System.out.println("5) Recibimiento de parte de los Animales");
                    System.out.println("0) Salir");
                    System.out.printf("Opcion: ");
                    menu = sc.nextInt();
                } catch (InputMismatchException e){
                    ciclo = true;
                    sc.nextLine();
                    System.out.println("Eliga una opcion correcta!");
                }
            } while (ciclo == true);
            switch (menu){
                case 1:
                    try {
                        System.out.println("Dueño?");
                        Duenio duenio = new Duenio();
                        duenio.crearDuenio();

                        do {
                            System.out.println("Que animal va a ingresar?");
                            System.out.println("1)Perro 2)Gato 3)Hamster 4)Mojarrita");
                            System.out.printf("Opcion: ");
                            tipoAnimal = sc.nextInt();
                            ciclo = false;

                            switch (tipoAnimal) {
                                case 1:
                                    Perro perro = new Perro();
                                    perro.agregarAnimal(duenio);
                                    ListaAnimales.add(perro);
                                    break;
                                case 2:
                                    Gato gato = new Gato();
                                    gato.agregarAnimal(duenio);
                                    ListaAnimales.add(gato);
                                    break;
                                case 3:
                                    Hamster hamster = new Hamster();
                                    hamster.agregarAnimal(duenio);
                                    ListaAnimales.add(hamster);
                                    break;
                                case 4:
                                    Mojarrita mojarrita = new Mojarrita();
                                    mojarrita.agregarAnimal(duenio);
                                    ListaAnimales.add(mojarrita);
                                    break;
                                default:
                                    ciclo = true;
                                    sc.nextLine();
                                    System.out.println("Ingrese una opcion correcta.");
                                    System.out.println("-----------------------------------------");

                                }
                            } while (ciclo == true);
                } catch (InputMismatchException e) {
                        System.out.println("Error en el ingreso de datos, No se pudo ingresar el animal correctamente.");
                    }

                    break;
                case 2:// Retirar un animal
                    try {
                        System.out.printf("En que posicion esta?: ");
                        menu = sc.nextInt();
                        System.out.println("Se retiro correctamente: " + ListaAnimales.get(menu-1).getNombre());
                        ListaAnimales.remove(menu-1);
                        break;
                    } catch (Exception e){
                        System.out.println("No se encontro el Animal");
                    }
                case 3:// Cantidad de animales
                    if (ListaAnimales.size() != 1)
                    System.out.println("En la guarderia hay : " + ListaAnimales.size() + " Animales");
                    else System.out.println("En la guarderia hay : " + ListaAnimales.size() + " Animal");
                    break;
                case 4:// Lista de animales
                    for (int i=0;i<ListaAnimales.size();i++) {
                        System.out.println(ListaAnimales.get(i).imprimirAnimales(i));
                    }
                    break;
                case 5:// Saludan
                    for (Animal animal: ListaAnimales) {
                       animal.saludarAnimal();
                    }
                    break;
                case 0:// Termina el codigo
                    System.out.println("Gracias por elegirnos, hasta luego");
                    break;

                default: System.out.println("Ingrese un opcion correcta!");
            }
        } while (menu !=0);
    }
}