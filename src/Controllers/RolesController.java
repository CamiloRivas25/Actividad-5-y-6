///Permite agrupar distintos tipos de elementos siguiendo principios funcionales, ya sean digitales o tangibles.
package controllers;
//Permite importar módulos, funciones o datos desde fuentes externas al programa principal.
import views.modules.roles.RolesView;
//Se utiliza para declarar una clase con acceso público, accesible desde cualquier parte del programa.
public class RolesController {
        //Sirve para ocultar partes de una clase que no deberían usarse desde fuera.
     private RolesView rolesView;
   
     public RolesController() {
          //Se utiliza para inicializar un nuevo objeto basado en un tipo de datos definido.
     rolesView = new RolesView();

    }
    
}
