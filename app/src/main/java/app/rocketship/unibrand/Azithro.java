package app.rocketship.unibrand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Azithro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azithro);
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(Azithro.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
