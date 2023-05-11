//factorial-break
let contador = 10;
let factorial = 1;
while (contador > 0) {
    factorial *= contador;
    if (contador === 1) {
        break;
    }    
    contador--
}
console.log(factorial)
