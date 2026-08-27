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
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.login);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Configura as margens da tela para respeitar as barras do sistema (status bar e navegação)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    /**
     * Método acionado quando o usuário clica no botão "buttonLogin".
     * O vínculo é feito através do atributo 'android:onClick="logar"' no arquivo XML.
     */
    public void logar(View view) {
        // Passo 1: Localizar os componentes EditText da tela utilizando seus respectivos IDs
        EditText campoUsuario = findViewById(R.id.campoEmail);
        EditText campoSenha = findViewById(R.id.campoSenha);

        // Passo 2: Extrair o texto digitado pelos usuários e converter para String.
        // O método .trim() remove espaços em branco no início ou no fim que o usuário possa ter digitado por engano.
        String usuario = campoUsuario.getText().toString().trim();
        String senha = campoSenha.getText().toString().trim();

        // Passo 3: Testar as credenciais fornecidas usando a estrutura condicional 'if'.
        // Em Java, comparações de texto (Strings) devem SEMPRE utilizar o método .equals(), e nunca o operador '=='.
        if (usuario.equals("admin") && senha.equals("123")) {
            // Se o usuário for "admin" E a senha for "123", exibe mensagem de sucesso
            Toast.makeText(this, "Sucesso no login", Toast.LENGTH_SHORT).show();
            DadosCompartilhados.usuarioLogado = "admin";
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);

        } else {
            // Caso contrário (qualquer outro texto ou campos vazios), exibe mensagem de erro
            Toast.makeText(this, "Usuário ou senha inválido", Toast.LENGTH_SHORT).show();
        }
    }
}