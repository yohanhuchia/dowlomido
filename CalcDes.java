package calculador.descarga;

import java.util.Scanner;


//este software es solo una prueba de programacion y su uso es personal.

public class CalcDes {

  public static void main(String[] args) {
  
// declaración de variables. 
  boolean jue = true ;
  int  obc = 0;
  float tamano = 0, tiempo = 0, resultado = 0, velocidad = 0;
   Scanner entrada = new Scanner(System.in);
   
 // Parte donde se explica la funcion del programa y se pide que ingrese el calculo a realizar 
   System.out.println("Hola, bienvenido a Downlomido, un software para realizar cálculos con respecto al tiempo de la descarga."); 
   System.out.println(""); 
   
   System.out.println("A continuacion ingrese el tipo de calculo a realizar:"); 
   System.out.println("1: calcular cuanto tiempo necesita para realizar una descarga conociendo el tamaño de descarga."); 
   System.out.println("2: calcular el tamaño de lo que puedes descargar con cierto tiempo disponible."); 
   
   obc = entrada.nextInt();
   
//bucle para evitar que se pongan más opciones de las que se ofrecen 
   while (jue) {
     if (obc < 1 || obc > 2){
       System.out.println("La opción elegida no existe, por favor intente, otra vez"); 
       obc = entrada.nextInt();
     }else {
       jue = false;
     }
     
   }
   
//calculo de la opción # 1.
   if(obc == 1){
     System.out.print("Para continuar, ingrese la velocidad aproximada de descarga(mb/s): "); 
     velocidad = entrada.nextFloat();
     
     System.out.print("Ok, ahora ingrese el tamaño de la descarga(mb): "); 
     tamano = entrada.nextFloat();
     
     resultado = (tamano / velocidad) / 60;
     System.out.println(" "); 
     System.out.println("Para realizar una descarga de " + tamano + " mb, necesitas " + resultado + " minutos."); 
     
// calculo de la opción # 2
   }else if(obc == 2){
     System.out.print("Para continuar, ingrese la velocidad aproximada de descarga(mb/s): "); 
     velocidad = entrada.nextFloat();
     
     System.out.print("Ok, ahora ingrese cuantos minutos dispone para realizar la descarga: "); 
     tiempo = entrada.nextFloat();
     System.out.println(" "); 
     resultado = (tiempo * 60) * velocidad ;
     
     System.out.println("Con " + tiempo + " minutos " + " puedes realizar una descarga de " + resultado + " mb."); 
   }
        
//fin del programa   
  }
}
