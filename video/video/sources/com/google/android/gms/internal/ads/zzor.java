package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import o.HS1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzor implements zzpa {
    public static final zzfvu h = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzop
        @Override // com.google.android.gms.internal.ads.zzfvu
        public final Object a() {
            String n;
            n = zzor.n();
            return n;
        }
    };
    public static final Random i = new Random();
    public final zzbk a;
    public final zzbj b;
    public final HashMap c;
    public zzoz d;
    public zzbl e;
    @InterfaceC11300zs1
    public String f;
    public long g;

    public zzor() {
        throw null;
    }

    public static String n() {
        byte[] bArr = new byte[12];
        i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized void a(zzmk zzmkVar, int i2) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        try {
            if (this.d != null) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    zzoq zzoqVar = (zzoq) it.next();
                    if (zzoqVar.k(zzmkVar)) {
                        it.remove();
                        z = zzoqVar.e;
                        if (z) {
                            str = zzoqVar.a;
                            boolean equals = str.equals(this.f);
                            boolean z3 = false;
                            if (i2 == 0 && equals) {
                                z2 = zzoqVar.f;
                                if (z2) {
                                    z3 = true;
                                }
                            }
                            if (equals) {
                                o(zzoqVar);
                            }
                            zzoz zzozVar = this.d;
                            str2 = zzoqVar.a;
                            zzozVar.f(zzmkVar, str2, z3);
                        }
                    }
                }
                p(zzmkVar);
            } else {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized void b(zzmk zzmkVar) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        long j;
        int i2;
        String unused;
        String unused2;
        try {
            if (this.d != null) {
                zzbl zzblVar = zzmkVar.b;
                if (!zzblVar.o()) {
                    zzvb zzvbVar = zzmkVar.d;
                    if (zzvbVar != null) {
                        if (zzvbVar.d >= l()) {
                            zzoq zzoqVar = (zzoq) this.c.get(this.f);
                            if (zzoqVar != null) {
                                j = zzoqVar.c;
                                if (j == -1) {
                                    i2 = zzoqVar.b;
                                    if (i2 == zzmkVar.c) {
                                    }
                                }
                            }
                        }
                    }
                    int i3 = zzmkVar.c;
                    zzoq m = m(i3, zzvbVar);
                    if (this.f == null) {
                        str3 = m.a;
                        this.f = str3;
                    }
                    if (zzvbVar != null && zzvbVar.b()) {
                        Object obj = zzvbVar.a;
                        long j2 = zzvbVar.d;
                        int i4 = zzvbVar.b;
                        zzoq m2 = m(i3, new zzvb(obj, j2, i4));
                        z3 = m2.e;
                        if (!z3) {
                            m2.e = true;
                            zzbj zzbjVar = this.b;
                            zzblVar.n(obj, zzbjVar);
                            zzbjVar.g(i4);
                            Math.max(0L, zzeu.Q(0L) + zzeu.Q(0L));
                            unused = m2.a;
                        }
                    }
                    z = m.e;
                    if (!z) {
                        m.e = true;
                        unused2 = m.a;
                    }
                    str = m.a;
                    if (str.equals(this.f)) {
                        z2 = m.f;
                        if (!z2) {
                            m.f = true;
                            zzoz zzozVar = this.d;
                            str2 = m.a;
                            zzozVar.a(zzmkVar, str2);
                            return;
                        }
                    }
                }
                return;
            }
            throw null;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized void c(zzmk zzmkVar) {
        boolean z;
        String str;
        String str2;
        try {
            if (this.d != null) {
                zzbl zzblVar = this.e;
                this.e = zzmkVar.b;
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    zzoq zzoqVar = (zzoq) it.next();
                    if (zzoqVar.l(zzblVar, this.e) && !zzoqVar.k(zzmkVar)) {
                    }
                    it.remove();
                    z = zzoqVar.e;
                    if (z) {
                        str = zzoqVar.a;
                        if (str.equals(this.f)) {
                            o(zzoqVar);
                        }
                        zzoz zzozVar = this.d;
                        str2 = zzoqVar.a;
                        zzozVar.f(zzmkVar, str2, false);
                    }
                }
                p(zzmkVar);
            } else {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    @InterfaceC11300zs1
    public final synchronized String d() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized void e(zzmk zzmkVar) {
        boolean z;
        zzoz zzozVar;
        String str;
        try {
            String str2 = this.f;
            if (str2 != null) {
                zzoq zzoqVar = (zzoq) this.c.get(str2);
                if (zzoqVar != null) {
                    o(zzoqVar);
                } else {
                    throw null;
                }
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                zzoq zzoqVar2 = (zzoq) it.next();
                it.remove();
                z = zzoqVar2.e;
                if (z && (zzozVar = this.d) != null) {
                    str = zzoqVar2.a;
                    zzozVar.f(zzmkVar, str, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void f(zzoz zzozVar) {
        this.d = zzozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized String g(zzbl zzblVar, zzvb zzvbVar) {
        String str;
        str = m(zzblVar.n(zzvbVar.a, this.b).c, zzvbVar).a;
        return str;
    }

    public final long l() {
        long j;
        long j2;
        zzoq zzoqVar = (zzoq) this.c.get(this.f);
        if (zzoqVar != null) {
            j = zzoqVar.c;
            if (j != -1) {
                j2 = zzoqVar.c;
                return j2;
            }
        }
        return this.g + 1;
    }

    public final zzoq m(int i2, @InterfaceC11300zs1 zzvb zzvbVar) {
        long j;
        int i3;
        zzvb zzvbVar2;
        zzvb zzvbVar3;
        HashMap hashMap = this.c;
        long j2 = Long.MAX_VALUE;
        zzoq zzoqVar = null;
        for (zzoq zzoqVar2 : hashMap.values()) {
            zzoqVar2.g(i2, zzvbVar);
            if (zzoqVar2.j(i2, zzvbVar)) {
                j = zzoqVar2.c;
                if (j != -1 && j >= j2) {
                    if (i3 == 0) {
                        String str = zzeu.a;
                        zzvbVar2 = zzoqVar.d;
                        if (zzvbVar2 != null) {
                            zzvbVar3 = zzoqVar2.d;
                            if (zzvbVar3 != null) {
                                zzoqVar = zzoqVar2;
                            }
                        }
                    }
                } else {
                    zzoqVar = zzoqVar2;
                    j2 = j;
                }
            }
        }
        if (zzoqVar == null) {
            String n = n();
            zzoq zzoqVar3 = new zzoq(this, n, i2, zzvbVar);
            hashMap.put(n, zzoqVar3);
            return zzoqVar3;
        }
        return zzoqVar;
    }

    public final void o(zzoq zzoqVar) {
        long j;
        long j2;
        j = zzoqVar.c;
        if (j != -1) {
            j2 = zzoqVar.c;
            this.g = j2;
        }
        this.f = null;
    }

    @HS1({ServiceSpecificExtraArgs.CastExtraArgs.a})
    public final void p(zzmk zzmkVar) {
        String str;
        long j;
        zzvb zzvbVar;
        zzvb zzvbVar2;
        zzvb zzvbVar3;
        String unused;
        String unused2;
        if (zzmkVar.b.o()) {
            String str2 = this.f;
            if (str2 != null) {
                zzoq zzoqVar = (zzoq) this.c.get(str2);
                zzoqVar.getClass();
                o(zzoqVar);
                return;
            }
            return;
        }
        zzoq zzoqVar2 = (zzoq) this.c.get(this.f);
        int i2 = zzmkVar.c;
        zzvb zzvbVar4 = zzmkVar.d;
        zzoq m = m(i2, zzvbVar4);
        str = m.a;
        this.f = str;
        b(zzmkVar);
        if (zzvbVar4 != null && zzvbVar4.b()) {
            if (zzoqVar2 != null) {
                long j2 = zzvbVar4.d;
                j = zzoqVar2.c;
                if (j == j2) {
                    zzvbVar = zzoqVar2.d;
                    if (zzvbVar != null) {
                        zzvbVar2 = zzoqVar2.d;
                        if (zzvbVar2.b == zzvbVar4.b) {
                            zzvbVar3 = zzoqVar2.d;
                            if (zzvbVar3.c == zzvbVar4.c) {
                                return;
                            }
                        }
                    }
                }
            }
            unused = m(i2, new zzvb(zzvbVar4.a, zzvbVar4.d)).a;
            unused2 = m.a;
        }
    }

    public zzor(zzfvu zzfvuVar) {
        this.a = new zzbk();
        this.b = new zzbj();
        this.c = new HashMap();
        this.e = zzbl.a;
        this.g = -1L;
    }
}
