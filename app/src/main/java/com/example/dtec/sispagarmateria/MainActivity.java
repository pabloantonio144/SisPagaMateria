package com.example.dtec.sispagarmateria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastroUsuarios(View view){
        Intent intent = new Intent(this, CadastroUsuario.class);

        startActivity(intent);
    }
    public void cadastroPeriodos(View view){
        Intent intent = new Intent(this, CadastroPeriodos.class);

        startActivity(intent);
    }
}
