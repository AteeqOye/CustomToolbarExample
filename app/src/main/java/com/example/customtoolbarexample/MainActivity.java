package com.example.customtoolbarexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        toolbar = findViewById (R.id.toolBar);

        setSupportActionBar (toolbar);

        if(getSupportActionBar ()!=null)
        {
            getSupportActionBar ().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar ().setTitle ("My ToolBar");
        }
        toolbar.setSubtitle ("Sub Title");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            new MenuInflater (this).inflate (R.menu.option_menu , menu);
        return super.onCreateOptionsMenu (menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId ();
        if(itemId==R.id.new_opt)
        {
            Toast.makeText (this, "Created new file.", Toast.LENGTH_SHORT).show ();
        }
        else if(itemId==R.id.open_opt)
        {
            Toast.makeText (this, "Your file is opening...", Toast.LENGTH_SHORT).show ();
        }
        else if(itemId==R.id.save_opt)
        {
            Toast.makeText (this, "Your file is saved.", Toast.LENGTH_SHORT).show ();
        }
        //for back button where its id is "android.R.id.home".
        else
        {
            super.onBackPressed ();
        }
        return super.onOptionsItemSelected (item);
    }
}