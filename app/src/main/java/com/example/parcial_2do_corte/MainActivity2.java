package com.example.parcial_2do_corte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView Vr_total_prod_1,Vr_total_prod_2,Vr_total_prod_3, Sub_total, Iva, Vr_total;
    private TextView precio_prod_1, precio_prod_2, precio_prod_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        precio_prod_1 = findViewById(R.id.txt_vr_unit_prod_1);
        precio_prod_2 = findViewById(R.id.txt_vr_unit_prod_2);
        precio_prod_3 = findViewById(R.id.txt_vr_unit_prod_3);
        Vr_total_prod_1 = findViewById(R.id.txt_vr_total_prod_1);
        Vr_total_prod_2 = findViewById(R.id.txt_vr_total_prod_2);
        Vr_total_prod_3 = findViewById(R.id.txt_vr_total_prod_3);
        Sub_total = findViewById(R.id.txt_sub_total);
        Iva = findViewById(R.id.txt_iva);
        Vr_total = findViewById(R.id.txt_vr_total);



        Bundle sendObj = getIntent().getExtras();
        Producto prod =null;

        if(sendObj != null){
            prod = (Producto) sendObj.getSerializable("producto");

            ;
                }
            });

        }

}