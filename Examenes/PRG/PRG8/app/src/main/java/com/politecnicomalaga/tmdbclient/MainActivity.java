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

        });

        //BOTONES MOVIES Y SERIES

        Button bMovie = (Button) findViewById(R.id.btSearchMovies);
        bMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.loadData(RequestClient.TipoBusqueda.MOVIES);
            }
        });

        Button bSeries = (Button) findViewById(R.id.btSearchSeries);
        bSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.loadData(RequestClient.TipoBusqueda.SERIES);
            }
        });


        //BOTONERA PAGINAS

        //Pagina anterior
        Button btnPrev = (Button) findViewById(id.btnPrev);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.prevPage();
            }
        });

        //Pagina siguiente
        Button btnNext = (Button) findViewById(id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.nextPage();
            }
        });

        //Primera pagina
        Button btnPrincipio = (Button) findViewById(id.btnPrincipio);
        btnPrincipio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.firstPage();
            }
        });

        //Ultima pagina
        Button btnFinal = (Button) findViewById(id.btnFinal);
        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vmodel.lastPage();
            }
        });
    }
}