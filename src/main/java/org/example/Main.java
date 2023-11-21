package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean cerrarProg = false;

        while (cerrarProg == false)
        {
            System.out.println("Calcula areas:\n1- Triangulo\2- Cuadrado\n3- Rectangulo\n4- Circulo\n 5- Petagono\n6- Hexagono\n0- Cerrar");
            int select = sc.nextInt();
            sc.nextLine();
            double resultado = 0;

            switch (select)
            {
                case 0:
                    cerrarProg = true;
                    break;

                case 1:
                    System.out.println("Di base");
                    double baseT = sc.nextDouble();
                    System.out.println("Di altura");
                    double alturaT = sc.nextDouble();
                    Triangulo triangulo=new Triangulo(baseT , alturaT);
                    resultado = triangulo.calculaArea();
                    break;


                case 2:
                    System.out.println("Di base");
                    double baseC = sc.nextDouble();
                    Cuadrado cuadrado=new Cuadrado(base);
                    resultado = cuadrado.calculaArea();
                    break;

                case 3:
                    System.out.println("Di base");
                    double baseR = sc.nextDouble();
                    System.out.println("Di altura");
                    double alturaR = sc.nextDouble();
                    Rectángulo rectangulo=new Rectángulo(baseR , alturaR);
                    resultado = rectangulo.calculaArea();
                    break;

                case 4:
                    System.out.println("Di el radio");
                    double redioC = sc.nextDouble();
                    Circulo circulo=new Circulo(radio);
                    resultado = circulo.calculaArea();
                    break;

                case 5:
                    System.out.println("Di un lado");
                    double lado1 = sc.nextDouble();
                    System.out.println("Di el otro lado");
                    double lado2 = sc.nextDouble();
                    Pentagono pentagono=new Pentagono(lado1 , lado2);
                    Pentagono = pentagono.calculaArea();
                    break;

                case 6:
                    System.out.println("Di un lado");
                    double ladoH = sc.nextDouble();
                    System.out.println("Di el apotema");
                    double apotema = sc.nextDouble();
                    Hexagono hexagono=new Hexagono(ladoH , apotema);
                    Hexagono = hexagono.calculaArea();
                    break;

                default:
                    System.out.println("Error de eleccion, elige del 1 al 6 o 0 para cerrar.");
                    select = sc.nextInt();
                    break;

            }

            if(resultado != 0)
            {
                System.out.println("El area es: " + resultado);
            }

        }

        System.out.println("Fin");
        sc.close();

    }
}