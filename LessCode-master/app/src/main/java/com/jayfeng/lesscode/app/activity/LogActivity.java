package com.jayfeng.lesscode.app.activity;

import android.app.Activity;
import android.os.Bundle;

import com.jayfeng.lesscode.app.R;
import com.jayfeng.lesscode.core.LogLess;

public class LogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        LogLess.$d("xxxxxxx");
        LogLess.$e("yyyyy");
        LogLess.$json("{\"a\":\"aValue\"}", "test");
    }
}
