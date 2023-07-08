public class Actividad_8 {
public static void main(String[] args) {
    persona persona1 = new persona();
    persona1.setEdad(18);
    persona1.setNombre("Emmanuel");
    persona1.setTelefono(662721393);
    System.out.println(persona1.getEdad());
    System.out.println(persona1.getNombre());
    System.out.println(persona1.getTelefono());
    
}
}
class persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    
    
}