package com.example.labm4.projeto_redesocial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.labm4.projeto_redesocial.Perfis;

import java.util.List;

/**
 * Created by rafa on 06/07/2015.
 */

public class Adapter extends BaseAdapter {

    private Context context;
    private List<Perfis> perfis;
    private LayoutInflater inflater;

    public Adapter(Context context, List<Perfis> perfis) {
        super();
        this.context = context;
        this.perfis = perfis;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.perfis.size();
    }

    @Override
    public Perfis getItem(int position) {
        return this.perfis.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Perfis perfis = this.perfis.get(position);

        MyViewHolder viewHolder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.listacustom, parent, false);
            viewHolder = new MyViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (MyViewHolder) convertView.getTag();
        }

        viewHolder.nome.setText(perfis.getNome());
        viewHolder.msg.setText(perfis.getMsg());
        viewHolder.modelhp.setText(perfis.getModelHP());


        return convertView;
    }

    private class MyViewHolder{
        TextView nome, msg, modelhp;
        ImageView maisinfo;

        public MyViewHolder(View v) {
            this.nome = (TextView)v.findViewById(R.id.nome);
            this.msg = (TextView)v.findViewById(R.id.msg);
            this.modelhp = (TextView)v.findViewById(R.id.modelhp);
            this.maisinfo = (ImageView)v.findViewById(R.id.maisinfo);
        }
    }
}