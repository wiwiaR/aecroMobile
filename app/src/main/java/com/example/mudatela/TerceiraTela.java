package com.example.mudatela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TerceiraTela extends AppCompatActivity {

    private Button btnSeg, btnInicio, btnLista;
    private TextView cor;
    private String sinalEnvia3 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        btnInicio = findViewById(R.id.btnInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hey = new Intent(getApplicationContext(), MainActivity.class);
                hey.setFlags(hey.FLAG_ACTIVITY_CLEAR_TOP);
                hey.putExtra("EXIT", true);
                startActivity(hey);
            }
        });

        cor = findViewById(R.id.txtCor);

        Bundle dados = getIntent().getExtras();
        int cont1 = dados.getInt("valor1");
        int cont2 = dados.getInt("valor2");
        int cont3 = dados.getInt("valor3");
        int cont4 = dados.getInt("valor4");
        int cont5 = dados.getInt("valor5");
        int cont6 = dados.getInt("valor6");
        int cont7 = dados.getInt("valor7");
        int cont8 = dados.getInt("valor8");
        int cont9 = dados.getInt("valor9");
        int cont10 = dados.getInt("valor10");
        int cont11 = dados.getInt("valor11");
        int cont12 = dados.getInt("valor12");

        int vital1 = dados.getInt("choque");
        int vital2 = dados.getInt("pressao");
        int vital3 = dados.getInt("temperatura");
        int vital4 = dados.getInt("saturacao");
        int vital5 = dados.getInt("glicemia");

        sinalEnvia3 = dados.getString("sinalEnvia");


        int vermelho = 0, laranja = 0, amarelo = 0, verde = 0, azul = 0;


        if (cont1 == 5 || cont2 == 5 || cont3 == 5 || cont4 == 5 || cont5 == 5 || cont6 == 5 || cont7 == 5 || cont8 == 5 || cont11 == 5 || cont12 == 5 || vital1 == 5 || vital4 == 5) {
            vermelho = 1;
        } else if (cont1 == 4 || cont2 == 4 || cont3 == 4 || cont4 == 4 || cont5 == 4 || cont6 == 4 || cont7 == 4 || cont8 == 4 || cont9 == 4 || cont10 == 4 || cont11 == 4 || cont12 == 4 || vital2 == 4 || vital3 == 4 || vital4 == 4 || vital5 == 4) {
            laranja = 1;
        } else if (cont1 == 3 || cont2 == 3 || cont3 == 3 || cont4 == 3 || cont5 == 3 || cont6 == 3 || cont7 == 3 || cont8 == 3 || cont9 == 3 || cont10 == 3 || cont11 == 3 || cont12 == 3 || vital2 == 3 || vital3 == 3 || vital4 == 3) {
            amarelo = 1;
        } else if (cont1 == 2 || cont2 == 2 || cont3 == 2 || cont4 == 2 || cont5 == 2 || cont6 == 2 || cont7 == 2 || cont8 == 2 || cont9 == 2 || cont10 == 2 || cont11 == 2 || cont12 == 2 || vital2 == 2 || vital3 == 2 || vital4 == 2) {
            verde = 1;
        } else if (cont1 == 1 || cont2 == 1 || cont3 == 1 || cont4 == 1 || cont5 == 1 || cont6 == 1 || cont7 == 1 || cont8 == 1 || cont9 == 1 || cont10 == 1 || cont11 == 1 || cont12 == 1) {
            azul = 1;
        }

        if (vermelho != 1){
            if (laranja != 1){
                if (amarelo != 1){
                    if (verde != 1){
                        if (azul != 1){
                            cor.setText("Sem cor");
                        } else {
                            cor.setText("Azul");
                            cor.setTextColor(this.getResources().getColor(R.color.corAzul));
                        }
                    } else {
                        cor.setText("Verde");
                        cor.setTextColor(this.getResources().getColor(R.color.corVerde));
                    }
                } else {
                    cor.setText("Amarelo");
                    cor.setTextColor(this.getResources().getColor(R.color.corAmarela));
                }
            } else {
                cor.setText("Laranja");
                cor.setTextColor(this.getResources().getColor(R.color.corLaranja));
            }
        } else {
            cor.setText("Vermelho");
            cor.setTextColor(this.getResources().getColor(R.color.corVermelha));
        }


        btnSeg = findViewById(R.id.btnSeg);
        btnSeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
