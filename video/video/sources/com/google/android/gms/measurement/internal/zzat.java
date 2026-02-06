package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.C6566gU0;
import o.InterfaceC10697xN2;

/* loaded from: classes3.dex */
public final class zzat {
    @InterfaceC10697xN2
    public static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void b(zzfr zzfrVar, SQLiteDatabase sQLiteDatabase) {
        if (zzfrVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzfrVar.L().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzfrVar.L().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzfrVar.L().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzfrVar.L().a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    @InterfaceC10697xN2
    public static void c(zzfr zzfrVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        String[] split;
        if (zzfrVar != null) {
            if (!d(zzfrVar, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> a = a(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!a.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!a.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (!a.isEmpty()) {
                    zzfrVar.L().c("Table has extra columns. table, columns", str, TextUtils.join(C6566gU0.h, a));
                    return;
                }
                return;
            } catch (SQLiteException e) {
                zzfrVar.G().b("Failed to verify columns on table that was just created", str);
                throw e;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    @InterfaceC10697xN2
    public static boolean d(zzfr zzfrVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzfrVar != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                    return moveToFirst;
                } catch (SQLiteException e) {
                    zzfrVar.L().c("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                        return false;
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
