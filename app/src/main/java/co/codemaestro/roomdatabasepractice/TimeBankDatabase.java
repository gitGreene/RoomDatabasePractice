package co.codemaestro.roomdatabasepractice;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import java.sql.Time;

@Database(entities = {TimeBank.class}, version = 1, exportSchema = false)
public abstract class TimeBankDatabase extends RoomDatabase {
    private  static TimeBankDatabase INSTANCE;
    public abstract TimeBankDao timeBankDao();

    public static TimeBankDatabase getTimeBankDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(),
                            TimeBankDatabase.class, "timeBank database")
                    .build();

        }
        return INSTANCE;
    }
}
