package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdnq implements zzbjw {
    public final WeakReference a;
    public final String b;
    public final zzbjw c;
    public final /* synthetic */ zzdns d;

    public /* synthetic */ zzdnq(zzdns zzdnsVar, WeakReference weakReference, String str, zzbjw zzbjwVar, zzdnr zzdnrVar) {
        this.d = zzdnsVar;
        this.a = weakReference;
        this.b = str;
        this.c = zzbjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        Object obj2 = this.a.get();
        if (obj2 == null) {
            this.d.n(this.b, this);
        } else {
            this.c.a(obj2, map);
        }
    }
}
