package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzazj {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final zzazy e;
    public final zzbag f;
    public int n;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;

    /* renamed from: o  reason: collision with root package name */
    public String f222o = "";
    public String p = "";
    public String q = "";

    public zzazj(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new zzazy(i4);
        this.f = new zzbag(i5, i6, i7);
    }

    public static final String n(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    @InterfaceC5056aJ2
    public final int a(int i, int i2) {
        return this.d ? this.b : (i * this.a) + (i2 * this.b);
    }

    @InterfaceC5056aJ2
    public final int b() {
        return this.k;
    }

    public final String c() {
        return this.f222o;
    }

    public final String d() {
        return this.q;
    }

    public final void e() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzazj) obj).f222o;
        if (str == null || !str.equals(this.f222o)) {
            return false;
        }
        return true;
    }

    public final void f() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final void g(int i) {
        this.l = i;
    }

    public final void h(String str, boolean z, float f, float f2, float f3, float f4) {
        m(str, z, f, f2, f3, f4);
    }

    public final int hashCode() {
        return this.f222o.hashCode();
    }

    public final void i(String str, boolean z, float f, float f2, float f3, float f4) {
        m(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            try {
                if (this.m < 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("ActivityContent: negative number of WebViews.");
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.g) {
            try {
                int a = a(this.k, this.l);
                if (a > this.n) {
                    this.n = a;
                    if (!com.google.android.gms.ads.internal.zzv.t().j().G()) {
                        zzazy zzazyVar = this.e;
                        this.f222o = zzazyVar.a(this.h);
                        this.p = zzazyVar.a(this.i);
                    }
                    if (!com.google.android.gms.ads.internal.zzv.t().j().J()) {
                        this.q = this.f.a(this.i, this.j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.g) {
            try {
                int a = a(this.k, this.l);
                if (a > this.n) {
                    this.n = a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.g) {
            if (this.m == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void m(@InterfaceC11300zs1 String str, boolean z, float f, float f2, float f3, float f4) {
        ArrayList arrayList;
        if (str != null) {
            if (str.length() >= this.c) {
                synchronized (this.g) {
                    try {
                        this.h.add(str);
                        this.k += str.length();
                        if (z) {
                            this.i.add(str);
                            this.j.add(new zzazu(f, f2, f3, f4, arrayList.size() - 1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.h;
        int i = this.l;
        int i2 = this.n;
        int i3 = this.k;
        String n = n(arrayList, 100);
        String n2 = n(this.i, 100);
        String str = this.f222o;
        String str2 = this.p;
        String str3 = this.q;
        return "ActivityContent fetchId: " + i + " score:" + i2 + " total_length:" + i3 + "\n text: " + n + "\n viewableText" + n2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }
}
