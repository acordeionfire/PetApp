package com.example.petapp;

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
        //aqui vai o código que será executado quando o botão for clicado
        Toast.makeText(this, R.string.meu_nome, Toast.LENGTH_LONG).show();
        EditText login = findViewById(R.id.campoEmail);
        Button botao = findViewById(R.id.buttonLogin);

        if(login.getText().toString().isEmpty()){
            Toast.makeText(this, R.string.campo_vazio, Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "Você escreveu: "+ login.getText().toString(), Toast.LENGTH_LONG).show();

        }

    }
}