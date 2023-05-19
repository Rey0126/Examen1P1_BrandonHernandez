/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_brandonhernandez;

import java.util.Scanner;

/**
 *
 * @author brhb2
 */
public class Examen1P1_BrandonHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean menu = true;

        while (menu) {// Inicio del while
            System.out.println("== MENU ==");
            System.out.println("1. Sumador Binario");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");
            System.out.println("Ingrese su opcion:");
            int opcion = sc.nextInt();

            switch (opcion) {//Inicio del switch

                case 1:
                    String cad1;
                    System.out.println("Ingrese la primer cadena:");
                    cad1 = sc.next();

                    String cad2;
                    System.out.println("Ingrese la segunda cadena:");
                    cad2 = sc.next();

                    if (cad1.length() != cad2.length()) {
                        System.out.println("Los números deben de tener el mismo número de bits");
                    }

                    boolean validac1 = true;
                    for (int i = 0; i < cad1.length(); i++) {// Verifica que los caracteres en la cadena solo sean 0 y 1
                        char x = cad1.charAt(i);
                        if (x != '0' && x != '1') {
                            System.out.println("El primer número contiene caracteres distintos de '0' y '1'");
                            validac1 = false;
                            break;
                        }
                    }

                    boolean validac2 = true;
                    for (int j = 0; j < cad2.length(); j++) {// Verifica que los caracteres en la cadena solo sean 0 y 1
                        char y = cad2.charAt(j);
                        if (y != '0' && y != '1') {
                            System.out.println("El segundo número contiene caracteres distintos de '0' y '1'");
                            validac2 = false;
                            break;
                        }
                    }

                    if (validac1 && validac2) {//Valida que ambas cadenas tengas la misma longitud
                        String suma = "";
                        String carrey = "0";
                        for (int i = cad1.length() - 1; i >= 0; i--) {//Recorre la cadena separando los caracteres de la misma
                            char x = cad1.charAt(i);
                            char y = cad2.charAt(i);

                            if (carrey == "0") {//Controla el comportamiento de las operaciones
                                if (x == '1' && y == '0') {
                                    suma = '1' + suma;
                                    carrey="0";

                                } else if (x == '0' && y == '0') {
                                    suma = '0'+suma;
                                    carrey="0";

                                } else if (x == '1' && y == '1') {
                                    suma = '0'+suma;
                                    carrey="1";

                                } else if (x == '0' && y == '1') {
                                    suma = '1'+suma;
                                    carrey="0";
                                }
                            } else {
                                if (x == '1' && y == '0') {
                                    suma = '0'+suma;
                                    carrey = "1";

                                } else if (x == '0' && y == '0') {
                                    suma = '1'+suma;
                                    carrey = "0";

                                } else if (x == '1' && y == '1') {
                                    suma = '0'+suma;
                                    carrey = "1";

                                } else if (x == '0' && y == '1') {
                                    suma = '0'+suma;
                                    carrey = "1";
                                }
                            }

                        }
                        if(carrey=="1"){//suma 1 porque el carrey queda valiendo 1 y el for ha terminado el ciclo
                            suma='1'+suma;
                        }
                        System.out.println("La suma es:" + suma);
                    }

                    break;

                case 2:
                    System.out.println("Ingrese el tamaño de la figura:");
                    int size = sc.nextInt();

                    while (size < 9 || (size % 2) != 1) {
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                        size = sc.nextInt();
                    }

                    for (int i = 1; i <= (size / 2) + 2; i++) { //For que me controla las filas
                        for (int j = 1; j <= size; j++) { // For que me controla las columnas

                            if (i == 1 && j == (size / 2) + 1) {
                                System.out.print("+");

                            } else if (i == 2) {
                                System.out.print("*");

                            } else if (i == (size / 2) + 1) {
                                System.out.print("+");

                            } else if (i == j + 1) {
                                System.out.print("*");

                            } else if (i == size - 1) {
                                System.out.print("*");

                            } else if (i == (size / 2) + 2 && j == (size / 2) + 1) {
                                System.out.print("*");

                            } else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();
                    }

                    break;

                case 3: // Opcion que cierra el ciclo while
                    menu = false;

                    break;

                default: // Mensaje si introduce una opcion que no este en el menu
                    System.out.println("Opcion Invalida!!!");
                    opcion = sc.nextInt();

            }//Fin del switch

        }// Fin del while
    }

}
