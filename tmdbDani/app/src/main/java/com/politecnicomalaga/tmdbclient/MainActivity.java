package com.politecnicomalaga.tmdbclient;

import static com.politecnicomalaga.tmdbclient.R.*;

import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.tmdbclient.control.MoviesSeriesRVAdapter;
import com.politecnicomalaga.tmdbclient.control.MoviesViewModel;
import com.politecnicomalaga.tmdbclient.data.RequestClient;

public class MainActivity extends AppCompatActivity {

    //Método onCreate: es el primero que se ejecuta en una app android, en una activity (pantalla)
    //Siempre se empieza a programar después de las líneas "auto" que inserta el IDE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //A partir de aquí es nuestro código. Esta parte cambiará dependiendo de la app a programar
        //Init components. Main Buttons and RecyclerView

        //Obtener el "controlador" entre el recyclerview y el modelo
        //Es necesario usar un LOQUESEAViewModel, una clase que hereda de ViewModel (Android)
        //para garantizar que los elementos que se muestran en la pantalla (Activity, en sus views)
        //no se eliminan de la RAM cuando se preduce un pause, stop o destroy por parte del S.O.
        //Android: este s.o. puede matar un proceso que quede en segundo plano en cualquier mmomento

        //Tipicamente:
        // MICLASEViewModel vmodel = new ViewModelProvider(this).get(MICLASEViewModel.class);
        MoviesViewModel vmodel = new ViewModelProvider(this).get(MoviesViewModel.class);

        //RecyclerView (es una lista de resultados) contendrá los trending movies o series
        //Para ello usamos el patrón Observer (Implementado por todas las clases que heredan de
        //ViewModel
        //Estructura: viewmodelobject.getResults().observe(activity, listadecosasamostrar -> {
        //    proceso de actualización del RecyclerView (Lambda function/method)
        // });
        vmodel.getResults().observe(this, movieSerieItems -> {
            // update UI
            // Cogemos el RV (RecyclerView)
            RecyclerView mRecyclerView = findViewById(R.id.rvMain);
            // Creamos un adapter con un enlace a la activity y a los datos a usar
            MoviesSeriesRVAdapter mAdapter = new MoviesSeriesRVAdapter(this, movieSerieItems);
            // Conectamos el adapter y el RV
            mRecyclerView.setAdapter(mAdapter);
            // Asignamos al RV un tipo de layout manager por defecto: típicamente el LinearLayoutManager
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

            if (vmodel.getTotalPages() != 0) {
                TextView Pag = findViewById(R.id.Pag);
                Pag.setText("Página: " + vmodel.getPagina() + " de " + vmodel.getTotalPages());
            }

        });

        TextView Pag = findViewById(R.id.Pag);
        Pag.setText("Página: " + vmodel.getPagina() + " de " + vmodel.getTotalPages());

        Toast.makeText(this, "Haz el favor de aprobarme Andrés", Toast.LENGTH_LONG).show();

        //Ahora toca programar los botones
        //Pelis
        Button bMovie = (Button) findViewById(R.id.btSearchMovies);

        bMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cuando pulsan el botón movies, le decimos al viewmodel que cargue pelis
                vmodel.loadData(RequestClient.TipoBusqueda.MOVIES);

                TextView Pag = findViewById(R.id.Pag);
                Pag.setText("Página: " + vmodel.getPagina());
            }
        });


        //Ahora el botón de las series
        Button bSeries = (Button) findViewById(R.id.btSearchSeries);

        bSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vmodel.loadData(RequestClient.TipoBusqueda.SERIES);

                TextView Pag = findViewById(R.id.Pag);
                Pag.setText("Página: " + vmodel.getPagina());
            }
        });


        Button btAtras = (Button) findViewById(R.id.btAtras);

        btAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.antPag();

                TextView Pag = findViewById(R.id.Pag);
                Pag.setText("Página: " + vmodel.getPagina());
            }
        });


        Button btDelante = (Button) findViewById(R.id.btDelante);

        btDelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.siguientePag();
                TextView Pag = findViewById(R.id.Pag);
                Pag.setText("Página: " + vmodel.getPagina());
            }
        });

        Button btPag2 = (Button) findViewById(R.id.btPag2);

        btPag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.pag2();
                TextView Pag = findViewById(R.id.Pag);
                Pag.setText("Página: " + vmodel.getPagina());
            }
        });

        Button btPag22 = findViewById(R.id.btPag22);
        btPag22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.pag22();
                TextView Pag = findViewById(R.id.Pag);
                Pag.setText("Página: " + vmodel.getPagina());
            }
        });

        Button btRojo = findViewById(R.id.btRojo);
        Button btVerde = findViewById(R.id.btVerde);
        btRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rojoColor = 0xFFFF0000;
                int blancoColor = 0xFFFFFFFF;

                bMovie.setBackgroundColor(rojoColor);
                bSeries.setBackgroundColor(rojoColor);
                btAtras.setBackgroundColor(rojoColor);
                btDelante.setBackgroundColor(rojoColor);
                btPag2.setBackgroundColor(rojoColor);
                btPag22.setBackgroundColor(rojoColor);
                btRojo.setBackgroundColor(rojoColor);
                btVerde.setBackgroundColor(rojoColor);
                Pag.setBackgroundColor(rojoColor);

                // texto blanco

                bMovie.setTextColor(blancoColor);
                bSeries.setTextColor(blancoColor);
                btAtras.setTextColor(blancoColor);
                btDelante.setTextColor(blancoColor);
                btPag2.setTextColor(blancoColor);
                btPag22.setTextColor(blancoColor);
                btRojo.setTextColor(blancoColor);
                btVerde.setTextColor(blancoColor);
                Pag.setTextColor(blancoColor);
            }
        });

        btVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int verdeColor = 0xFF00FF00;
                int negroColor = 0xFF000000;

                bMovie.setBackgroundColor(verdeColor);
                bSeries.setBackgroundColor(verdeColor);
                btAtras.setBackgroundColor(verdeColor);
                btDelante.setBackgroundColor(verdeColor);
                btPag2.setBackgroundColor(verdeColor);
                btPag22.setBackgroundColor(verdeColor);
                btRojo.setBackgroundColor(verdeColor);
                btVerde.setBackgroundColor(verdeColor);
                Pag.setBackgroundColor(verdeColor);

                //texto negro

                bMovie.setTextColor(negroColor);
                bSeries.setTextColor(negroColor);
                btAtras.setTextColor(negroColor);
                btDelante.setTextColor(negroColor);
                btPag2.setTextColor(negroColor);
                btPag22.setTextColor(negroColor);
                btRojo.setTextColor(negroColor);
                btVerde.setTextColor(negroColor);
                Pag.setTextColor(negroColor);
                }
        });

        EditText etBuscaPag = findViewById(R.id.etBuscaPag);
        Button btBuscar = findViewById(R.id.btBuscar);

        btBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etBuscaPag.getText().toString();
                try {
                    int NumPag = Integer.parseInt(input);
                    if (NumPag >= 1 && NumPag <= vmodel.getTotalPages()) {
                        vmodel.setPagina(NumPag);
                        vmodel.pagBuscar();
                        TextView Pag = findViewById(R.id.Pag);
                        Pag.setText("Página: " + vmodel.getPagina());
                    } else {
                        Toast.makeText(btBuscar.getContext(), "Ingrese un número entre 1 y " + vmodel.getTotalPages(), Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(btBuscar.getContext(), "Ingrese un número válido", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}