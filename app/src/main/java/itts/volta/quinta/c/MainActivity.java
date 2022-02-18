package itts.volta.quinta.c;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb;
    Button btnCerca;
    EditText txtAutore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb = new GestioneBrani();

        txtAutore=(EditText)findViewById(R.id.textViewEditText);
        btnCerca=(Button) findViewById(R.id.buttonCerca);

        btnCerca.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(getApplicationContext, "Ok", Toast.LENGTH_LONG).show();
                gb.visualizzaTitolo("Eminem");
            }
        });
    }
}