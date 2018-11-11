package co.codemaestro.roomdatabasepractice;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class TimeBank {
    @NonNull
    @PrimaryKey
    private int timeBankID;
    private String timeBankName;
    private long timeBankMillis;

    public TimeBank() {

    }

    @NonNull
    public int getTimeBankID() {
        return timeBankID;
    }

    public void setTimeBankID(@NonNull int timeBankID) {
        this.timeBankID = timeBankID;
    }

    public String getTimeBankName() {
        return timeBankName;
    }

    public void setTimeBankName(String timeBankName) {
        this.timeBankName = timeBankName;
    }

    public long getTimeBankMillis() {
        return timeBankMillis;
    }

    public void setTimeBankMillis(long timeBankMillis) {
        this.timeBankMillis = timeBankMillis;
    }
}
