package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfla {
    public boolean a;

    public final void a(Context context) {
        zzfmx.c(context, "Application Context cannot be null");
        if (!this.a) {
            this.a = true;
            zzfmf.c().d(context);
            zzflw.i().d(context);
            zzfms.b(context);
            zzfmt.d(context);
            zzfmw.a(context);
            zzfmc.b().c(context);
            zzflv.b().d(context);
            zzfmh.a().e(context);
        }
    }

    public final boolean b() {
        return this.a;
    }
}
