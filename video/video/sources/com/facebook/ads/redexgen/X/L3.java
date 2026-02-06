package com.facebook.ads.redexgen.X;

import o.C10323vs;

/* loaded from: assets/audience_network/classes2.dex */
public final class L3 {
    public static String[] A0D = {"ITeGogKqorZ7bSCIE87s8DTmQOo7Fv11", "MgkbApIEYzpKXgGasWREFXTi3GTadnaL", "OAixFelLhBe3iSBS2M", "ijopPBuuJeE4Ltql3uBrQuSo8nqq7R3R", "1SB5ttJ09JcNeK6D9rJTpC1clnicerw7", "nbktskyiJneEJjHZifeKEa33HsJGsJ62", "ZYvdfmJVTREWWhesr4Tm9ps4syTvrO", "VkO2l5JSpUAFzoG39IjRbEodOO78G96O"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0780Hd A0C;

    public L3(InterfaceC0780Hd interfaceC0780Hd) {
        this.A0C = interfaceC0780Hd;
    }

    private void A00(int i) {
        if (this.A04 == C10323vs.b) {
            return;
        }
        boolean z = this.A0B;
        this.A0C.AIu(this.A04, z ? 1 : 0, (int) (this.A01 - this.A03), i, null);
    }

    public static boolean A01(int i) {
        return (32 <= i && i <= 35) || i == 39;
    }

    public static boolean A02(int i) {
        return i < 32 || i == 40;
    }

    public final void A03() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A0A = false;
        this.A09 = false;
    }

    public final void A04(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.A06 = false;
        this.A05 = false;
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = j;
        if (!A02(i2)) {
            if (this.A0A && !this.A09) {
                if (z) {
                    A00(i);
                }
                this.A0A = false;
            }
            if (A01(i2)) {
                this.A05 = !this.A09;
                this.A09 = true;
            }
        }
        this.A08 = i2 >= 16 && i2 <= 21;
        this.A07 = (this.A08 || i2 <= 9) ? true : true;
        if (A0D[6].length() != 30) {
            throw new RuntimeException();
        }
        A0D[6] = "HIa27EP0rmwgvhPEN5RK7GL0DsepbL";
    }

    public final void A05(long j, int i, boolean z) {
        if (this.A09 && this.A06) {
            this.A0B = this.A08;
            this.A09 = false;
        } else if (!this.A05 && !this.A06) {
        } else {
            if (z && this.A0A) {
                A00(i + ((int) (j - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A0B = this.A08;
            this.A0A = true;
        }
    }

    public final void A06(byte[] bArr, int i, int i2) {
        if (this.A07) {
            int i3 = (i + 2) - this.A00;
            if (i3 < i2) {
                int headerOffset = bArr[i3];
                this.A06 = (headerOffset & 128) != 0;
                this.A07 = false;
                return;
            }
            this.A00 += i2 - i;
        }
    }
}
