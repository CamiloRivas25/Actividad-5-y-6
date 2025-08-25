//Sirve para estructurar elementos relacionados de forma lógica, facilitando su gestión, comprensión y uso en distintos entornos como programación, redes o sistemas físicos.
package views.landing;
  //Sirve para importar recursos externos al programa, como funciones, datos o módulos, ampliando sus capacidades sin necesidad de desarrollarlos internamente.
import java.util.Scanner;
//Sirve para declarar una clase con acceso público, permitiendo que pueda ser utilizada desde cualquier parte del programa o sistema.
public class LandingView {
         //Es un modificador que limita el acceso a ciertos elementos dentro de una clase, controlando desde qué partes del programa pueden ser utilizados y protegiendo la estructura interna del código.
      private int menu;
            //Sirve en Java para instanciar un objeto de la clase Scanner llamado sc, el cual permite capturar datos ingresados por el usuario a través del teclado durante la ejecución del programa.
       private Scanner sc = new Scanner(System.in);
                           
  public LandingView() {
      //Corresponde a una estructura de control que garantiza la ejecución inicial de un bloque de código antes de verificar si la condición para repetirlo se cumple.                                             
  do {
          // Sirve para imprimir información en la consola o terminal, facilitando la visualización de mensajes, resultados o datos durante la ejecución del programa.      
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|----------------------------- EMPRESA -----------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("    1. Iniciar Sesión");
        System.out.println("    2. Registrarse");
        System.out.println("    0. Salir");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.print("|----- Seleccione una opción: ");
       //Hace referencia a una selección dentro del menú de una aplicación de desarrollo de software que permite ejecutar funciones específicas relacionadas con la programación o configuración del entorno.
         menu = sc.nextInt();            
        System.out.println("|-------------------------------------------------------------------|");
            
   //Sirve para ejecutar programas, como juegos y aplicaciones, activando su funcionamiento dentro del sistema operativo.
switch (menu) {
               
   //Sirve para definir una regla que determina si un bloque de código debe ejecutarse, permitiendo controlar el comportamiento del programa según ciertas condiciones.                   
case 1:
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|------------------------- INICIAR SESIÓN --------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
//Sirve para detener la ejecución de un bucle de forma inmediata, sin esperar a que se cumpla la condición de salida establecida.
break;
case 2:                    
         System.out.println("\n|-------------------------------------------------------------------|");
         System.out.println("|--------------------------- REGISTRARSE ---------------------------|");
         System.out.println("|-------------------------------------------------------------------|");
break;
case 0:
         System.out.println("|----- ¡Hasta Pronto! ...");
         System.out.println("|-------------------------------------------------------------------|");        
 break;
 // Sirve para establecer una opción, valor o comportamiento predeterminado que se aplica cuando no se especifica uno diferente.
 default:
         System.out.println("|----- ¡Opción No Válida!");
         System.out.println("|-------------------------------------------------------------------|");
                    
    }
   //Sirve para repetir un bloque de código mientras la variable menu tenga un valor distinto de cero, controlando la ejecución según esa condición.                
  } while (menu != 0);
 }
                          
    
}
