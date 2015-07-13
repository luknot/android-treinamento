package com.example.labm4.projeto_redesocial;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.labm4.projeto_redesocial.R;

import java.util.List;


public class FragmentLista extends android.support.v4.app.Fragment {

    private List<Perfis> perfis;
    private ListView listview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.listnormal, container, false);

        listview = (ListView)v.findViewById(R.id.listViewSimples);

        Adapter adapter = new Adapter(getActivity(), perfis);

        listview.setAdapter(adapter);


        return v;
    }

    public void setPerfis(List<Perfis> perfis) {
        this.perfis = perfis;
    }
}
