
public class Main {
    public static void main(String[] args) {
        Persona p1= new Persona("Carlos","Rodriguez",42);
        Persona p2= new Persona("Juan","sebastian",17);
        Persona p3= new Persona("Claudia ","Milena",40);
        Persona p4= new Persona("juliana ","Rodriguez",18);

        System.out.println("persona 1");
        p1.mostrar_datos();
        p1.mayor_edad();
        System.out.println("persona 2");
        p2.mostrar_datos();
        p2.mayor_edad();
        System.out.println("persona 3");
        p3.mostrar_datos();
        p3.mayor_edad();
        System.out.println("persona 4");
        p4.mostrar_datos();
        p4.mayor_edad();
    }
}