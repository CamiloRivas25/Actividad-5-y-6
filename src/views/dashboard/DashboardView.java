//Organiza y agrupa elementos de forma lógica en distintos contextos.
package views.dashboard;
  //Se utiliza para importar o integrar recursos externos, como funciones, datos o módulos, dentro de un programa o sistema, ampliando sus capacidades sin necesidad de desarrollarlos desde cero.
import java.util.Scanner;
//Sirve para definir una clase p�blica
public class DashboardView {
     //Es un modificador que limita el acceso a atributos o métodos de una clase, controlando desde dónde pueden ser utilizados y protegiendo la encapsulación del código.
      private int menu;
      //Se utiliza en Java para instanciar un objeto de la clase Scanner llamado sc
private Scanner sc = new Scanner(System.in);

public DashboardView() {
   // Se refiere a una estructura de control que garantiza la ejecución inicial de un bloque de código antes de verificar si debe repetirse según una condición.                          
 do {            
     //Se utiliza para imprimir información en la consola o terminal, permitiendo visualizar mensajes, resultados o datos durante la ejecución del programa. 
      System.out.println("\n|-------------------------------------------------------------------|");
      System.out.println("|---------------------------- DASHBOARD ----------------------------|");
      System.out.println("|-------------------------------------------------------------------|");
      System.out.println("    1. Gesti�n de Roles");
      System.out.println("    2. Gesti�n de Usuarios");
      System.out.println("    0. Cerrar Sesi�n");
      System.out.println("|-------------------------------------------------------------------|");
      System.out.print("|----- Seleccione una opci�n : ");
      //Hace referencia a una funcionalidad o comando disponible en el menú de una aplicación de desarrollo de software, que permite al usuario ejecutar acciones específicas relacionadas con el entorno de programación.
      menu = sc.nextInt();            
      System.out.println("|-------------------------------------------------------------------|");
          
      //Se utiliza para ejecutar o lanzar programas, como juegos y aplicaciones, permitiendo que comiencen su funcionamiento en el sistema.
switch (menu) {
     //    Se utiliza para establecer una condición que determina si un bloque de código debe ejecutarse, permitiendo controlar el flujo lógico del programa según criterios definidos.               
case 1:
      System.out.println("\n|-------------------------------------------------------------------|");
      System.out.println("|------------------------ GESTI�N DE ROLES -------------------------|");
      System.out.println("|-------------------------------------------------------------------|");
//Sirve para finalizar la ejecución de un bucle de forma inmediata, sin esperar a que se cumpla la condición de salida.
break;
case 2:
      System.out.println("\n|-------------------------------------------------------------------|");
      System.out.println("|---------------------- GESTI�N DE USUARIOS ------------------------|");
      System.out.println("|-------------------------------------------------------------------|");
break;
case 0:
      System.out.println("|----- �Sesi�n Cerrada! ...");
      System.out.println("|-------------------------------------------------------------------|");        
break;
// Sirve para establecer una opción, valor o comportamiento predeterminado que se aplica cuando no se especifica uno diferente.
default:
      System.out.println("|----- �Opci�n No V�lida!");
      System.out.println("|-------------------------------------------------------------------|");
 }
//Sirve para establecer una estructura de repetición que ejecuta un bloque de código mientras la variable menu tenga un valor distinto de cero, permitiendo controlar el flujo del programa según esa condición.
   } while (menu != 0);
  }
    
}
