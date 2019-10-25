package com.example.theaters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class payment extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        radioGroup =findViewById(R.id.rg1);
        textView=findViewById(R.id.tvs1);
        Button button=findViewById(R.id.bs);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                textView.setText("Your Choice is :"+radioButton.getText());

            }
        });
    }
    public void checkButton(View v)
    {
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
        Toast.makeText(this, "Selected Mode is" + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }


    public void paymentButton(View view) {
        Intent i=new Intent(payment.this,carddetails.class);
        startActivity(i);
    }
    }

