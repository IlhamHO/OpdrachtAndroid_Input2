package be.ehb.opdrachtandroid_input2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etEuroBedrag;
    private EditText etUsdBedrag;
    private Button btnconvert;
    private String str_bedrag;

    private View.OnClickListener convertListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Double euroBedrag = Double.parseDouble(etEuroBedrag.getText().toString());

            Double usdBedrag = euroBedrag*0.85;

            etUsdBedrag.setText(String.valueOf(usdBedrag));

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEuroBedrag = findViewById(R.id.et_euroBedrag);
        etUsdBedrag = findViewById(R.id.et_usdBedrag);
        btnconvert = findViewById(R.id.btn_convert);


        btnconvert.setOnClickListener(convertListener);
    }
}
