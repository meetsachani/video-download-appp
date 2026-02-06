package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Sb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1058Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{C4715Xk.i, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, C3307Iz.Y, 51, 51, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, QC1.w, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, QC1.w, 76, 110, 115, 106, 117, QC1.w, 121, 110, C8077mf.u, C8077mf.A, 19, C8077mf.A, 10, C3307Iz.V, 10, C8077mf.n, 31, C8077mf.G, C8077mf.y, C8077mf.A, C8077mf.r, C8077mf.C};
    }

    public static C1057Sa A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, 113);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c = null;
        try {
            c = contentResolver.query(XB.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c == null || !c.moveToFirst()) {
                return new C1057Sa(null, null, false);
            }
            String string = c.getString(c.getColumnIndex(A013));
            String attributionId = c.getString(c.getColumnIndex(A012));
            C1057Sa c1057Sa = new C1057Sa(string, attributionId, Boolean.valueOf(c.getString(c.getColumnIndex(A01))).booleanValue());
            if (c != null) {
                c.close();
            }
            return c1057Sa;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
