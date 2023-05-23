package sg.edu.rp.c346.id22013080.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView c203;
    TextView c206;
    TextView c218;
    TextView c235;
    TextView c346;
    TextView g956;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c203 = findViewById(R.id.textViewC203);
        c206 = findViewById(R.id.textViewC206);
        c218 = findViewById(R.id.textViewC218);
        c235 = findViewById(R.id.textViewC235);
        c346 = findViewById(R.id.textViewC346);
        g956 = findViewById(R.id.textViewG956);

        c203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModuleInfo.class);
                intent.putExtra("modCode", "C203");
                intent.putExtra("modName", "Web Application Development in PHP");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        c206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModuleInfo.class);
                intent.putExtra("modCode", "C206");
                intent.putExtra("modName", "Software Development Process");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        c218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModuleInfo.class);
                intent.putExtra("modCode", "C218");
                intent.putExtra("modName", "UI/UX Design");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        c235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModuleInfo.class);
                intent.putExtra("modCode", "C235");
                intent.putExtra("modName", "IT security and Management");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModuleInfo.class);
                intent.putExtra("modCode", "C346");
                intent.putExtra("modName", "Mobile App Development");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 4);
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

        g956.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModuleInfo.class);
                intent.putExtra("modCode", "G956");
                intent.putExtra("modName", "Life Skills III");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 2);
                startActivity(intent);
            }
        });
     }
}