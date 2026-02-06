package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaas {
    public final Context a;
    public boolean b;
    public zztl c = zztl.a;
    public final zzsx d;
    @InterfaceC11300zs1
    public Handler e;
    @InterfaceC11300zs1
    public zzacc f;

    public zzaas(Context context) {
        this.a = context;
        this.d = new zzsr(context, null, null);
    }

    public final zzaas e(@InterfaceC11300zs1 Handler handler) {
        this.e = handler;
        return this;
    }

    public final zzaas f(@InterfaceC11300zs1 zzacc zzaccVar) {
        this.f = zzaccVar;
        return this;
    }

    public final zzaas g(zztl zztlVar) {
        this.c = zztlVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r3.f != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaau h() {
        boolean z;
        zzdc.f(!this.b);
        Handler handler = this.e;
        if (handler != null || this.f != null) {
            z = false;
            if (handler != null) {
            }
            zzdc.f(z);
            this.b = true;
            return new zzaau(this);
        }
        z = true;
        zzdc.f(z);
        this.b = true;
        return new zzaau(this);
    }
}
