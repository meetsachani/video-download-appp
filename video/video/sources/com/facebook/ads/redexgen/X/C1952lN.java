package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C10323vs;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.lN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1952lN implements InterfaceC0875Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = C10323vs.b;
    public boolean A03;
    public final List<LC> A04;
    public final InterfaceC0780Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, C8077mf.r, C8077mf.r, C8077mf.n, 9, 3, 1, C8077mf.x, 9, C8077mf.q, C8077mf.p, C2638Cg0.A7, 4, C8077mf.z, 2, 19, C8077mf.y, 2, 19};
    }

    public C1952lN(List<LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0780Hd[list.size()];
    }

    private boolean A02(C04774v c04774v, int i) {
        if (c04774v.A07() == 0) {
            return false;
        }
        if (c04774v.A0I() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void A5A(C04774v c04774v) {
        InterfaceC0780Hd[] interfaceC0780HdArr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(c04774v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c04774v, 0)) {
                return;
            }
            int A09 = c04774v.A09();
            int A07 = c04774v.A07();
            for (InterfaceC0780Hd interfaceC0780Hd : this.A05) {
                c04774v.A0f(A09);
                interfaceC0780Hd.AIr(c04774v, A07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A07;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5c(HA ha, LG lg) {
        for (int i = 0; i < i; i++) {
            LC lc = this.A04.get(i);
            lg.A05();
            InterfaceC0780Hd AKS = ha.AKS(lg.A03(), 3);
            AKS.A6e(new C04212p().A0y(lg.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(lc.A02)).A10(lc.A01).A14());
            this.A05[i] = AKS;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != C10323vs.b) {
                for (InterfaceC0780Hd interfaceC0780Hd : this.A05) {
                    interfaceC0780Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGq(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j != C10323vs.b) {
            this.A02 = j;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = C10323vs.b;
    }
}
