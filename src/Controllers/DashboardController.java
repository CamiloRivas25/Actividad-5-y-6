//Permite la organización coherente de componentes, desde líneas de código hasta datos en sistemas de red y artículos físicos
package controllers;
//Permite importar funciones, datos o fragmentos de código desde fuentes externas al sistema principal.
import views.dashboard.DashboardView;
//Se utiliza para declarar una clase accesible desde cualquier parte del programa.
public class DashboardController {
    //Sirve para definir el nivel de acceso que otros componentes del programa tienen sobre un miembro específico de la clase.
      private DashboardView dashboardView;

 public DashboardController() {
    //Ayuda a ver lo más importante sin complicaciones ni exceso de detalles.
dashboardView = new DashboardView();
  }
    
}