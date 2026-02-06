package o;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class FW1 {
    public static final <T> T a(SQLiteDatabase sQLiteDatabase, boolean z, HA0<? super SQLiteDatabase, ? extends T> ha0) {
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = ha0.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            UP0.d(1);
            sQLiteDatabase.endTransaction();
            UP0.c(1);
        }
    }

    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase, boolean z, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = ha0.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            UP0.d(1);
            sQLiteDatabase.endTransaction();
            UP0.c(1);
        }
    }
}
