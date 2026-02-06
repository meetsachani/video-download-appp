package o;

import java.io.InputStream;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "ConsoleKt")
/* renamed from: o.lK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7738lK {
    @XP0
    public static final void a(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @XP0
    public static final void b(char c) {
        System.out.print(c);
    }

    @XP0
    public static final void c(double d) {
        System.out.print(d);
    }

    @XP0
    public static final void d(float f) {
        System.out.print(f);
    }

    @XP0
    public static final void e(int i) {
        System.out.print(i);
    }

    @XP0
    public static final void f(long j) {
        System.out.print(j);
    }

    @XP0
    public static final void g(Object obj) {
        System.out.print(obj);
    }

    @XP0
    public static final void h(short s) {
        System.out.print(Short.valueOf(s));
    }

    @XP0
    public static final void i(boolean z) {
        System.out.print(z);
    }

    @XP0
    public static final void j(char[] cArr) {
        C6562gT0.p(cArr, "message");
        System.out.print(cArr);
    }

    @XP0
    public static final void k() {
        System.out.println();
    }

    @XP0
    public static final void l(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @XP0
    public static final void m(char c) {
        System.out.println(c);
    }

    @XP0
    public static final void n(double d) {
        System.out.println(d);
    }

    @XP0
    public static final void o(float f) {
        System.out.println(f);
    }

    @XP0
    public static final void p(int i) {
        System.out.println(i);
    }

    @XP0
    public static final void q(long j) {
        System.out.println(j);
    }

    @XP0
    public static final void r(Object obj) {
        System.out.println(obj);
    }

    @XP0
    public static final void s(short s) {
        System.out.println(Short.valueOf(s));
    }

    @XP0
    public static final void t(boolean z) {
        System.out.println(z);
    }

    @XP0
    public static final void u(char[] cArr) {
        C6562gT0.p(cArr, "message");
        System.out.println(cArr);
    }

    @Nullable
    public static final String v() {
        ZZ0 zz0 = ZZ0.a;
        InputStream inputStream = System.in;
        C6562gT0.o(inputStream, "in");
        Charset defaultCharset = Charset.defaultCharset();
        C6562gT0.o(defaultCharset, "defaultCharset(...)");
        return zz0.d(inputStream, defaultCharset);
    }

    @InterfaceC6480g82(version = "1.6")
    @NotNull
    public static final String w() {
        String x = x();
        if (x != null) {
            return x;
        }
        throw new C9239rO1("EOF has already been reached");
    }

    @InterfaceC6480g82(version = "1.6")
    @Nullable
    public static final String x() {
        return v();
    }
}
