package com.facebook.ads.redexgen.X;

import o.C10323vs;
import o.CK1;

/* renamed from: com.facebook.ads.redexgen.X.Kz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0879Kz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC0780Hd A07;

    public C0879Kz(InterfaceC0780Hd interfaceC0780Hd) {
        this.A07 = interfaceC0780Hd;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i, long j) {
        this.A00 = i;
        this.A06 = false;
        boolean z = true;
        this.A05 = i == 182 || i == 179;
        if (i != 182) {
            z = false;
        }
        this.A04 = z;
        this.A01 = 0;
        this.A03 = j;
    }

    public final void A02(long j, int flags, boolean z) {
        if (this.A00 == 182 && z && this.A05 && this.A03 != C10323vs.b) {
            this.A07.AIu(this.A03, this.A06 ? 1 : 0, (int) (j - this.A02), flags, null);
        }
        int size = this.A00;
        if (size != 179) {
            this.A02 = j;
        }
    }

    public final void A03(byte[] bArr, int i, int i2) {
        if (this.A04) {
            int i3 = (i + 1) - this.A01;
            if (i3 < i2) {
                int headerOffset = bArr[i3];
                this.A06 = ((headerOffset & CK1.x) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i2 - i;
        }
    }
}
