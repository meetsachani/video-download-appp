package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class TL {
    public static byte[] A01;
    public final TH A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, C3307Iz.Y, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, C3307Iz.d0, 88, 77, 78, 64, 73, C3307Iz.d0, 6, C8077mf.r, 13, C8077mf.u, 98, C8077mf.z, 3, 0, C8077mf.p, 7, 98, C8077mf.m, 4, 98, 7, C8077mf.D, C8077mf.m, 17, C8077mf.z, 17, 98, 34, 52, C4715Xk.i, 52, 50, C3307Iz.X, 81};
    }

    public abstract String A06();

    public abstract TF[] A0A();

    public TL(TH th) {
        this.A00 = th;
    }

    private String A00() {
        TF[] A0A = A0A();
        if (A0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i = 0; i < A0A.length - 1; i++) {
            result = result + A0A[i].A02() + A01(20, 2, 43);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static String A02(String str, TF[] tfArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 114));
        for (int i = 0; i < tfArr.length - 1; i++) {
            sb.append(tfArr[i].A01);
            sb.append(A01(20, 2, 43));
        }
        sb.append(tfArr[tfArr.length - 1].A01);
        sb.append(A01(6, 6, 21));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, TF[] tfArr, TF tf) {
        return A02(str, tfArr) + A01(12, 7, 119) + tf.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
