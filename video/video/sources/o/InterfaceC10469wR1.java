package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.OD1;

@Deprecated
/* renamed from: o.wR1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC10469wR1 extends OD1.b {
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final int c0 = 3;
    public static final int d0 = 4;
    public static final int e0 = 5;
    public static final int f0 = 6;
    public static final int g0 = 7;
    public static final int h0 = 8;
    public static final int i0 = 9;
    public static final int j0 = 10;
    public static final int k0 = 11;
    public static final int l0 = 12;
    public static final int m0 = 13;
    public static final int n0 = 14;
    public static final int o0 = 10000;
    public static final int p0 = 0;
    public static final int q0 = 1;
    public static final int r0 = 2;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wR1$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wR1$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* renamed from: o.wR1$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b();
    }

    void C(C10833xx0[] c10833xx0Arr, IX1 ix1, long j, long j2) throws C3824Og0;

    void D(long j, long j2) throws C3824Og0;

    long E();

    void F(long j) throws C3824Og0;

    @InterfaceC11300zs1
    InterfaceC2729De1 G();

    void b();

    boolean c();

    int d();

    @InterfaceC11300zs1
    IX1 e();

    String getName();

    int getState();

    boolean isReady();

    void j(C10955yR1 c10955yR1, C10833xx0[] c10833xx0Arr, IX1 ix1, long j, boolean z, boolean z2, long j2, long j3) throws C3824Og0;

    boolean k();

    void m();

    void o(int i, ND1 nd1);

    void reset();

    void start() throws C3824Og0;

    void stop();

    void u() throws IOException;

    boolean v();

    InterfaceC10712xR1 x();

    default void g() {
    }

    default void A(float f, float f2) throws C3824Og0 {
    }
}
