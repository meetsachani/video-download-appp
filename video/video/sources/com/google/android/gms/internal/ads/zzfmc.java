package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfmc {
    @SuppressLint({"StaticFieldLeak"})
    public static final zzfmc b = new zzfmc();
    public Context a;

    private zzfmc() {
    }

    public static zzfmc b() {
        return b;
    }

    public final Context a() {
        return this.a;
    }

    public final void c(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.a = context2;
    }
}
