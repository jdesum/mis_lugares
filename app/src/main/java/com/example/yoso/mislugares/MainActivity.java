package com.example.yoso.mislugares;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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


        // Accediendo a los valores de las preferencias de Mostrar Lugares
        btnMostrarLugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarPreferencias();
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

    /* Método acceder a los valores de las preferencias
       * para alterar e funcionamiento de nuestra aplicación
      */
    private void mostrarPreferencias() {
        /*
         * La función comienza creando el objeto pref de la clase SharedPreferences
         * y le asigna las preferencias definidas para la aplicación
         */
        SharedPreferences pref =
                PreferenceManager.getDefaultSharedPreferences(this);
        /*
         * Crea el String s y le asigna los valores de dos de las  preferencias.
         * Se utilizan los métodos pref.getBoolean() y pref.getString(),
         * que disponen de dos parámetros: el valor de key que queremos buscar
         * ("notificaciones" y "maximo") y el valor asignado por defecto
         * en caso de no encontrar esta key.
         */
        String s = "notificaciones: " + pref.getBoolean("notificaciones", true)
                + ", máximo a listar: " +
                pref.getString("maximo","?");
        // Se visualiza el resultado utilizando la clase Toast
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
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
