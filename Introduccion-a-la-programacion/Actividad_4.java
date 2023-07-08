public class Actividad_4 {
public static void main(String[] args) {
 //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    int numeroif = -2;
    if (numeroif > 0) {
        System.out.println("el numero " + numeroif + " es mayor a 0");
    } else if (numeroif < 0) {
        System.out.println("el numero " + numeroif + " es menor a 0");
    }else{
        System.out.println("el numero es igual a " + numeroif);
    }
                                                                                System.out.println();
//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:Incrementar el valor de la variable en uno cada vez que se ejecute.Mostrarlo por pantalla cada vez que se ejecute.
    int numeroWhile = 0;
    while (numeroWhile < 3) {
        numeroWhile++;
        System.out.println(numeroWhile);
    }
                                                                                System.out.println();
//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    numeroWhile--;
    do{
        numeroWhile++;
        System.out.println(numeroWhile);
    }while (numeroWhile < 3);
                                                                                System.out.println();
    //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    for (int numerofor = 0; numerofor <= 3; numerofor++) {
        System.out.println(numerofor);
    }
                                                                                System.out.println();
    //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
    var estacion = "primavera";
    switch (estacion) {
        case "primavera":
            System.out.println("es primavera");
            break;
        case "verano":
            System.out.println("es verano");
            break;
        case "otoño":
            System.out.println("es otoño");
            break;
        case "inierno":
            System.out.println("es invierno");
            break;
        default:
            System.out.println("el valor de la variable no es estación");
            break;
    }
}
    
}
