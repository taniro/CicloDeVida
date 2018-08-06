package br.ufrn.eaj.tads.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {

    Integer numero;

    public static final int RESULT_X2 = 55;
    public static final int RESULT_X5 = 56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);



        Bundle params = getIntent().getExtras();
        numero = params.getInt("numero");

        TextView tv = findViewById(R.id.numeroc);
        tv.setText(numero.toString());


    }

    public void multi2(View v){

        Intent intent= new Intent();

        Bundle data = new Bundle();
        data.putInt("resultado", numero * 2);

        intent.putExtras(data);

        setResult(RESULT_X2,intent);
        finish();
    }

    public void multi5(View v){

        Intent intent= new Intent();


        Bundle data = new Bundle();
        data.putInt("resultado", numero * 5);

        intent.putExtras(data);


        setResult(RESULT_X5,intent);
        finish();

    }
}
