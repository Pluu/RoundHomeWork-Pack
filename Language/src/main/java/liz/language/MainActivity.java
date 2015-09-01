package liz.language;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.content.res.Configuration;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends ActionBarActivity {
    Button btn_ko, btn_en, btn_ja, btn_zh;
    TextView hello, text;

    //언어 변경 부분
    public void setLocale(String charicter) {
        Locale locale = new Locale(charicter);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().
                updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = (TextView) findViewById(R.id.hello);
        text = (TextView) findViewById(R.id.text);
        btn_en = (Button) findViewById(R.id.button_en);
        btn_ko = (Button) findViewById(R.id.button_ko);
        btn_ja = (Button) findViewById(R.id.button_ja);
        btn_zh = (Button) findViewById(R.id.button_zh);
    }

    public void onClick(View v) {

        if (v == btn_en) {
            setLocale("en");
        } else if (v == btn_ko) {
            setLocale("ko");
        }
        else if (v == btn_ja) {
            setLocale("ja");
        }
        else if (v == btn_zh) {
            setLocale("zh");
        }

        //갱신 부분
        hello.setText(R.string.hello);
        text.setText(R.string.text);
        btn_en.setText(R.string.btn_en);
        btn_ko.setText(R.string.btn_ko);
        btn_ja.setText(R.string.btn_ja);
        btn_zh.setText(R.string.btn_zh);

    }
}