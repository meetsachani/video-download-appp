package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Format;
import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.pg */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2205pg implements AnonymousClass24 {
    public static byte[] A05;
    public static final AnonymousClass23<C2205pg> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C2242qI[] A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{95, 28, C8077mf.r, C8077mf.u, C8077mf.G, C8077mf.z, 17, C8077mf.D, C8077mf.E, 95, C8077mf.z, 17, 95, C8077mf.r, 17, C8077mf.D, 95, C3307Iz.c0, 13, C8077mf.H, 28, C8077mf.x, 56, 13, C8077mf.r, 10, C8077mf.q, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, Byte.MAX_VALUE, 35, C3307Iz.X, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, 64, 90, C8077mf.p, C8077mf.z, 48, 35, C3307Iz.V, C3307Iz.a0, 5, 48, C3307Iz.e0, 55, 50, 50, ED2.a, 48, 57, C3307Iz.c0, ED2.a, 57, 59, C3307Iz.e0, 40, 53, 54, ED2.a, 122, 60, 54, 59, C4715Xk.i, C3307Iz.a0, C4715Xk.i, C3307Iz.Y, C3307Iz.d0};
    }

    static {
        A05();
        A07 = C5C.A0h(0);
        A08 = C5C.A0h(1);
        A06 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ph
            @Override // com.facebook.ads.redexgen.X.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C2205pg.A01(bundle);
            }
        };
    }

    public C2205pg(String str, C2242qI... c2242qIArr) {
        AbstractC04543y.A07(c2242qIArr.length > 0);
        this.A03 = str;
        this.A04 = c2242qIArr;
        this.A01 = c2242qIArr.length;
        int A01 = C3J.A01(c2242qIArr[0].A0W);
        this.A02 = A01 == -1 ? C3J.A01(c2242qIArr[0].A0S) : A01;
        A04();
    }

    public C2205pg(C2242qI... c2242qIArr) {
        this(A02(0, 0, 114), c2242qIArr);
    }

    public static int A00(int i) {
        return i | 16384;
    }

    public static /* synthetic */ C2205pg A01(Bundle bundle) {
        List A01;
        List<Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            A01 = C1840jW.A01();
        } else {
            A01 = AnonymousClass44.A01(C2242qI.A0b, formats);
        }
        String id = bundle.getString(A08, A02(0, 0, 114));
        return new C2205pg(id, (C2242qI[]) A01.toArray(new C2242qI[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String A03 = A03(this.A04[0].A0V);
        int A00 = A00(this.A04[0].A0E);
        for (int i = 1; i < this.A04.length; i++) {
            String language = this.A04[i].A0V;
            if (!A03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i].A0V;
                String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i);
                return;
            } else if (A00 != A00(this.A04[i].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                String binaryString2 = Integer.toBinaryString(this.A04[i].A0E);
                String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i) {
        AbstractC04624g.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i + A02(56, 1, 24)));
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A07(C2242qI c2242qI) {
        for (int i = 0; i < i; i++) {
            if (c2242qI == this.A04[i]) {
                return i;
            }
        }
        return -1;
    }

    public final C2242qI A08(int i) {
        return this.A04[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2205pg c2205pg = (C2205pg) obj;
        return this.A03.equals(c2205pg.A03) && Arrays.equals(this.A04, c2205pg.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}
