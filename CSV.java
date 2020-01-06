/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.google.gson.Gson;
import com.opencsv.CSVIterator;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Estacion;
import modelo.Intento;
import modelo.Transmision;

/**
 *
 * @author sfsuarez
 */
public class CSV {
    private int no=0;
    private List<String> nombresEstaciones = new ArrayList<String>();
    private Gson gson = new Gson();
    
    public Transmision leerArchivoCSV( File f ){
        Transmision transmision = new Transmision();
        transmision.setNo(1);
        Intento intent = null;
        Estacion estacion;
        List<Intento> intentos  = new ArrayList<Intento>();
        List<Estacion> estaciones = new ArrayList<Estacion>();
        
        try {
            System.out.println("Archivo: " + f.getAbsolutePath());
            CSVReader reader = new CSVReader(new FileReader( f.getAbsoluteFile()));
           
            Iterator<String[]> iterator = reader.iterator();

            while( iterator.hasNext() ) {
               
               
             
               
                String[] fila = iterator.next();
                for(int i=0; i < fila.length; i++  ){
                
                    if( no < 1 && i > 0 ){//Lee cabecera por el nombre de estaciones
                
                        nombresEstaciones.add( fila[i] );
                        
                    
                    }else{
                        
                        if( no > 0 ){
                        
                            if(  i < 1 ){
                                intent = new Intento();
                                System.out.println(no + " # Intentosss:" + fila[i] );
                                intent.setNoIntent( string2Int ( fila[i] ) );
                            }else{
                                estacion = new Estacion();
                                estacion.setIdStacion( nombresEstaciones.get(i - 1));
                                estacion.setNoAleatorio( string2Int ( fila[i] ) );
                                estacion.setTiempo(0);
                                estacion.setTxMb(0);
                                estaciones.add(estacion);
                                System.out.print( fila[i] + " - ");

                            }
                        }
    
                    }
                
                }//End for
                if( no > 0){
                
                    intent.setEstaciones(estaciones);
                    intentos.add(intent);
                    System.out.println( );
                
                }
                
               
                no++;
              
            }
            transmision.setIntentos(intentos);
            
            System.out.println("Nombres Estaciones: " + gson.toJson(nombresEstaciones));
            System.out.println("Transmisiones: " + gson.toJson( transmision ));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
        return transmision;
        
        
        
    }
    
    
    
    
    public int string2Int( String dato ){
    
        int no = -1;
        
        try{
        
           no = Integer.parseInt(dato);
        }catch( Exception ex ){
        
            no = -2;
        
        }
        
        return no;
    
    }
    
}
