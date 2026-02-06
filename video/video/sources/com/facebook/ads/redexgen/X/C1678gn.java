package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.gn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1678gn extends AbstractRunnableC1160Wc {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC1071Sp A00;
    public final /* synthetic */ C1072Sq A01;
    public final /* synthetic */ C1079Sx A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1678gn(C1079Sx c1079Sx, ArrayList arrayList, C1072Sq c1072Sq, InterfaceC1071Sp interfaceC1071Sp, ArrayList arrayList2) {
        this.A02 = c1079Sx;
        this.A03 = arrayList;
        this.A01 = c1072Sq;
        this.A00 = interfaceC1071Sp;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        AtomicBoolean A0D;
        T8 t8;
        Handler handler;
        T8 t82;
        long j;
        long j2;
        long j3;
        long j4;
        A0D = C1079Sx.A0D(this.A03);
        t8 = this.A02.A04;
        if (t8 instanceof C1673gi) {
            t82 = this.A02.A04;
            C1673gi c1673gi = (C1673gi) t82;
            if (this.A01.A00 == -1) {
                boolean z = A0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        InterfaceC0899Lt A0F = c1673gi.A0F();
                        j4 = this.A02.A00;
                        A0F.A4p(Y1.A01(j4));
                    } else {
                        InterfaceC0899Lt A0F2 = c1673gi.A0F();
                        j3 = this.A02.A00;
                        A0F2.A4n(Y1.A01(j3));
                    }
                }
                throw new RuntimeException();
            } else if (A0D.get()) {
                InterfaceC0899Lt A0F3 = c1673gi.A0F();
                j2 = this.A02.A00;
                long A01 = Y1.A01(j2);
                C1072Sq c1072Sq = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    A0F3.A4q(A01, c1072Sq.A00);
                }
                throw new RuntimeException();
            } else {
                InterfaceC0899Lt A0F4 = c1673gi.A0F();
                j = this.A02.A00;
                A0F4.A4o(Y1.A01(j), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C1679go(this, A0D));
        C1079Sx.A0D(this.A04);
    }
}
