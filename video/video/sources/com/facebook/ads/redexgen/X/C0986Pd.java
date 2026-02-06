package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Pd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0986Pd implements InterfaceC1311aq {
    public static byte[] A01;
    public final /* synthetic */ View$OnClickListenerC05316x A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, C2638Cg0.B7, -52, C2638Cg0.E7, C2638Cg0.t7, C2638Cg0.v7, -36, C2638Cg0.y7, C2638Cg0.y7, -52, C2638Cg0.E7, -52, C2638Cg0.x7, C2638Cg0.t7, C2638Cg0.w7, -45, -48, C2638Cg0.w7, -46, C2638Cg0.t7, -48, -56, C2638Cg0.v7, C2638Cg0.t7, -43, -56, -35, -48, C2638Cg0.z7, -56, -37, -48, -42, -43};
    }

    public C0986Pd(View$OnClickListenerC05316x view$OnClickListenerC05316x) {
        this.A00 = view$OnClickListenerC05316x;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AF7(String str) {
        this.A00.A0C.setProgress(100);
        ((PZ) this.A00).A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AF9(String str) {
        int i;
        ((PZ) this.A00).A05 = true;
        this.A00.A0F.setUrl(str);
        i = this.A00.A00;
        if (i > 1) {
            this.A00.A0I(A00(0, 34, 31));
        }
        View$OnClickListenerC05316x.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AFY(int i) {
        if (((PZ) this.A00).A05) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AFb(String str) {
        this.A00.A0F.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1311aq
    public final void AFe() {
        this.A00.A0B.ADJ(14);
    }
}
