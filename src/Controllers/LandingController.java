//Permite estructurar y clasificar elementos de forma lógica, abarcando desde código fuente hasta datos de red y productos físicos.
package controllers;
////Permite importar funciones, datos o módulos desde fuentes externas al programa principal.
 import views.landing.LandingView;
//Permite definir una clase que puede ser accedida por otras clases, incluso fuera del paquete donde fue creada.
public class LandingController {
        //Es un modificador que limita el acceso a atributos o métodos de una clase desde otras clases o paquetes.

     private LandingView landingView;

     public LandingController() {
    //Sirve para generar engagement con los usuarios y guiarlos hacia una conversión mediante una oferta específica.
  landingView = new LandingView();
       
  }
    
}
