let lista = [3, 7, 3, 9, 3, 5, 7, 3];
let valorProcurado = 3;
let contador = 0;

for (let i = 0; i < lista.length; i++) {
    if (lista[i] === valorProcurado) {
        contador = contador + 1;
    }
}

console.log("O valor " + valorProcurado + " aparece " + contador + " vezes");