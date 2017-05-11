package com.example.edao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.bc.lib.BeerCalculator;

import java.util.Formatter;


public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private TextView mTextView;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);
        mEditText = (EditText) findViewById(R.id.editText);
        mBtn = (Button) findViewById(R.id.button);

        mBtn.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
               String value =  mEditText.getText().toString().trim();
                if(value.equals("")){
                    Toast.makeText(MainActivity.this, "输入不能为空！", Toast.LENGTH_SHORT).show();
                }
                else{
                    int n = Integer.valueOf(value);
                    int[] result = BeerCalculator.calc(n);
                    //String str = String.format("%d元钱能喝%d瓶酒，剩余%d元钱，剩余%d个空瓶，剩余%d个瓶盖", n , result[0], result[1], result[2], result[3]);
                    Formatter formatter = new Formatter();
                    String str2 = formatter.format("%d元钱能喝%d瓶酒，剩余%d元钱，剩余%d个空瓶，剩余%d个瓶盖", n , result[0], result[1], result[2], result[3]).toString();

                    mTextView.setText(str2);
                }

            }
        });
    }
}
