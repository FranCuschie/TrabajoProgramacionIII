import java.util.Scanner;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String sexo, Duenio duenio, int edad, int peso) {
        super(nombre, sexo, duenio, edad, peso);
    }

    @Override
    public void agregarAnimal(Duenio duenio) {
        setDuenio(duenio);
        System.out.println("Datos de la mascota.");

        Scanner sc = new Scanner(System.in);
        System.out.printf("Nombre: ");
        setNombre(sc.nextLine());

        System.out.printf("Sexo: ");
        setSexo(sc.nextLine());

        System.out.printf("Edad: ");
        setEdad(sc.nextInt());
        sc.nextLine();

        System.out.printf("Peso(grs): ");
        setPeso(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void saludarAnimal() { System.out.println("Hola me llamo " + getNombre() + " Y soy un Gato"); }

    @Override
    public String imprimirAnimales(int i) {
        i = i +1;
        return  "\n-----------------------------------------\n" +
                "Tipo Animal: Gato\n" +
                "Nombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                getDuenio() +
                "\nSexo: " + getSexo() +
                "\nPeso(grs): " + getPeso() +
                "\nPosicion en la lista: " + i;
    }
}
