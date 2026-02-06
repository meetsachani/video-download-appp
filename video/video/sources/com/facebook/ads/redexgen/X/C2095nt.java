package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2095nt implements DT {
    public static String[] A03 = {"SXf2ikyU7x67I20o8i24dVpGUFSBqQTw", "mkUiuiIj8yhWc2", "ZVpzrzkkS3TCIC8ssuB1q665Cly", "AyVvw5Y1t2x", "iglXNLTRJoy", "iTKB7JlXxZgW", "zcduVvETVwMCfQslxyZfhoZ", "8SZ4gfyzqyWZuyWUMuDO3PJ5JnvEF7yK"};
    public boolean A00;
    public final DT A01;
    public final /* synthetic */ C9v A02;

    public C2095nt(C9v c9v, DT dt) {
        this.A02 = c9v;
        this.A01 = dt;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final boolean AAe() {
        if (!this.A02.A03()) {
            boolean AAe = this.A01.AAe();
            String[] strArr = A03;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "tfusTrbeCFgw";
            strArr2[6] = "N1qkw3c8e5Hqf14VA9IMw1Y";
            if (AAe) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void ACR() throws IOException {
        this.A01.ACR();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r0 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r0 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        if (r0 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        r3 = r6.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
        if (r3 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
        if (r3 == false) goto L37;
     */
    @Override // com.facebook.ads.redexgen.X.DT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AHP(C05336z c05336z, C2163p0 c2163p0, int i) {
        int encoderPadding;
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            c2163p0.A02(4);
            return -4;
        }
        int AHP = this.A01.AHP(c05336z, c2163p0, i);
        if (AHP == -5) {
            Object A01 = AbstractC04543y.A01(c05336z.A00);
            if (A03[1].length() != 3) {
                A03[1] = "CgcnacS";
                C2242qI c2242qI = (C2242qI) A01;
                int result = c2242qI.A08;
                if (result == 0) {
                    int result2 = c2242qI.A09;
                }
                long j = this.A02.A01;
                String[] strArr = A03;
                String str = strArr[3];
                String str2 = strArr[4];
                int length = str.length();
                int result3 = str2.length();
                if (length != result3) {
                    String[] strArr2 = A03;
                    strArr2[3] = "GNrNzPSs5rG";
                    strArr2[4] = "BRLad8Ppi7x";
                    int result4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                } else {
                    String[] strArr3 = A03;
                    strArr3[7] = "EEmKLcyNYLT06pocayZ2GsCLcCuyLxXc";
                    strArr3[0] = "iurrvyyHueo7iqPuT2paMo28xJltVQ5w";
                    int result5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                }
                int encoderDelay = (this.A02.A00 > Long.MIN_VALUE ? 1 : (this.A02.A00 == Long.MIN_VALUE ? 0 : -1));
                c05336z.A00 = c2242qI.A07().A0d(encoderPadding).A0e(encoderDelay == 0 ? c2242qI.A09 : 0).A14();
                return -5;
            }
            throw new RuntimeException();
        }
        if (this.A02.A00 != Long.MIN_VALUE) {
            if (AHP != -4 || c2163p0.A01 < this.A02.A00) {
                if (AHP == -3) {
                    int result6 = (this.A02.A78() > Long.MIN_VALUE ? 1 : (this.A02.A78() == Long.MIN_VALUE ? 0 : -1));
                    if (result6 == 0) {
                        boolean z = c2163p0.A04;
                        if (A03[2].length() != 27) {
                            String[] strArr4 = A03;
                            strArr4[7] = "1nwlHryK5EDeU2ZU0H4BcQJbxB1i4Ihb";
                            strArr4[0] = "uJ2uSAytr2SiAHwLxUdt9xnwmqCI2wHf";
                        } else {
                            String[] strArr5 = A03;
                            strArr5[5] = "inKi0NPX9S85";
                            strArr5[6] = "FN6Cq4NmwdrKNoi6ofH3HqR";
                        }
                    }
                }
            }
            c2163p0.A0A();
            c2163p0.A02(4);
            this.A00 = true;
            return -4;
        }
        return AHP;
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final int AK2(long j) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.AK2(j);
    }
}
