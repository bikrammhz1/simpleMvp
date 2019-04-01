package com.i.simplemvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.i.simplemvp.R;
import com.i.simplemvp.model.MainInterface;
import com.i.simplemvp.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainInterface.view {

    private EditText edA;
    private EditText edB;
    private Button btnSum;
    private TextView tvDisplay;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        handalingUI();
    }

    private void initUI(){
        mainPresenter = new MainPresenter(this);
        edA = findViewById(R.id.ed_a);
        edB = findViewById(R.id.ed_b);
        btnSum = findViewById(R.id.btn_submit);
        tvDisplay = findViewById(R.id.tv_print);
    }

    private void handalingUI(){
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edA.getText().toString());
                int b = Integer.parseInt(edB.getText().toString());
                mainPresenter.sum(a,b);
            }
        });
    }

    @Override
    public void answer(String msg) {
        tvDisplay.setText(msg);
    }
}
