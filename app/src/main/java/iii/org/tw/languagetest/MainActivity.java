package iii.org.tw.languagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private boolean isOn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        isOn = true;
    }

    public void test1(View v) {
        isOn = !isOn;
        textView.setText(isOn?R.string.text1_on:R.string.text1_off);
    }
}
