package com.example.catalogo_wcq;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.catalogo_wcq.Entidades.SqliteUtil;

import Utilidades.UtilWCQ;

public class InsertarCurso extends AppCompatActivity implements View.OnClickListener {
    ImageView imgMostrarImagen;
    Button btnCargarImage,btnRegistrar;
    EditText edtCodigo,edtNombre,edtDescripcion,edtDuracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar_curso);
        imgMostrarImagen=findViewById(R.id.imgMostrarImage);
        btnCargarImage=findViewById(R.id.btnCargarImagen);
        btnRegistrar=findViewById(R.id.btnRegistrar);
        edtCodigo=findViewById(R.id.edtCodigo);
        edtNombre=findViewById(R.id.edtNombre);
        edtDescripcion=findViewById(R.id.edtDescripción);
        edtDuracion=findViewById(R.id.edtDuracion);

        btnCargarImage.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCargarImagen:{
                cargarImagen();
                break;
            }
            case R.id.btnRegistrar:
                regCurso();
                break;
        }
    }

    private void regCurso() {
        SqliteUtil conexion=new SqliteUtil(this,"bd_catalogo", null,1);
        SQLiteDatabase db=conexion.getWritableDatabase();
        ContentValues valores=new ContentValues();
        valores.put(UtilWCQ.CAMPO_ID,edtCodigo.getText().toString());
        valores.put(UtilWCQ.CAMPO_NOMBRE,edtNombre.getText().toString());
        valores.put(UtilWCQ.CAMPO_DESCRIPCION,edtDescripcion.getText().toString());
        valores.put(UtilWCQ.CAMPO_DURACION,edtDuracion.getText().toString());
        valores.put(UtilWCQ.CAMPO_IMAGEN,imgMostrarImagen.getImageAlpha());

        Long resultado=db.insert(UtilWCQ.CREAR_TABLA_CURSO,null,valores);
        Toast.makeText(this, "Registro completo", Toast.LENGTH_SHORT).show();
        db.close();
    }

    private void cargarImagen() {
        Intent i=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        i.setType("image/");
        startActivityForResult(i.createChooser(i,"Seleciona una Aplicación"),10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Uri path=data.getData();
            imgMostrarImagen.setImageURI(path);
        }

    }
}