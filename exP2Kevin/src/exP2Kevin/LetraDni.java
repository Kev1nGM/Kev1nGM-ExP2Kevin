package exP2Kevin;

import java.util.Scanner;

public class LetraDni {

    int dni;
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni;
        do{
            System.out.print("Introduce número de DNI: ");
            dni = sc.nextInt();
        }while(dni < 1);
        System.out.println("Letra dni -> " + obtenerLetraDNI(dni));                                               
    }
    public char obtenerLetraDNI(int dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                         'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};                             
        return letras[dni % 23];
    }
}

