package joshuamartin.deguzman.com.deguzmanjoshualab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button constraint = findViewById(R.id.constraintButton);
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveC = new Intent(getApplicationContext(), constraintActivity.class);
                startActivity(moveC);
            }
        });

        Button relative = findViewById(R.id.relativeButton);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveR = new Intent(getApplicationContext(), relativeActivity.class);
                startActivity(moveR);
            }
        });

        Button linear = findViewById(R.id.linearButton);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveL = new Intent(getApplicationContext(), linearActivity.class);
                startActivity(moveL);
            }
        });
    }
}
