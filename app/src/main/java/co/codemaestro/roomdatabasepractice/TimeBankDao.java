package co.codemaestro.roomdatabasepractice;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface TimeBankDao {

    @Insert
    void insertNewTimeBank (TimeBank timeBank);

    @Insert
    void insertMultipleNewTimeBanks (List<TimeBank> timeBankList);

    @Query("SELECT * FROM TimeBank WHERE timeBankID = :timeBankID")
    TimeBank fetchOneTimeBankById(int timeBankID);

    @Update
    void updateTimeBank (TimeBank timeBank);

    @Delete
    void deleteTimeBank (TimeBank timeBank);
}
