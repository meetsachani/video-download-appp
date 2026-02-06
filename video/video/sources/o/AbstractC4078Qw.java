package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.Qw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4078Qw {
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final List<Integer> i = Arrays.asList(1, 2, 3, 7);
    public final int a;
    public final Executor b;
    public final InterfaceC8579oi2 c;
    public final InterfaceC7024iN0 d;
    public final InterfaceC10929yL<Throwable> e;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Qw$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Qw$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public AbstractC4078Qw(int i2, Executor executor, InterfaceC7024iN0 interfaceC7024iN0, InterfaceC10929yL<Throwable> interfaceC10929yL) {
        C10907yF1.b(i2 == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.a = i2;
        this.b = executor;
        this.c = null;
        this.d = interfaceC7024iN0;
        this.e = interfaceC10929yL;
    }

    public InterfaceC8822pi2 a() {
        return new C10532wi2(this);
    }

    public InterfaceC10929yL<Throwable> b() {
        return this.e;
    }

    public Executor c() {
        return this.b;
    }

    public InterfaceC7024iN0 d() {
        return this.d;
    }

    public InterfaceC8579oi2 e() {
        return this.c;
    }

    public int f() {
        return this.a;
    }

    public AbstractC4078Qw(int i2, Executor executor, InterfaceC8579oi2 interfaceC8579oi2, InterfaceC10929yL<Throwable> interfaceC10929yL) {
        C3553Ll2.a(i, i2);
        this.a = i2;
        this.b = executor;
        this.c = interfaceC8579oi2;
        this.d = null;
        this.e = interfaceC10929yL;
    }
}
