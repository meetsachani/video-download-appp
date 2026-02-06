package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1984lt extends AbstractC0829Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C0784Hh A01;
    public C0786Hj A02;
    public C0830Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0830Jc A02(C04774v c04774v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC0787Hk.A06(c04774v);
            return null;
        } else if (this.A01 == null) {
            this.A01 = AbstractC0787Hk.A04(c04774v);
            return null;
        } else {
            C0786Hj c0786Hj = this.A02;
            C0784Hh c0784Hh = this.A01;
            byte[] bArr = new byte[c04774v.A0A()];
            System.arraycopy(c04774v.A0l(), 0, bArr, 0, c04774v.A0A());
            C0785Hi[] A0D = AbstractC0787Hk.A0D(c04774v, c0786Hj.A05);
            return new C0830Jc(c0786Hj, c0784Hh, bArr, A0D, AbstractC0787Hk.A00(A0D.length - 1));
        }
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C0830Jc c0830Jc) {
        if (!c0830Jc.A04[A00(b, c0830Jc.A00, 1)].A03) {
            int modeNumber = c0830Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0830Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C04774v c04774v, long j) {
        if (c04774v.A08() < c04774v.A0A() + 4) {
            c04774v.A0i(Arrays.copyOf(c04774v.A0l(), c04774v.A0A() + 4));
        } else {
            c04774v.A0e(c04774v.A0A() + 4);
        }
        byte[] A0l = c04774v.A0l();
        A0l[c04774v.A0A() - 4] = (byte) (j & 255);
        A0l[c04774v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        A0l[c04774v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        A0l[c04774v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C04774v c04774v) {
        try {
            return AbstractC0787Hk.A0C(1, c04774v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    public final long A09(C04774v c04774v) {
        int i = 0;
        if ((c04774v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c04774v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (C0830Jc) AbstractC04543y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c04774v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C04774v c04774v, long j, C0828Ja c0828Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC04543y.A01(c0828Ja.A00);
            return false;
        }
        this.A03 = A02(c04774v);
        if (this.A03 == null) {
            return true;
        }
        C0830Jc c0830Jc = this.A03;
        C0786Hj c0786Hj = c0830Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c0786Hj.A09);
        codecInitializationData.add(c0830Jc.A03);
        c0828Ja.A00 = new C04212p().A11(A03(0, 12, 22)).A0a(c0786Hj.A02).A0j(c0786Hj.A00).A0b(c0786Hj.A05).A0m(c0786Hj.A06).A12(codecInitializationData).A0v(AbstractC0787Hk.A02(C1840jW.A02(c0830Jc.A01.A02))).A14();
        return true;
    }
}
