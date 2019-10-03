package pe.bonifacio.misgastosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView ahorroedit;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ahorroedit=findViewById(R.id.ahorro_edit);
        progressBar=findViewById(R.id.progreso_horizontal);

        if (getIntent().getExtras()!=null) {
            String amount = getIntent().getExtras().getString("amount");
            int radioId=getIntent().getExtras().getInt("radioId");

            ahorroedit.setText(amount);
            progressBar.setProgress(radioId);

        }

    }

}
