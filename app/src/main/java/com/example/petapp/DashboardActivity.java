package com.example.petapp;

import android.os.Bundle;
import android.util.Log;
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

        String

        Log.i("pet_dashboard", "usuario_logado" + DadosCompartilhados.usuarioLogado);

        Toast.makeText(this, "Seja bem-vindo " + DadosCompartilhados.usuarioLogado,LENGTH_LONG).show();

    }
}