package co.edu.sena.poomiscelania;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        // Se declara una variable con iniciacion 0 llamada opcion, la cual almacenara
        // la opcion elejida

        do {
            System.out.println("\nBIENVENIDO A LAS OPCIONES PARA LA MISCELANIA\n");
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("99. finalizar con el sistema" +"\n");
 
            System.out.println("Por favor digite el numero de la accion a realizar");
            // Se crea el menu de opciones con el metodo do y con una salida con el numero
            // 4
            opcion = scanner.nextInt();
            // Se llama la variable en donde se almacenara la opcion ejelida por el
            // usuario
            switch (opcion) {
                case 1:
                    operadores();
                    break;
                case 2:
                    condicionales();
                    break;
                case 3:
                    ciclos();
                    break;
                case 99:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Operacion invalida");
            }
            // Se asigna un caso para cada opcion que pueda ser elejida, si se dijita el
            // numero sera redirijodo a operadores condicionales ciclos o al fin del
            // programa
        } while (opcion != 99);
        // Mientras sea diferente de 0 se ejecutara
        System.out.println("Ha finalizado");

    }

    static void operadores() {
        // Se comienza el caso de operadores
        int opcion;
        Ejercicios ejercicios = new Ejercicios();
        // Se crea la connecion con Ejercicios para que se puedan realizar los return
        // alli
        Scanner src = new Scanner(System.in);

        do {
            System.out.println("\nOPCIONES DE OPERACIONES\n");
            System.out.println("1. Calcular el área de un triángulo");
            System.out.println("2. Calcular la suma de dos números");
            System.out.println("3. Calcular un número elevado al cuadrado");
            System.out.println("4. Conversión de dólares a euros");
            System.out.println("5. Calcular el área y perímetro de un cuadrado");
            System.out.println("6. Calcular área y volumen de un cilindro");
            System.out.println("7. Circunferencia del radio y area pi del circulo");
            System.out.println("8. Promedio de tres numeros");
            System.out.println("9. Si desea finalizar por favor vuelva al menú principal");

            System.out.print("Seleccione una opción: ");
            opcion = src.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaTriangulo(ejercicios, src);
                    break;
                case 2:
                    calcularSumaDosNumeros(ejercicios, src);
                    break;
                case 3:
                    calcularNumeroElevado(ejercicios, src);
                    break;
                case 4:
                    conversionDolaresAEuros(ejercicios, src);
                    break;
                case 5:
                    calcularAreaYPerimetroCuadrado(ejercicios, src);
                    break;
                case 6:
                    calcularAreaYVolumenCilindro(ejercicios, src);
                break;
                    case 7:
                    Circunferenciadelradioyareapidelcirculo(ejercicios, src);
                    break;
                case 8:
                    promediotresnumeros(ejercicios, src);
                    break;
                case 9:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 9);
    }

    private static void calcularAreaTriangulo(Ejercicios ejercicios, Scanner src) {
        // Se coloca private ya que solo se podra ejecutar dentro de Main,
        // Dentro de los parentesis se coloca la instancia de Ejercicios y el objeto
        // Scanner src que
        // serviran para que desde main se pueda ejecutar el ejercicio
        double dato1;
        double dato2;
        double dato3;
        Ejercicios Ejercicios = new Ejercicios();
        System.out.println("BIENVENIDO A OPERACIONES" + "\n");
        System.out.println("1.1 CALCULAR EL AREA DE UN TRIANGULO");

        System.out.println("*Ingrese la base del triangulo");
        dato1 = src.nextDouble();

        System.out.println("*Ingrese la altura del triangulo");
        dato2 = src.nextDouble();

        dato3 = Ejercicios.areatriangulo(dato1, dato2);
        System.out.println("\n" + "EL AREA DEL TRIANGULO ES " + dato3 + "\n");
    }

    private static void calcularSumaDosNumeros(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        double dato3;
        Ejercicios Ejercicios = new Ejercicios();
        System.out.println("1.2 CALCULAR LA SUMA DE DOS NUMEROS");

        System.out.println("*Ingrese el primer numero");
        dato1 = src.nextDouble();

        System.out.println("*Ingrese el segundo numero");
        dato2 = src.nextDouble();

        dato3 = Ejercicios.sumadosnumeros(dato1, dato2);
        System.out.println("\n" + "EL RESULTADO DE LA SUMA ES " + dato3 + "\n");
    }

    private static void calcularNumeroElevado(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        Ejercicios Ejercicios = new Ejercicios();
        System.out.println("1.3 CALCULAR UN NUMERO ELEVADO AL CUADRADO");

        System.out.println("*Ingrese el numero a elevar");
        dato1 = src.nextDouble();

        dato2 = Ejercicios.numeroelevado(dato1);
        System.out.println("\n" + "EL NUMERO ELEVADO ES " + dato2 + "\n");
    }

    private static void conversionDolaresAEuros(Ejercicios ejercicios, Scanner src) {
        Ejercicios Ejercicios = new Ejercicios();
        double dato1;
        double dato2;
        double dato3;
        System.out.println("1.4 CONVERCION DE DOLARES A EUROS");

        System.out.println("*Ingrese la cantidad de euros");
        dato1 = src.nextDouble();

        dato2 = 1.08;

        dato3 = Ejercicios.Convercion(dato1, dato2);
        System.out.println("\n" + "LA CONVERSION ES DE " + dato3 + "\n");
    }

    private static void calcularAreaYPerimetroCuadrado(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        double dato3;
        Ejercicios Ejercicios = new Ejercicios();
        System.out.println("1.5 CALCULAR EL AREA Y PERIMETRO DE UN CUADRADO");
        System.out.println("*Ingrese el valor de un lado del cuadrado");

        dato1 = src.nextDouble();

        dato2 = Ejercicios.apcuadrado1(dato1);
        System.out.println("\n" + "EL AREA DEL CUADRADO ES " + dato2 + "\n");

        dato3 = Ejercicios.apcuadrado2(dato1);
        System.out.println("\n" + "EL PERIMETRO DEL CUADRADO ES " + dato3 + "\n");
    }

    private static void calcularAreaYVolumenCilindro(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;
        Ejercicios Ejercicios = new Ejercicios();
        System.out.println("\n" + "1.6 CALCULAR AREA Y VOLUMEN DE UN CILINDRO:");
        System.out.println("*Ingrese el radio de la base del cilindro:");
        dato1 = src.nextDouble();

        System.out.println("*Ingrese la altura del cilindro:");
        dato2 = src.nextDouble();

        dato3 = Ejercicios.areacilindro(dato1, dato2);
        System.out.println("\n" + "EL AREA TOTAL DEL CILINDRO ES " + dato3);

        dato4 = Ejercicios.volumencilindro(dato1, dato2);
        System.out.println("\n" + "EL VOLUMEN TOTAL DEL CILINDRO ES  " + dato4 + "\n");
    }
    private static void Circunferenciadelradioyareapidelcirculo (Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        double dato3;
        Ejercicios Ejercicios = new Ejercicios();
        System.out.println("\n" + "1.7 CALCULAR LONGITUD DE CIRCUNFERENCIA Y AREA DEL CIRCULO:");
        System.out.println("*Ingrese el radio de la circunferencia");
        dato1 = src.nextDouble();
        dato2 = Ejercicios.Circunferenciadelradioyareapidelcirculo(dato1);
        System.out.println("La longitud de la circunferencia es " + dato2);

        dato3 = Ejercicios.Circunferenciadelradioyareapidelcirculo2(dato1);
        System.out.println("El area del circulo es " + dato3);
    }

    private static void promediotresnumeros (Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;
        Ejercicios Ejercicios = new Ejercicios();
        System.out.println("\n" + "1.8 PROMEDIO DE TRES NUMEROS:");
        System.out.println("*Ingrese el primer numero");
        dato1 = src.nextDouble();
        System.out.println("*Ingrese el segundo numero");
        dato2 = src.nextDouble();
        System.out.println("*Ingrese el tercer numero");
        dato3 = src.nextDouble();
        dato4 = Ejercicios.promediotresnumeros(dato1, dato2, dato3);
        System.out.println("El promedio de los tres numeros es " + dato4);
    }

    // Desde este punto comienza el caso 2, es decir condicionales con sus
    // repectivos ejercicios
    static void condicionales() {
        int opcion;
        Ejercicios ejercicios = new Ejercicios();
        Scanner src = new Scanner(System.in);

        do {
            System.out.println("\nOPCIONES DE OPERACIONES\n");
            System.out.println("1. Determinar si un número es positivo o negativo");
            System.out.println("2. Determinar cuál es el mayor y cuál el menor entre dos números");
            System.out.println("3. Encontrar el mayor y menor entre tres números");
            System.out.println("4. Si el numero 1 es menor que el numero 2 se sumaran de lo contrario se restan");
            System.out.println("5. Dados dos números A y B encontrar el cociente entre A y B.");
            System.out.println(
                    "6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.");
            System.out.println("7. Determinar si un año es bisiesto o no.");
            System.out.println("8. Si desea finalizar por favor vuelva al menú principal");

            System.out.print("Seleccione una opción: ");
            opcion = src.nextInt();

            switch (opcion) {
                case 1:
                    positivonegativo(ejercicios, src);
                    break;
                case 2:
                    dosnumerosmayorymenor(ejercicios, src);
                    break;
                case 3:
                    tresnumerosmayorymenor(ejercicios, src);
                    break;
                case 4:
                    dosnumerossumarlosorestarlos(ejercicios, src);
                    break;
                case 5:
                    cociente(ejercicios, src);
                    break;
                case 6:
                    sumaromultiplicar(ejercicios, src);
                    break;
                case 7:
                    bisiesto(ejercicios, src);
                    break;
                case 8:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 8);
    }

    // EJERCICIO #1 CONDICIONALES
    private static void positivonegativo(Ejercicios ejercicios, Scanner src) {
        double dato1;
        System.out.println("\nBIENVENIDO A CONDICIONALES" + "\n");
        System.out.println("1.1 DETERMINAR SI UN NUMERO ES POSITIVO O NEGATIVO" + "\n");
        System.out.println("*Digite el numero");
        dato1 = src.nextDouble();
        String resultado = ejercicios.positivonegativo(dato1);
        System.out.println(resultado);
        // Se guarda la salida en una variable llamada resultado de tipo String ya que
        // sera una cadena de caracteres
        // Se llama al archivo que se encuentra en ejercicios, con los datos que se
        // leeran
        // se imprime el resultado llamando a la variable
    }

    // EJERCICIO #2 CONDICIONALES
    private static void dosnumerosmayorymenor(Ejercicios ejercicios, Scanner src) {
        System.out.println(  "\n" + "1.2 DETERMINAR ENTRE DOS NUMEROS CUAL ES MAYOR" + "\n");
        System.out.println("*Ingrese el primer numero");
        double dato1 = scanner.nextDouble();
        System.out.println("*Ingrese el segundo numero");
        double dato2 = scanner.nextDouble();
        String solucion = ejercicios.determinarMayorYMenor(dato1, dato2);
        System.out.println(solucion);

    }

    // EJERCICIO #3 CONDICIONALES
    private static void tresnumerosmayorymenor(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        double dato3;
        System.out.println("\n1.3 Encontrar el mayor y menor entre tres números" + "\n");
        System.out.println("*Ingrese el primer numero");
        dato1 = src.nextDouble();
        System.out.println("*Ingrese el segundo numero");
        dato2 = src.nextDouble();
        System.out.println("*Ingrese el tercer numero");
        dato3 = src.nextDouble();
        String resultado = ejercicios.numerosMayoryMenor(dato1, dato2, dato3);
        System.out.println(resultado);

    }

    // EJERCICIO #4 CONDICIONALES
    private static void dosnumerossumarlosorestarlos(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        System.out.println("\n1.4 SI EL NUMERO 1 ES MENOR QUE EL NUMERO 2 SE RESTAN DE LO CONTRARIO SE SUMAN" + "\n");
        System.out.println("*Ingrese el primer numero");
        dato1 = src.nextDouble();
        System.out.println("*Ingrese el segundo numero");
        dato2 = src.nextDouble();
        String resultado = ejercicios.sumaoresta(dato1, dato2);
        System.out.println(resultado);

    }

    // EJERCICIO #5 CONDICIONALES
    private static void cociente(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;

        System.out.println( "\n" +"1.5 ENCONTAR EL COCIENTE DOS NUMEROS." + "\n");
        System.out.println(" *Ingrese el primer numero.");
        dato1 = src.nextDouble();
        System.out.println(" *Ingrese el segundo numero.");
        dato2 = src.nextDouble();
        String resultado = ejercicios.cociente(dato1, dato2);
        System.out.println(resultado);
    }

    // EJERCICIO #6 CONDICIONALES
    private static void sumaromultiplicar(Ejercicios ejercicios, Scanner src) {
        double dato1;
        double dato2;
        System.out.println( "\n" + "1.6 MULTIPLICACION DE NUMEROS SI UNO ES NEGATIVO" + "\n");
        System.out.println(" * Ingrese el primer numero.");
        dato1 = src.nextDouble();
        System.out.println(" * Ingrese el segundo numero.");
        dato2 = src.nextDouble();
        String resultado = ejercicios.sumaomultiplicacion(dato1, dato2);
        System.out.println(resultado);

    }

    // EJERCICIO #7 CONDICIONALES
    private static void bisiesto(Ejercicios ejercicios, Scanner src) {
        double dato1;

        System.out.println("\n" + "1.7 CONOCER SI UN AÑO ES BISIESTO O NO" + "\n");
        System.out.println(" * Ingrese el año determinar " + "\n");
        dato1 = src.nextDouble();
        String resultado = ejercicios.bisiesto(dato1);
        System.out.println(resultado);

    }

    static void ciclos() {
        System.out.println("\nCiclos" + "\n");
        System.out.println("Digite el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);
    }
}
