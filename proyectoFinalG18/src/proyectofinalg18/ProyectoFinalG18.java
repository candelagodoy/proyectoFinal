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
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ProyectoFinalG18 {

    public static void main(String[] args) {

        Entrenador Luis = new Entrenador(37412834, "Luis Gabriel", "Segura", "fullbody", true);
        Entrenador Candela = new Entrenador(39001002, " Candela Guadalupe", "Godoy", "Spinning", true);
        Entrenador Jose = new Entrenador(32001002, "Jose Enrique", "Zuñiga", "Crossfit", true);
        Entrenador Tomas = new Entrenador(45001002, "Tomas Emiliano", "Carrillo", "Calistenia", true);
        Entrenador Juanjo = new Entrenador(5, 35001002, "Juan Jose", "Perez", "Boxeo", true);

        Socio enrique = new Socio("39001002", "Enrique pascual", "Tozo", 22, "enrique@hotmail.com", 261333111, true);
        Socio pablo = new Socio(2,"38001002", "Pablo Lorenzo", "Gonzalez", 25, "pablo@gmail.com", 261221222, true);
        Socio fabiana = new Socio(3,"40001002", "Fabiana ", "Ramis", 19, "fabi@hotmail.com", 261441442, true);
        Socio marcela = new Socio(4,"37548964", "Marcela", "Gomez", 27, "marce@hotmail.com", 266487545, true);
        

        Membresia membresia = new Membresia(pablo, 30, LocalDate.of(2024, 06, 01), LocalDate.of(2024, 07, 02) , 16000, true);
        Membresia membresia2 = new Membresia(6,marcela,14, LocalDate.of(2024, 06, 05), LocalDate.of(2024,07 , 06), 13500, true);
        
        
        ////PRUEBAS ASISTENCIA DATA ////
            
            
            
            
            
        ////PRUEBAS CLASE DATA ////
//     //agregar clase a la DB
//       LocalTime hora = LocalTime.of(17, 00, 00);
//       Clase cl= new Clase("boxeo",Juanjo,hora,10,true);
//       
//       ClaseData cd= new ClaseData();
//       
//       cd.guardarClase(cl);




        //// PRUEBAS SOCIO DATA ////
        SocioData sD = new SocioData();
        //Insert nuevos Socios 

//        sD.guardarSocio(enrique);
         //        sD.guardarSocio(pablo)
        //sD.guardarSocio(marcela);
        //sD.guardarSocio(fabiana);
        //sD.actualizarSocio(fabiana);
        //System.out.println(""+sD.listarSociosActivos());
        //System.out.println(""+sD.buscarSocioPorNumeroSocio("38001002"));
        //sD.eliminarSocio(3);

        
        
        
        ////PRUEBAS MEMBRESIA DATA////
       MembresiaData mD= new MembresiaData();
        //Guardar Membresia
        //mD.guardarMembresia(membresia2);
        //Buscar Membresia 
//       System.out.println(""+mD.buscarMembresia("39001002"));
        //Listar Mmebresias
//        System.out.println(""+mD.listarMembresias());
        //Eliminar Membresia
//        mD.eliminarMembresia(4);
        //Modificar Membresia
        //mD.modificarMembresia(membresia2);





       ////PRUEBAS ENTRENADOR DATA////

        EntrenadorData eD = new EntrenadorData();
        //Insertar nuevos Entrenadores 
//       eD.guardarEntrenador(Tomas);
//       eD.guardarEntrenador(Jose);
//       eD.guardarEntrenador(Luis);
//       eD.guardarEntrenador(Candela);
//       eD.guardarEntrenador(Juanjo);
        //Buscar un Entrenador
        // System.out.println(eD.buscarEntrenadorPoNombre("Jose Enrique"));
//       eD.buscarEntrenador(2);
        //Busqueda por especialidad
        //System.out.println(""+ eD.buscarEntrenadorPorEspecialidad("Calistenia"));
        //Listar Entrenadores 
//        System.out.println(""+ eD.listarEntrenadores());
        //Modificar y Eliminar un Entrenador 
        //eD.modificarEntrenador(Juanjo);
        //eD.eliminarEntrenador(5);
    }

}
