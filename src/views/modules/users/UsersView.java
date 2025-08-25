//Agrupa elementos relacionados de forma lógica para facilitar su orden, gestión y eficiencia en programación, redes y sistemas físicos.
package views.modules.users;
  //Importa funciones, datos o código externo para integrarlos en tu programa o sistema.
import java.util.Scanner;
//Declara una clase pública que puede ser accedida desde cualquier parte del programa o módulo.
public class UsersView {
      //Limita el acceso a un miembro de clase, controlando desde dónde puede ser utilizado dentro del programa.
      private int menu;
    //Sirve en Java para crear un objeto de la clase Scanner llamado sc que permite leer datos del teclado
private Scanner sc = new Scanner(System.in);
              
public UsersView() {
 //Ejecuta el código una vez antes de verificar si debe repetirse, como en un bucle do-while.                                                           
do {
         //Muestra texto o datos en la consola para informar al usuario o verificar resultados durante la ejecución del programa.                                    
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|---------------------- GESTI�N DE USUARIOS ------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("    1. Registrar Usuario");
        System.out.println("    2. Listar Usuarios");
        System.out.println("    3. Actualizar Usuario");
        System.out.println("    4. Eliminar Usuario");
        System.out.println("    0. Cerrar Sesi�n");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.print("|----- Seleccione una opci�n : ");
        //Indica una función disponible en el menú de una aplicación de desarrollo de software.
        menu = sc.nextInt();            
        System.out.println("|-------------------------------------------------------------------|");
        //Permite ejecutar juegos o aplicaciones en el sistema.                         
        switch (menu) {
     // Establece una regla que determina si un bloque de código debe ejecutarse dentro de una estructura de control.                                                        
case 1:
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|----------------------- REGISTRAR USUARIO -------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
//Detiene la ejecución del bucle y sale de él de forma inmediata.
break;
case 2:
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|------------------------ LISTAR USUARIOS --------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
break;
case 3:
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|----------------------- ACTUALIZAR USUARIO ------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
break;
case 4:
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|------------------------ ELIMINAR USUARIO -------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
break;
case 0:
        System.out.println("|----- �Sesi�n Cerrada! ...");
        System.out.println("|-------------------------------------------------------------------|");        
break;
 // Es para indicar una opcion, un valor o comportamiento estandar 
default:
        System.out.println("|----- �Opci�n No V�lida!");
        System.out.println("|-------------------------------------------------------------------|");
               
      }
//Crea un bucle que se repite mientras menu sea distinto de cero.                              
    } while (menu != 0);
  }
    
}