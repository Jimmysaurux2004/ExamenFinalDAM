package com.example.dam_examen_final_huerta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotasAdapter extends RecyclerView.Adapter<NotasAdapter.NotaViewHolder> {

    private List<Nota> notas;

    // Constructor para recibir la lista de notas
    public NotasAdapter(List<Nota> notas) {
        this.notas = notas;
    }

    // Crear el ViewHolder (asocia el item_nota.xml)
    @NonNull
    @Override
    public NotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_nota, parent, false);
        return new NotaViewHolder(view);
    }

    // Asignar datos a cada elemento del RecyclerView
    @Override
    public void onBindViewHolder(@NonNull NotaViewHolder holder, int position) {
        Nota nota = notas.get(position);
        holder.textViewTitulo.setText(nota.getTitulo());
        holder.textViewDescripcion.setText(nota.getDescripcion());
    }

    // Cantidad total de ítems
    @Override
    public int getItemCount() {
        return notas.size();
    }

    // Clase interna ViewHolder: referencia los elementos del layout item_nota.xml
    static class NotaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitulo, textViewDescripcion;

        public NotaViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            textViewDescripcion = itemView.findViewById(R.id.textViewDescripcion);
        }
    }
}

