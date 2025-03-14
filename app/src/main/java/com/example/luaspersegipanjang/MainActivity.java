package com.example.luaspersegipanjang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText edPanjang, edLebar, edLuas;
Button btHitung;

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

        edPanjang = findViewById(R.id.edPanjang);
        edLebar = findViewById(R.id.edLebar);
        edLuas =  findViewById(R.id.edLuas);
        btHitung = findViewById(R.id.btHitung);

        btHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double panjang = Double.parseDouble(edPanjang.getText().toString());
                double lebar = Double.parseDouble(edLebar.getText().toString());

                double luas = panjang * lebar;

                edLuas.setText(""+ luas);
            }
        });

    }
}