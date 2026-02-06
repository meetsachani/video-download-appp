package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhbi {
    public static volatile int a = 100;

    public abstract Object a(Object obj);

    public abstract Object b();

    public abstract Object c(Object obj);

    public abstract void d(Object obj, int i, int i2);

    public abstract void e(Object obj, int i, long j);

    public abstract void f(Object obj, int i, Object obj2);

    public abstract void g(Object obj, int i, zzgxk zzgxkVar);

    public abstract void h(Object obj, int i, long j);

    public abstract void i(Object obj);

    public abstract void j(Object obj, Object obj2);

    public final boolean k(Object obj, zzhaq zzhaqVar, int i) throws IOException {
        int f = zzhaqVar.f();
        int i2 = f >>> 3;
        int i3 = f & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                d(obj, i2, zzhaqVar.e());
                                return true;
                            }
                            throw new zzgzg("Protocol message tag had invalid wire type.");
                        } else if (i != 0) {
                            return false;
                        } else {
                            throw new zzgzh("Protocol message end-group tag did not match expected tag.");
                        }
                    }
                    Object b = b();
                    int i4 = i2 << 3;
                    int i5 = i + 1;
                    if (i5 < a) {
                        while (zzhaqVar.c() != Integer.MAX_VALUE && k(b, zzhaqVar, i5)) {
                        }
                        if ((i4 | 4) == zzhaqVar.f()) {
                            f(obj, i2, c(b));
                            return true;
                        }
                        throw new zzgzh("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zzgzh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                g(obj, i2, zzhaqVar.o());
                return true;
            }
            e(obj, i2, zzhaqVar.k());
            return true;
        }
        h(obj, i2, zzhaqVar.l());
        return true;
    }
}
