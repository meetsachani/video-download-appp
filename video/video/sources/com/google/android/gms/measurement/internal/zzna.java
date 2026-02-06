package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes3.dex */
public final class zzna {
    public final Context a;

    @InterfaceC5056aJ2
    public zzna(Context context) {
        Preconditions.r(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.r(applicationContext);
        this.a = applicationContext;
    }
}
