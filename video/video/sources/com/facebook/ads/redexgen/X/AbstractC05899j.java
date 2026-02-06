package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.9j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC05899j implements InterfaceC2054nE {
    public int A00;
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2242qI[] A04;
    public final int A05;
    public final C2205pg A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:12:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC05899j(C2205pg c2205pg, int[] iArr, int i) {
        AbstractC04543y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C2205pg) AbstractC04543y.A01(c2205pg);
        this.A05 = iArr.length;
        this.A04 = new C2242qI[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            C2242qI[] c2242qIArr = this.A04;
            int i3 = iArr[i2];
            c2242qIArr[i2] = c2205pg.A08(i3);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC05899j.A07((C2242qI) obj, (C2242qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c2205pg.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2242qI c2242qI, C2242qI c2242qI2) {
        return c2242qI2.A05 - c2242qI.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2054nE
    public void A5x() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2054nE
    public void A6K() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0716Eq
    public final C2242qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0716Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2054nE
    public final C2242qI A92() {
        return this.A04[A93()];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0716Eq
    public final C2205pg A9L() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0716Eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AA6(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2054nE
    public void AFJ(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC05899j abstractC05899j = (AbstractC05899j) obj;
        return this.A06 == abstractC05899j.A06 && Arrays.equals(this.A07, abstractC05899j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0716Eq
    public final int length() {
        return this.A07.length;
    }
}
