package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
abstract class zzma<T, B> {
    public abstract int a(T t);

    public abstract B b();

    public abstract T c(T t, T t2);

    public abstract void d(B b, int i, int i2);

    public abstract void e(B b, int i, long j);

    public abstract void f(B b, int i, zzhm zzhmVar);

    public abstract void g(B b, int i, T t);

    public abstract void h(T t, zzmw zzmwVar) throws IOException;

    public abstract boolean i(zzlc zzlcVar);

    public final boolean j(B b, zzlc zzlcVar) throws IOException {
        int f = zzlcVar.f();
        int i = f >>> 3;
        int i2 = f & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                d(b, i, zzlcVar.e());
                                return true;
                            }
                            throw zzji.a();
                        }
                        return false;
                    }
                    B b2 = b();
                    int i3 = 4 | (i << 3);
                    while (zzlcVar.c() != Integer.MAX_VALUE && j(b2, zzlcVar)) {
                    }
                    if (i3 == zzlcVar.f()) {
                        g(b, i, r(b2));
                        return true;
                    }
                    throw zzji.b();
                }
                f(b, i, zzlcVar.o());
                return true;
            }
            e(b, i, zzlcVar.k());
            return true;
        }
        l(b, i, zzlcVar.l());
        return true;
    }

    public abstract int k(T t);

    public abstract void l(B b, int i, long j);

    public abstract void m(T t, zzmw zzmwVar) throws IOException;

    public abstract void n(Object obj, B b);

    public abstract B o(Object obj);

    public abstract void p(Object obj, T t);

    public abstract T q(Object obj);

    public abstract T r(B b);

    public abstract void s(Object obj);
}
