public class Actividad_9 {
public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.nombre = "Emmanuel";
    cliente.edad = 18;
    cliente.telefono = 667447581;
    cliente.credito = 20212.589;
    System.out.println("soy " + cliente.nombre + " tengo " + cliente.edad + " mi numero es " + cliente.telefono + " mi credito actual es " + cliente.credito);
    System.out.println();
    
    Trabajador trabajador = new Trabajador();
    trabajador.nombre = "richi";
    trabajador.edad = 25;
    trabajador.telefono = 812371912;
    trabajador.salario = 15000.01;
    System.out.println("soy " + trabajador.nombre + " tengo " + trabajador.edad + " mi numero es " + trabajador.telefono + " mi salario actual es " + trabajador.salario);
}
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    double credito;
}
class Trabajador extends Persona {
    double salario;
}