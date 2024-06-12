package proyectofinalg18;

import accesoADatos.AsistenciaData;
import accesoADatos.ClaseData;
import accesoADatos.EntrenadorData;
import accesoADatos.MembresiaData;
import accesoADatos.SocioData;
import entidades.Asistencia;
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

        Entrenador Luis = new Entrenador(3,37412834, "Luis Gabriel", "Segura", "fullbody", true);
        Entrenador Candela = new Entrenador(4,39001002, " Candela Guadalupe", "Godoy", "Spinning", true);
        Entrenador Jose = new Entrenador(2,32001002, "Jose Enrique", "Zuñiga", "Crossfit", true);
        Entrenador Tomas = new Entrenador(1,45001002, "Tomas Emiliano", "Carrillo", "Calistenia", true);
        Entrenador Juanjo = new Entrenador(5, 35001002, "Juan Jose", "Perez", "Boxeo", true);

        Socio enrique = new Socio(1,"39001002", "Enrique pascual", "Tozo", 22, "enrique@hotmail.com", 261333111, true);
        Socio pablo = new Socio(2,"38001002", "Pablo Lorenzo", "Gonzalez", 25, "pablo@gmail.com", 261221222, true);
        Socio fabiana = new Socio(3,"40001002", "Fabiana ", "Ramis", 19, "fabi@hotmail.com", 261441442, true);
        Socio marcela = new Socio(4,"37548964", "Marcela", "Gomez", 27, "marce@hotmail.com", 266487545, true);
        

        Membresia membresia = new Membresia(pablo, 30, LocalDate.of(2024, 06, 01), LocalDate.of(2024, 07, 02) , 16000, true);
        Membresia membresia2 = new Membresia(6,marcela,13, LocalDate.of(2024, 06, 05), LocalDate.of(2024,07 , 06), 13500, true);
        
        Clase cl= new Clase(1,"Boxeo Profesional",Juanjo,LocalTime.of(17, 00),12,true);
        Clase c2= new Clase("Fullbody",Luis,LocalTime.of(16, 00),15,true);
        Clase c3= new Clase(7,"Spinning",Candela,LocalTime.of(18, 00),13,true);
        Clase c4= new Clase(8,"Crossfit",Jose,LocalTime.of(19, 00),15,true);
        Clase c5= new Clase(9,"Calistenia",Tomas,LocalTime.of(20, 00),11,true);
        
        
        Asistencia a1 = new Asistencia(enrique,c4,LocalDate.of(2024, 06, 05));
        Asistencia a2 = new Asistencia(7,pablo,c4,LocalDate.of(2024, 06, 10));
        Asistencia a3 = new Asistencia(enrique,c5,LocalDate.of(2024, 06, 07)); 
        Asistencia a4 = new Asistencia(marcela, c3,LocalDate.of(2024, 06, 11));
        Asistencia a5 = new Asistencia(marcela, c3,LocalDate.of(2024, 06, 10));

        
        
        ////PRUEBAS ASISTENCIA DATA ////
        AsistenciaData aD=new AsistenciaData();   
        //Guardando Asistencias
//        aD.guardarAsistencia(a1);
//        aD.guardarAsistencia(a2);
//        aD.guardarAsistencia(a3);
//        aD.guardarAsistencia(a4);
 //       aD.guardarAsistencia(a5);
//        aD.guardarAsistencia(a5);

        //Eliminando una asistencia
//        aD.eliminarAsistencia(1, 8);
        //Modificando Asistencia 
//        aD.modificarAsistencia(a2);
        //Listando Asistencias
//        System.out.println(""+aD.listandoAsistencia());
        //Listando Asistencias por Socio
//        System.out.println(""+aD.asistenciaPorSocio(1));
            

            
        ////PRUEBAS CLASE DATA ////
        
        ClaseData cD = new ClaseData();
        
//     //Agregar clase a la DB
//        cD.guardarClase(cl);
//        cD.guardarClase(c2);
//        cD.guardarClase(c3);
//        cD.guardarClase(c4);
//        cD.guardarClase(c5);
       //Eliminar clase
//       cD.eliminarClase(1);
       //Listar Clases
//        System.out.println(""+cD.listarClases());
       //Buscar Clase
//        System.out.println(""+cD.buscarClasePorNombre("Fullbody"));
       //Modificar capacidad
//       cD.ModificarCapacidadClase(c4);
       //Modificar clase 
//       cD.ModificarClase(cl);





        //// PRUEBAS SOCIO DATA ////
        SocioData sD = new SocioData();
        //Insert nuevos Socios 

//        sD.guardarSocio(enrique);
         //        sD.guardarSocio(pablo)
        //sD.guardarSocio(marcela);
        //sD.guardarSocio(fabiana);
        //sD.actualizarSocio(fabiana);
        //System.out.println(""+sD.listarSociosActivos());
        //System.out.println(""+sD.buscarSocioPorNumeroDni("38001002"));
        //sD.eliminarSocio(3);
        

        
        
        
        ////PRUEBAS MEMBRESIA DATA////
       MembresiaData mD= new MembresiaData();
        //Guardar Membresia
        //mD.guardarMembresia(membresia2);
        //Buscar Membresia 
       System.out.println(""+mD.buscarMembresia("38001002"));
        //Listar Mmebresias
//        System.out.println(""+mD.listarMembresias());
        //Eliminar Membresia
//        mD.eliminarMembresia(4);
        //Modificar Membresia
        //mD.modificarMembresia(membresia2);
        //Modificar cantidad de pases 
//        mD.modificarCantidadPases(membresia2);
        //Buscar membresia por ID
//        System.out.println(mD.buscarMembresiaPorId(6));




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
         //System.out.println(""+ eD.buscarEntrenadorPoNombre("Adam"));
         
        //Busqueda por especialidad
        //System.out.println(""+ eD.buscarEntrenadorPorEspecialidad("Calistenia"));
       // System.out.println(""+ eD.buscarEntrenadorPorEspecialidad("Kickboxing"));
        //Listar Entrenadores 
//        System.out.println(""+ eD.listarEntrenadores());
        //Modificar y Eliminar un Entrenador 
        //eD.modificarEntrenador(Juanjo);
        //eD.eliminarEntrenador(5);
    }

}
