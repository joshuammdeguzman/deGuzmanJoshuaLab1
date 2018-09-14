package joshuamartin.deguzman.com.deguzmanjoshualab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        Button back = findViewById(R.id.relativeBack);
        Button next = findViewById(R.id.relativeNext);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveB = new Intent(getApplicationContext(), constraintActivity.class);
                startActivity(moveB);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveN = new Intent(getApplicationContext(), linearActivity.class);
                startActivity(moveN);
            }
        });
    }
}
