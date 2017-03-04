package net.ddns.wizards.wizards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void equipos (View view){
        Intent i = new Intent(this, Equipos.class);
        startActivity(i);
        finish();
    }

    public void asistencia (View view){
        Intent i = new Intent(this, Asistencia.class);
        startActivity(i);
        finish();
    }


}
