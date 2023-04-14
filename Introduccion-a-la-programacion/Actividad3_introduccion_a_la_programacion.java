public class Actividad3_introduccion_a_la_programacion {
//PARTE 1
    public static int suma (int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {

    int resultado = suma(2, 3, 5);
    System.out.println("el resultado de la suma es " + resultado);

 //PARTE 2   
    coche micoche = new coche();
    micoche.addpuerta();
    System.out.println(micoche.puertas);
}

}

class coche {
    public int puertas = 0;

    public void addpuerta() {
        this.puertas++;
    }
}