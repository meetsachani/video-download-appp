package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

@Deprecated
/* loaded from: classes2.dex */
public final class XE2 {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 1000;
    public static final String f = "ExoPlayerVersions";
    public static final String g = "feature";
    public static final String h = "instance_uid";
    public static final String i = "version";
    public static final String j = "feature = ? AND instance_uid = ?";
    public static final String k = "PRIMARY KEY (feature, instance_uid)";
    public static final String l = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    static {
        C6361fi0.a("goog.exo.database");
    }

    public static String[] a(int i2, String str) {
        return new String[]{Integer.toString(i2), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i2, String str) throws YU {
        try {
            if (!TD2.P1(sQLiteDatabase, f)) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query(f, new String[]{"version"}, j, a(i2, str), null, null, null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i3 = query.getInt(0);
            query.close();
            return i3;
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i2, String str) throws YU {
        try {
            if (!TD2.P1(sQLiteDatabase, f)) {
                return;
            }
            sQLiteDatabase.delete(f, j, a(i2, str));
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i2, String str, int i3) throws YU {
        try {
            sQLiteDatabase.execSQL(l);
            ContentValues contentValues = new ContentValues();
            contentValues.put(g, Integer.valueOf(i2));
            contentValues.put(h, str);
            contentValues.put("version", Integer.valueOf(i3));
            sQLiteDatabase.replaceOrThrow(f, null, contentValues);
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }
}
