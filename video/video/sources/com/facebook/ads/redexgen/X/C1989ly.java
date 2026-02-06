package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.ly  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1989ly extends AbstractC0829Jb {
    public static String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public HJ A00;
    public C1990lz A01;

    private int A00(C04774v c04774v) {
        int i = (c04774v.A0l()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c04774v.A0g(4);
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int charAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (charAt == blockSizeKey) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c04774v.A0S();
        }
        int result = HF.A00(c04774v, i);
        c04774v.A0f(0);
        return result;
    }

    public static boolean A01(C04774v c04774v) {
        return c04774v.A07() >= 5 && c04774v.A0I() == 127 && c04774v.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    public final long A09(C04774v c04774v) {
        if (!A02(c04774v.A0l())) {
            return -1L;
        }
        return A00(c04774v);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0829Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C04774v c04774v, long j, C0828Ja c0828Ja) {
        byte[] A0l = c04774v.A0l();
        HJ hj = this.A00;
        if (hj == null) {
            HJ hj2 = new HJ(A0l, 17);
            this.A00 = hj2;
            c0828Ja.A00 = hj2.A08(Arrays.copyOfRange(A0l, 9, c04774v.A0A()), null);
            return true;
        } else if ((A0l[0] & Byte.MAX_VALUE) == 3) {
            HI A03 = HH.A03(c04774v);
            HJ streamMetadata = hj.A09(A03);
            this.A00 = streamMetadata;
            this.A01 = new C1990lz(streamMetadata, A03);
            return true;
        } else if (!A02(A0l)) {
            return true;
        } else {
            if (this.A01 != null) {
                this.A01.A00(j);
                c0828Ja.A01 = this.A01;
            }
            C2242qI c2242qI = c0828Ja.A00;
            String[] strArr = A02;
            if (strArr[4].length() != strArr[7].length()) {
                String[] strArr2 = A02;
                strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
                strArr2[2] = "wrCWS6iAkk";
                AbstractC04543y.A01(c2242qI);
                return false;
            }
            throw new RuntimeException();
        }
    }
}
