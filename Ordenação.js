let lista = [5, 2, 9, 1, 7, 3];

for (let i = 0; i < lista.length - 1; i++) {
    for (let j = 0; j < lista.length - 1 - i; j++) {
        if (lista[j] > lista[j + 1]) {
            let temp = lista[j];
            lista[j] = lista[j + 1];
            lista[j + 1] = temp;
        }
    }
}

console.log(lista);