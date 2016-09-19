package com.example.lber.bibliotecalistview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lber on 19/09/2016.
 */
public class ViewHolder {

    final TextView textViewTitulo;
    final TextView textViewAutor;
    final TextView textViewQuantidade;
    final ImageView img;


    public ViewHolder(View v) {
        this.textViewTitulo = (TextView) v.findViewById(R.id.titulo);
        this.textViewAutor = (TextView) v.findViewById(R.id.autor);;
        this.textViewQuantidade = (TextView) v.findViewById(R.id.quantidade);;
        this.img = (ImageView) v.findViewById(R.id.img);
    }
}
