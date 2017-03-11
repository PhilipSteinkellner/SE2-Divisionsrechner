package com.calc.divisionsrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button); //Divide Button

        /** Called when the user taps the divide button */
        button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.output);
                        TextView divident = (TextView) findViewById(R.id.divident);
                        TextView divisor = (TextView) findViewById(R.id.divisor);

                        //Exception handling if either divident or divisor field is empty
                        if (divident.getText().toString().trim().length() == 0 ||
                                divisor.getText().toString().trim().length() == 0) {

                            output.setText("Felder ausfüllen!");

                        } else { //parse inputs to doubles

                            double d1 = Double.parseDouble(divident.getText().toString());
                            double d2 = Double.parseDouble(divisor.getText().toString());

                            if (d2 == 0) {
                                // Cannot Divide By Zero
                                output.setText("Nulldivision nicht moeglich!");
                            } else {
                                output.setText(Double.toString(d1 / d2));
                            }
                        }
                    }
                }
        );

    }


}
