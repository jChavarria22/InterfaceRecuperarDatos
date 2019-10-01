package com.example.interfacerecuperardatos;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {

    Button btn1, btn2;
    ImageView imegen;
    TextView titulo;


    public viewHolder(@NonNull View itemView) {
        super(itemView);

        btn1  = itemView.findViewById(R.id.btn1);
        btn2  = itemView.findViewById(R.id.btn2);
        imegen = itemView.findViewById(R.id.imagen);
        titulo  = itemView.findViewById(R.id.texto);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
