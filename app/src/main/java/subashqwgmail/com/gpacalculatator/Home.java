package subashqwgmail.com.gpacalculatator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
private Button btnmacu;
private Button btnyorku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnyorku = findViewById(R.id.btnyorku);
        btnyorku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        btnmacu = findViewById(R.id.btnmacu);
        btnmacu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMcU();
            }
        });
    }
    public void openMainActivity(){
Intent intent =new Intent(this,MainActivity.class);
startActivity(intent);
    }
    public void openMcU(){
        Intent intent =new Intent(this,McUGPA.class);
        startActivity(intent);
    }

}
