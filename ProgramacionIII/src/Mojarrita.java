import java.util.Scanner;

public class Mojarrita extends Animal{
    private String tipoAgua;

    public Mojarrita() {
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
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

        System.out.printf("Tipo de agua: ");
        setTipoAgua(sc.nextLine());
    }

    @Override
    public void saludarAnimal() { System.out.println("Hola me llamo " + getNombre() + " Y soy una Mojarrita."); }

    @Override
    public String imprimirAnimales(int i) {
        i = i +1;
        return  "\n-----------------------------------------\n"+
                "Tipo Animal: Mojarrita\n" +
                "Nombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                getDuenio() +
                "\nSexo: " + getSexo() +
                "\nPeso(grs): " + getPeso() +
                "\nPosicion en la lista: " + i;
    }
}
