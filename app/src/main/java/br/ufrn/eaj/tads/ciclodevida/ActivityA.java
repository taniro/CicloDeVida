package br.ufrn.eaj.tads.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class ActivityA extends AppCompatActivity {

    public static final String tag = "CICLO_VIDA";
    public static final int MULTIPL = 77;
    public static final int RESULT_X2 = 55;
    public static final int RESULT_X5 = 56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Log.i(tag, "Método onCreate() invocado.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "Método onStart() invocado.");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, "Método onResume() invocado.");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "Método onPause() invocado.");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "Método onStop() invocado.");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, "Método onRestart() invocado.");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, "Método onDestroy() invocado.");

    }

    public void click1(View v){

        Intent intent = new Intent(this,ActivityB.class);
        Bundle params = new Bundle();

        EditText texto = (EditText) findViewById(R.id.texto);

        params.putString("nome", texto.getText().toString());
        intent.putExtras(params);

        startActivity(intent);
    }

    public void click2(View v){

        Intent intent = new Intent(this,ActivityC.class);
        Bundle params = new Bundle();

        EditText numero = (EditText) findViewById(R.id.numero);

        params.putInt("numero", Integer.valueOf(numero.getText().toString()) );
        intent.putExtras(params);

        startActivityForResult(intent, MULTIPL);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MULTIPL) {
            //De qual opção veio o resultado?
            if(resultCode == RESULT_X2) {
                TextView tv = (TextView) findViewById(R.id.tiporesultado);
                tv.setText("Foi multiplicado por 2.");

            }else if(resultCode == RESULT_X5){
                TextView tv = (TextView) findViewById(R.id.tiporesultado);
                tv.setText("Foi multiplicado por 5.");
            }


            TextView tv2 = (TextView) findViewById(R.id.resultado);

            Bundle dados = data.getExtras();
            int resultado = dados.getInt("resultado");
            tv2.setText(""+resultado);
        }

    }
}
