package com.example.petapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RemoverActivity extends AppCompatActivity {

    private EditText campoNomePetRemover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remover);

        campoNomePetRemover = findViewById(R.id.campoNomePetRemover);
    }

    public void removerPet(View view) {
        String nomeDigitado = campoNomePetRemover.getText().toString().trim();

        if (nomeDigitado.isEmpty()) {
            campoNomePetRemover.setError("Informe o nome do pet");
            campoNomePetRemover.requestFocus();
            return;
        }

        boolean removido = DadosCompartilhados.removerPetPorNome(nomeDigitado);

        if (removido) {
            Toast.makeText(this, "Pet removido com sucesso!", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Pet não encontrado!", Toast.LENGTH_SHORT).show();
        }
    }
}