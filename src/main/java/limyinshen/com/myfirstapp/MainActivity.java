package limyinshen.com.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText number1 = (EditText) findViewById(R.id.firstNumEditText);
                EditText number2 = (EditText) findViewById(R.id.secondNumeditText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                int resulto = num2 + num1;
                result.setText(resulto + "");
            }
        });

    }
}
