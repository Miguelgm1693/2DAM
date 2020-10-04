function getRandom(min, max) {
    return Math.floor(Math.random() * (max - min) + min);
}

var figura;
var figura1 = getRandom(1, 5);
var figura2 = getRandom(1, 5);
var figura3 = getRandom(1, 5);

switch (figura1) {
    case 1:
        console.log(" COR ");
        break;
    case 2:
        console.log(" DIA ");
        break;
    case 3:
        console.log(" ANC ");
        break;
    case 4:
        console.log(" CAM ");
        break;
    case 5:
        console.log(" LIM ");
        break;
}

switch (figura2) {
    case 1:
        console.log(" COR ");
        break;
    case 2:
        console.log(" DIA ");
        break;
    case 3:
        console.log(" ANC ");
        break;
    case 4:
        console.log(" CAM ");
        break;
    case 5:
        console.log(" LIM ");
        break;
}

switch (figura3) {
    case 1: 
        console.log(" COR ");
        break;
    case 2:
        console.log(" DIA ");
        break;
    case 3:
        console.log(" ANC ");
        break;
    case 4:
        console.log(" CAM ");
        break;
    case 5:
        console.log(" LIM ");
        break;
}

if ((figura1 == figura2) && (figura2 == figura3)) {
    console.log("Enhorabuena, has conseguido 10 monedas");
} else if ((figura1 == figura2) || (figura2 == figura3) || (figura1 == figura3)){
    console.log("Bien, ha recuperado su moneda");
} else {
    console.log("Lo siento, ha perdido");
}

