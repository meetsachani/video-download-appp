package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10323vs;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1958lT implements InterfaceC0875Kv {
    public static byte[] A0D;
    public static String[] A0E = {"eg1HF5xa7z40pAwthJhUwMgyYSflMm57", "vTWXZUhc0T5ye2gU", "5CU7tG4vDC5MrJOvyrKXJFg3lgmAd80k", "DBSeFcO6ZOsoqUplN3HsHa32omlpR5Gp", "ocqdBidFvokLCywFTEXKHS5uCgObv9g8", "Mmwr1Jc9dpTbQpvT", "ugccp26DZT8wLBdxyPVLtxapsfOoaJDE", "eNeWJfNXyWcyw1SOouQPEZVsCwWfQhE2"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C2242qI A05;
    public InterfaceC0780Hd A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final C04764u A0A;
    public final C04774v A0B;
    public final String A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 29;
            String[] strArr = A0E;
            if (strArr[1].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "llPzXaIPGYOm1jx09XShEDSvCSxFzIZB";
            strArr2[4] = "gGGXbxf7z5B4GQeBG0q6dPqvCPeZy7ri";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-108, -88, -105, -100, -94, 98, -108, -106, 103};
    }

    static {
        A02();
    }

    public C1958lT() {
        this(null);
    }

    public C1958lT(String str) {
        this.A0A = new C04764u(new byte[16]);
        this.A0B = new C04774v(this.A0A.A00);
        this.A02 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A04 = C10323vs.b;
        this.A0C = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r4.equals(r6.A05.A0W) != false) goto L14;
     */
    @RequiresNonNull({"output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A01() {
        this.A0A.A08(0);
        C0770Gt A04 = AbstractC0771Gu.A04(this.A0A);
        C2242qI c2242qI = this.A05;
        String A00 = A00(0, 9, 22);
        if (c2242qI != null) {
            int i = A04.A01;
            String[] strArr = A0E;
            if (strArr[1].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "SKD2aiuMz12sC9MEHPwFtgw1C1HH3qQd";
            strArr2[4] = "2YOZvYYyczeO9UVS3DIHqXjJCxImTVhM";
            if (i == this.A05.A06) {
                if (A04.A04 == this.A05.A0G) {
                }
            }
        }
        this.A05 = new C04212p().A0y(this.A07).A11(A00).A0b(A04.A01).A0m(A04.A04).A10(this.A0C).A14();
        this.A06.A6e(this.A05);
        this.A01 = A04.A02;
        long j = (A04.A03 * 1000000) / this.A05.A0G;
        String[] strArr3 = A0E;
        if (strArr3[7].charAt(24) != strArr3[4].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0E;
        strArr4[6] = "AWQIxDR1BxjJqdSwyyHMPwKr6xoKH6oB";
        strArr4[2] = "F7eavifvP420Kso3ywMcgn0EXVt9uheB";
        this.A03 = j;
    }

    private boolean A03(C04774v c04774v) {
        int A0I;
        while (true) {
            if (c04774v.A07() <= 0) {
                return false;
            }
            if (!this.A09) {
                this.A09 = c04774v.A0I() == 172;
            } else {
                A0I = c04774v.A0I();
                this.A09 = A0I == 172;
                if (A0I == 64 || A0I == 65) {
                    break;
                }
            }
        }
        this.A08 = A0I == 65;
        return true;
    }

    private boolean A04(C04774v c04774v, byte[] bArr, int i) {
        int min = Math.min(c04774v.A07(), i - this.A00);
        int bytesToRead = this.A00;
        c04774v.A0k(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void A5A(C04774v c04774v) {
        AbstractC04543y.A02(this.A06);
        while (c04774v.A07() > 0) {
            switch (this.A02) {
                case 0:
                    if (!A03(c04774v)) {
                        break;
                    } else {
                        this.A02 = 1;
                        this.A0B.A0l()[0] = -84;
                        this.A0B.A0l()[1] = (byte) (this.A08 ? 65 : 64);
                        this.A00 = 2;
                        break;
                    }
                case 1:
                    if (!A04(c04774v, this.A0B.A0l(), 16)) {
                        break;
                    } else {
                        A01();
                        this.A0B.A0f(0);
                        this.A06.AIr(this.A0B, 16);
                        this.A02 = 2;
                        break;
                    }
                case 2:
                    int min = Math.min(c04774v.A07(), this.A01 - this.A00);
                    this.A06.AIr(c04774v, min);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + min;
                    int i = this.A00;
                    int bytesToRead2 = this.A01;
                    if (i == bytesToRead2) {
                        int i2 = (this.A04 > C10323vs.b ? 1 : (this.A04 == C10323vs.b ? 0 : -1));
                        String[] strArr = A0E;
                        String str = strArr[1];
                        String str2 = strArr[5];
                        int length = str.length();
                        int bytesToRead3 = str2.length();
                        if (length == bytesToRead3) {
                            String[] strArr2 = A0E;
                            strArr2[7] = "IAM9NHxQABFG0hTE5bn7OXwICUUtPCRY";
                            strArr2[4] = "ryput7yIrWVq6mIAY3kQFQghClw5ei8P";
                            if (i2 != 0) {
                                this.A06.AIu(this.A04, 1, this.A01, 0, null);
                                this.A04 += this.A03;
                            }
                            this.A02 = 0;
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        continue;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A07 = lg.A04();
        this.A06 = ha.AKS(lg.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGq(long j, int i) {
        if (j != C10323vs.b) {
            this.A04 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AJ5() {
        this.A02 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A04 = C10323vs.b;
    }
}
