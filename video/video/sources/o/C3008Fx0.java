package o;

/* renamed from: o.Fx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3008Fx0 {
    public static final int c = 21522;
    public static final int[][] d = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final EnumC8074me0 a;
    public final byte b;

    public C3008Fx0(int i) {
        this.a = EnumC8074me0.e((i >> 3) & 3);
        this.b = (byte) (i & 7);
    }

    public static C3008Fx0 a(int i, int i2) {
        C3008Fx0 b = b(i, i2);
        if (b != null) {
            return b;
        }
        return b(i ^ 21522, i2 ^ 21522);
    }

    public static C3008Fx0 b(int i, int i2) {
        int[][] iArr;
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : d) {
            int i5 = iArr2[0];
            if (i5 != i && i5 != i2) {
                int e2 = e(i, i5);
                if (e2 < i3) {
                    i4 = iArr2[1];
                    i3 = e2;
                }
                if (i != i2 && (e = e(i2, i5)) < i3) {
                    i4 = iArr2[1];
                    i3 = e;
                }
            } else {
                return new C3008Fx0(iArr2[1]);
            }
        }
        if (i3 <= 3) {
            return new C3008Fx0(i4);
        }
        return null;
    }

    public static int e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    public byte c() {
        return this.b;
    }

    public EnumC8074me0 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3008Fx0)) {
            return false;
        }
        C3008Fx0 c3008Fx0 = (C3008Fx0) obj;
        if (this.a != c3008Fx0.a || this.b != c3008Fx0.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a.ordinal() << 3) | this.b;
    }
}
