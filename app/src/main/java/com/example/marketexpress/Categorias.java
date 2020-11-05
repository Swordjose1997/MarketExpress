package com.example.marketexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Categorias extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    private List<Modelo> mlista = new ArrayList<>();
    // adaptando el adaptador
    ListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        mListView = findViewById(R.id.ListaCategoria);
        mListView.setOnItemClickListener(this);

        mlista.add(new Modelo("Abarrotes",R.mipmap.abarrotes));
        mlista.add(new Modelo("Articulos de limpieza",R.mipmap.articulosdelimpieza));
        mlista.add(new Modelo("Bebidas",R.mipmap.bebidas));
        mlista.add(new Modelo("Carnes",R.mipmap.carnes));
        mlista.add(new Modelo("Cosmeticos",R.mipmap.cosmeticos));
        mlista.add(new Modelo("Embutidos",R.mipmap.embutidos));
        mlista.add(new Modelo("Productos agricolas",R.mipmap.agricolas));
        mlista.add(new Modelo("Productos desechables y de papel",R.mipmap.desechablesypapel));


        mAdapter = new ListAdapter(Categorias
                .this,R.layout.row,mlista);

        mListView.setAdapter(mAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this, "Elemento Clicado: "+position, Toast.LENGTH_SHORT).show();
    }
}