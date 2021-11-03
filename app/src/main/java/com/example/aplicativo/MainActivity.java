package com.example.aplicativo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView txtMsg;
    private TextView txtNomeCompleto;
    private EditText edtTxtNome;
    private EditText edtTxtSobrenome;
    private ArrayList<String> arrList = new ArrayList<>();
    private EditText edtTxtLista;
    private TextView txtItensLista;
    ArrayAdapter<String> adapter;
    private RadioButton rdBtnMasculino;
    private RadioButton rdBtnFeminino;
    private TextView txtSexo;
    private EditText atCpEdtTxtPais;
    private Spinner spnLista;
    private TextView txtIdade;
    private ListView listView;

    MediaPlayer musica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musica = MediaPlayer.create(this, R.raw.f1);

        Spinner spinner = findViewById(R.id.spnLista);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.idade, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
/*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, PAISES);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.atCpEdtTxtPais);
        textView.setAdapter(adapter);
 */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.menuPag1:
                Toast.makeText(this, "Você já está na página 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.menuPag2:
                Intent intent = new Intent(this, pagina2.class);
                startActivity(intent);
                //Toast.makeText(this, "Página 2 Indisponível", Toast.LENGTH_LONG).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    private static final String[] PAISES = new String[] {
            "Alemanha","Argentina","Bélgica","Brasil","Chile",
            "Espanha","Estados Unidos","Portugal"
    };

    public void nomeCompleto(View view){
        txtNomeCompleto = (TextView) findViewById(R.id.txtNomeCompleto);
        edtTxtNome = (EditText) findViewById(R.id.edtTxtNome);
        edtTxtSobrenome = (EditText) findViewById(R.id.edtTxtSobrenome);

        txtNomeCompleto.setText("SEU NOME COMPLETO: "+edtTxtNome.getText()+" "+edtTxtSobrenome.getText());
        mudaSexo();
        mudaIdade();
    }

    public void mudaSexo(){
        rdBtnMasculino = findViewById(R.id.rdBtnMasculino);
        rdBtnFeminino = findViewById(R.id.rdBtnFeminino);
        txtSexo = findViewById(R.id.txtSexo);
        if(rdBtnMasculino.isChecked()){
            txtSexo.setText("SEU SEXO: "+rdBtnMasculino.getText());
        }
        if(rdBtnFeminino.isChecked()){
            txtSexo.setText("SEU SEXO: "+rdBtnFeminino.getText());
        }
    }

    public void mudaIdade(){
        spnLista = findViewById(R.id.spnLista);
        txtIdade = findViewById(R.id.txtIdade);
        txtIdade.setText("SUA IDADE: "+spnLista.getSelectedItem().toString());
    }

    public void mudaBtn(View view){
        toggleButton = (ToggleButton) findViewById(R.id.btnToggle);
        txtMsg = (TextView) findViewById(R.id.txtMsg);
        if(toggleButton.isChecked()){
            musica.start();
            txtMsg.setText("Música Tocando");
        }else {
            musica.pause();
            txtMsg.setText("Botão desativado");
        }
    }

    public void pais(View vie){

    }

    public void addLista(View view){
        listView = findViewById(R.id.listView);
        edtTxtLista = (EditText) findViewById(R.id.edtTxtLista);
        arrList.add(String.valueOf(edtTxtLista.getText()));

        ArrayAdapter<String> arAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrList);
        listView.setAdapter(arAdapter);
        //txtItensLista = findViewById(R.id.txtItensLista);
        //txtItensLista.setText("");
        //for (int i = 0; i < arrList.size(); i++) {
        //    txtItensLista.setText(txtItensLista.getText() + arrList.get(i) + "\n");
        //}
        edtTxtLista.setText("");

        /*adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item, arrList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnLista.setAdapter(adapter);*/
    }
}