package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.If  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0808If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C04895h A00;

    public C0808If(C04895h c04895h) {
        this.A00 = c04895h;
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void ADS() {
        AbstractC1386c3 abstractC1386c3;
        AbstractC1386c3 abstractC1386c32;
        InterfaceC1493dm interfaceC1493dm;
        AbstractC1386c3 abstractC1386c33;
        InterfaceC1493dm interfaceC1493dm2;
        AbstractC1208Yb abstractC1208Yb;
        InterfaceC1493dm interfaceC1493dm3;
        int i;
        AbstractC1386c3 abstractC1386c34;
        InterfaceC1493dm interfaceC1493dm4;
        AbstractC1208Yb abstractC1208Yb2;
        abstractC1386c3 = this.A00.A01;
        if (abstractC1386c3 instanceof C0856Kc) {
            abstractC1386c34 = this.A00.A01;
            if (abstractC1386c34.A1M()) {
                interfaceC1493dm4 = this.A00.A07;
                interfaceC1493dm4.AFw(true);
                abstractC1208Yb2 = this.A00.A06;
                abstractC1208Yb2.setToolbarActionMode(1);
                interfaceC1493dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1493dm3.ADc(i);
            }
        }
        abstractC1386c32 = this.A00.A01;
        if (abstractC1386c32 instanceof C0836Ji) {
            abstractC1386c33 = this.A00.A01;
            if (abstractC1386c33.A1M()) {
                interfaceC1493dm2 = this.A00.A07;
                interfaceC1493dm2.AFw(true);
                abstractC1208Yb = this.A00.A06;
                abstractC1208Yb.setToolbarActionMode(1);
                interfaceC1493dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1493dm3.ADc(i);
            }
        }
        interfaceC1493dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1493dm.AFw(false);
        interfaceC1493dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1493dm3.ADc(i);
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void AFV(float f) {
        InterfaceC1493dm interfaceC1493dm;
        int i;
        DZ dz;
        DZ dz2;
        int i2;
        interfaceC1493dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC1493dm.ADw(i - f);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i2 = this.A00.A03;
            dz2.A07((int) (i2 - f));
        }
    }
}
