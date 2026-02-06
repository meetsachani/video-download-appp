package com.google.android.gms.internal.ads;

import android.view.View;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfma {
    public final zzfno a;
    public final String b;
    public final zzfli c;
    public final String d = "Ad overlay";

    public zzfma(View view, zzfli zzfliVar, @InterfaceC11300zs1 String str) {
        this.a = new zzfno(view);
        this.b = view.getClass().getCanonicalName();
        this.c = zzfliVar;
    }

    public final zzfli a() {
        return this.c;
    }

    public final zzfno b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
