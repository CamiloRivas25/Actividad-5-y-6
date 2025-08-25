//Se utiliza para agrupar componentes relacionados, facilitando su gestión en entornos digitales y físicos.
package controllers;
//Permite importar módulos, funciones o datos desde fuentes externas al programa principal.
  import views.modules.users.UsersView;
//Define una clase que puede ser accedida por otras clases, incluso si están en paquetes distintos.
public class UsersController {
            //Sirve para ocultar partes de una clase que no deberían usarse desde fuera.
     private UsersView usersView;
                
public UsersController() {
     //Creación de una interfaz (View) para mostrar información relacionada con los usuarios.
 usersView = new UsersView();
                    
    }
    
}
