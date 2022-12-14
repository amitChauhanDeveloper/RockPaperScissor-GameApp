package com.example.amit.rockpaperscissor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.io.FileOutputStream;

public class HomeScreen extends Activity implements View.OnClickListener{
    Button btnSimple=null,btnGraph=null;

    FileOutputStream f = null;
    String path = "test.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btnSimple = (Button)findViewById(R.id.btnSimple);
        btnGraph = (Button)findViewById(R.id.btnGraph);

        btnSimple.setOnClickListener(this);
        btnGraph.setOnClickListener(this);
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }
*/
    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btnSimple){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
            /*try {
                f=new FileOutputStream(path);
                byte[] buff = "This will be written in test.txt".getBytes();
                f.write(buff,0,buff.length);
                f.close();
                if(f.createNewFile())
                    Toast.makeText(this, "New File created", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "File not created", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(this, "File creation error", Toast.LENGTH_SHORT).show();
            }*/
        }
        else {
            i = new Intent(this, RPSGraphic.class);
            startActivity(i);
        }

    }
}
