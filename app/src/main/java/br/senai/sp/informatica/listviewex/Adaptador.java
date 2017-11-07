package br.senai.sp.informatica.listviewex;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Web on 07/11/2017.
 */

public class Adaptador extends BaseAdapter {


    private String[] planetas = {
        "Mercúrio",
        "Vênus",
        "Terra",
        "Marte",
        "Júpiter",
        "Saturno",
        "Urano",
        "Netuno"

    };

    private Context contexto;

    public Adaptador(Context contexto){
        this.contexto=contexto;

    }

    @Override
    public int getCount() {
        return planetas.length;
    }

    @Override
    public Object getItem(int position) {
        return planetas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // pega o planeta

        String planeta = planetas[position];
        TextView view = new TextView(contexto);

        // converter dip em px
        float dip = 50;

        //densidade tela
        float densidade =contexto.getResources().getDisplayMetrics().density;

        // converter

        int px =(int) (dip * densidade + 0.5f);

        //define a altura do text view em px
        view.setHeight(px);

        view.setText(planeta);

        return view;
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
