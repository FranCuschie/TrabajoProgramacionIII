import java.util.Scanner;

public class Duenio {
    private String nombreDuenio;
    private String apellidoDuenio;
    private int dni;
    private String direccion;


    public Duenio() {
    }

    public Duenio(String nombreDuenio, String apellidoDuenio, int dni, String direccion) {
        this.nombreDuenio = nombreDuenio;
        this.apellidoDuenio = apellidoDuenio;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getApellidoDuenio() {
        return apellidoDuenio;
    }

    public void setApellidoDuenio(String apellidoDuenio) {
        this.apellidoDuenio = apellidoDuenio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void crearDuenio(){

            Scanner sc = new Scanner(System.in);
            System.out.printf("Nombre: ");
            setNombreDuenio(sc.nextLine());

            System.out.printf("Apellido: ");
            setApellidoDuenio(sc.nextLine());

            System.out.printf("DNI: ");
            setDni(sc.nextInt());
            sc.nextLine();

            System.out.printf("Direccion: ");
            setDireccion(sc.nextLine());

            System.out.println("-------------------------------");

    }

    @Override
    public String toString() {
        return  "\nDueño: " + nombreDuenio + " " + apellidoDuenio +
                "\nDNI: " + dni +
                "\nDirección: " + direccion ;
    }
}
