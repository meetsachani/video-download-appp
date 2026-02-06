package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdhg implements zzbjw {
    public final WeakReference a;
    public final zzfjr b;
    public final com.google.android.gms.ads.internal.util.client.zzv c;
    public final zzfhn d;

    public /* synthetic */ zzdhg(zzdhi zzdhiVar, zzfjr zzfjrVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfhn zzfhnVar, zzdhh zzdhhVar) {
        this.a = new WeakReference(zzdhiVar);
        this.b = zzfjrVar;
        this.c = zzvVar;
        this.d = zzfhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        zzcyd zzcydVar;
        zzdhi zzdhiVar = (zzdhi) this.a.get();
        String str = (String) map.get("u");
        if (zzdhiVar != null && !TextUtils.isEmpty(str)) {
            zzfjr zzfjrVar = this.b;
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.c;
            zzfhn zzfhnVar = this.d;
            zzcydVar = zzdhiVar.D;
            zzfjrVar.d(str, zzvVar, zzfhnVar, zzcydVar);
        }
    }
}
