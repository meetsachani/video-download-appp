package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public class ZU extends SQLiteOpenHelper {
    public static final String X = "prdownloader.db";
    public static final int Y = 1;

    public ZU(Context context) {
        super(context, X, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS prdownloader( id INTEGER PRIMARY KEY, url VARCHAR, etag VARCHAR, dir_path VARCHAR, file_name VARCHAR, total_bytes INTEGER, downloaded_bytes INTEGER, last_modified_at INTEGER )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
