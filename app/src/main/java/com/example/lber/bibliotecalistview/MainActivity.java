package com.example.lber.bibliotecalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView lista;
    List<Livro> listaLivro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.minhalista);
        listaLivro = Livro.getLivros();
        lista.setAdapter(new LivroAdapter(this, listaLivro));
        lista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Livro livro = this.listaLivro.get(i);
        Toast.makeText(MainActivity.this, ""+livro.getTitulo(), Toast.LENGTH_SHORT).show();
    }
}
