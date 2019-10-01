package com.example.interfacerecuperardatos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Clase> lista = new ArrayList<Clase>();
        lista.add(new Clase("Imegen N1", R.drawable.uno, 0));
        lista.add(new Clase("Imegen N2", R.drawable.dos, 0));
        lista.add(new Clase("Imegen N3", R.drawable.tres, 0));
        lista.add(new Clase("Imegen N4", R.drawable.cuatro, 0));
        lista.add(new Clase("Imegen N5", R.drawable.cinco, 0));
        lista.add(new Clase("Imegen N6", R.drawable.seis, 0));

        RecyclerView contenedor = findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new Adapter(lista));
        contenedor.setLayoutManager(layoutManager);
    }
}
