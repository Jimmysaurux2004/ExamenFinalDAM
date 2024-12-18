package com.example.dam_examen_final_huerta;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        // Inicializar el RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewNotas);

        // Configurar el RecyclerView con un LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear una lista de ejemplo para mostrar las notas
        List<Nota> listaNotas = new ArrayList<>();
        listaNotas.add(new Nota("Trabajo Académico", "Las notas del trabajo académico serán  revisadas el día 18 de diciembre e ingresadas el día 23 de diciembre."));
        listaNotas.add(new Nota("Examen Final", "Estudiar, practicar y presentarse al examen Final el día 18 de Diciembre"));
        listaNotas.add(new Nota("Resultado de Examen Final", "La revisión del examen final se revisará durante la sesión de clases y el resultado será publicado en los próximos días, específicamente: 23/12/24."));
        listaNotas.add(new Nota("Examen Sustitutorio", "Examen Sustitutorio planificado para el día 23 de diciembre del 2024. Asistir puntualmente a todos los que se van a presentar."));
        listaNotas.add(new Nota("Fiestas Navideñas", "La Navidad es tiempo de dar y recibir amor. ¡Feliz Navidad, querido amigo!"));
        listaNotas.add(new Nota("Despedida de Ciclo", "“La mayor necesidad del mundo es la de hombres que no se vendan ni se compren; hombres que sean sinceros y honrados en lo más íntimo de sus almas; hombres que no teman dar al pecado el nombre que le corresponde; hombres cuya conciencia sea tan leal al deber como la brújula al polo; hombres que se mantengan de parte de la justicia aunque se desplomen los cielos”. Aprecio mucho su amistad, su participación en las sesiones de clases, cada ciclo es una nueva experiencia, deseo que sigan estudiando. Muchas Felicidades. Nos vemos el 2025."));
        listaNotas.add(new Nota("Estudia y superate", "El éxito es la suma de pequeños esfuerzos repetidos día tras día. Tú eres más fuerte de lo que crees. Nunca subestimes tu capacidad”."));

        // Configurar el Adapter con la lista de notas
        NotasAdapter adapter = new NotasAdapter(listaNotas);
        recyclerView.setAdapter(adapter);
    }
}
