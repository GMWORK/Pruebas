package conecctionrest;

import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class ParseJson {
        private Object url;

    
    public ParseJson() {
            
    }

    public ParseJson(Object url) {
        this.url = url;
    }
    
    public Object getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    
    
    public void pars(String ks) throws JSONException{
             
        JSONArray array = new JSONArray(ks);
        JSONObject object = array.getJSONObject(0);
        JSONObject object2 = array.getJSONObject(1);
        System.out.println(object2.get("nombre"));
    }

}
