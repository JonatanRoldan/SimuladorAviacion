package com.Home;


import com.Clases.PistasClass;
import com.Clases.EstacionMantenimientoClass;
import com.Clases.EstacionDesabordajeClass;
import com.Clases.EstacionControlClass;
import com.Clases.AvionesClass;
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
 * @author Bryan
 */
public class LoadData {
    private LinkedList<AvionesClass> aviones = new LinkedList<>();
    private LinkedList<EstacionControlClass> estacionControl = new LinkedList<>();
    private LinkedList<EstacionDesabordajeClass> estacionDesabordaje = new LinkedList<>();
    private LinkedList<EstacionMantenimientoClass> estacionMantenimiento = new LinkedList<>();
    private LinkedList<PistasClass> pistas = new LinkedList<>();
    
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
                    AvionesClass avion = new AvionesClass();
                    avion.setId(Integer.parseInt(arreglo[0]));
                    avion.setTipo(arreglo[1]);
                    avion.setCombustible(Integer.parseInt(arreglo[2]));
                    getAviones().add(avion);
                }
            }
            System.out.println(getAviones());
                    
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
                        EstacionDesabordajeClass desabordaje = new EstacionDesabordajeClass();
                        desabordaje.setId(Integer.parseInt(arreglo[0]));
                        desabordaje.setCantidad(Integer.parseInt(arreglo[1]));
                        getEstacionDesabordaje().add(desabordaje);
                    }
                    if(Tipo=="control"){
                        EstacionControlClass control = new EstacionControlClass();
                        control.setId(Integer.parseInt(arreglo[0]));
                        control.setCantidad(Integer.parseInt(arreglo[1]));
                        getEstacionControl().add(control);
                    }
                    if(Tipo=="mantenimieto"){
                        EstacionMantenimientoClass mantenimineto = new EstacionMantenimientoClass();
                        mantenimineto.setId(Integer.parseInt(arreglo[0]));
                        mantenimineto.setCantidad(Integer.parseInt(arreglo[1]));
                        getEstacionMantenimiento().add(mantenimineto);
                    }
                    if(Tipo=="pistas"){
                        PistasClass pista = new PistasClass();
                        pista.setId(Integer.parseInt(arreglo[0]));
                        pista.setCantidad(Integer.parseInt(arreglo[1]));
                        getPistas().add(pista);
                    }  
                }
            }
            System.out.println("abordaje"+ getEstacionDesabordaje());
            System.out.println("mantenimiento"+ getEstacionMantenimiento());   
            System.out.println("control"+ getEstacionControl());   
            System.out.println("pistas"+ getPistas());   
        }catch(Exception ex){
        }
    }

    /**
     * @return the aviones
     */
    public LinkedList<AvionesClass> getAviones() {
        return aviones;
    }

    /**
     * @return the estacionControl
     */
    public LinkedList<EstacionControlClass> getEstacionControl() {
        return estacionControl;
    }

    /**
     * @return the estacionDesabordaje
     */
    public LinkedList<EstacionDesabordajeClass> getEstacionDesabordaje() {
        return estacionDesabordaje;
    }

    /**
     * @return the estacionMantenimiento
     */
    public LinkedList<EstacionMantenimientoClass> getEstacionMantenimiento() {
        return estacionMantenimiento;
    }

    /**
     * @return the pistas
     */
    public LinkedList<PistasClass> getPistas() {
        return pistas;
    }
    
    
    
}
