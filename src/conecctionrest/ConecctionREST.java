/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecctionrest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author kevin
 */

public class ConecctionREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException {
        //TODO code application logic here
        //DataTimeClass fechaAct = new DataTimeClass("Now");
        //fechaAct.mostrarFechaHoraSistema();        
        URL url;
            try {
		// get URL content
		url = new URL("http://192.168.2.254:8080/webService/webresources/usuario/");
		URLConnection conn = url.openConnection();
 
		// open the stream and put it into BufferedReader
		BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
 
                    String inputLine;
 
                    //save to this Array
                    ArrayList array = new ArrayList();
			while ((inputLine = br.readLine()) != null) {
				array.add(inputLine);
            		}
                        for(int i=0;i<array.size();i++){    
                            String o = array.get(i).toString();
                            ParseJson js = new ParseJson();
                            js.pars(o);
                        }
			br.close();      
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
                   //ParseJson js = new ParseJson();
                   //js.pars();
    }
    
}
