package com.facebook.ads.redexgen.X;

import android.graphics.Rect;

/* loaded from: assets/audience_network/classes2.dex */
public final class XM {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C2293rN<C1130Uw, V1> c2293rN) {
        if (c2293rN.A06.A05()) {
            return c2293rN.A07.A07();
        }
        if (!c2293rN.A06.A06()) {
            return true;
        }
        return c2293rN.A07.A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        if ((r6.A00.bottom - r6.A00.top) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        r4 = r6.A01.bottom;
        r3 = r6.A00.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (com.facebook.ads.redexgen.X.XM.A02[7].length() == 7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
        if ((r6.A00.bottom - r6.A00.top) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        com.facebook.ads.redexgen.X.XM.A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if ((r4 - r3) <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r0 = true;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A01(C2293rN<C1130Uw, V1> c2293rN, InterfaceC2283rD interfaceC2283rD) {
        boolean z;
        float f = -1.0f;
        try {
            f = interfaceC2283rD.A9X(c2293rN);
        } catch (IllegalStateException unused) {
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (A02[6].length() != 7) {
            A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
            if (i <= 0 || !A00(c2293rN)) {
                if (c2293rN.A06.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c2293rN)) {
                    return true;
                }
                interfaceC2283rD.A9W(this.A00);
                if (A02[2].length() != 2) {
                    A02[2] = "WH3ZGQ";
                    interfaceC2283rD.A8D(c2293rN, this.A01);
                } else {
                    interfaceC2283rD.A8D(c2293rN, this.A01);
                }
                return z && A00(c2293rN);
            }
            return true;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C2293rN<C1130Uw, V1> c2293rN, InterfaceC2283rD interfaceC2283rD) {
        if (c2293rN.A07.A04() && A01(c2293rN, interfaceC2283rD)) {
            c2293rN.A07.A01();
            c2293rN.A06.A02().ABx(c2293rN.A06.A03(), c2293rN.A06.A04());
        }
        if (c2293rN.A07.A05() && C1123Up.A1l(c2293rN.A06.A01())) {
            c2293rN.A07.A02();
            c2293rN.A06.A02().ABL(c2293rN.A06.A03(), c2293rN.A06.A04());
        }
    }
}
