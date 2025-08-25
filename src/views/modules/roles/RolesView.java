//Sirve para estructurar y clasificar elementos relacionados de forma lógica, facilitando su comprensión, gestión y eficiencia en programación, redes, bases de datos y sistemas físicos.
package views.modules.roles;
  //Sirve para incorporar funcionalidades, datos o código externos, ampliando las capacidades del programa sin necesidad de desarrollarlos desde cero.
import java.util.Scanner;
//Sirve para declarar una clase accesible desde cualquier parte del programa o sistema.
public class RolesView {
             //Sirve para controlar qué partes del programa pueden acceder a un miembro de una clase, limitando su visibilidad y protegiendo la encapsulación del código.
    private int menu;
    //Sirve para crear un objeto que permite leer datos ingresados por el usuario desde el teclado en Java.
private Scanner sc = new Scanner(System.in);
                
public RolesView() {

    //Sirve para ejecutar un bloque de código una vez antes de verificar una condición que determina si debe repetirse, lo que permite garantizar al menos una ejecución inicial del ciclo.                                           
do {
         // Sirve para desplegar información en la consola o terminal, permitiendo al programa comunicar mensajes, resultados o instrucciones al usuario mediante texto.                   
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------ GESTI�N DE ROLES -------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Rol");
            System.out.println("    2. Listar Roles");
            System.out.println("    3. Actualizar Rol");
            System.out.println("    4. Eliminar Rol");
            System.out.println("    0. Cerrar Sesi�n");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opci�n : ");
            //Hace referencia a una opción del menú en una aplicación de desarrollo que permite acceder a funciones específicas del entorno de programación.
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
               
               //Sirve para ejecutar o iniciar juegos y aplicaciones en el sistema.
            switch (menu) {
    // Sirve para establecer una regla o criterio que determina si un bloque de código debe ejecutarse, repitiéndose o desviándose según el resultado de esa condición dentro de estructuras como if, while o for.                              
case 1:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------- REGISTRAR ROL ---------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
//Sirve para finalizar la ejecución de un bucle de forma inmediata, sin esperar a que se cumpla la condición de salida, permitiendo continuar con el resto del programa.
break;
case 2:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------- LISTAR ROLES ----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
break;
case 3:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------- ACTUALIZAR ROL --------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
break;
case 4:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|-------------------------- ELIMINAR ROL ---------------------------|");
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
       // Sirve para crear un bucle que se repite mientras la variable menu sea distinta de cero.                          
    } while (menu != 0);
                    
  }
     
    
}
