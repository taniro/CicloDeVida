package br.ufrn.eaj.tads.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Bundle params = getIntent().getExtras();
        String nome = params.getString("nome");

        TextView tv = findViewById(R.id.recebe);
        tv.setText(nome);
    }

    public void click2 (View v){
        finish();
    }
}
