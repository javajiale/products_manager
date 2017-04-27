package com.brucele.products_manager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by javajiale on 2016/8/22.
 */
public class LogInAty extends AppCompatActivity {

    private EditText et_username;
    private EditText et_pwd;
    private Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);   //隐藏title
        setContentView(R.layout.login);

        et_username = (EditText) findViewById(R.id.et_username);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        login_btn = (Button) findViewById(R.id.btnSignIn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogInAty.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });



    }


}
