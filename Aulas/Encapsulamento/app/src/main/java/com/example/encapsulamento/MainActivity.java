package com.example.encapsulamento;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        criarObjetos();
    }

    public void criarObjetos(){

        Livro objLivro = new Livro();

        objLivro.setTitulo("A culpa é das estrelas");
        objLivro.setAutor("John Green");
        objLivro.setEditora("Globo");
        objLivro.setPaginas(123);

        Log.i("POO", "Titulo: "+objLivro.getTitulo());
        Log.i("POO", "Autor: "+objLivro.getAutor());
        Log.i("POO", "Páginas: "+objLivro.getPaginas());
        Log.i("POO", "Editora: "+objLivro.getEditora());
    }
}