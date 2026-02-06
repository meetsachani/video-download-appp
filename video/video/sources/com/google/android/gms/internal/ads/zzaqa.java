package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaqa {
    @InterfaceC11300zs1
    public final Object a;
    @InterfaceC11300zs1
    public final zzapd b;
    @InterfaceC11300zs1
    public final zzaqd c;
    public boolean d;

    public zzaqa(zzaqd zzaqdVar) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = zzaqdVar;
    }

    public static zzaqa a(zzaqd zzaqdVar) {
        return new zzaqa(zzaqdVar);
    }

    public static zzaqa b(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 zzapd zzapdVar) {
        return new zzaqa(obj, zzapdVar);
    }

    public final boolean c() {
        return this.c == null;
    }

    public zzaqa(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 zzapd zzapdVar) {
        this.d = false;
        this.a = obj;
        this.b = zzapdVar;
        this.c = null;
    }
}
