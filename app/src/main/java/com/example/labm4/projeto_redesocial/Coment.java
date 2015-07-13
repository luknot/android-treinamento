package com.example.labm4.projeto_redesocial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class Coment extends ActionBarActivity {
    private ImageView btnstar1,btnstar2,btnstar3,btnstar4,btnstar5;
    private TextView modelo,marca,comentario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coment);
        btnstar1 = (ImageView)findViewById(R.id.btn_star1);
        btnstar2 = (ImageView)findViewById(R.id.btn_star2);
        btnstar3 = (ImageView)findViewById(R.id.btn_star3);
        btnstar4 = (ImageView)findViewById(R.id.btn_star4);
        btnstar5 = (ImageView)findViewById(R.id.btn_star5);

        modelo = (TextView)findViewById(R.id.modelo);
        marca = (TextView)findViewById(R.id.marca);
        comentario = (TextView)findViewById(R.id.comentario);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_coment, menu);
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

    public int pontosStar(int qtdestrela){
        int qtdstar = qtdestrela;

        return  qtdstar;
    }

    public void clickStar1(View v ){
        btnstar1.setImageResource(R.drawable.ic_btn_star_on);
        btnstar2.setImageResource(R.drawable.ic_btn_star_off);
        btnstar3.setImageResource(R.drawable.ic_btn_star_off);
        btnstar4.setImageResource(R.drawable.ic_btn_star_off);
        btnstar5.setImageResource(R.drawable.ic_btn_star_off);
        pontosStar(1);

    }

    public void clickStar2(View v ){
        btnstar1.setImageResource(R.drawable.ic_btn_star_on);
        btnstar2.setImageResource(R.drawable.ic_btn_star_on);
        btnstar3.setImageResource(R.drawable.ic_btn_star_off);
        btnstar4.setImageResource(R.drawable.ic_btn_star_off);
        btnstar5.setImageResource(R.drawable.ic_btn_star_off);
        pontosStar(2);
    }

    public void clickStar3(View v ){
        btnstar1.setImageResource(R.drawable.ic_btn_star_on);
        btnstar2.setImageResource(R.drawable.ic_btn_star_on);
        btnstar3.setImageResource(R.drawable.ic_btn_star_on);
        btnstar4.setImageResource(R.drawable.ic_btn_star_off);
        btnstar5.setImageResource(R.drawable.ic_btn_star_off);

        pontosStar(3);
    }

    public void clickStar4(View v ){
        btnstar1.setImageResource(R.drawable.ic_btn_star_on);
        btnstar2.setImageResource(R.drawable.ic_btn_star_on);
        btnstar3.setImageResource(R.drawable.ic_btn_star_on);
        btnstar4.setImageResource(R.drawable.ic_btn_star_on);
        btnstar5.setImageResource(R.drawable.ic_btn_star_off);
        pontosStar(4);
    }

    public void clickStar5(View v ){
        btnstar1.setImageResource(R.drawable.ic_btn_star_on);
        btnstar2.setImageResource(R.drawable.ic_btn_star_on);
        btnstar3.setImageResource(R.drawable.ic_btn_star_on);
        btnstar4.setImageResource(R.drawable.ic_btn_star_on);
        btnstar5.setImageResource(R.drawable.ic_btn_star_on);
        pontosStar(5);
    }

}
