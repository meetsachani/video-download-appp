package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Ma  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0906Ma implements InterfaceC1522eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ MW A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, C2638Cg0.B7, -25, C2638Cg0.n7, C2638Cg0.C7, -34, C2638Cg0.n7, -32};
    }

    static {
        A01();
    }

    public C0906Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C0906Ma(MW mw, C0918Mm c0918Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AEA() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AEh() {
        C0945No c0945No;
        AtomicBoolean atomicBoolean;
        c0945No = this.A00.A0H;
        if (!c0945No.A0b()) {
            this.A00.A0N();
            return;
        }
        MW mw = this.A00;
        String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        atomicBoolean = mw.A0S;
        atomicBoolean.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AFQ() {
        C1524eI c1524eI;
        C1673gi c1673gi;
        this.A00.AFA(false);
        c1524eI = this.A00.A0Q;
        c1524eI.A0E(8);
        c1673gi = this.A00.A0J;
        c1673gi.A0F().AFH();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AGg() {
        InterfaceC1214Yh interfaceC1214Yh;
        interfaceC1214Yh = this.A00.A0O;
        interfaceC1214Yh.ADJ(15);
    }
}
