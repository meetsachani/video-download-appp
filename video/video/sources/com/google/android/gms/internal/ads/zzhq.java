package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class zzhq extends zzbl {
    public final int b;
    public final zzww c;

    public zzhq(boolean z, zzww zzwwVar) {
        this.c = zzwwVar;
        this.b = zzwwVar.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int a(Object obj) {
        int a;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int p = p(obj2);
            if (p != -1 && (a = u(p).a(obj3)) != -1) {
                return s(p) + a;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbj d(int i, zzbj zzbjVar, boolean z) {
        int q = q(i);
        int t = t(q);
        u(q).d(i - s(q), zzbjVar, z);
        zzbjVar.c += t;
        if (z) {
            Object v = v(q);
            Object obj = zzbjVar.b;
            obj.getClass();
            zzbjVar.b = Pair.create(v, obj);
        }
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbk e(int i, zzbk zzbkVar, long j) {
        int r = r(i);
        int t = t(r);
        int s = s(r);
        u(r).e(i - t, zzbkVar, j);
        Object v = v(r);
        if (!zzbk.f227o.equals(zzbkVar.a)) {
            v = Pair.create(v, zzbkVar.a);
        }
        zzbkVar.a = v;
        zzbkVar.m += s;
        zzbkVar.n += s;
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final Object f(int i) {
        int q = q(i);
        return Pair.create(v(q), u(q).f(i - s(q)));
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int g(boolean z) {
        int i;
        if (this.b == 0) {
            return -1;
        }
        if (z) {
            i = this.c.a();
        } else {
            i = 0;
        }
        while (u(i).o()) {
            i = w(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return t(i) + u(i).g(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int h(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            i = this.c.b();
        } else {
            i = i2 - 1;
        }
        while (u(i).o()) {
            i = x(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return t(i) + u(i).h(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int j(int i, int i2, boolean z) {
        int i3;
        int r = r(i);
        int t = t(r);
        zzbl u = u(r);
        int i4 = i - t;
        if (i2 == 2) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        int j = u.j(i4, i3, z);
        if (j != -1) {
            return t + j;
        }
        int w = w(r, z);
        while (w != -1 && u(w).o()) {
            w = w(w, z);
        }
        if (w != -1) {
            return t(w) + u(w).g(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return g(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int k(int i, int i2, boolean z) {
        int r = r(i);
        int t = t(r);
        int k = u(r).k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = x(r, false);
        while (x != -1 && u(x).o()) {
            x = x(x, false);
        }
        if (x == -1) {
            return -1;
        }
        return t(x) + u(x).h(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbj n(Object obj, zzbj zzbjVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = p(obj2);
        int t = t(p);
        u(p).n(obj3, zzbjVar);
        zzbjVar.c += t;
        zzbjVar.b = obj;
        return zzbjVar;
    }

    public abstract int p(Object obj);

    public abstract int q(int i);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract int t(int i);

    public abstract zzbl u(int i);

    public abstract Object v(int i);

    public final int w(int i, boolean z) {
        if (z) {
            return this.c.d(i);
        }
        if (i >= this.b - 1) {
            return -1;
        }
        return i + 1;
    }

    public final int x(int i, boolean z) {
        if (z) {
            return this.c.e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }
}
