package com.example.labm4.projeto_redesocial;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.view.menu.MenuView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;


public class home extends ActionBarActivity {
    MenuView.ItemView listacoment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listacoment = (MenuView.ItemView)findViewById(R.id.btn_listcoment);


        //Fragmento da lista de perfis
        FragmentLista fragment = new FragmentLista();
        fragment.setPerfis(getPerfis());

        //Inserir a fragment no meu framelayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }
    private List<Perfis> getPerfis(){
        List<Perfis> perfis = new ArrayList<>();
        perfis.add(new Perfis("Lucas Dias", "ola", "57"));
        return perfis;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.btn_coment) {
            Intent intent = new Intent(this,Coment.class);
            startActivity(intent);

            //Fragmento da lista de perfis
            //FragmentComent fragmentcoment = new FragmentComent();

            //Inserir a fragment no meu framelayout
            //getSupportFragmentManager().beginTransaction()
            //        .add(R.id.fragment_container, fragmentcoment)
            //        .commit();

            return true;
        }
        if (id==R.id.btn_listcoment){

            //Fragmento da lista de perfis
            FragmentLista fragment = new FragmentLista();
            fragment.setPerfis(getPerfis());

            //Inserir a fragment no meu framelayout
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();


            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void maisDetalhes(View v){
        //Fragmento da lista de perfis
        FragmentDetalhes fragmentdt = new FragmentDetalhes();

        //Inserir a fragment no meu framelayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragmentdt)
                .commit();
    }

}