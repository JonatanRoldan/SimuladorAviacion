
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jony
 */
public class loadData {
    LinkedList<avionesClass> aviones = new LinkedList<>();
    LinkedList<estacionControlClass> estacionControl = new LinkedList<>();
    LinkedList<estacionDesabordajeClass> estacionDesabordaje = new LinkedList<>();
    LinkedList<estacionMantenimientoClass> estacionMantenimiento = new LinkedList<>();
    LinkedList<pistasClass> pistas = new LinkedList<>();
    
    public void cargarAviones(File archivo){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine())!=null){
                String arreglo [] = linea.split(",");
                if(arreglo.length==3){
                    avionesClass avion = new avionesClass();
                    avion.setId(Integer.parseInt(arreglo[0]));
                    avion.setTipo(arreglo[1]);
                    avion.setCombustible(Integer.parseInt(arreglo[2]));
                    aviones.add(avion);
                }
            }
            System.out.println(aviones);
                    
        }catch(Exception ex){
        }
    }
    public void cargarEstaciones(File archivo,String Tipo){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!=null){
                String arreglo [] = linea.split(",");
                if(arreglo.length==2){
                    if(Tipo=="desabordaje"){
                        estacionDesabordajeClass desabordaje = new estacionDesabordajeClass();
                        desabordaje.setId(Integer.parseInt(arreglo[0]));
                        desabordaje.setCantidad(Integer.parseInt(arreglo[1]));
                        estacionDesabordaje.add(desabordaje);
                    }
                    if(Tipo=="control"){
                        estacionControlClass control = new estacionControlClass();
                        control.setId(Integer.parseInt(arreglo[0]));
                        control.setCantidad(Integer.parseInt(arreglo[1]));
                        estacionControl.add(control);
                    }
                    if(Tipo=="mantenimieto"){
                        estacionMantenimientoClass mantenimineto = new estacionMantenimientoClass();
                        mantenimineto.setId(Integer.parseInt(arreglo[0]));
                        mantenimineto.setCantidad(Integer.parseInt(arreglo[1]));
                        estacionMantenimiento.add(mantenimineto);
                    }
                    if(Tipo=="pistas"){
                        pistasClass pista = new pistasClass();
                        pista.setId(Integer.parseInt(arreglo[0]));
                        pista.setCantidad(Integer.parseInt(arreglo[1]));
                        pistas.add(pista);
                    }  
                }
            }
            System.out.println("abordaje"+ estacionDesabordaje);
            System.out.println("mantenimiento"+ estacionMantenimiento);   
            System.out.println("control"+ estacionControl);   
            System.out.println("pistas"+ pistas);   
        }catch(Exception ex){
        }
    }
    
    
    
}
