package com.example.labm4.projeto_redesocial;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class criaConta extends ActionBarActivity {
    private EditText crianome;
    private EditText criaemail;
    private EditText criasenha;        ;
    private EditText rptsenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cria_conta);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cria_conta, menu);
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

    public void dadosUsuario(){
        crianome = (EditText) findViewById(R.id.crianome);
        criaemail = (EditText) findViewById(R.id.criasenha);
        criasenha = (EditText) findViewById(R.id.rptsenha);
    }

    public void cadastrarConta(View v){
        dadosUsuario();
    }
}
