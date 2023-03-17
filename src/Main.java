
/*
PARCIAL ARQUITECTURA DE DATOS
Se quiere crear una aplicación para controlar los gastos telefónicos de una empresa.
La empresa cuenta con tres líneas telefónicas a través de las cuales se pueden realizar llamadas locales,
 de larga distancia y a celulares.
La empresa cuenta con planes telefónicos que establece las siguientes tarifas:
Minuto Llamada Local: $60 pesos
Minuto Llamada Larga Distancia: $1200 pesos
Minuto Llamada Celular: $850 pesos
La aplicación debe permitir:
1. Registrar una llamada en alguna de las líneas,
2. Mostrar la información detallada de cada línea (número de llamadas realizadas
, duración total de las llamadas en minutos y el costo total de las llamadas en pesos)
3. Mostrar un consolidado total de la información de todas las líneas (costo total en
pesos de las tres líneas, número total de llamadas realizadas, duración total de llamadas en minutos
y el cálculo del costo promedio por minuto según el costo total y el total de minutos).
Adicionalmente, la aplicación debe permitir
4. Reiniciar el uso las líneas telefónicas, dejando todos sus valores en cero.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int nllamadascel=0;
        int intentosllamadas=0;
        int duracion=0;

        ArrayList<Integer>registrollamadascel=new ArrayList<>();








        while (!salir){

            System.out.println("Menu");
            System.out.println("1.registrar LLamada");
            opcion= teclado.nextInt();

            if (opcion==1){


                System.out.println("Tipo de llamda");
                System.out.println("1.celular precio: 850 min");
                System.out.println("2.local");
                System.out.println("3.larga distancia");
                System.out.println("Digite que llamada va realizar");


            opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                    //Celular
                    nllamadascel++;
                    registrollamadascel.add(nllamadascel);
                    tipollamada tipo =new tipollamada(registrollamadascel.size(),850,"Informacion: ");
                    System.out.println("Cuantas llamadas realizo");
                    System.out.println("digite por favor ");
                    intentosllamadas= teclado.nextInt();
                    System.out.println("Cunto duro la llamada en minutos ");
                    System.out.println("digite por favor ");
                    duracion= teclado.nextInt();

                    celular cel=new celular(registrollamadascel.size(),850,"informacion: ",intentosllamadas,duracion,5);
                    cel.cantllamdas(intentosllamadas,duracion);

                    System.out.println(cel.toString());



                    break;






            }
            }else{
                System.out.println("Salir Llamada");
            }


        }


    }
}