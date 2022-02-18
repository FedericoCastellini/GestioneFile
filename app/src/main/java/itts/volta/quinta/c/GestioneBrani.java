package itts.volta.quinta.c;

import android.content.Context;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GestioneBrani {
    public String visualizzaTitolo(String autore){
        String testo=autore;
        return  testo;
    }
}
public String leggiFIleRaw(String nomefile, Context c) {
    String testo="";
    Resources res = c.getResources();
    InputStream is = res.openRawResource(R.raw.Brano);
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    while ((testo = br.readLine())!=null);
    {
        sh.append(testo + "\n");
    }
    return testo;
}