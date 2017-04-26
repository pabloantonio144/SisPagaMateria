package com.example.dtec.sispagarmateria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CadastroUsuario extends AppCompatActivity {

    private Spinner spnCursos;

    private ArrayAdapter<String> adpCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        adpCursos = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpCursos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnCursos.setAdapter(adpCursos);

        adpCursos.add("Administração");
        adpCursos.add("Enfermagem");
        adpCursos.add("Direito");
        adpCursos.add("Medicina");
        adpCursos.add("Sistema de Informação");
    }
}
