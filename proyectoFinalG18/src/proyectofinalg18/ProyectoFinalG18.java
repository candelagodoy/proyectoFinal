
package proyectofinalg18;

import accesoADatos.ClaseData;
import accesoADatos.EntrenadorData;
import accesoADatos.MembresiaData;
import accesoADatos.SocioData;
import entidades.Clase;
import entidades.Entrenador;
import entidades.Membresia;
import entidades.Socio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

        
        
        
public class ProyectoFinalG18 {

   
    public static void main(String[] args) {
       
       
       Entrenador Luis= new Entrenador(37412834, "Luis Gabriel", "Segura", "fullbody", true);
       Entrenador Candela = new Entrenador(39001002," Candela Guadalupe", "Godoy", "Spinning", true);
       Entrenador Jose = new Entrenador (32001002,"Jose Enrique", "Zuñiga", "Crossfit", true);
       Entrenador Tomas = new Entrenador (45001002,"Tomas Emiliano", "Carrillo","Calistenia", true);
       Entrenador Juanjo = new Entrenador (6,32001002,"Juan Jose", "Perezo", "Boxeo", true);
       
       Socio enrique= new Socio("39001002", "Enrique pascual", "Tozo", 22, "enrique@hotmail.com", 261333111, true);
       Socio pablo= new Socio(3,"38001002", "Pablo Lorenzo", "Gonzalez", 25, "pablo@gmail.com", 261221222, true);
       Socio fabiana= new Socio(6,"40001002", "Fabiana ", "Ramis", 19,"fabi@hotmail.com",261441442, true);









  ////Pruebas AsistenciaData////














       ////Pruebas ClaseData////


//     //agregar clase a la DB
//       LocalTime hora = LocalTime.of(17, 00, 00);
//       Clase cl= new Clase("boxeo",Juanjo,hora,10,true);
//       
//       ClaseData cd= new ClaseData();
//       
//       cd.guardarClase(cl);
      
    




     //// Pruebas SocioData ////





SocioData sD= new SocioData();
        //Insert nuevos Socios 
        
//        sD.guardarSocio(enrique);
 //         sD.guardarSocio(pablo);
 //sD.guardarSocio(fabiana);
  sD.actualizarSocio(fabiana);
  //      System.out.println(""+sD.listarSociosActivos());
 //sD.buscarSocioPorNumeroSocio(2);
 //sD.eliminarSocio(3);
 
 
 
 
 
 
 
 
 
     ////Pruebas MembresiaData////
 
//       MembresiaData mD= new MembresiaData();
//       Membresia membresia = new Membresia(pablo, 30, LocalDate.of(2024, 06, 01), LocalDate.of(2024, 07, 02) , 16000, true);
//       mD.guardarMembresia(membresia);
        //Buscar Membresia 
        
//       System.out.println(""+mD.buscarMembresia("39001002"));
//        System.out.println(""+mD.listarMembresias());
        
        
       







        //Pruebas EntrenadorData


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
     
 //      System.out.println(""+ eD.buscarEntrenadorPorDni(35001002));



    //Listar Entrenadores 
//        System.out.println(""+ eD.listarEntrenadores());



    //Modificar y Eliminar un Entrenador 
//    eD.modificarEntrenador(Juanjo);
    
 //   eD.eliminarEntrenador(5);
      
    }
    
}
