let a = 48;
let b = 18;
let mdc = 1;

let menor = a;
if (b < a) {
    menor = b;
}

for (let i = 1; i <= menor; i++) {
    if (a % i === 0 && b % i === 0) {
        mdc = i;
    }
}

console.log("O MDC é " + mdc);