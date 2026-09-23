package com.example.petapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AtualizarActivity extends AppCompatActivity {

    private EditText campoNomePet;
    private EditText campoIdadePet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atualizar);

        campoNomePet = findViewById(R.id.campoNomePet);
        campoIdadePet = findViewById(R.id.campoIdadePet);
    }

    public void atualizaCadastro(View view) {
        String nomeDigitado = campoNomePet.getText().toString().trim();
        String idadeDigitada = campoIdadePet.getText().toString().trim();

        if (nomeDigitado.isEmpty()) {
            campoNomePet.setError("Informe o nome do pet");
            campoNomePet.requestFocus();
            return;
        }

        if (idadeDigitada.isEmpty()) {
            campoIdadePet.setError("Informe a nova idade");
            campoIdadePet.requestFocus();
            return;
        }

        boolean sucesso = DadosCompartilhados.atualizarIdadePet(nomeDigitado, idadeDigitada);

        if (sucesso) {
            Toast.makeText(this, "Idade atualizada com sucesso!", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Pet não encontrado!", Toast.LENGTH_SHORT).show();
        }
    }
}