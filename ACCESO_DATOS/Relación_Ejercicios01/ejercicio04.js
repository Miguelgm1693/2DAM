const prompt = require('prompt-sync')();
const numReyes = prompt('Introduzca el número de reyes: ');

console.log("Vaya introduciendo los nombres de los reyes y pulsando INTRO");

var nomReyes = [];

for (let i = 0; i < numReyes; i++) {
    nomReyes[i] = prompt();
}

for (let i = 0; i < numReyes; i++) {
    var orReyes = 1;
    for (let j = 0; j < i; j++) {
        if (nomReyes[i] == nomReyes[j]) {
            orReyes++;
        }

    }

    console.log(nomReyes[i] + " " + orReyes + "o")
}


