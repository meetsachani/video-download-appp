package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.j90  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC7209j90 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.j90$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    void a(int i) throws C3989Py1;

    void b(int i, double d2) throws C3989Py1;

    void c(int i, long j) throws C3989Py1;

    int d(int i);

    boolean e(int i);

    void f(int i, String str) throws C3989Py1;

    void g(int i, int i2, InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException;

    void h(int i, long j, long j2) throws C3989Py1;
}
