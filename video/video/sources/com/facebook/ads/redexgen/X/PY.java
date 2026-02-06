package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class PY extends R7 {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C1J A00;

    public PY(C1J c1j) {
        this.A00 = c1j;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void A0L(C7M c7m, int i) {
        int A25;
        InterfaceC1221Yo interfaceC1221Yo;
        super.A0L(c7m, i);
        C1743hr linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (A25 = linearLayoutManager.A25()) >= 0) {
            C1J c1j = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c1j.getAdapter() == null || A25 >= this.A00.getAdapter().A0B() || (interfaceC1221Yo = (InterfaceC1221Yo) c7m.A1F(A25)) == null) {
                return;
            }
            interfaceC1221Yo.AJF();
        }
    }
}
