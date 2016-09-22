package com.aixinwu.axw.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aixinwu.axw.R;

public class DealFinished extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_finished);
        TextView OverallChecked = (TextView) findViewById(R.id.overallcost);
        Button BackToMain = (Button) findViewById(R.id.BackToMain);

        OverallChecked.setText("总共消费： "+  getIntent().getStringExtra("overallcost") + " 爱心币");
        BackToMain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        Intent intent = new Intent(getApplication(), MainActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }

}