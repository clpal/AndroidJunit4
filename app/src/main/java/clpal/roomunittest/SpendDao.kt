package clpal.roomunittest

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SpendDao {
    @Insert
    suspend fun addSpend(spend: Spend)
    @Query("SELECT * FROM spends ORDER by date DESC Limit  20")
    suspend fun getLast20spends():List<Spend>
}