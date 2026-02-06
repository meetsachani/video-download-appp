package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.List;
import o.C2638Cg0;
import o.C8077mf;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1986lv extends AbstractC0829Jb {
    public static byte[] A01;
    public static String[] A02 = {"llfHvvp5w7AsdcfCf5e", "amqCmPcUyTwYr5NdTloeCtiw", "0NAIhycYLxj75", "dj34azdkZPKXRKaV6TbpL4Sg", "ijcAEj6S85lKiCQyoflHjypUMqTEGqRn", "eY0hdp8", "jqGnWXF3Z8AkxtecEpgwxV1mUEmkJWKs", "4zwbE0EN4gXO5y3Vp0p"};
    public static final byte[] A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-1, 19, 2, 7, 13, C2638Cg0.y7, 13, C8077mf.p, 19, 17};
    }

    static {
        A01();
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
        A03 = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    }

    public static boolean A02(C04774v c04774v) {
        return A03(c04774v, A04);
    }

    public static boolean A03(C04774v c04774v, byte[] bArr) {
        if (c04774v.A07() < bArr.length) {
            return false;
        }
        int A09 = c04774v.A09();
        int startPosition = bArr.length;
        byte[] header = new byte[startPosition];
        int startPosition2 = bArr.length;
        c04774v.A0k(header, 0, startPosition2);
        c04774v.A0f(A09);
        return Arrays.equals(header, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    public final long A09(C04774v c04774v) {
        return A06(HT.A05(c04774v.A0l()));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public final boolean A0C(C04774v c04774v, long j, C0828Ja c0828Ja) throws C3K {
        if (A03(c04774v, A04)) {
            byte[] headerBytes = Arrays.copyOf(c04774v.A0l(), c04774v.A0A());
            int A012 = HT.A01(headerBytes);
            List<byte[]> A06 = HT.A06(headerBytes);
            if (c0828Ja.A00 != null) {
                return true;
            }
            c0828Ja.A00 = new C04212p().A11(A00(0, 10, 33)).A0b(A012).A0m(48000).A12(A06).A14();
            return true;
        } else if (A03(c04774v, A03)) {
            AbstractC04543y.A02(c0828Ja.A00);
            if (this.A00) {
                return true;
            }
            this.A00 = true;
            c04774v.A0g(A03.length);
            C0784Hh commentHeader = AbstractC0787Hk.A05(c04774v, false, false);
            Metadata A022 = AbstractC0787Hk.A02(C1840jW.A02(commentHeader.A02));
            if (A022 == null) {
                return true;
            }
            C04212p A07 = c0828Ja.A00.A07();
            String[] strArr = A02;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "80vtnZ0VGuLh5BtNytGnkcmL";
            strArr2[1] = "kfnMkjsOg47yHVBMKsSTRfGb";
            c0828Ja.A00 = A07.A0v(A022.A04(c0828Ja.A00.A0P)).A14();
            return true;
        } else {
            AbstractC04543y.A02(c0828Ja.A00);
            return false;
        }
    }
}
