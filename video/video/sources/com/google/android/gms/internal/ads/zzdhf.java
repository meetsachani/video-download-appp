package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdhf implements zzbjw {
    public final WeakReference a;
    public final WeakReference b;

    public /* synthetic */ zzdhf(zzdhi zzdhiVar, View view, zzdhh zzdhhVar) {
        this.a = new WeakReference(zzdhiVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fd)).booleanValue()) {
            this.b = new WeakReference(view);
        } else {
            this.b = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        zzdhi zzdhiVar = (zzdhi) this.a.get();
        if (zzdhiVar != null) {
            zzdhi.D(zzdhiVar).a();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fd)).booleanValue()) {
                zzdhi.H(zzdhiVar, (View) this.b.get());
            }
        }
    }
}
