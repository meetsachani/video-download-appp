package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbvq implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zzbvs b;

    public zzbvq(zzbvs zzbvsVar, Context context) {
        this.a = context;
        this.b = zzbvsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbvp a;
        WeakHashMap weakHashMap2;
        zzbvs zzbvsVar = this.b;
        weakHashMap = zzbvsVar.a;
        Context context = this.a;
        zzbvr zzbvrVar = (zzbvr) weakHashMap.get(context);
        if (zzbvrVar != null) {
            if (zzbvrVar.a + ((Long) zzbek.d.e()).longValue() >= com.google.android.gms.ads.internal.zzv.d().a()) {
                a = new zzbvo(context, zzbvrVar.b).a();
                weakHashMap2 = zzbvsVar.a;
                weakHashMap2.put(context, new zzbvr(zzbvsVar, a));
                return a;
            }
        }
        a = new zzbvo(context).a();
        weakHashMap2 = zzbvsVar.a;
        weakHashMap2.put(context, new zzbvr(zzbvsVar, a));
        return a;
    }
}
