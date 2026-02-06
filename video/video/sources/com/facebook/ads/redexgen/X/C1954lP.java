package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import o.Xu2;

/* renamed from: com.facebook.ads.redexgen.X.lP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1954lP implements LE {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C2242qI> A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C2242qI> A03(LD ld) {
        String A022;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        C04774v c04774v = new C04774v(ld.A03);
        List<C2242qI> list = this.A01;
        while (c04774v.A07() > 0) {
            int A0I = c04774v.A0I();
            int A09 = c04774v.A09() + c04774v.A0I();
            if (A0I == 134) {
                list = new ArrayList<>();
                int A0I2 = c04774v.A0I() & 31;
                for (int i2 = 0; i2 < A0I2; i2++) {
                    String A0W = c04774v.A0W(3);
                    int A0I3 = c04774v.A0I();
                    boolean z = (A0I3 & 128) != 0;
                    if (z) {
                        A022 = A02(19, 19, 47);
                        i = A0I3 & 63;
                    } else {
                        A022 = A02(0, 19, 57);
                        i = 1;
                    }
                    byte A0I4 = (byte) c04774v.A0I();
                    c04774v.A0g(1);
                    List<byte[]> list2 = null;
                    if (z) {
                        boolean z2 = (A0I4 & 64) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        list2 = AnonymousClass46.A04(z2);
                    }
                    list.add(new C04212p().A11(A022).A10(A0W).A0Z(i).A12(list2).A14());
                }
                continue;
            }
            c04774v.A0f(A09);
        }
        return list;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, C2638Cg0.n7, -25, -25, -29, -32, C2638Cg0.B7, C2638Cg0.n7, -21, -32, -26, -27, -90, C2638Cg0.B7, -36, C2638Cg0.n7, -92, -82, -89, -81, C8077mf.n, C8077mf.E, C8077mf.E, C8077mf.A, C8077mf.x, C8077mf.p, C8077mf.n, 31, C8077mf.x, C8077mf.D, C8077mf.C, C2638Cg0.B7, C3307Iz.V, C8077mf.C, C8077mf.q, C2638Cg0.E7, C8077mf.q, C3307Iz.V, 13, C2638Cg0.E7, C8077mf.n, C8077mf.x, 31, C2638Cg0.r7, -46, -46, C2638Cg0.z7, C2638Cg0.x7, C2638Cg0.s7, C2638Cg0.r7, -42, C2638Cg0.x7, -47, -48, -111, C2638Cg0.B7, -113, -43, C2638Cg0.s7, -42, C2638Cg0.u7, -107, -105};
    }

    static {
        A04();
    }

    public C1954lP() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C1954lP(int i) {
        this(i, C1840jW.A03(new C2242qI[0]));
    }

    public C1954lP(int i, List<C2242qI> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private L9 A00(LD ld) {
        return new L9(A03(ld));
    }

    private LJ A01(LD ld) {
        return new LJ(A03(ld));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.LE
    public final SparseArray<LH> A5Q() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.LE
    public final LH A5V(int i, LD ld) {
        switch (i) {
            case 2:
            case 128:
                return new C1943lE(new C1951lM(A01(ld)));
            case 3:
            case 4:
                return new C1943lE(new C1945lG(ld.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C1943lE(new C1955lQ(false, ld.A01));
            case 16:
                return new C1943lE(new C1950lL(A01(ld)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C1943lE(new C1946lH(ld.A01));
            case 21:
                return new C1943lE(new C1947lI());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C1943lE(new C1949lK(A00(ld), A05(1), A05(8)));
            case 36:
                return new C1943lE(new C1948lJ(A00(ld)));
            case 89:
                return new C1943lE(new C1952lN(ld.A02));
            case 129:
            case 135:
                return new C1943lE(new C1961lW(ld.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C1938l9(new C1944lF(A02(61, 20, 26)));
            case 138:
                break;
            case Xu2.K /* 172 */:
                return new C1943lE(new C1958lT(ld.A01));
            case 257:
                return new C1938l9(new C1944lF(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C1943lE(new C1953lO(ld.A01));
    }
}
