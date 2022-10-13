package com.example.parcial_2do_corte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText canProd_1, canProd_2, canProd_3;
    public Button btnComprar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        canProd_1 = findViewById(R.id.cant_prod_1);
        canProd_2 = findViewById(R.id.cant_prod_2);
        canProd_3 = findViewById(R.id.cant_prod_3);
        btnComprar = findViewById(R.id.btnComprar);

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    public boolean validacion() {

    boolean res = true;
        String entrada_1 = canProd_1.getText().toString();
        String entrada_2 = canProd_2.getText().toString();
        String entrada_3 = canProd_3.getText().toString();

        if(entrada_1.isEmpty()){
            canProd_1.setError("Diligencie este espacio");
            res = false;
        }
        else if(entrada_2.isEmpty()){
            canProd_2.setError("Diligencie este espacio");
            res = false;
        }
        else if(entrada_3.isEmpty()){
            canProd_3.setError("Diligencie este espacio");
            res = false;
        }
        return res;
    }

}
