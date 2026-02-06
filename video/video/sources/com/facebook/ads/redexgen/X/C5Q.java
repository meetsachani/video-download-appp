package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import o.C10997yd1;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.5Q  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C5Q {
    public static byte[] A00;
    public static String[] A01 = {"ftBSrscYCZrU1XGsUffOBJlxDQfDqofj", "6A6pNCV2uhgoYcLypb", "8GOV2FUSZps1pTbJ4je5MwftASUnZkM1", "4wRLkwVxN17llLy", "8LQiKKC5rqzUsPzG", "bVt1RMPFhi5Vk9jMxK8mGuGgg99xJtg4", "bUya0H86JSXRIIoahVHYTIdtcqgWtSBf", "i4ePvK4hrBrPNKxpSWALXVVM3"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(SQLiteDatabase sQLiteDatabase, int i, String str) throws C5N {
        try {
            if (C5C.A19(sQLiteDatabase, A01(159, 17, 73))) {
                Cursor query = sQLiteDatabase.query(A01(159, 17, 73), new String[]{A01(244, 7, 93)}, A01(C10997yd1.n2, 32, 22), A05(i, str), null, null, null);
                if (query.getCount() == 0) {
                    if (query != null) {
                        query.close();
                    }
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i2;
            }
            return -1;
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{53, 36, 51, 55, 34, 51, 86, 34, 55, 52, 58, 51, 86, ED2.a, 48, 86, 56, 57, 34, 86, 51, C3307Iz.f0, ED2.a, C3307Iz.X, 34, C3307Iz.X, 86, 51, C8077mf.p, C8077mf.C, C3307Iz.Y, C8077mf.D, C8077mf.A, C8077mf.q, 19, 4, 32, 19, 4, 5, 31, C8077mf.C, C8077mf.B, 5, 86, 94, C8077mf.r, 19, C8077mf.A, 2, 3, 4, 19, 86, ED2.a, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 31, C8077mf.B, 5, 2, C8077mf.A, C8077mf.B, C8077mf.y, 19, C3307Iz.a0, 3, 31, C8077mf.u, 86, 34, 51, C3307Iz.f0, 34, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 0, 19, 4, 5, 31, C8077mf.C, C8077mf.B, 86, ED2.a, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, C3307Iz.Y, 36, ED2.a, 59, 55, 36, 47, 86, C4715Xk.i, 51, 47, 86, 94, C8077mf.r, 19, C8077mf.A, 2, 3, 4, 19, 90, 86, 31, C8077mf.B, 5, 2, C8077mf.A, C8077mf.B, C8077mf.y, 19, C3307Iz.a0, 3, 31, C8077mf.u, 95, 95, C8077mf.G, 32, 55, 8, 52, 57, C3307Iz.V, C4715Xk.i, 42, C8077mf.p, C4715Xk.i, 42, C3307Iz.c0, 49, 55, 54, C3307Iz.c0, 103, 100, 96, 117, 116, 115, 100, 97, 98, 102, 115, 114, 117, 98, C3307Iz.Z, 58, C3307Iz.Z, 56, C3307Iz.Z, 70, 73, 67, C3307Iz.Z, 110, 105, 116, 115, 102, 105, 100, 98, 88, 114, 110, 99, C3307Iz.Z, 58, C3307Iz.Z, 56, 64, 72, 72, 64, 9, 66, 95, 72, 9, 67, 70, 83, 70, 69, 70, 84, 66, 9, C8077mf.p, 19, C8077mf.x, 1, C8077mf.p, 3, 5, ED2.a, C8077mf.y, 9, 4, 58, C3307Iz.a0, 62, ED2.a, C3307Iz.X, 35, 34};
        String[] strArr = A01;
        if (strArr[6].charAt(14) == strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        A01[7] = "SNjSmBwt36dpbjCWXjm4KdaDp";
    }

    static {
        A02();
        AnonymousClass35.A03(A01(C10997yd1.z1, 17, 54));
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, int i, String str) throws C5N {
        String A012 = A01(159, 17, 73);
        try {
            if (!C5C.A19(sQLiteDatabase, A012)) {
                return;
            }
            sQLiteDatabase.delete(A012, A01(C10997yd1.n2, 32, 22), A05(i, str));
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws C5N {
        try {
            sQLiteDatabase.execSQL(A01(0, 159, 103));
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(176, 7, 16), Integer.valueOf(i));
            contentValues.put(A01(232, 12, 113), str);
            contentValues.put(A01(244, 7, 93), Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow(A01(159, 17, 73), null, contentValues);
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    public static String[] A05(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }
}
