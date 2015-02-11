package vgplusstest.vg.no.vgplussintegrasjontest;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ((TextView)findViewById(R.id.status)).setText("Klargjør...");
        ((TextView)findViewById(R.id.status)).setTextColor(Color.argb(255,255,0,0));
    }

    @Override
    protected void onResume() {
        super.onResume();
        ((TextView)findViewById(R.id.status)).setText("Klar");
        ((TextView)findViewById(R.id.status)).setTextColor(Color.argb(255,0,200,0));

    }

    public void buttonClick(final View view) {
        Uri uri = Uri.parse("vgpluss://open/edition/1919/article/1919_23388662");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
