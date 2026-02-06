package o;

/* renamed from: o.Ly1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3599Ly1 {
    public static final char g = '-';
    public static final char h = '.';
    public static final char i = 'E';
    public static final char j = '0';
    public static final int k = 3;
    public static final int l = 10;
    public static final int m = 5;
    public static final int n = 3;
    public final boolean a;
    public final int[] b;
    public int c;
    public int d;
    public char[] e;
    public int f;

    /* renamed from: o.Ly1$a */
    /* loaded from: classes4.dex */
    public interface a {
        char a();

        boolean b();

        char[] c();

        char d();

        boolean e();

        char[] f();

        boolean g();

        char h();

        boolean i();
    }

    public C3599Ly1(boolean z, int[] iArr, int i2, int i3) {
        this.a = z;
        this.b = iArr;
        this.c = i2;
        this.d = i3;
    }

    public static int g(char c) {
        return c - '0';
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static C3599Ly1 h(double d) {
        ?? r0;
        if (Double.isFinite(d)) {
            char[] charArray = Double.toString(d).toCharArray();
            int i2 = 0;
            if (charArray[0] == '-') {
                r0 = 1;
            } else {
                r0 = 0;
            }
            int[] iArr = new int[(charArray.length - r0) - 1];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            boolean z = false;
            int i6 = r0;
            while (i6 < charArray.length) {
                char c = charArray[i6];
                if (c == '.') {
                    z = true;
                    i4 = i3;
                } else if (c == 'E') {
                    break;
                } else if (c == '0' && i3 <= 0) {
                    if (z) {
                        i4--;
                    }
                } else {
                    int g2 = g(c);
                    int i7 = i3 + 1;
                    iArr[i3] = g2;
                    if (g2 > 0) {
                        i5 = i7;
                    }
                    i3 = i7;
                }
                i6++;
            }
            if (i3 > 0) {
                if (i6 < charArray.length) {
                    i2 = p(charArray, i6 + 1);
                }
                return new C3599Ly1(r0, iArr, i5, (i2 + i4) - i5);
            }
            return new C3599Ly1(r0, new int[]{0}, 1, 0);
        }
        throw new IllegalArgumentException("Double is not finite");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2 = (r2 * 10) + g(r3[r4]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        return -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r4 >= r3.length) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0019 -> B:8:0x000d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int p(char[] cArr, int i2) {
        boolean z;
        int i3 = 0;
        if (cArr[i2] == '-') {
            z = true;
        } else {
            z = false;
        }
    }

    public final String A(int i2, a aVar) {
        boolean z;
        int i3 = (this.c + this.d) - i2;
        int abs = Math.abs(i3);
        boolean v = v(i3, aVar);
        int i4 = 1;
        if (i3 < 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = i(i2, aVar);
        if (v) {
            if (abs > 0) {
                i4 = 1 + ((int) Math.floor(Math.log10(abs)));
            }
            i5 += aVar.f().length + i4;
            if (z) {
                i5++;
            }
        }
        q(i5);
        c(0, e(i2, aVar), aVar);
        if (v) {
            b(aVar.f());
            if (z) {
                a(aVar.d());
            }
            char[] c = aVar.c();
            for (int i6 = i5 - 1; i6 >= this.f; i6--) {
                this.e[i6] = c[abs % 10];
                abs /= 10;
            }
            this.f = i5;
        }
        return o();
    }

    public String B(a aVar) {
        return A(1, aVar);
    }

    public final void C(int i2) {
        for (int i3 = i2 - 1; i3 > 0 && this.b[i3] == 0; i3--) {
            i2--;
        }
        this.d += this.c - i2;
        this.c = i2;
    }

    public final void a(char c) {
        char[] cArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        cArr[i2] = c;
    }

    public final void b(char[] cArr) {
        for (char c : cArr) {
            a(c);
        }
    }

    public final void c(int i2, int i3, a aVar) {
        char[] c = aVar.c();
        char c2 = c[0];
        if (i3 < this.c) {
            a(aVar.a());
            for (int i4 = 0; i4 < i2; i4++) {
                a(c2);
            }
            while (i3 < this.c) {
                d(this.b[i3], c);
                i3++;
            }
        } else if (aVar.i()) {
            a(aVar.a());
            a(c2);
        }
    }

    public final void d(int i2, char[] cArr) {
        a(cArr[i2]);
    }

    public final int e(int i2, a aVar) {
        if (w(aVar)) {
            a(aVar.d());
        }
        char[] c = aVar.c();
        int i3 = 0;
        char c2 = c[0];
        int max = Math.max(0, Math.min(i2, this.c));
        if (max > 0) {
            while (i3 < max) {
                d(this.b[i3], c);
                i3++;
            }
            while (i3 < i2) {
                a(c2);
                i3++;
            }
            return max;
        }
        a(c2);
        return max;
    }

    public final int f(int i2, a aVar) {
        if (w(aVar)) {
            a(aVar.d());
        }
        char[] c = aVar.c();
        int i3 = 0;
        char c2 = c[0];
        char h2 = aVar.h();
        int max = Math.max(0, Math.min(i2, this.c));
        if (max > 0) {
            int i4 = i2;
            while (i3 < max) {
                d(this.b[i3], c);
                if (r(i4)) {
                    a(h2);
                }
                i3++;
                i4--;
            }
            while (i3 < i2) {
                a(c2);
                if (r(i4)) {
                    a(h2);
                }
                i3++;
                i4--;
            }
            return max;
        }
        a(c2);
        return max;
    }

    public final int i(int i2, a aVar) {
        int i3 = this.c;
        if (w(aVar)) {
            i3++;
        }
        if (i2 < 1) {
            return i3 + Math.abs(i2) + 2;
        }
        int i4 = this.c;
        if (i2 >= i4) {
            int i5 = i3 + (i2 - i4);
            if (aVar.i()) {
                return i5 + 2;
            }
            return i5;
        }
        return i3 + 1;
    }

    public int j() {
        return this.d;
    }

    public final int k(int i2, a aVar) {
        int i3 = i(i2, aVar);
        if (aVar.g() && i2 > 0) {
            return i3 + ((i2 - 1) / 3);
        }
        return i3;
    }

    public int l() {
        return (this.c + this.d) - 1;
    }

    public boolean m() {
        if (this.b[0] != 0) {
            return false;
        }
        return true;
    }

    public void n(int i2) {
        if (i2 > 0 && i2 < this.c) {
            if (x(i2)) {
                t(i2);
            } else {
                C(i2);
            }
        }
    }

    public final String o() {
        String valueOf = String.valueOf(this.e);
        this.e = null;
        return valueOf;
    }

    public final void q(int i2) {
        this.e = new char[i2];
        this.f = 0;
    }

    public final boolean r(int i2) {
        if (i2 > 1 && i2 % 3 == 1) {
            return true;
        }
        return false;
    }

    public void s(int i2) {
        int i3 = this.d;
        if (i2 > i3) {
            int i4 = this.c + i3;
            if (i2 < i4) {
                n(i4 - i2);
            } else if (i2 == i4 && x(0)) {
                u(1, i2);
            } else {
                u(0, 0);
            }
        }
    }

    public final void t(int i2) {
        int i3 = this.c - i2;
        int i4 = i2 - 1;
        while (true) {
            if (i4 < 0) {
                break;
            }
            int[] iArr = this.b;
            int i5 = iArr[i4] + 1;
            if (i5 < 10) {
                iArr[i4] = i5;
                break;
            } else {
                i3++;
                i4--;
            }
        }
        if (i4 < 0) {
            u(1, this.d + i3);
        } else {
            C(this.c - i3);
        }
    }

    public final void u(int i2, int i3) {
        this.b[0] = i2;
        this.c = 1;
        this.d = i3;
    }

    public final boolean v(int i2, a aVar) {
        if (i2 == 0 && !aVar.e()) {
            return false;
        }
        return true;
    }

    public final boolean w(a aVar) {
        if (this.a) {
            if (aVar.b() || !m()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean x(int i2) {
        int[] iArr = this.b;
        int i3 = iArr[i2];
        if (i3 <= 5) {
            if (i3 == 5) {
                if (i2 >= this.c - 1 && iArr[i2 - 1] % 2 == 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public String y(a aVar) {
        return A(Math.floorMod(l(), 3) + 1, aVar);
    }

    public String z(a aVar) {
        int i2;
        int e;
        int i3 = this.c + this.d;
        if (i3 < 1) {
            i2 = Math.abs(i3);
        } else {
            i2 = 0;
        }
        q(k(i3, aVar));
        if (aVar.g()) {
            e = f(i3, aVar);
        } else {
            e = e(i3, aVar);
        }
        c(i2, e, aVar);
        return o();
    }
}
