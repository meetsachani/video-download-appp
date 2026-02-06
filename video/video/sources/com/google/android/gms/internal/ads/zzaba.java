package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaba {
    public final Context a;
    public final zzabl b;
    public zzby c;
    public zzca d;
    public boolean g;
    public boolean i;
    public final List e = zzfyc.F();
    public final zzbv f = zzbv.a;
    public zzdg h = zzdg.a;

    public zzaba(Context context, zzabl zzablVar) {
        this.a = context.getApplicationContext();
        this.b = zzablVar;
    }

    public final zzaba e(zzdg zzdgVar) {
        this.h = zzdgVar;
        return this;
    }

    public final zzaba f(boolean z) {
        this.g = true;
        return this;
    }

    public final zzabh g() {
        zzdc.f(!this.i);
        if (this.d == null) {
            if (this.c == null) {
                this.c = new zzabd(false);
            }
            this.d = new zzabe(this.c);
        }
        zzabh zzabhVar = new zzabh(this, null);
        this.i = true;
        return zzabhVar;
    }
}
