import java.util.Scanner;

public class Perro extends Animal{
    private String raza;

    public Perro() {
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

        System.out.printf("Raza: ");
        setRaza(sc.nextLine());
    }

    @Override
    public void saludarAnimal() { System.out.println("Hola me llamo " + getNombre() + " Y soy un Perro"); }

    @Override
    public String imprimirAnimales(int i) {
        i = i +1;
        return  "\n-----------------------------------------\n"+
                "Tipo Animal: Perro\n" +
                "Nombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                getDuenio() +
                "\nSexo: " + getSexo() +
                "\nPeso(grs): " + getPeso() +
                "\nRaza: " + getRaza() +
                "\nPosicion en la lista: " + i;
    }
}
