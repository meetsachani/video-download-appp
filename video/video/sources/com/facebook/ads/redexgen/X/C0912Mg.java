package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Mg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0912Mg {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C1892kN A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C0911Mf> A03;
    public final TreeSet<C1890kL> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, C2638Cg0.u7, C2638Cg0.q7, 115, -100, -70, -68, C2638Cg0.p7, -66, -67, -100, -56, C2638Cg0.u7, C2638Cg0.y7, -66, C2638Cg0.u7, C2638Cg0.y7, C2638Cg0.u7, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C0912Mg(int i, String str) {
        this(i, str, C1892kN.A03);
    }

    public C0912Mg(int i, String str, C1892kN c1892kN) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = c1892kN;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j, long j2) {
        boolean z = true;
        AbstractC04543y.A07(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        AbstractC04543y.A07(z);
        C1890kL A04 = A04(j, j2);
        if (A04.A03()) {
            return -Math.min(A04.A04() ? Long.MAX_VALUE : A04.A01, j2);
        }
        long j3 = j + j2;
        if (j3 < 0) {
            j3 = Long.MAX_VALUE;
        }
        long currentEndPosition = A04.A02 + A04.A01;
        if (currentEndPosition < j3) {
            TreeSet<C1890kL> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C1890kL c1890kL : treeSet.tailSet(A04, false)) {
                if (c1890kL.A02 > currentEndPosition) {
                    break;
                }
                long j4 = c1890kL.A02;
                long queryEndPosition = c1890kL.A01;
                currentEndPosition = Math.max(currentEndPosition, j4 + queryEndPosition);
                if (currentEndPosition >= j3) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j, j2);
    }

    public final C1892kN A03() {
        return this.A00;
    }

    public final C1890kL A04(long j, long j2) {
        C1890kL A03 = C1890kL.A03(this.A02, j);
        C1890kL floor = this.A04.floor(A03);
        if (floor != null && floor.A02 + floor.A01 > j) {
            return floor;
        }
        C1890kL lookupSpan = this.A04.ceiling(A03);
        if (lookupSpan != null) {
            long j3 = lookupSpan.A02 - j;
            if (j2 != -1) {
                j3 = Math.min(j3, j2);
            }
            j2 = j3;
        }
        return C1890kL.A04(this.A02, j, j2);
    }

    public final C1890kL A05(C1890kL c1890kL, long j, boolean z) {
        AbstractC04543y.A08(this.A04.remove(c1890kL));
        File file = (File) AbstractC04543y.A01(c1890kL.A03);
        if (z) {
            File file2 = file.getParentFile();
            File A052 = C1890kL.A05((File) AbstractC04543y.A01(file2), this.A01, c1890kL.A02, j);
            if (file.renameTo(A052)) {
                file = A052;
            } else {
                AbstractC04624g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + A052);
            }
        }
        C1890kL newCacheSpan = c1890kL.A09(file, j);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C1890kL> A06() {
        return this.A04;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07(long j) {
        for (int i = 0; i < i; i++) {
            int i2 = (this.A03.get(i).A01 > j ? 1 : (this.A03.get(i).A01 == j ? 0 : -1));
            if (i2 == 0) {
                this.A03.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void A08(C1890kL c1890kL) {
        this.A04.add(c1890kL);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0B(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A00(j, j2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0C(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01(j, j2)) {
                return false;
            }
        }
        this.A03.add(new C0911Mf(j, j2));
        return true;
    }

    public final boolean A0D(MZ mz) {
        if (this.A04.remove(mz)) {
            if (mz.A03 != null) {
                mz.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() != strArr[3].length()) {
            String[] strArr2 = A06;
            strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
            strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
            return false;
        }
        throw new RuntimeException();
    }

    public final boolean A0E(C0917Ml c0917Ml) {
        C1892kN c1892kN = this.A00;
        C1892kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c0917Ml);
        C1892kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c1892kN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0912Mg c0912Mg = (C0912Mg) obj;
        if (this.A01 == c0912Mg.A01 && this.A02.equals(c0912Mg.A02) && this.A04.equals(c0912Mg.A04) && this.A00.equals(c0912Mg.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = this.A02.hashCode();
        return ((i + result2) * 31) + this.A00.hashCode();
    }
}
