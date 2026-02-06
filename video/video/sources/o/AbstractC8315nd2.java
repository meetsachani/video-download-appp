package o;

import java.util.Arrays;

@Deprecated
/* renamed from: o.nd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8315nd2 {
    public static final AbstractC8315nd2 a = new a(',');
    public static final AbstractC8315nd2 b = new a('\t');
    public static final AbstractC8315nd2 c = new a(' ');
    public static final AbstractC8315nd2 d = new b(" \t\n\r\f".toCharArray());
    public static final AbstractC8315nd2 e = new e();
    public static final AbstractC8315nd2 f = new a('\'');
    public static final AbstractC8315nd2 g = new a('\"');
    public static final AbstractC8315nd2 h = new b("'\"".toCharArray());
    public static final AbstractC8315nd2 i = new c();

    /* renamed from: o.nd2$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8315nd2 {
        public final char j;

        public a(char c) {
            this.j = c;
        }

        @Override // o.AbstractC8315nd2
        public int g(char[] cArr, int i, int i2, int i3) {
            if (this.j == cArr[i]) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: o.nd2$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC8315nd2 {
        public final char[] j;

        public b(char[] cArr) {
            this.j = C3619Me.b((char[]) cArr.clone());
        }

        @Override // o.AbstractC8315nd2
        public int g(char[] cArr, int i, int i2, int i3) {
            if (Arrays.binarySearch(this.j, cArr[i]) >= 0) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: o.nd2$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8315nd2 {
        @Override // o.AbstractC8315nd2
        public int g(char[] cArr, int i, int i2, int i3) {
            return 0;
        }
    }

    /* renamed from: o.nd2$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC8315nd2 {
        public final char[] j;

        public d(String str) {
            this.j = str.toCharArray();
        }

        @Override // o.AbstractC8315nd2
        public int g(char[] cArr, int i, int i2, int i3) {
            int length = this.j.length;
            if (i + length > i3) {
                return 0;
            }
            int i4 = 0;
            while (true) {
                char[] cArr2 = this.j;
                if (i4 < cArr2.length) {
                    if (cArr2[i4] != cArr[i]) {
                        return 0;
                    }
                    i4++;
                    i++;
                } else {
                    return length;
                }
            }
        }

        public String toString() {
            return super.toString() + ' ' + Arrays.toString(this.j);
        }
    }

    /* renamed from: o.nd2$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC8315nd2 {
        @Override // o.AbstractC8315nd2
        public int g(char[] cArr, int i, int i2, int i3) {
            if (cArr[i] <= ' ') {
                return 1;
            }
            return 0;
        }
    }

    public static AbstractC8315nd2 a(char c2) {
        return new a(c2);
    }

    public static AbstractC8315nd2 b(String str) {
        if (C4500Ve2.I0(str)) {
            return i;
        }
        if (str.length() == 1) {
            return new a(str.charAt(0));
        }
        return new b(str.toCharArray());
    }

    public static AbstractC8315nd2 c(char... cArr) {
        if (cArr != null && cArr.length != 0) {
            if (cArr.length == 1) {
                return new a(cArr[0]);
            }
            return new b(cArr);
        }
        return i;
    }

    public static AbstractC8315nd2 d() {
        return a;
    }

    public static AbstractC8315nd2 e() {
        return g;
    }

    public static AbstractC8315nd2 h() {
        return i;
    }

    public static AbstractC8315nd2 i() {
        return h;
    }

    public static AbstractC8315nd2 j() {
        return f;
    }

    public static AbstractC8315nd2 k() {
        return c;
    }

    public static AbstractC8315nd2 l() {
        return d;
    }

    public static AbstractC8315nd2 m(String str) {
        if (C4500Ve2.I0(str)) {
            return i;
        }
        return new d(str);
    }

    public static AbstractC8315nd2 n() {
        return b;
    }

    public static AbstractC8315nd2 o() {
        return e;
    }

    public int f(char[] cArr, int i2) {
        return g(cArr, i2, 0, cArr.length);
    }

    public abstract int g(char[] cArr, int i2, int i3, int i4);
}
