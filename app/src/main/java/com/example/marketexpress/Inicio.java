package com.example.marketexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.slider.Slider;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class Inicio extends AppCompatActivity {
    EasySlider easySlider;
    Button btinicio;
    Button btfavoritos;
    Button btcarrito;
    Button btcategorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        easySlider=(EasySlider) findViewById(R.id.slader);
        btcategorias=(Button)findViewById(R.id.btnCategorias);
        List<SliderItem> easySliders= new ArrayList<>();
        easySliders.add(new SliderItem("",R.drawable.c1));
        easySliders.add(new SliderItem("",R.drawable.c2));
        easySliders.add(new SliderItem("",R.drawable.c3));
        easySliders.add(new SliderItem("",R.drawable.c4));
        easySliders.add(new SliderItem("",R.drawable.c5));
        easySlider.setPages(easySliders);
        btcategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Categorias.class);
                startActivity(intent);
            }
        });
    }
}