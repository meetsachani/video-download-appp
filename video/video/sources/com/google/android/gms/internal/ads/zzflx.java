package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzflx {
    public static final zzflx c = new zzflx();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    private zzflx() {
    }

    public static zzflx a() {
        return c;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.b);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.a);
    }

    public final void d(zzflf zzflfVar) {
        this.a.add(zzflfVar);
    }

    public final void e(zzflf zzflfVar) {
        ArrayList arrayList = this.a;
        boolean g = g();
        arrayList.remove(zzflfVar);
        this.b.remove(zzflfVar);
        if (g && !g()) {
            zzfmf.c().g();
        }
    }

    public final void f(zzflf zzflfVar) {
        ArrayList arrayList = this.b;
        boolean g = g();
        arrayList.add(zzflfVar);
        if (!g) {
            zzfmf.c().f();
        }
    }

    public final boolean g() {
        if (this.b.size() > 0) {
            return true;
        }
        return false;
    }
}
