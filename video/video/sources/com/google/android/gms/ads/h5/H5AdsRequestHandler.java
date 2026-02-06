package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzblc;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class H5AdsRequestHandler {
    public final zzblc a;

    public H5AdsRequestHandler(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 OnH5AdsEventListener onH5AdsEventListener) {
        this.a = new zzblc(context, onH5AdsEventListener);
    }

    public void a() {
        this.a.a();
    }

    public boolean b(@InterfaceC5670cr1 String str) {
        return this.a.b(str);
    }

    public boolean c(@InterfaceC5670cr1 String str) {
        return zzblc.c(str);
    }
}
