package com.ahmed.eid.node;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@Dao
public interface NoteDAO {

    @Insert
    void mInsert(Note note);
    @Update
    void mUpdate(Note note);
    @Delete
    void mDelete(Note note);
    @Query("DELETE FROM note_table")
    void mDeleteAllNotes();
    @Query("SELECT * FROM note_table ORDER BY priority ASC")
    LiveData<List<Note>> mGetAllNotes();

}
