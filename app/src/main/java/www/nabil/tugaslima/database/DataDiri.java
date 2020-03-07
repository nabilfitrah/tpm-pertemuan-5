package www.nabil.tugaslima.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "datadiri_db")

public class DataDiri {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")

    private int id;

    @ColumnInfo(name = "name")
    private String nama;

    @ColumnInfo(name = "address")
    private String alamat;

    @ColumnInfo(name = "gender")
    private char Jkelamin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getJkelamin() {
        return Jkelamin;
    }

    public void setJkelamin(char jkelamin) {
        Jkelamin = jkelamin;
    }
}
