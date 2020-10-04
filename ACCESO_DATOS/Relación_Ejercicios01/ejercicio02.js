const prompt = require("prompt-sync")();

var n = prompt("Introduzca la altura de la pirámide numérica: ");

for (let i = 1; i <= n; i++) {
    for(let j = 1; j <= n - 1; j++) {
        process.stdout.write(" ");
    }

    for(j = 1; j <= 2 * i - 1; j++) {               

        if((j == 0) || (j == i)){
            process.stdout.write("*");
        } else {
            process.stdout.write(" ");
        }
        
    }

    console.log();
}

/**j = espacios en blando
 * i = límite de la pirámide
 * conseguir que la piramide dibuje la úiltima fila entera
 * 
 */
