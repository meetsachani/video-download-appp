package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import o.C3307Iz;
import o.QC1;
import o.Xu2;

/* renamed from: com.facebook.ads.redexgen.X.il  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1795il extends AbstractRunnableC1160Wc {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1794ik A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, C3307Iz.Y, 48, 55, 49, C3307Iz.d0, 58, 99, 52, 34, 48, 99, C3307Iz.e0, C3307Iz.d0, 55, 99, 32, 34, 47, 47, C3307Iz.Y, C3307Iz.Z, 109, 123, Byte.MAX_VALUE, 124, 72, 89, 84, 88, 83, 94, 88, 115, 88, 73, 74, 82, 79, 86, 86, 96, 122, 47, 107, 102, 107, 97, 40, 123, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, C3307Iz.Z, C3307Iz.Y, 47, 105, 96, 125, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, C3307Iz.V, 47, 91, 103, 102, 124, 47, 98, 110, 118, 47, 99, 106, 110, 107, 47, 123, 96, 47, 99, 106, 110, 100, 102, 97, 104, 47, 98, 106, 98, 96, 125, 118, C3307Iz.V, 47, 95, 99, 106, 110, 124, 106, 35, 47, 110, 99, QC1.w, 110, 118, 124, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, C3307Iz.Z, C3307Iz.Y, 47, QC1.w, 103, 106, 97, 47, 118, 96, 122, 47, 107, 96, 97, 40, 123, 47, 97, 106, 106, 107, 47, 123, 103, 102, 124, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, 47, 110, 97, 118, 47, 98, 96, 125, 106, C3307Iz.V, 56, C3307Iz.a0, 48};
    }

    public C1795il(AbstractC1794ik abstractC1794ik) {
        this.A00 = abstractC1794ik;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        this.A00.A02.A0F().A3V();
        if (this.A00.A00.A6p() == OD.A03) {
            return;
        }
        if (!BuildConfigApi.isDebug()) {
            this.A00.A02.A08().ABz(A00(Xu2.A, 3, 107), AbstractC1085Td.A0Y, new C1086Te(A00(0, 23, 113)));
        }
        Log.e(A00(23, 17, 15), A00(40, o.DE.g, 61));
        this.A00.A08();
    }
}
