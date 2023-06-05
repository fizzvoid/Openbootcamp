function siempreTrue() {
    return true
}
async function timeoOut() {
    return setTimeout(() => console.log("hola soy una promesa"), 5000)
}
function* idsPares() {
    id = 0
    while (true) {
        yield id += 2
    }

}
