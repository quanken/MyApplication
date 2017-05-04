package com.example.edao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.edao.myapplication.ndktest.NDKLibUtil;
import com.example.edao.myapplication.ndktest.NDKUtil;


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
                    NDKLibUtil ndk_lib_util = new NDKLibUtil();
                    String str = ndk_lib_util.result(n);

//                    NDKUtil ndk_util = new NDKUtil();
//                    String str = ndk_util.result(n);

                    mTextView.setText(str);
                }

            }
        });



        //mTextView.setText(ndk_util.getLibName());
    }
}
