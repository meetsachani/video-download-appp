package o;

/* renamed from: o.te2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9784te2 extends AbstractC7061iX0<String> {
    public static final C9784te2 Y0 = new C9784te2();
    public static final int Z0 = 16;
    public static final int a1 = 32768;
    private static final long serialVersionUID = -7032449491269434877L;

    public static int n(int i) {
        return 32768 >>> i;
    }

    @Override // o.AbstractC7061iX0
    public int b() {
        return 16;
    }

    @Override // o.AbstractC7061iX0
    /* renamed from: j */
    public int a(String str, int i, int i2, String str2, int i3, int i4) {
        char charAt;
        char c;
        if (i % 16 == 0 && i3 % 16 == 0 && i2 % 16 == 0 && i4 % 16 == 0) {
            int i5 = i / 16;
            int i6 = i3 / 16;
            int i7 = (i2 / 16) + i5;
            int i8 = (i4 / 16) + i6;
            int max = Math.max(i7, i8);
            boolean z = true;
            for (int i9 = 0; i9 < max; i9++) {
                int i10 = i5 + i9;
                int i11 = i6 + i9;
                if (i10 >= i7) {
                    charAt = 0;
                } else {
                    charAt = str.charAt(i10);
                }
                if (str2 != null && i11 < i8) {
                    c = str2.charAt(i11);
                } else {
                    c = 0;
                }
                if (charAt != c) {
                    return ((i9 * 16) + Integer.numberOfLeadingZeros(charAt ^ c)) - 16;
                }
                if (charAt != 0) {
                    z = false;
                }
            }
            if (z) {
                return -1;
            }
            return -2;
        }
        throw new IllegalArgumentException("The offsets and lengths must be at Character boundaries");
    }

    @Override // o.AbstractC7061iX0
    /* renamed from: k */
    public boolean c(String str, int i, int i2) {
        if (str != null && i < i2) {
            if ((str.charAt(i / 16) & n(i % 16)) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC7061iX0
    /* renamed from: l */
    public boolean g(String str, int i, int i2, String str2) {
        if (i % 16 == 0 && i2 % 16 == 0) {
            return str2.startsWith(str.substring(i / 16, i2 / 16));
        }
        throw new IllegalArgumentException("Cannot determine prefix outside of Character boundaries");
    }

    @Override // o.AbstractC7061iX0
    /* renamed from: m */
    public int i(String str) {
        if (str != null) {
            return str.length() * 16;
        }
        return 0;
    }
}
