package o;

import java.text.DecimalFormatSymbols;
import java.util.Objects;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import o.C3599Ly1;
import o.EnumC6211f50;

/* renamed from: o.f50  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC6211f50 {
    PLAIN(new Function() { // from class: o.b50
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new EnumC6211f50.f((EnumC6211f50.c) obj);
        }
    }),
    SCIENTIFIC(new Function() { // from class: o.c50
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new EnumC6211f50.g((EnumC6211f50.c) obj);
        }
    }),
    ENGINEERING(new Function() { // from class: o.d50
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new EnumC6211f50.d((EnumC6211f50.c) obj);
        }
    }),
    MIXED(new Function() { // from class: o.e50
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new EnumC6211f50.e((EnumC6211f50.c) obj);
        }
    });
    
    public final Function<c, DoubleFunction<String>> X;

    /* renamed from: o.f50$b */
    /* loaded from: classes4.dex */
    public static abstract class b implements DoubleFunction<String>, C3599Ly1.a {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final char[] h;
        public final char i;
        public final char j;
        public final boolean k;
        public final char l;
        public final char[] m;
        public final boolean n;

        public b(c cVar) {
            this.a = cVar.b;
            this.b = cVar.c;
            this.c = cVar.f;
            this.d = cVar.n + cVar.f;
            this.e = cVar.g;
            this.f = cVar.h;
            this.g = cVar.i;
            this.h = cVar.j.toCharArray();
            this.i = cVar.k;
            this.j = cVar.l;
            this.k = cVar.m;
            this.l = cVar.n;
            this.m = cVar.f736o.toCharArray();
            this.n = cVar.p;
        }

        @Override // o.C3599Ly1.a
        public char a() {
            return this.i;
        }

        @Override // o.C3599Ly1.a
        public boolean b() {
            return this.g;
        }

        @Override // o.C3599Ly1.a
        public char[] c() {
            return this.h;
        }

        @Override // o.C3599Ly1.a
        public char d() {
            return this.l;
        }

        @Override // o.C3599Ly1.a
        public boolean e() {
            return this.n;
        }

        @Override // o.C3599Ly1.a
        public char[] f() {
            return this.m;
        }

        @Override // o.C3599Ly1.a
        public boolean g() {
            return this.k;
        }

        @Override // o.C3599Ly1.a
        public char h() {
            return this.j;
        }

        @Override // o.C3599Ly1.a
        public boolean i() {
            return this.f;
        }

        @Override // java.util.function.DoubleFunction
        /* renamed from: j */
        public String apply(double d) {
            if (Double.isFinite(d)) {
                return k(d);
            }
            if (Double.isInfinite(d)) {
                if (d > 0.0d) {
                    return this.c;
                }
                return this.d;
            }
            return this.e;
        }

        public final String k(double d) {
            C3599Ly1 h = C3599Ly1.h(d);
            int max = Math.max(h.j(), this.b);
            if (this.a > 0) {
                max = Math.max((h.l() - this.a) + 1, max);
            }
            h.s(max);
            return l(h);
        }

        public abstract String l(C3599Ly1 c3599Ly1);
    }

    /* renamed from: o.f50$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public static final int q = 6;
        public static final int r = -3;
        public static final String s = "0123456789";
        public final Function<c, DoubleFunction<String>> a;
        public int b;
        public int c;
        public int d;
        public int e;
        public String f;
        public String g;
        public boolean h;
        public boolean i;
        public String j;
        public char k;
        public char l;
        public boolean m;
        public char n;

        /* renamed from: o  reason: collision with root package name */
        public String f736o;
        public boolean p;

        public c A(String str) {
            Objects.requireNonNull(str, "Infinity string cannot be null");
            this.f = str;
            return this;
        }

        public c B(int i) {
            this.b = i;
            return this;
        }

        public c C(int i) {
            this.c = i;
            return this;
        }

        public c D(char c) {
            this.n = c;
            return this;
        }

        public c E(String str) {
            Objects.requireNonNull(str, "NaN string cannot be null");
            this.g = str;
            return this;
        }

        public c F(int i) {
            this.d = i;
            return this;
        }

        public c G(int i) {
            this.e = i;
            return this;
        }

        public c p(boolean z) {
            this.i = z;
            return this;
        }

        public c q(boolean z) {
            this.p = z;
            return this;
        }

        public DoubleFunction<String> r() {
            return this.a.apply(this);
        }

        public c s(char c) {
            this.k = c;
            return this;
        }

        public c t(String str) {
            Objects.requireNonNull(str, "Digits string cannot be null");
            if (str.length() == 10) {
                this.j = str;
                return this;
            }
            throw new IllegalArgumentException("Digits string must contain exactly 10 characters.");
        }

        public c u(String str) {
            Objects.requireNonNull(str, "Exponent separator cannot be null");
            this.f736o = str;
            return this;
        }

        public c v(DecimalFormatSymbols decimalFormatSymbols) {
            Objects.requireNonNull(decimalFormatSymbols, "Decimal format symbols cannot be null");
            return t(w(decimalFormatSymbols)).s(decimalFormatSymbols.getDecimalSeparator()).y(decimalFormatSymbols.getGroupingSeparator()).D(decimalFormatSymbols.getMinusSign()).u(decimalFormatSymbols.getExponentSeparator()).A(decimalFormatSymbols.getInfinity()).E(decimalFormatSymbols.getNaN());
        }

        public final String w(DecimalFormatSymbols decimalFormatSymbols) {
            int zeroDigit = decimalFormatSymbols.getZeroDigit() - s.charAt(0);
            char[] cArr = new char[10];
            for (int i = 0; i < 10; i++) {
                cArr[i] = (char) (s.charAt(i) + zeroDigit);
            }
            return String.valueOf(cArr);
        }

        public c x(boolean z) {
            this.m = z;
            return this;
        }

        public c y(char c) {
            this.l = c;
            return this;
        }

        public c z(boolean z) {
            this.h = z;
            return this;
        }

        public c(Function<c, DoubleFunction<String>> function) {
            this.b = 0;
            this.c = Integer.MIN_VALUE;
            this.d = 6;
            this.e = -3;
            this.f = "Infinity";
            this.g = "NaN";
            this.h = true;
            this.i = true;
            this.j = s;
            this.k = '.';
            this.l = ',';
            this.m = false;
            this.n = '-';
            this.f736o = C2638Cg0.S4;
            this.p = false;
            this.a = function;
        }
    }

    /* renamed from: o.f50$d */
    /* loaded from: classes4.dex */
    public static class d extends b {
        public d(c cVar) {
            super(cVar);
        }

        @Override // o.EnumC6211f50.b
        public String l(C3599Ly1 c3599Ly1) {
            return c3599Ly1.y(this);
        }
    }

    /* renamed from: o.f50$e */
    /* loaded from: classes4.dex */
    public static final class e extends b {

        /* renamed from: o  reason: collision with root package name */
        public final int f737o;
        public final int p;

        public e(c cVar) {
            super(cVar);
            this.f737o = cVar.d;
            this.p = cVar.e;
        }

        @Override // o.EnumC6211f50.b
        public String l(C3599Ly1 c3599Ly1) {
            int l = c3599Ly1.l();
            if (l <= this.f737o && l >= this.p) {
                return c3599Ly1.z(this);
            }
            return c3599Ly1.B(this);
        }
    }

    /* renamed from: o.f50$f */
    /* loaded from: classes4.dex */
    public static class f extends b {
        public f(c cVar) {
            super(cVar);
        }

        @Override // o.EnumC6211f50.b
        public String l(C3599Ly1 c3599Ly1) {
            return c3599Ly1.z(this);
        }
    }

    /* renamed from: o.f50$g */
    /* loaded from: classes4.dex */
    public static class g extends b {
        public g(c cVar) {
            super(cVar);
        }

        @Override // o.EnumC6211f50.b
        public String l(C3599Ly1 c3599Ly1) {
            return c3599Ly1.B(this);
        }
    }

    EnumC6211f50(Function function) {
        this.X = function;
    }

    public c e() {
        return new c(this.X);
    }
}
