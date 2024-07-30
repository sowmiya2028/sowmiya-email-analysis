
package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String filename) throws FileNotFoundException {
       File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int i = 0;
        List<Mail> map = new ArrayList();
            try{
                archivo = new File(filename);
                fr = new FileReader(archivo);
                br =new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    if(linea.contains("@")){
                        Mail mensaje = new Mail(linea);
                        map.add(mensaje);
                    }
                }
              }
          catch(Exception e){
             e.printStackTrace();
          }finally{
             try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
             }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        return map;
    }
}