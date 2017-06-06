package com.zoe.litter.coordinatelayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.zoe.litter.R;

public class FloatingActionButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello World", Snackbar.LENGTH_LONG)
                        .setAction("nihao", new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Toast.makeText(FloatingActionButtonActivity.this, "hello tt",
                                        Toast.LENGTH_LONG).show();
                            }
                        }).show();
            }
        });
    }

}
