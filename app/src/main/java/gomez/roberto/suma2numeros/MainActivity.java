package gomez.roberto.suma2numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final EditText num1= (EditText)findViewById(R.id.txtNum1);
        EditText num2= (EditText)findViewById(R.id.txtNum2);
        Button btnSuma= (Button) findViewById(R.id.btnSumar);
        final float resultado;



        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numero1= Float.parseFloat(num1.getText().toString());
                float numero2= Float.parseFloat(num1.getText().toString());
                float resultado = numero1+numero2;

                Toast.makeText(getApplicationContext(),
                        "resultado "+resultado,Toast.LENGTH_SHORT).show();
            }
        });


    }

}
