package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setTitle(R.string.login);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void logar(View view) {
        // 1. Pegamos os dois campos da tela
        EditText campoUsuario = findViewById(R.id.campoEmail);
        EditText campoSenha = findViewById(R.id.campoSenha);

        String usuarioDigitado = campoUsuario.getText().toString();
        String senhaDigitada = campoSenha.getText().toString();

        // 2. Verificamos se algum campo está vazio
        if (usuarioDigitado.isEmpty() || senhaDigitada.isEmpty()) {
            Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
            return;
        }

        // 3. Procurando na lista
        Usuario usuarioEncontrado = null;

        for (Usuario u : DadosCompartilhados.listaUsuario) {
            if (u.getUsuario().equals(usuarioDigitado) && u.getSenha().equals(senhaDigitada)) {
                usuarioEncontrado = u; // guardamos a referência, não só um boolean
                break;
            }
        }

        // 4. O resultado da busca
        if (usuarioEncontrado != null) {
            DadosCompartilhados.usuarioLogado = usuarioEncontrado; // 👈 a linha que faltava

            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show();
        }
    }}