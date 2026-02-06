package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public final class zzeba {
    public static int a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor g = g(sQLiteDatabase, i);
        if (g.getCount() > 0) {
            g.moveToNext();
            i2 = g.getInt(g.getColumnIndexOrThrow("value"));
        }
        g.close();
        return i2;
    }

    public static long b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor g = g(sQLiteDatabase, 2);
        if (g.getCount() > 0) {
            g.moveToNext();
            j = g.getLong(g.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        g.close();
        return j;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase, "failed_requests", 0);
        h(sQLiteDatabase, "total_requests", 0);
        h(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        i(sQLiteDatabase, "failed_requests", 0);
        i(sQLiteDatabase, "total_requests", 0);
        i(sQLiteDatabase, "completed_requests", 0);
    }

    public static void f(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        if (!z2) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
        }
    }

    public static Cursor g(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    strArr2[0] = "completed_requests";
                } else {
                    strArr2[0] = "last_successful_request_time";
                }
            } else {
                strArr2[0] = "total_requests";
            }
        } else {
            strArr2[0] = "failed_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void h(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void i(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
