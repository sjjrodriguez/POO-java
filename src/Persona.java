import java.util.Random;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int n_registro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getN_registro() {
        return n_registro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void numero_registro() {
        Random ale = new Random();
        this.n_registro=ale.nextInt((9999 - 1000+1))+1000;
        System.out.println(n_registro);
        System.out.println("Número de registro asignado: " + n_registro);
    }

    public void mostrar_datos() {
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad );
    }

    public void mayor_edad() {
        if (edad < 18) {
            System.out.println(nombre + " es menor de edad con " + edad + " años.");
        } else {
            System.out.println(nombre + " es mayor de edad con " + edad + " años.");
        }
    }
}
