package com.example.yoso.mislugares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Crea la la clase PreferenciasActivity
 * que simplemente muestre el fragment de la clase PreferenceFragment
 * Created by yoso on 15/05/16.
 */
public class PreferenciasActivity extends AppCompatActivity {
    /* Desde una actividad podemos visualizar un fragment en tiempo de ejecución.
     * Para ello utilizamos el manejador de fragments
     * de la activdad (getFragmentManager())
     * y comenzamos una transacción (beginTransaction()).
     * Una transacción es una operación de insertado, borrado o reemplazo
     * de fragments. En el ejemplo vamos a reemplazar el contenido de la actividad
      * por un nuevo fragment de la clase PreferenciasFragment.
      * Finalmente se llama a commit() para que se ejecute la transacción.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PreferenciasFragment()).commit();
    }
}
