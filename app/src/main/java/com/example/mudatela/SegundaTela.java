package com.example.mudatela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;


public class SegundaTela extends AppCompatActivity {

    private Button btnAnt, btnProx, btnClear;
    private RadioGroup rgSim1, rgSim2, rgSim3, rgSim4, rgSim5, rgSim6, rgSim7, rgSim8, rgSim9, rgSim10, rgSim11, rgSim12;

    private int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0, cont11 = 0, cont12 = 0;

    private TextView txtSintoma1, txtSintoma2, txtSintoma3, txtSintoma4, txtSintoma5, txtSintoma6, txtSintoma7, txtSintoma8, txtSintoma9, txtSintoma10, txtSintoma11, txtSintoma12;

    private String sinalEnvia2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        txtSintoma1 = findViewById(R.id.txtSintoma1);
        txtSintoma2 = findViewById(R.id.txtSintoma2);
        txtSintoma3 = findViewById(R.id.txtSintoma3);
        txtSintoma4 = findViewById(R.id.txtSintoma4);
        txtSintoma5 = findViewById(R.id.txtSintoma5);
        txtSintoma6 = findViewById(R.id.txtSintoma6);
        txtSintoma7 = findViewById(R.id.txtSintoma7);
        txtSintoma8 = findViewById(R.id.txtSintoma8);
        txtSintoma9 = findViewById(R.id.txtSintoma9);
        txtSintoma10 = findViewById(R.id.txtSintoma10);
        txtSintoma11 = findViewById(R.id.txtSintoma11);
        txtSintoma12 = findViewById(R.id.txtSintoma12);

        rgSim1 = findViewById(R.id.rgSim1);
        rgSim2 = findViewById(R.id.rgSim2);
        rgSim3 = findViewById(R.id.rgSim3);
        rgSim4 = findViewById(R.id.rgSim4);
        rgSim5 = findViewById(R.id.rgSim5);
        rgSim6 = findViewById(R.id.rgSim6);
        rgSim7 = findViewById(R.id.rgSim7);
        rgSim8 = findViewById(R.id.rgSim8);
        rgSim9 = findViewById(R.id.rgSim9);
        rgSim10 = findViewById(R.id.rgSim10);
        rgSim11 = findViewById(R.id.rgSim11);
        rgSim12 = findViewById(R.id.rgSim12);

        btnAnt = findViewById(R.id.btnAnt);
        btnClear = findViewById(R.id.bntClear);
        btnProx = findViewById(R.id.btnProx);


        Bundle dados = getIntent().getExtras();           // --- Obtendo dados dos sinais vitais ---
        final int vital1 = dados.getInt("choque");
        final int vital2 = dados.getInt("pressao");
        final int vital3 = dados.getInt("temperatura");
        final int vital4 = dados.getInt("saturacao");
        final int vital5 = dados.getInt("glicemia");
        sinalEnvia2 = dados.getString("sinalEnvia");


        verificaBotao();                                  // --- Verificar se botão foi clicado ---
        limpar(btnClear);                                 // --- Limpar botões ---

        btnAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

