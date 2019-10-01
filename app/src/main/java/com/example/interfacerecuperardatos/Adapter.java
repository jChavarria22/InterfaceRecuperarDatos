package com.example.interfacerecuperardatos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter  extends RecyclerView.Adapter<viewHolder> {

    List<Clase> listaObjeto;

    public Adapter(List<Clase> listaObjeto) {
        this.listaObjeto = listaObjeto;
    }


    @Override
    public viewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder( viewHolder holder, int position) {
      holder.titulo.setText(listaObjeto.get(position).getDescripcion());
      holder.imegen.setImageResource(listaObjeto.get(position).getImagen());


    }

    @Override
    public int getItemCount() {
        return listaObjeto.size();
    }
}
