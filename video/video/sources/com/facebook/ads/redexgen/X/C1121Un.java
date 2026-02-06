package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Messenger;
import java.util.Arrays;
import javax.annotation.Nullable;
import o.C2638Cg0;
import o.C3307Iz;
import o.C7193j50;
import o.C8077mf;
import o.CK1;

/* renamed from: com.facebook.ads.redexgen.X.Un  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1121Un {
    public static byte[] A06;
    public static String[] A07 = {"6qWdP8UnAqk2", "MP5OshbzeeKQXWypFydZHFaUVi2SMaBY", "YZOrpgpjnThYhZrbQ", "9FBJpZQghCKG6mC2kMssKZrg31bKkWn0", "1igNFrY6lER43", "wq7phLHZ3BH2hfkM7", "H4ZPtJlAPqOhXadVzSXMAib", "ZeuNk8rzE4mqHJK5cCc2mdI2UMeFjq1Z"};
    @Nullable
    public Messenger A00;
    public boolean A01 = false;
    public final ServiceConnection A02 = new ServiceConnectionC1120Um(this);
    public final C1673gi A03;
    public final String A04;
    public final String A05;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        byte[] bArr = {-32, -47, -30, -47, -35, -17, -47, -34, -17, -27, -27, C2638Cg0.E7, -44, -4, -19, -2, -19, -7, C8077mf.m, -4, -2, -5, 0, -5, -17, -5, -8, C8077mf.m, 2, -15, -2, -1, -11, -5, -6, C2638Cg0.p7, -78, C2638Cg0.r7, -78, -66, -48, C2638Cg0.r7, -74, C2638Cg0.q7, C2638Cg0.t7, -74, -60, C2638Cg0.s7, -48, -70, -75, C8077mf.p, 31, C3307Iz.V, C3307Iz.a0, 31, C3307Iz.X, 35, -19, C3307Iz.V, C3307Iz.e0, C3307Iz.c0, C3307Iz.f0, C3307Iz.e0, C3307Iz.d0, 35, C3307Iz.d0, 50, -34, C3307Iz.d0, C3307Iz.e0, 50, -34, 36, C3307Iz.e0, 51, C3307Iz.d0, 34, -34, C3307Iz.e0, 48, -34, C3307Iz.c0, C3307Iz.Z, 49, 49, C3307Iz.Z, C3307Iz.d0, C3307Iz.X, -34, C3307Iz.f0, 35, 48, C3307Iz.c0, C3307Iz.Z, 49, 49, C3307Iz.Z, C3307Iz.e0, C3307Iz.d0, 49, -69, -35, C2638Cg0.B7, C2638Cg0.z7, -48, -34, -34, -44, C2638Cg0.E7, -46, -117, -35, -48, -36, -32, -48, -34, -33, 1, 13, C8077mf.m, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 19, 2, 7, 3, C8077mf.n, 1, 3, C8077mf.n, 3, C8077mf.u, C8077mf.y, 13, C8077mf.r, 9, -52, -33, 19, 2, 7, 3, C8077mf.n, 1, 3, -20, 3, C8077mf.u, C8077mf.y, 13, C8077mf.r, 9, -15, 3, C8077mf.r, C8077mf.x, 7, 1, 3, 2, C8077mf.p, C8077mf.n, C2638Cg0.y7, 5, 0, 2, 4, 1, C8077mf.p, C8077mf.p, 10, C2638Cg0.y7, 10, 0, 19, 0, 13, 0, C3307Iz.c0, 50, C3307Iz.X, C3307Iz.V, 56, 35, C3307Iz.f0, C3307Iz.c0, C3307Iz.Y, 35, 54, C3307Iz.c0, 49, 48};
        String[] strArr = A07;
        if (strArr[0].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[0] = "tkHV67jO43cW";
        strArr2[4] = "7eV9Uq8jXNAYU";
        A06 = bArr;
    }

    static {
        A06();
    }

    public C1121Un(C1673gi c1673gi, String str, String str2) {
        this.A03 = c1673gi;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt(A05(13, 22, 88), 1);
        bundle.putString(A05(0, 13, 60), this.A04);
        bundle.putString(A05(35, 16, 29), this.A05);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, C1086Te c1086Te) {
        this.A03.A08().ABC(A05(CK1.w, 14, 110), i, c1086Te);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(int i, C1086Te c1086Te) {
        c1086Te.A05(1);
        this.A03.A08().ABD(A05(CK1.w, 14, 110), i, c1086Te);
    }

    public final void A0C() {
        A08(AbstractC1085Td.A1t, new C1086Te(A05(101, 18, 23), this.A05));
        Intent intent = new Intent();
        intent.setClassName(A05(C7193j50.f, 19, 75), A05(119, 51, 74));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                A08(AbstractC1085Td.A1p, new C1086Te(A05(51, 50, 106)));
                this.A03.unbindService(this.A02);
            }
        } catch (Exception e) {
            A07(AbstractC1085Td.A1o, new C1086Te(e));
        }
    }
}
