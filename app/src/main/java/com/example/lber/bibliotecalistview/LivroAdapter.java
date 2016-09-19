package com.example.lber.bibliotecalistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Taniro on 17/09/2016.
 */
public class LivroAdapter extends BaseAdapter{

    Context context;
    List<Livro> livros;

    public LivroAdapter(Context context, List<Livro> listaLivros){
        this.context = context;
        this.livros = listaLivros;
    }
    @Override
    public int getCount() {
        return livros != null ? livros.size(): 0;
    }

    @Override
    public Object getItem(int i) {
        return livros.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View currentView, ViewGroup viewGroup) {

        View view;
        ViewHolder holder;

        if (currentView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.livro_item_inflater, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            view = currentView;
            holder = (ViewHolder) view.getTag();
        }

        Livro escolhido = livros.get(i);
        holder.textViewTitulo.setText(escolhido.getTitulo());
        holder.textViewAutor.setText(escolhido.getAutor());
        holder.textViewQuantidade.setText(""+escolhido.getQuantidade());

        if(escolhido.getLido() == true){
            holder.img.setImageResource(R.drawable.open);
        }else{
            holder.img.setImageResource(R.drawable.flat);
        }

        return view;
    }
}
