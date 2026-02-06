package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.kQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1895kQ implements InterfaceC0913Mh {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C0912Mg> A02 = new SparseArray<>();
    public final C5O A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, C3307Iz.c0, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, C3307Iz.f0, ED2.a, 40, C3307Iz.d0, 57, 40, 77, 57, C3307Iz.d0, 47, C3307Iz.V, 40, 77, 6, C8077mf.r, 13, C8077mf.u, 98, C8077mf.z, 3, 0, C8077mf.p, 7, 98, C8077mf.m, 4, 98, 7, C8077mf.D, C8077mf.m, 17, C8077mf.z, 17, 98, C3307Iz.a0, C8077mf.x, 3, 60, 0, 13, C8077mf.y, 9, C8077mf.H, 47, 13, C8077mf.q, 4, 9, C3307Iz.X, 2, 8, 9, C8077mf.x, 88, 85, C8077mf.u, 31, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AAs(HashMap<String, C0912Mg> hashMap, SparseArray<String> sparseArray) throws IOException {
        C1892kN A02;
        AbstractC04543y.A08(this.A02.size() == 0);
        try {
            if (C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC04543y.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                A04(writableDatabase);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            Cursor A00 = A00();
            while (A00.moveToNext()) {
                A02 = C0914Mi.A02(new DataInputStream(new ByteArrayInputStream(A00.getBlob(2))));
                C0912Mg c0912Mg = new C0912Mg(A00.getInt(0), (String) AbstractC04543y.A01(A00.getString(1)), A02);
                hashMap.put(c0912Mg.A02, c0912Mg);
                sparseArray.put(c0912Mg.A01, c0912Mg.A02);
            }
            if (A00 != null) {
                A00.close();
            }
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new C5N(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AKJ(HashMap<String, C0912Mg> hashMap) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.A02.size(); i++) {
                C0912Mg valueAt = this.A02.valueAt(i);
                if (valueAt == null) {
                    A05(writableDatabase, this.A02.keyAt(i));
                } else {
                    A06(writableDatabase, valueAt);
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(136, 3, 37), A01(C3503Kz.c0, 8, 1)};
    }

    public C1895kQ(C5O c5o) {
        this.A03 = c5o;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC04543y.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C5N {
        C5Q.A04(sQLiteDatabase, 1, (String) AbstractC04543y.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC04543y.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete((String) AbstractC04543y.A01(this.A01), A01(130, 6, 122), new String[]{Integer.toString(i)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C0912Mg c0912Mg) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0914Mi.A08(c0912Mg.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(c0912Mg.A01));
        contentValues.put(A01(136, 3, 37), c0912Mg.A02);
        contentValues.put(A01(C3503Kz.c0, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC04543y.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(C5O c5o, String str) throws C5N {
        try {
            String A02 = A02(str);
            SQLiteDatabase writableDatabase = c5o.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            C5Q.A03(writableDatabase, 1, str);
            A07(writableDatabase, A02);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void A5p() throws C5N {
        A08(this.A03, (String) AbstractC04543y.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final boolean A6S() throws C5N {
        try {
            return C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC04543y.A01(this.A00)) != -1;
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AAF(long j) {
        this.A00 = Long.toHexString(j);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AFd(C0912Mg c0912Mg, boolean z) {
        if (z) {
            this.A02.delete(c0912Mg.A01);
        } else {
            this.A02.put(c0912Mg.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AGK(C0912Mg c0912Mg) {
        this.A02.put(c0912Mg.A01, c0912Mg);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AKI(HashMap<String, C0912Mg> hashMap) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            A04(writableDatabase);
            for (C0912Mg c0912Mg : hashMap.values()) {
                A06(writableDatabase, c0912Mg);
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }
}
