package com.unknown.root.quiz;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import com.unknown.root.quiz.R;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton nextplay = (ImageButton) findViewById(R.id.imgbtn_play);
        nextplay.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent nextplay = new Intent (MainActivity.this, StartActivity.class);
                startActivity(nextplay);
            }
        });

        ImageButton nextabout = (ImageButton) findViewById(R.id.imgbtn_about);
        nextabout.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent nextabout = new Intent (MainActivity.this, AboutActivity.class);
                startActivity(nextabout);
            }
        });


    }
}