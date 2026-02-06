package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC10571ws1;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzegf {
    @InterfaceC8710pF0("this")
    public final zzgds c;
    @InterfaceC8710pF0("this")
    public zzegv f;
    public final String h;
    public final int i;
    public final zzegu j;
    public zzfbu k;
    @InterfaceC8710pF0("this")
    public final Map a = new HashMap();
    @InterfaceC8710pF0("this")
    public final List b = new ArrayList();
    @InterfaceC8710pF0("this")
    public final List d = new ArrayList();
    @InterfaceC8710pF0("this")
    public final Set e = new HashSet();
    @InterfaceC8710pF0("this")
    public int g = Integer.MAX_VALUE;
    @InterfaceC8710pF0("this")
    public boolean l = false;

    public zzegf(zzfcg zzfcgVar, zzegu zzeguVar, zzgds zzgdsVar) {
        this.i = zzfcgVar.b.b.r;
        this.j = zzeguVar;
        this.c = zzgdsVar;
        this.h = zzehb.d(zzfcgVar);
        List list = zzfcgVar.b.a;
        for (int i = 0; i < list.size(); i++) {
            this.a.put((zzfbu) list.get(i), Integer.valueOf(i));
        }
        this.b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r2.v0 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r6.l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6.d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        return (com.google.android.gms.internal.ads.zzfbu) r1.remove(r0);
     */
    @InterfaceC10571ws1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfbu a() {
        try {
            if (i()) {
                int i = 0;
                while (true) {
                    List list = this.b;
                    if (i >= list.size()) {
                        break;
                    }
                    zzfbu zzfbuVar = (zzfbu) list.get(i);
                    String str = zzfbuVar.t0;
                    Set set = this.e;
                    if (!set.contains(str)) {
                        break;
                    }
                    i++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Throwable th, zzfbu zzfbuVar) {
        this.l = false;
        this.d.remove(zzfbuVar);
        this.e.remove(zzfbuVar.t0);
        if (!d() && !h()) {
            e();
        }
    }

    public final synchronized void c(zzegv zzegvVar, zzfbu zzfbuVar) {
        int i;
        this.l = false;
        this.d.remove(zzfbuVar);
        if (d()) {
            zzegvVar.r();
            return;
        }
        Integer num = (Integer) this.a.get(zzfbuVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > this.g) {
            this.j.m(zzfbuVar);
            return;
        }
        if (this.f != null) {
            this.j.m(this.k);
        }
        this.g = i;
        this.f = zzegvVar;
        this.k = zzfbuVar;
        if (!h()) {
            e();
        }
    }

    public final synchronized boolean d() {
        return this.c.isDone();
    }

    public final synchronized void e() {
        this.j.i(this.k);
        zzegv zzegvVar = this.f;
        if (zzegvVar != null) {
            this.c.l(zzegvVar);
        } else {
            this.c.m(new zzegy(3, this.h));
        }
    }

    public final synchronized boolean f(boolean z) {
        int i;
        try {
            for (zzfbu zzfbuVar : this.b) {
                Integer num = (Integer) this.a.get(zzfbuVar);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                if (z || !this.e.contains(zzfbuVar.t0)) {
                    int i2 = this.g;
                    if (i < i2) {
                        return true;
                    }
                    if (i > i2) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g() {
        int i;
        try {
            for (zzfbu zzfbuVar : this.d) {
                Integer num = (Integer) this.a.get(zzfbuVar);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                if (i < this.g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean i() {
        if (this.l) {
            return false;
        }
        List list = this.b;
        if (!list.isEmpty() && ((zzfbu) list.get(0)).v0 && !this.d.isEmpty()) {
            return false;
        }
        if (!d()) {
            List list2 = this.d;
            if (list2.size() < this.i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
