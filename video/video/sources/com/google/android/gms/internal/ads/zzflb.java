package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzflb {
    public static zzflb a(zzflc zzflcVar, zzfld zzfldVar) {
        zzfmx.a();
        return new zzflf(zzflcVar, zzfldVar, UUID.randomUUID().toString());
    }

    public abstract void b(View view, zzfli zzfliVar, @InterfaceC11300zs1 String str);

    public abstract void c();

    public abstract void d(@InterfaceC11300zs1 View view);

    public abstract void e();
}
