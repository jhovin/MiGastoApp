package pe.bonifacio.misgastosapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText montoInput;
    private RadioGroup radioGroup;

    private Button rbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        montoInput = findViewById(R.id.monto_text);
        radioGroup = (RadioGroup) findViewById(R.id.opciones_registro);
        rbutton = findViewById(R.id.registrar_button);


        rbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callRegistrar();
            }
        });
    }

    private void callRegistrar() {
        String amount = montoInput.getText().toString();

        if (amount.isEmpty()) {
            Toast.makeText(this, "Completar los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("amount", amount);
        startActivity(intent);
    }
}