                                                          // --- Enviando dados para a TerceiraTela ---
        btnProx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), TerceiraTela.class);
                intent.putExtra("valor1", cont1);
                intent.putExtra("valor2", cont2);
                intent.putExtra("valor3", cont3);
                intent.putExtra("valor4", cont4);
                intent.putExtra("valor5", cont5);
                intent.putExtra("valor6", cont6);
                intent.putExtra("valor7", cont7);
                intent.putExtra("valor8", cont8);
                intent.putExtra("valor9", cont9);
                intent.putExtra("valor10", cont10);
                intent.putExtra("valor11", cont11);
                intent.putExtra("valor12", cont12);

                intent.putExtra("choque", vital1);
                intent.putExtra("pressao", vital2);
                intent.putExtra("temperatura", vital3);
                intent.putExtra("saturacao", vital4);
                intent.putExtra("glicemia", vital5);

                intent.putExtra("sinalEnvia", sinalEnvia2);

                startActivity(intent);
            }
        });

                                                        // --- Limpar botões ao clicar no sintoma ---

        txtSintoma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim1.clearCheck();
                cont1 = 0;
            }
        });
        txtSintoma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim2.clearCheck();
                cont2 = 0;
            }
        });
        txtSintoma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim3.clearCheck();
                cont3 = 0;
            }
        });
        txtSintoma4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim4.clearCheck();
                cont4 = 0;
            }
        });
        txtSintoma5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim5.clearCheck();
                cont5 = 0;
            }
        });
        txtSintoma6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim6.clearCheck();
                cont6 = 0;
            }
        });
        txtSintoma7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim7.clearCheck();
                cont7 = 0;
            }
        });
        txtSintoma8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim8.clearCheck();
                cont8 = 0;
            }
        });
        txtSintoma9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim9.clearCheck();
                cont9 = 0;
            }
        });
        txtSintoma10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim10.clearCheck();
                cont10 = 0;
            }
        });
        txtSintoma11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim11.clearCheck();
                cont11 = 0;
            }
        });
        txtSintoma12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgSim12.clearCheck();
                cont12 = 0;
            }
        });

    }

                                                        // --- Verificar se botão foi clicado ---

    private void verificaBotao(){
        rgSim1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn1){
                    cont1 = 5;
                } if (checkedId == R.id.rbtn2){
                    cont1 = 4;
                } if (checkedId == R.id.rbtn3){
                    cont1 = 3;
                } if (checkedId == R.id.rbtn4){
                    cont1 = 2;
                } if (checkedId == R.id.rbtn5){
                    cont1 = 1;
                }
            }
        });
        rgSim2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn6){
                    cont2 = 5;
                } if (checkedId == R.id.rbtn7){
                    cont2 = 4;
                } if (checkedId == R.id.rbtn8){
                    cont2 = 3;
                } if (checkedId == R.id.rbtn9){
                    cont2 = 2;
                } if (checkedId == R.id.rbtn10){
                    cont2 = 1;
                }
            }
        });
        rgSim3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn11){
                    cont3 = 5;
                } if (checkedId == R.id.rbtn12){
                    cont3 = 4;
                } if (checkedId == R.id.rbtn13){
                    cont3 = 3;
                } if (checkedId == R.id.rbtn14){
                    cont3 = 2;
                } if (checkedId == R.id.rbtn15){
                    cont3 = 1;
                }
            }
        });
        rgSim4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn16){
                    cont4 = 5;
                } if (checkedId == R.id.rbtn17){
                    cont4 = 4;
                } if (checkedId == R.id.rbtn18){
                    cont4 = 3;
                } if (checkedId == R.id.rbtn19){
                    cont4 = 2;
                } if (checkedId == R.id.rbtn20){
                    cont4 = 1;
                }
            }
        });
        rgSim5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn21){
                    cont5 = 5;
                } if (checkedId == R.id.rbtn22){
                    cont5 = 4;
                } if (checkedId == R.id.rbtn23){
                    cont5 = 3;
                } if (checkedId == R.id.rbtn24){
                    cont5 = 2;
                } if (checkedId == R.id.rbtn25){
                    cont5 = 1;
                }
            }
        });
        rgSim6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn26){
                    cont6 = 5;
                } if (checkedId == R.id.rbtn27){
                    cont6 = 4;
                } if (checkedId == R.id.rbtn28){
                    cont6 = 3;
                } if (checkedId == R.id.rbtn29){
                    cont6 = 2;
                } if (checkedId == R.id.rbtn30){
                    cont6 = 1;
                }
            }
        });
        rgSim7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn31){
                    cont7 = 5;
                } if (checkedId == R.id.rbtn32){
                    cont7 = 4;
                } if (checkedId == R.id.rbtn33){
                    cont7 = 3;
                } if (checkedId == R.id.rbtn34){
                    cont7 = 2;
                } if (checkedId == R.id.rbtn35){
                    cont7 = 1;
                }
            }
        });
        rgSim8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn36){
                    cont8 = 5;
                } if (checkedId == R.id.rbtn37){
                    cont8 = 4;
                } if (checkedId == R.id.rbtn38){
                    cont8 = 3;
                } if (checkedId == R.id.rbtn39){
                    cont8 = 2;
                }
            }
        });
        rgSim9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn41){
                    cont9 = 4;
                } if (checkedId == R.id.rbtn42){
                    cont9 = 3;
                } if (checkedId == R.id.rbtn43){
                    cont9 = 2;
                } if (checkedId == R.id.rbtn44){
                    cont9 = 1;
                }
            }
        });
        rgSim10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn46){
                    cont10 = 4;
                } if (checkedId == R.id.rbtn47){
                    cont10 = 3;
                } if (checkedId == R.id.rbtn48){
                    cont10 = 2;
                } if (checkedId == R.id.rbtn49){
                    cont10 = 1;
                }
            }
        });
        rgSim11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn51){
                    cont11 = 5;
                } if (checkedId == R.id.rbtn52){
                    cont11 = 4;
                } if (checkedId == R.id.rbtn53){
                    cont11 = 3;
                } if (checkedId == R.id.rbtn54){
                    cont11 = 2;
                } if (checkedId == R.id.rbtn55){
                    cont11 = 1;
                }
            }
        });
        rgSim12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn56){
                    cont12 = 5;
                } if (checkedId == R.id.rbtn57){
                    cont12 = 4;
                } if (checkedId == R.id.rbtn58){
                    cont12 = 3;
                } if (checkedId == R.id.rbtn59){
                    cont12 = 2;
                } if (checkedId == R.id.rbtn60){
                    cont12 = 1;
                }
            }
        });
    }
                                                         // --- Limpar todos os botões ao mesmo tempo ---

    public void limpar(View view){
        rgSim1.clearCheck();
        rgSim2.clearCheck();
        rgSim3.clearCheck();
        rgSim4.clearCheck();
        rgSim5.clearCheck();
        rgSim6.clearCheck();
        rgSim7.clearCheck();
        rgSim8.clearCheck();
        rgSim9.clearCheck();
        rgSim10.clearCheck();
        rgSim11.clearCheck();
        rgSim12.clearCheck();

        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        cont6 = 0;
        cont7 = 0;
        cont8 = 0;
        cont9 = 0;
        cont10 = 0;
        cont11 = 0;
        cont12 = 0;
    }

}
