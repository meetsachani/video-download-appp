package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.androidx.media3.common.StreamKey;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.facebook.internal.C2372q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.9w  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9w implements InterfaceC2098nw {
    public static byte[] A05;
    public static String[] A06 = {"xDo36q5CJhNrWsOc4rgAzQVAx", "Zg", "PxE083d5zJ8aaIHABfFNAkkkdmyhAK0f", "IKBV5UeodpiHWCvQ4", "aq", "Dab1stL8zsyR1UyyOB", "bulzcqFjtxPyO4baGqsDfIFqn", "1F8Ca2LGZvQNSSWsKAWhpLL3JBdOfpqY"};
    public static final String A07;
    public static final String[] A08;
    public boolean A00;
    public final C5O A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0634Bk A01(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        C8 A02 = new C8((String) AbstractC04543y.A01(cursor.getString(0)), Uri.parse((String) AbstractC04543y.A01(cursor.getString(2)))).A01(cursor.getString(1)).A02(A09(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest A052 = A02.A04(blob).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C6 c6 = new C6();
        c6.A01 = cursor.getLong(13);
        c6.A00 = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new C0634Bk(A052, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, c6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0634Bk A02(Cursor cursor) {
        DownloadRequest A052 = new C8((String) AbstractC04543y.A01(cursor.getString(0)), Uri.parse((String) AbstractC04543y.A01(cursor.getString(2)))).A01(A05(cursor.getString(1))).A02(A09(cursor.getString(3))).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C6 c6 = new C6();
        c6.A01 = cursor.getLong(13);
        c6.A00 = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new C0634Bk(A052, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, c6);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A05 = new byte[]{51, 66, 35, C3307Iz.d0, C3307Iz.Y, 66, 77, 36, 35, 77, 69, 78, C8077mf.q, 2, 70, 50, 35, 62, 50, 70, 54, 52, 47, C3307Iz.c0, C3307Iz.Z, 52, ED2.a, 70, C3307Iz.e0, 35, ED2.a, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, C8077mf.m, C8077mf.q, C8077mf.m, 3, 57, C8077mf.u, 31, C8077mf.z, 3, 70, 50, 35, 62, 50, 74, 19, C8077mf.x, C8077mf.q, 70, 50, 35, 62, 50, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, C8077mf.y, C8077mf.u, C8077mf.x, 3, 7, C8077mf.m, 57, 13, 3, 31, C8077mf.y, 70, 50, 35, 62, 50, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, 5, 19, C8077mf.y, C8077mf.u, 9, C8077mf.m, 57, 5, 7, 5, C8077mf.p, 3, 57, 13, 3, 31, 70, 50, 35, 62, 50, 74, 2, 7, C8077mf.u, 7, 70, 36, 42, C3307Iz.a0, 36, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, C8077mf.y, C8077mf.u, 7, C8077mf.u, 3, 70, 47, 40, 50, 35, C3307Iz.V, 35, 52, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, C8077mf.y, C8077mf.u, 7, C8077mf.x, C8077mf.u, 57, C8077mf.u, C8077mf.q, C8077mf.m, 3, 57, C8077mf.m, C8077mf.y, 70, 47, 40, 50, 35, C3307Iz.V, 35, 52, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, 19, C8077mf.z, 2, 7, C8077mf.u, 3, 57, C8077mf.u, C8077mf.q, C8077mf.m, 3, 57, C8077mf.m, C8077mf.y, 70, 47, 40, 50, 35, C3307Iz.V, 35, 52, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, 5, 9, 8, C8077mf.u, 3, 8, C8077mf.u, 57, 10, 3, 8, 1, C8077mf.u, C8077mf.p, 70, 47, 40, 50, 35, C3307Iz.V, 35, 52, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, C8077mf.y, C8077mf.u, 9, C8077mf.z, 57, C8077mf.x, 3, 7, C8077mf.y, 9, 8, 70, 47, 40, 50, 35, C3307Iz.V, 35, 52, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, 0, 7, C8077mf.q, 10, 19, C8077mf.x, 3, 57, C8077mf.x, 3, 7, C8077mf.y, 9, 8, 70, 47, 40, 50, 35, C3307Iz.V, 35, 52, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, C8077mf.z, 3, C8077mf.x, 5, 3, 8, C8077mf.u, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 52, 35, C3307Iz.Z, 42, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, 4, 31, C8077mf.u, 3, C8077mf.y, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 47, 40, 50, 35, C3307Iz.V, 35, 52, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 74, 13, 3, 31, 57, C8077mf.y, 3, C8077mf.u, 57, C8077mf.q, 2, 70, 36, 42, C3307Iz.a0, 36, 70, 40, C3307Iz.a0, 50, 70, 40, 51, 42, 42, 79, C8077mf.C, C8077mf.m, 118, 103, 112, 116, 97, 112, C8077mf.y, 97, 116, 119, 121, 112, C8077mf.y, 115, 101, QC1.w, 103, C8077mf.A, 99, 118, 117, 123, 114, C8077mf.A, 126, 113, C8077mf.A, 114, 111, 126, 100, 99, 100, C8077mf.A, 49, C8077mf.n, C8077mf.E, 36, C8077mf.B, C8077mf.y, 13, 17, 6, 48, C8077mf.E, 3, C8077mf.D, C8077mf.B, C8077mf.E, C8077mf.y, C8077mf.r, 7, 106, C8077mf.B, 50, 35, 35, ED2.a, 58, 48, 50, C3307Iz.Z, 58, 60, C4715Xk.i, 124, 55, 50, 32, 59, QC1.w, C3307Iz.c0, 62, ED2.a, 121, 104, 104, 116, 113, 123, 121, 108, 113, 119, 118, 55, 110, 118, 124, 54, 117, 107, 53, 107, 107, 108, 106, 51, 96, 117, 116, 117, 100, 100, QC1.w, 125, 119, 117, 96, 125, 123, 122, 59, 108, 57, 121, 100, 113, 115, 65, 70, 88, 70, 93, 80, 65, 87, 123, 64, 75, 83, 74, 72, 75, 69, 64, 65, 64, 70, 74, 75, 81, 64, 75, 81, 122, 73, 64, 75, 66, 81, 77, 115, 101, 99, 100, Byte.MAX_VALUE, 125, 79, 115, 113, 115, QC1.w, 117, 79, 123, 117, 105, C8077mf.x, 17, 3, C8077mf.B, 121, 124, 105, 124, 102, 97, 105, 108, 117, 114, 101, 95, 114, 101, 97, 115, 111, 110, 52, 48, 47, 42, C3307Iz.Z, 52, 57, 125, 96, 125, 98, 70, 72, 84, 114, 94, 72, 89, 114, 68, 73, 53, 49, 53, C4715Xk.i, 7, C3307Iz.d0, C3307Iz.V, 40, C4715Xk.i, Byte.MAX_VALUE, 106, 125, 108, 106, 97, 123, 80, 107, 96, QC1.w, 97, 99, 96, 110, 107, 106, 107, 119, 119, C8077mf.z, 17, 4, C8077mf.A, 17, 58, 17, C8077mf.n, 8, 0, 58, 8, C8077mf.z, 36, 35, 54, C3307Iz.X, 35, 8, 35, 62, 58, 50, 8, 58, 36, 119, C8077mf.z, 4, C8077mf.x, 109, 106, Byte.MAX_VALUE, 106, 123, 99, 100, 113, 100, 117, 48, C3307Iz.e0, 48, 34, 51, 52, 47, 48, 31, 50, C3307Iz.X, C3307Iz.V, 51, 47, C3307Iz.f0, 70, 65, 71, 80, 84, 88, 106, 94, 80, 76, 70, 79, 82, 79, 87, 94, 73, 76, 88, 93, 72, 89, 99, 72, 85, 81, 89, 99, 81, 79, 77, 74, 81, C3307Iz.Y, 57, 52, 53, ED2.a, Byte.MAX_VALUE, 40, 125, C3307Iz.X, 62, 59, 62, ED2.a, C3307Iz.Z, 62};
    }

    static {
        A0B();
        A07 = A07(3, 4);
        A08 = new String[]{A04(InterfaceC8148mw2.e.w, 2, 119), A04(625, 9, 108), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04(634, 18, 59), A04(536, 16, 16), A04(615, 10, 25)};
    }

    public C9w(C5O c5o) {
        this(c5o, A04(0, 0, 21));
    }

    public C9w(C5O c5o, String str) {
        this.A03 = str;
        this.A01 = c5o;
        this.A04 = A04(448, 18, 64) + str;
        this.A02 = new Object();
    }

    private Cursor A00(String str, String[] strArr) throws C5N {
        try {
            String sortOrder = A04(667, 17, 99);
            return this.A01.getReadableDatabase().query(this.A04, A08, str, strArr, null, null, sortOrder);
        } catch (SQLiteException e) {
            throw new C5N(e);
        }
    }

    public static String A05(String str) {
        if (A04(582, 4, 68).equals(str)) {
            return A04(468, 20, 103);
        }
        if (A04(InterfaceC8148mw2.e.t, 3, 104).equals(str)) {
            return A04(515, 21, 32);
        }
        if (A04(652, 2, 48).equals(str)) {
            return A04(488, 27, 44);
        }
        return A04(742, 15, 100);
    }

    public static String A06(List<StreamKey> streamKeys) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < streamKeys.size(); i++) {
            StreamKey streamKey = streamKeys.get(i);
            StringBuilder stringBuilder = sb.append(streamKey.A01);
            stringBuilder.append('.').append(streamKey.A00).append('.').append(streamKey.A02).append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String A07(int... iArr) {
        if (iArr.length == 0) {
            return A04(413, 1, 14);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A04(684, 5, 42)).append(A04(6, 5, 89));
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            int i2 = iArr[i];
            int i3 = A06[5].length();
            if (i3 == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "Jd";
            strArr[4] = "Ze";
            sb.append(i2);
        }
        sb.append(')');
        String sb2 = sb.toString();
        String[] strArr2 = A06;
        if (strArr2[0].length() != strArr2[6].length()) {
            return sb2;
        }
        String[] strArr3 = A06;
        strArr3[1] = "5c";
        strArr3[4] = "cS";
        return sb2;
    }

    private List<C0634Bk> A08(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!C5C.A19(sQLiteDatabase, this.A04)) {
            return arrayList;
        }
        String A04 = A04(634, 18, 59);
        String A042 = A04(536, 16, 16);
        Cursor query = sQLiteDatabase.query(this.A04, new String[]{A04(InterfaceC8148mw2.e.w, 2, 119), A04(720, 5, 15), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04, A042}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(A02(query));
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public static List<StreamKey> A09(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] strArr = A06;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[0] = "JZKSAdXCo0Lu0XCPfhbdJS2vI";
        strArr2[6] = "3oo0vy2N0OZaC0WsxvSOxloxy";
        for (String str2 : C5C.A1O(str, A04(C2372q.n, 1, 1))) {
            String[] A1O = C5C.A1O(str2, A04(466, 2, 2));
            AbstractC04543y.A08(A1O.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(A1O[0]), Integer.parseInt(A1O[1]), Integer.parseInt(A1O[2])));
        }
        return arrayList;
    }

    private void A0A() throws C5N {
        synchronized (this.A02) {
            if (this.A00) {
                return;
            }
            try {
                SQLiteDatabase readableDatabase = this.A01.getReadableDatabase();
                int A00 = C5Q.A00(readableDatabase, 0, this.A03);
                if (A00 != 3) {
                    SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        C5Q.A04(writableDatabase, 0, this.A03, 3);
                        List<C0634Bk> A082 = A00 == 2 ? A08(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL(A04(427, 21, 3) + this.A04);
                        writableDatabase.execSQL(A04(414, 13, 1) + this.A04 + A04(0, 1, 39) + A04(11, 401, 82));
                        for (C0634Bk c0634Bk : A082) {
                            A0C(c0634Bk, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                this.A00 = true;
            } catch (SQLException e) {
                throw new C5N(e);
            }
        }
    }

    private void A0C(C0634Bk c0634Bk, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c0634Bk.A07.A06 == null ? C5C.A07 : c0634Bk.A07.A06;
        ContentValues contentValues = new ContentValues();
        contentValues.put(A04(InterfaceC8148mw2.e.w, 2, 119), c0634Bk.A07.A02);
        contentValues.put(A04(625, 9, 108), c0634Bk.A07.A03);
        contentValues.put(A04(739, 3, 12), c0634Bk.A07.A00.toString());
        contentValues.put(A04(709, 11, 1), A06(c0634Bk.A07.A04));
        contentValues.put(A04(566, 16, 36), c0634Bk.A07.A01);
        contentValues.put(A04(586, 4, 41), c0634Bk.A07.A05);
        contentValues.put(A04(684, 5, 42), Integer.valueOf(c0634Bk.A02));
        contentValues.put(A04(654, 13, 81), Long.valueOf(c0634Bk.A05));
        contentValues.put(A04(725, 14, 8), Long.valueOf(c0634Bk.A06));
        contentValues.put(A04(552, 14, 17), Long.valueOf(c0634Bk.A04));
        contentValues.put(A04(698, 11, 116), Integer.valueOf(c0634Bk.A03));
        contentValues.put(A04(590, 14, 52), Integer.valueOf(c0634Bk.A01));
        contentValues.put(A04(634, 18, 59), Float.valueOf(c0634Bk.A00()));
        contentValues.put(A04(536, 16, 16), Long.valueOf(c0634Bk.A01()));
        contentValues.put(A04(615, 10, 25), bArr);
        sQLiteDatabase.replaceOrThrow(this.A04, null, contentValues);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Bx
    public final C0634Bk A7q(String str) throws C5N {
        A0A();
        try {
            Cursor A00 = A00(A04(InterfaceC8148mw2.e.y, 6, 105), new String[]{str});
            if (A00.getCount() == 0) {
                if (A00 != null) {
                    A00.close();
                    return null;
                }
                return null;
            }
            A00.moveToNext();
            C0634Bk A01 = A01(A00);
            if (A00 != null) {
                A00.close();
            }
            return A01;
        } catch (SQLiteException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Bx
    public final C2105o4 A7r(int... iArr) throws C5N {
        A0A();
        return new C2105o4(A00(A07(iArr), null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nw
    public final void AHF(C0634Bk c0634Bk) throws C5N {
        A0A();
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            A0C(c0634Bk, writableDatabase);
        } catch (SQLiteException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nw
    public final void AIR(String str) throws C5N {
        A0A();
        try {
            this.A01.getWritableDatabase().delete(this.A04, A04(InterfaceC8148mw2.e.y, 6, 105), new String[]{str});
        } catch (SQLiteException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nw
    public final void AJO() throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 42), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, A04(689, 9, 36), null);
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nw
    public final void AJp() throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 42), (Integer) 5);
            contentValues.put(A04(590, 14, 52), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, null, null);
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nw
    public final void AJq(int i) throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 116), Integer.valueOf(i));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07, null);
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nw
    public final void AJr(String str, int i) throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 116), Integer.valueOf(i));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07 + A04(1, 5, 86) + A04(InterfaceC8148mw2.e.y, 6, 105), new String[]{str});
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }
}
