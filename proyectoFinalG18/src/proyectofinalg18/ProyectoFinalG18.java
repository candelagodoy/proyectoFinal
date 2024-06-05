
package proyectofinalg18;

import accesoADatos.EntrenadorData;
import entidades.Entrenador;

        
        
        
public class ProyectoFinalG18 {

   
    public static void main(String[] args) {
       
       
       Entrenador Luis= new Entrenador(37412834, "Luis Gabriel", "Segura", "fullbody", true);
       Entrenador Candela = new Entrenador(39001002," Candela Guadalupe", "Godoy", "Spinning", true);
       Entrenador Jose = new Entrenador (32001002,"Jose Enrique", "Zuñiga", "Crossfit", true);
       Entrenador Tomas = new Entrenador (45001002,"Tomas Emiliano", "Carrillo","Calistenia", true);
       Entrenador Juanjo = new Entrenador (35001002,"Juan Jose", "Perez", "Boxeo", true);
       
       EntrenadorData eD= new EntrenadorData();
       
       
       
       
       
       //Insertar nuevos Entrenadores 
       
//       eD.guardarEntrenador(Tomas);
//       eD.guardarEntrenador(Jose);
//       eD.guardarEntrenador(Luis);
//       eD.guardarEntrenador(Candela);
//        eD.guardarEntrenador(Juanjo);

      //Buscar un Entrenador
      
//        System.out.println(eD.buscarEntrenador(2));
//        eD.buscarEntrenador(2);



     //Busqueda por Dni 
     
//       System.out.println(""+ eD.buscarEntrenadorPorDni(37412834));



    //Listar Entrenadores 
//        System.out.println(""+ eD.listarEntrenadores());



    //Modificar y Eliminar un Entrenador 
    
    
    
      
    }
    
}
