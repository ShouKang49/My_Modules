package sg.edu.rp.c346.id22013080.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayModuleInfo extends AppCompatActivity {

    TextView code;
    TextView name;
    TextView year;
    TextView sem;
    TextView cred;
    TextView venue;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_module_info);

        code = findViewById(R.id.modCode);
        name = findViewById(R.id.modName);
        year = findViewById(R.id.year);
        sem = findViewById(R.id.sem);
        cred = findViewById(R.id.modCred);
        venue = findViewById(R.id.venue);
        back = findViewById(R.id.buttonBack);


        Intent intentReceived = getIntent();

        String modCode = intentReceived.getStringExtra("modCode");
        code.setText("Module Code: " + modCode);

        String modName = intentReceived.getStringExtra("modName");
        name.setText("Module Name: " + modName);

        int acedYear = intentReceived.getIntExtra("year", 2023);
        year.setText("Academic Year: " + acedYear);

        int semester = intentReceived.getIntExtra("sem", 1);
        sem.setText("Semester: " + semester);

        int modCred = intentReceived.getIntExtra("modCred", 2);
        cred.setText("Module Credit: "+ modCred);

        String ven = intentReceived.getStringExtra("venue");
        venue.setText("Venue: " + ven);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayModuleInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}