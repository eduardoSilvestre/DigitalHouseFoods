package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class TelaLoginActivity extends AppCompatActivity {

    Button entrar;
    TextInputEditText emailDigitado;
    TextInputEditText senhaDigitada;
    Button irParaCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        emailDigitado = findViewById(R.id.email_edit_text);
        senhaDigitada = findViewById(R.id.senha_edit_text);
        entrar = findViewById(R.id.entrar_button);
        irParaCadastro = findViewById(R.id.cadastrado_button);



        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrarNaConta();
            }
        });

        irParaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaTelaDeCadastro();
            }
        });
    }

    public void entrarNaConta(){
        android.view.inputmethod.InputMethodManager teclado = (android.view.inputmethod.InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);

        if (teclado.isAcceptingText()){
            teclado.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);}

        if(emailDigitado.getText().toString().equals("")){

            emailDigitado.setError("Digite um Email");
        }
        if (senhaDigitada.getText().toString().equals("")){
            senhaDigitada.setError("Digite uma Senha");
        }   else {
            Intent intent =new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void irParaTelaDeCadastro(){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
}
