package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setTitle("Dashboard");

        Log.i("pet_dashboard", "usuario_logado" + DadosCompartilhados.usuarioLogado);

        Toast.makeText(this, "Seja bem-vindo " + DadosCompartilhados.usuarioLogado.getUsuario(), Toast.LENGTH_LONG).show();

    }


    public void cadastrar(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void listar(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
    public void remover(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void atualizar(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
}