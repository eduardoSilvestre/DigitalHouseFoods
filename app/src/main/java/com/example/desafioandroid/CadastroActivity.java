package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class CadastroActivity extends AppCompatActivity {

    TextInputEditText nomeDigitado;
    TextInputEditText emailDigitado;
    TextInputEditText senhaDigitada;
    TextInputEditText confirmarSenha;
    Button fazerCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomeDigitado = findViewById(R.id.nome_cadastro_edit_text);
        emailDigitado = findViewById(R.id.email_cadastro_edit_text);
        senhaDigitada = findViewById(R.id.senha_cadastro_edit_text);
        confirmarSenha = findViewById(R.id.confirmar_senha_cadastro_edit_text);
        fazerCadastro = findViewById(R.id.cadastrado_button);

        fazerCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cadastrar();
            }
        });


    }

    public void Cadastrar(){
        android.view.inputmethod.InputMethodManager teclado = (android.view.inputmethod.InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);

        if (teclado.isAcceptingText()){
            teclado.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);}

        if (nomeDigitado.getText().toString().equals("")){
            nomeDigitado.setError("Digite seu Nome");
        }

        if(emailDigitado.getText().toString().equals("")){

            emailDigitado.setError("Digite um Email");
        }
        if (senhaDigitada.getText().toString().equals("")){
            senhaDigitada.setError("Digite uma Senha");
        }
        if (confirmarSenha.getText().toString().equals("")){
            senhaDigitada.setError("Confirme sua Senha");
        }
        else {
            Intent intent =new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
