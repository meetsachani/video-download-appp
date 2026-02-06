package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.C2638Cg0;
import o.C8077mf;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* loaded from: assets/audience_network/classes2.dex */
public final class MV {
    public static byte[] A02;
    public static final String[] A03;
    public String A00;
    public final C5O A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-91, -123, C2638Cg0.x7, -66, C2638Cg0.w7, C2638Cg0.q7, 125, -79, -94, -75, -79, 125, -83, -81, -90, -86, -98, -81, -74, 125, -88, -94, -74, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, C2638Cg0.v7, C2638Cg0.q7, C2638Cg0.x7, -60, -47, C2638Cg0.s7, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, C2638Cg0.v7, -66, -48, -47, -68, -47, -52, -46, C2638Cg0.o7, C2638Cg0.s7, -68, -47, C2638Cg0.t7, C2638Cg0.w7, C2638Cg0.q7, -48, -47, -66, C2638Cg0.w7, C2638Cg0.y7, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -122, -98, -83, -96, -100, -81, -96, 123, -81, -100, -99, -89, -96, 123, -25, -11, -14, -13, C2638Cg0.r7, -9, -28, -27, -17, -24, C2638Cg0.r7, -20, -23, C2638Cg0.r7, -24, -5, -20, -10, -9, -10, C2638Cg0.r7, Byte.MAX_VALUE, -78, -87, -118, -90, -101, -77, -97, -84, 125, -101, -99, -94, -97, Byte.MIN_VALUE, -93, -90, -97, -121, -97, -82, -101, -98, -101, -82, -101, 13, 2, C8077mf.x, C8077mf.y, 0, C8077mf.y, C8077mf.r, C8077mf.z, 4, 9, 0, C8077mf.y, 10, C8077mf.p, 6, C8077mf.x, C8077mf.y, 2, C8077mf.p, 17, -24, C2638Cg0.C7, -22, -29, -16, -28, -89, -102, -90, -98, -96, -109, -97, -105, 82, 111, 82, 113};
    }

    static {
        A03();
        A03 = new String[]{A01(181, 4, 13), A01(175, 6, 80), A01(155, 20, 117)};
    }

    public MV(C5O c5o) {
        this.A01 = c5o;
    }

    private Cursor A00() {
        AbstractC04543y.A01(this.A00);
        return this.A01.getReadableDatabase().query(this.A00, A03, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(129, 26, 14) + str;
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(108, 21, 119) + str);
    }

    public final Map<String, MU> A05() throws C5N {
        try {
            Cursor A00 = A00();
            HashMap hashMap = new HashMap(A00.getCount());
            while (A00.moveToNext()) {
                hashMap.put((String) AbstractC04543y.A01(A00.getString(0)), new MU(A00.getLong(1), A00.getLong(2)));
            }
            if (A00 != null) {
                A00.close();
            }
            return hashMap;
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    public final void A06(long j) throws C5N {
        try {
            String hexString = Long.toHexString(j);
            String hexUid = A02(hexString);
            this.A00 = hexUid;
            if (C5Q.A00(this.A01.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                C5Q.A04(writableDatabase, 2, hexString, 1);
                String hexUid2 = this.A00;
                A04(writableDatabase, hexUid2);
                StringBuilder sb = new StringBuilder();
                String hexUid3 = A01(95, 13, 47);
                StringBuilder append = sb.append(hexUid3);
                String hexUid4 = this.A00;
                StringBuilder append2 = append.append(hexUid4);
                String hexUid5 = A01(0, 1, 89);
                StringBuilder append3 = append2.append(hexUid5);
                String hexUid6 = A01(1, 94, 49);
                writableDatabase.execSQL(append3.append(hexUid6).toString());
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    public final void A07(String str) throws C5N {
        AbstractC04543y.A01(this.A00);
        try {
            this.A01.getWritableDatabase().delete(this.A00, A01(185, 8, 6), new String[]{str});
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    public final void A08(String str, long j, long j2) throws C5N {
        AbstractC04543y.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(181, 4, 13), str);
            contentValues.put(A01(175, 6, 80), Long.valueOf(j));
            contentValues.put(A01(155, 20, 117), Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.A00, null, contentValues);
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    public final void A09(Set<String> set) throws C5N {
        AbstractC04543y.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (String str : set) {
                writableDatabase.delete(this.A00, A01(185, 8, 6), new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }
}
