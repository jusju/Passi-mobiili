package fi.softala.passi;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PassinValintaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passin_valinta);
        Button button1 = (Button) findViewById(R.id.btnTyokykypassi);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(PassinValintaActivity.this, TehtavakortinValintaActivity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.btnTyokykypassi);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(PassinValintaActivity.this, TehtavakortinValintaActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.btnTyokykypassi);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(PassinValintaActivity.this, TehtavakortinValintaActivity.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.btnTyokykypassi);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(PassinValintaActivity.this, TehtavakortinValintaActivity.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button) findViewById(R.id.btnTyokykypassi);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(PassinValintaActivity.this, TehtavakortinValintaActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {

        super.onBackPressed();
        finish();


    }

}
