package com.example.petapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void realizaCadastro(View view) {
        EditText nomePet = findViewById(R.id.campoNomePet);
        EditText idadePet = findViewById(R.id.campoIdadePet);

        String nomeDigitado = nomePet.getText().toString();
        String idadeDigitado = idadePet.getText().toString();

        if (nomeDigitado.isEmpty() || idadeDigitado.isEmpty()) {
            Toast.makeText(this, "Todos os campos devem ser preenchidos", Toast.LENGTH_SHORT).show();
            return;
        }else{
            Toast.makeText(this, "Sucesso no cadastro", Toast.LENGTH_SHORT).show();
            return;
        }


    }
}