package com.example.yoso.mislugares;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Atributos
    private Button btnMostrarLugares, btnPreferencias;
    private Button btnAcercaDe, btnSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inflar el boton
        btnMostrarLugares = (Button) findViewById(R.id.btnMostrarLugares);
        btnPreferencias = (Button) findViewById(R.id.btnPreferencias);
        btnAcercaDe = (Button) findViewById(R.id.btnAcercaDe);
        btnSalir = (Button) findViewById(R.id.btnSalir);


        // Lanzar la actividades al selecionar boton correspondiente
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               lanzarAcercaDe();

            }
        });

        btnPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarPreferencias();
            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            lanzarPreferencias();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    // Método de la actividad lanzarAcercaDe
    public void lanzarAcercaDe(){
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
    }

    /*
     * Añade a MainActivity.java el método lanzarPreferencias().
     * Este método ha de tener el mismo código que lanzarAcercaDe()
     * pero lanzando la actividad PreferenciasActivity.
      * Al pulsar el botón con texto “Preferencias”
      * hace que se llame a lanzarPreferencias().
     */
    public void lanzarPreferencias(){
        Intent i = new Intent(this, PreferenciasActivity.class);
        startActivity(i);
    }



 /* Metodo con switch
 @Override
public void onCreate(Bundle savedInstanceState) {
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
}

private OnClickListener onClickListener = new OnClickListener() {
     @Override
     public void onClick(View v) {
         switch(v.getId()){
             case R.id.button1:
                  //DO something
             break;
             case R.id.button2:
                  //DO something
             break;
             case R.id.button3:
                  //DO something
             break;
         }

   }
};
  */

}
