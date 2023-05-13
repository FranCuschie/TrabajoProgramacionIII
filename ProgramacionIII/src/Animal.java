import java.util.Scanner;

public abstract class Animal {

    private String nombre;
    private String sexo;
    private Duenio duenio;
    private int edad;
    private int peso;

    public Animal() {
    }

    public Animal(String nombre, String sexo, Duenio duenio, int edad, int peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.duenio = duenio;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public abstract void agregarAnimal(Duenio duenio);

    public abstract void saludarAnimal();

    public abstract String imprimirAnimales(int i);

}
