package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: o.jt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7386jt {
    public static final String c = "ExoPlayerCacheFileMetadata";
    public static final int d = 1;
    public static final String e = "name";
    public static final String f = "length";
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final String k = "name = ?";
    public static final String m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    public final InterfaceC5100aV a;
    public String b;
    public static final String g = "last_touch_timestamp";
    public static final String[] l = {"name", "length", g};

    public C7386jt(InterfaceC5100aV interfaceC5100aV) {
        this.a = interfaceC5100aV;
    }

    @InterfaceC10697xN2
    public static void a(InterfaceC5100aV interfaceC5100aV, long j2) throws YU {
        String hexString = Long.toHexString(j2);
        try {
            String e2 = e(hexString);
            SQLiteDatabase writableDatabase = interfaceC5100aV.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            XE2.c(writableDatabase, 2, hexString);
            b(writableDatabase, e2);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e3) {
            throw new YU(e3);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String e(String str) {
        return c + str;
    }

    @InterfaceC10697xN2
    public Map<String, C6902ht> c() throws YU {
        try {
            Cursor d2 = d();
            HashMap hashMap = new HashMap(d2.getCount());
            while (d2.moveToNext()) {
                hashMap.put((String) C9542sf.g(d2.getString(0)), new C6902ht(d2.getLong(1), d2.getLong(2)));
            }
            d2.close();
            return hashMap;
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }

    public final Cursor d() {
        C9542sf.g(this.b);
        return this.a.getReadableDatabase().query(this.b, l, null, null, null, null, null);
    }

    @InterfaceC10697xN2
    public void f(long j2) throws YU {
        try {
            String hexString = Long.toHexString(j2);
            this.b = e(hexString);
            if (XE2.b(this.a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                XE2.d(writableDatabase, 2, hexString, 1);
                b(writableDatabase, this.b);
                writableDatabase.execSQL("CREATE TABLE " + this.b + C4500Ve2.b + m);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }

    @InterfaceC10697xN2
    public void g(String str) throws YU {
        C9542sf.g(this.b);
        try {
            this.a.getWritableDatabase().delete(this.b, k, new String[]{str});
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }

    @InterfaceC10697xN2
    public void h(Set<String> set) throws YU {
        C9542sf.g(this.b);
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (String str : set) {
                writableDatabase.delete(this.b, k, new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }

    @InterfaceC10697xN2
    public void i(String str, long j2, long j3) throws YU {
        C9542sf.g(this.b);
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j2));
            contentValues.put(g, Long.valueOf(j3));
            writableDatabase.replaceOrThrow(this.b, null, contentValues);
        } catch (SQLException e2) {
            throw new YU(e2);
        }
    }
}
