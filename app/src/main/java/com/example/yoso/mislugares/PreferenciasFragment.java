package com.example.yoso.mislugares;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * La clase PreferenceFragment permite crear un fragment que contiene una ventana
 * con las opciones de preferencias definidas en un recurso XML.
 * Created by yoso on 15/05/16.
 */
public class PreferenciasFragment extends PreferenceFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);

    }
}
