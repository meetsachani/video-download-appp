package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class AI implements InterfaceC2178pF {
    public static byte[] A00;
    public static final C5Y A01;
    public static final AI A02;

    public static /* synthetic */ AI A00() {
        return new AI();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{C8077mf.A, C3307Iz.c0, C3307Iz.Y, 36, 34, 47, 40, C3307Iz.c0, 35, 34, 53, 3, C3307Iz.Y, 51, C3307Iz.Y, C8077mf.x, 40, 50, 53, 36, 34, 103, 36, C3307Iz.Y, C3307Iz.a0, C3307Iz.a0, 40, 51, 103, C3307Iz.X, 34, 103, 40, 55, 34, C3307Iz.a0, 34, 35};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    static {
        A02();
        A02 = new AI();
        A01 = new C5Y() { // from class: com.facebook.ads.redexgen.X.p4
            @Override // com.facebook.ads.redexgen.X.C5Y
            public final InterfaceC2178pF A5I() {
                return AI.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final void A43(InterfaceC05015t interfaceC05015t) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final Uri A9P() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final long AGi(C04905i c04905i) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
