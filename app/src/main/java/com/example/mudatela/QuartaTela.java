package com.example.mudatela;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuartaTela extends AppCompatActivity {

    private Button btnPrevious, btnNext, btnClear;
    private RadioGroup rgVital1, rgVital2, rgVital3, rgVital4, rgVital5;
    private TextView txtVital1, txtVital2, txtVital3, txtVital4, txtVital5;

    private String sinalEnvia1 = "";

    private int contVital1 = 0, contVital2 = 0, contVital3 = 0, contVital4 = 0, contVital5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_tela);

        rgVital1 = findViewById(R.id.rgVital1);
        rgVital2 = findViewById(R.id.rgVital2);
        rgVital3 = findViewById(R.id.rgVital3);
        rgVital4 = findViewById(R.id.rgVital4);
        rgVital5 = findViewById(R.id.rgVital5);

        txtVital1 = findViewById(R.id.txtSinalVital1);
        txtVital2 = findViewById(R.id.txtSinalVital2);
        txtVital3 = findViewById(R.id.txtSinalVital3);
        txtVital4 = findViewById(R.id.txtSinalVital4);
        txtVital5 = findViewById(R.id.txtSinalVital5);

        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnClear = findViewById(R.id.btnClear);

        verificaBotao();

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaTela.class);

                intent.putExtra("choque", contVital1);
                intent.putExtra("pressao", contVital2);
                intent.putExtra("temperatura", contVital3);
                intent.putExtra("saturacao", contVital4);
                intent.putExtra("glicemia", contVital5);
                intent.putExtra("sinalEnvia", sinalEnvia1);

                startActivity(intent);
            }
        });


        //Limpar campos ----------------------------------------------------------------------------
        txtVital1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgVital1.clearCheck();
                contVital1 = 0;
            }
        });
        txtVital2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgVital2.clearCheck();
                contVital2 = 0;
            }
        });
        txtVital3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgVital3.clearCheck();
                contVital3 = 0;
            }
        });
        txtVital4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgVital4.clearCheck();
                contVital4 = 0;
            }
        });
        txtVital5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgVital5.clearCheck();
                contVital5 = 0;
            }
        });
    }

    //Verificar botao ------------------------------------------------------------------------------
    private void verificaBotao(){
        rgVital1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtnVital1) {
                    sinalEnvia1 = txtVital1.toString();
                    contVital1 = 5;
                } if (checkedId == R.id.rbtnVital2) {
                    contVital1 = 0;
                }
            }
        });
        rgVital2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtnVital3 || checkedId == R.id.rbtnVital4) {
                    contVital2 = 4;
                } if (checkedId == R.id.rbtnVital5) {
                    contVital2 = 3;
                } if (checkedId == R.id.rbtnVital6) {
                    contVital2 = 2;
                }
            }
        });
        rgVital3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtnVital7) {
                    contVital3 = 4;
                } if (checkedId == R.id.rbtnVital8) {
                    contVital3 = 3;
                } if (checkedId == R.id.rbtnVital9) {
                    contVital3 = 2;
                }
            }
        });
        rgVital4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtnVital10) {
                    contVital4 = 5;
                } if (checkedId == R.id.rbtnVital11) {
                    contVital4 = 4;
                } if (checkedId == R.id.rbtnVital12) {
                    contVital4 = 3;
                } if (checkedId == R.id.rbtnVital13) {
                    contVital4 = 2;
                }
            }
        });
        rgVital5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtnVital14) {
                    contVital5 = 4;
                }
            }
        });
    }

    private void clear() {
        rgVital5.clearCheck();
        rgVital4.clearCheck();
        rgVital2.clearCheck();
        rgVital1.clearCheck();
        rgVital3.clearCheck();

        contVital1 = 0;
        contVital2 = 0;
        contVital3 = 0;
        contVital4 = 0;
        contVital5 = 0;
    }

}
