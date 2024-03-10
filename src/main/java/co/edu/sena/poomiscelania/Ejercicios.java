package co.edu.sena.poomiscelania;

public class Ejercicios {
    // EJERCICIO #1 OPERADORES//
    public double areatriangulo(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    // EJERCICIO #2 OPERADORES//
    public double sumadosnumeros(double d1, double d2) {
        return (d1 + d2);
    }

    // EJERCICIO #3 OPERADORES//
    public double numeroelevado(double d1) {
        return (d1 * d1);
    }

    // EJERCICIO #4 OPERADORES//
    public double Convercion(double d1, double d2) {
        return (d1 * d2);
    }

    // EJERCICIO #5 OPERADORES//
    public double apcuadrado1(double d1) {
        return (d1 * d1);
    }

    // EJERCICIO #5.1 OPERADORES//
    public double apcuadrado2(double d1) {
        return (d1 + d1 + d1 + d1);
    }

    // EJERCICIO #6 OPERADORES//
    public double areacilindro(double d1, double d2) {
        return (Math.PI * d1 * (d1 + d2));
    }

    // EJERCICIO #7 OPERADORES//
    public double volumencilindro(double d1, double d2) {
        return (Math.PI * d1 * d1 * d2);
    }

    //EJERCICIO #8 OPERADORES//
    public double Circunferenciadelradioyareapidelcirculo(double d1) {
        return  2 * Math.PI * d1;
    }
    public double Circunferenciadelradioyareapidelcirculo2(double d1) {
        return Math.PI * Math.pow(d1, 2);
    }

    public double promediotresnumeros (double d1, double d2, double d3) {
        return (d1 + d2 + d3 ) / 3;
    }

    // EJERCICIO #1 CONDICIONALES//

    // Se coloca String ya que el retorno sera cadena de caracteres
    // Para el return se utiliza el operador ternario

    public String positivonegativo(double d1) {
        return (d1 > 0) ? "EL NUMERO ES POSITIVO." + "\n"
                : (d1 < 0) ? "EL NUMERO ES NEGATIVO." + "\n" : "El número es cero.";

    }

    // EJERCICIO #2 CONDICIONALES//

    // Se coloca String ya que se devolvera una cadena de caracteres
    // Se declara double dato1 y double dato2 ya que estos seran los datos que se
    // van a leer
    // Se llaman las variables de mayor y menor en donde se almacenara el resultado
    // LOS DATOS QUE SERAN LEIDOS DEBEN SER LLAMADOS DE LA MISMA MANERA DENTRO DEL CONDICIONAL

    public String determinarMayorYMenor(double dato1, double dato2) {
        double mayor;
        double menor;

        if (dato1 > dato2) {
            mayor = dato1;
            menor = dato2;
        } else {
            mayor = dato2;
            menor = dato1;
        }
        // Se genera el return de esta manera para que se pueda retornar las salidas de
        // manera correcta en el Main
        return "El número mayor es " + mayor + " y el número menor es " + menor;
    }

    // EJERCICIO #3 CONDICIONALES//

    public String numerosMayoryMenor(double dato1, double dato2, double dato3) {
        double mayor;
        double menor;

        if (dato1 > dato2 && dato1 > dato3) {
            mayor = dato1;
        } else if (dato2 > dato3) {
            mayor = dato2;
        } else {
            mayor = dato3;
        }

        if (dato1 < dato2 && dato1 < dato3) {
            menor = dato1;
        } else if (dato2 < dato3) {
            menor = dato2;
        } else {
            menor = dato3;
        }

        // Se genera el return de esta manera para que se pueda retornar las salidas de
        // manera correcta en el Main

        return "El numero mayor es " + mayor + "el numero menor es " + menor;

    }

    // EJERCICIO #4 CONCIDICIONALES
    // Los return en este caso se colocan dentro del if para que salga el mensaje en
    // Main

    public String sumaoresta(double d1, double d2) {
        double dato3;
        double dato4;

        if (d1 < d2) {
            dato3 = d1 + d2;
            return "la suma es de " + dato3;
        } else {
            dato4 = d1 - d2;
            return "la resta es de " + dato4;
        }

    }

    // EJERCICIO #5 CONDICIONALES
    public String cociente(double dato1, double dato2) {
        double dato3;

        if (dato2 != 0) {
            dato3 = dato1 / dato2;
            return "El cociente es:" + dato3;
        } else {
            return "La division no es posible ya que se puede dividir entre cero";
        }
    }

    // EJERCICIO #6 CONDICIONALES
    public String sumaomultiplicacion(double dato1, double dato2) {
        double dato3;
        double dato4;

        if (dato1 < 0 || dato2 < 0) {
            dato3 = (dato1 + dato2);
            return "El resultado es: " + dato3;
        } else {
            dato4 = (dato1 * dato2);
            return "El resultado es: " + dato4;
        }

    }

    // EJERCICIO #7 CONDICIONALES
    public String bisiesto(double dato1) {

        if ((dato1 % 4 == 0 && dato1 % 100 != 0 || (dato1 % 400 == 0))) {
            return "El año si es bisiesto. ";
        } else {
            return "El año no es bisiesto. ";
        }
    }
}
  
