package frasesdodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView textoNovaFrase;
    private Button  botaoNovaFrase;
    private String[] frases = {

            "Frase1",
            "Frase2",
            "Frase3"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textoNovaFrase = (TextView) findViewById(R.id.txtId);
        botaoNovaFrase = (Button) findViewById(R.id.btnId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random radomico = new Random();

                int numAleatorio = radomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numAleatorio]);
            }
        });


    }
}
