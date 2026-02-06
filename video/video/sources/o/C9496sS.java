package o;

import android.database.Cursor;

/* renamed from: o.sS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9496sS {
    public static final byte[] a(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    public static final Double b(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    public static final Float c(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i));
    }

    public static final Integer d(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    public static final Long e(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    public static final Short f(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i));
    }

    public static final String g(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }
}
