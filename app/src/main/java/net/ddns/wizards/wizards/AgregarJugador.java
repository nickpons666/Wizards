package net.ddns.wizards.wizards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AgregarJugador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_jugador);
    }

    public void menuAdministrador (View view){
        Intent i = new Intent(this, MenuAdministrador.class);
        startActivity(i);
        finish();
    }
}
