package com.example.labm4.projeto_redesocial;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private EditText loginemail;
    private EditText loginsenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void criarConta(View v){
        Intent intent = new Intent(this, criaConta.class);
        startActivity(intent);

    }

    public void esqueciSenha(View v){
        Intent intent = new Intent(this, esqueciSenha.class);
        startActivity(intent);

    }

    public void autenticacao(View v){
        loginemail = (EditText) findViewById(R.id.loginemail);
        loginsenha = (EditText) findViewById(R.id.loginsenha);

        Intent intent = new Intent(this, home.class);
        startActivity(intent);

    }
}

