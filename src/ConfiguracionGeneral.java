
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jony
 */
public class ConfiguracionGeneral {
    
    private static LoadData loadDataInstancia = null;
    private int tiempoConsumoCombustible;
    private int tiempoAterrizaje;
    private int tiempoDesbordaje;
    private int tiempoMantenimiento;
    private int tiempoDespegue;
    
    public void calculoTiempo(LinkedList<AvionesClass> lista){
        AvionesClass avion = new AvionesClass();
        
//        avion.setId(Integer.parseInt(arreglo[0]));
    }
   
    public static LoadData getLoadData(){
        
        if( loadDataInstancia == null ){
            loadDataInstancia = new LoadData();
        }
        return loadDataInstancia;
    } 
}
