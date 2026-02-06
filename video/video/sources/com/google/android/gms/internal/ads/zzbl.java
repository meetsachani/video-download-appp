package com.google.android.gms.internal.ads;

import android.util.Pair;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzbl {
    public static final zzbl a = new zzbi();

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract zzbj d(int i, zzbj zzbjVar, boolean z);

    public abstract zzbk e(int i, zzbk zzbkVar, long j);

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbl)) {
            return false;
        }
        zzbl zzblVar = (zzbl) obj;
        if (zzblVar.c() == c() && zzblVar.b() == b()) {
            zzbk zzbkVar = new zzbk();
            zzbj zzbjVar = new zzbj();
            zzbk zzbkVar2 = new zzbk();
            zzbj zzbjVar2 = new zzbj();
            for (int i = 0; i < c(); i++) {
                if (!e(i, zzbkVar, 0L).equals(zzblVar.e(i, zzbkVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < b(); i2++) {
                if (!d(i2, zzbjVar, true).equals(zzblVar.d(i2, zzbjVar2, true))) {
                    return false;
                }
            }
            int g = g(true);
            if (g == zzblVar.g(true) && (h = h(true)) == zzblVar.h(true)) {
                while (g != h) {
                    int j = j(g, 0, true);
                    if (j != zzblVar.j(g, 0, true)) {
                        return false;
                    }
                    g = j;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        if (o()) {
            return -1;
        }
        return 0;
    }

    public int h(boolean z) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        zzbk zzbkVar = new zzbk();
        zzbj zzbjVar = new zzbj();
        int c = c() + 217;
        int i2 = 0;
        while (true) {
            i = c * 31;
            if (i2 >= c()) {
                break;
            }
            c = i + e(i2, zzbkVar, 0L).hashCode();
            i2++;
        }
        int b = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            b = (b * 31) + d(i3, zzbjVar, true).hashCode();
        }
        int g = g(true);
        while (g != -1) {
            b = (b * 31) + g;
            g = j(g, 0, true);
        }
        return b;
    }

    public final int i(int i, zzbj zzbjVar, zzbk zzbkVar, int i2, boolean z) {
        int i3 = d(i, zzbjVar, false).c;
        if (e(i3, zzbkVar, 0L).n == i) {
            int j = j(i3, i2, z);
            if (j == -1) {
                return -1;
            }
            return e(j, zzbkVar, 0L).m;
        }
        return i + 1;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == h(z)) {
                        return g(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public int k(int i, int i2, boolean z) {
        if (i == g(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair l(zzbk zzbkVar, zzbj zzbjVar, int i, long j) {
        Pair m = m(zzbkVar, zzbjVar, i, j, 0L);
        m.getClass();
        return m;
    }

    @InterfaceC11300zs1
    public final Pair m(zzbk zzbkVar, zzbj zzbjVar, int i, long j, long j2) {
        zzdc.a(i, 0, c());
        e(i, zzbkVar, j2);
        if (j == C10323vs.b) {
            long j3 = zzbkVar.k;
            j = 0;
        }
        int i2 = zzbkVar.m;
        d(i2, zzbjVar, false);
        while (i2 < zzbkVar.n) {
            long j4 = zzbjVar.e;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = d(i4, zzbjVar, false).e;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        d(i2, zzbjVar, true);
        long j6 = zzbjVar.e;
        long j7 = zzbjVar.d;
        if (j7 != C10323vs.b) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = zzbjVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbj n(Object obj, zzbj zzbjVar) {
        return d(a(obj), zzbjVar, true);
    }

    public final boolean o() {
        if (c() == 0) {
            return true;
        }
        return false;
    }
}
