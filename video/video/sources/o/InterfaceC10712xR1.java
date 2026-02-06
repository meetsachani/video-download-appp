package o;

import android.annotation.SuppressLint;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.xR1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC10712xR1 {
    public static final int A0 = 8;
    public static final int B0 = 0;
    public static final int C0 = 32;
    public static final int D0 = 32;
    public static final int E0 = 0;
    public static final int F0 = 64;
    public static final int G0 = 64;
    public static final int H0 = 0;
    public static final int I0 = 384;
    public static final int J0 = 256;
    public static final int K0 = 128;
    public static final int L0 = 0;
    public static final int s0 = 7;
    @Deprecated
    public static final int t0 = 4;
    @Deprecated
    public static final int u0 = 3;
    @Deprecated
    public static final int v0 = 2;
    @Deprecated
    public static final int w0 = 1;
    @Deprecated
    public static final int x0 = 0;
    public static final int y0 = 24;
    public static final int z0 = 16;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xR1$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xR1$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xR1$c */
    /* loaded from: classes2.dex */
    public @interface c {
    }

    @Target({ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xR1$d */
    /* loaded from: classes2.dex */
    public @interface d {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xR1$e */
    /* loaded from: classes2.dex */
    public @interface e {
    }

    /* renamed from: o.xR1$f */
    /* loaded from: classes2.dex */
    public interface f {
        void a(InterfaceC10469wR1 interfaceC10469wR1);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xR1$g */
    /* loaded from: classes2.dex */
    public @interface g {
    }

    @SuppressLint({"WrongConstant"})
    static int H(int i) {
        return i & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int l(int i) {
        return i & 384;
    }

    @SuppressLint({"WrongConstant"})
    static int n(int i, int i2, int i3, int i4, int i5) {
        return i | i2 | i3 | i4 | i5;
    }

    @SuppressLint({"WrongConstant"})
    static int p(int i) {
        return i & 32;
    }

    @SuppressLint({"WrongConstant"})
    static int q(int i) {
        return i & 24;
    }

    static int r(int i) {
        return y(i, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int w(int i) {
        return i & 64;
    }

    static int y(int i, int i2, int i3) {
        return n(i, i2, i3, 0, 128);
    }

    int B() throws C3824Og0;

    int a(C10833xx0 c10833xx0) throws C3824Og0;

    int d();

    String getName();

    default void i() {
    }

    default void s(f fVar) {
    }
}
