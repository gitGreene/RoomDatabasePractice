package co.codemaestro.roomdatabasepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String DATABASE_NAME = "timeBank database";
    private TimeBankDatabase timeBankDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                TimeBank timeBank = new TimeBank();
                timeBank.setTimeBankID(1);
                timeBank.setTimeBankName("Gym");
                timeBank.setTimeBankMillis(000001);
                timeBankDatabase.timeBankDao().insertNewTimeBank(timeBank);
            }
        }).start();
    }


}
