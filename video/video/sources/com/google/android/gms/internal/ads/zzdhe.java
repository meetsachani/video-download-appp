package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdhe implements zzbjw {
    public final WeakReference a;

    public /* synthetic */ zzdhe(zzdhi zzdhiVar, zzdhh zzdhhVar) {
        this.a = new WeakReference(zzdhiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        zzcvr zzcvrVar;
        zzddw zzddwVar;
        zzddw zzddwVar2;
        zzdhi zzdhiVar = (zzdhi) this.a.get();
        if (zzdhiVar != null) {
            zzcvrVar = zzdhiVar.h;
            zzcvrVar.y();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bb)).booleanValue()) {
                zzddwVar = zzdhiVar.i;
                zzddwVar.X0();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzddwVar2 = zzdhiVar.i;
                    zzddwVar2.t();
                }
            }
        }
    }
}
