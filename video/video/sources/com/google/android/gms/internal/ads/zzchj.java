package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzchj implements zzhfv {
    public final zzche a;

    public zzchj(zzche zzcheVar) {
        this.a = zzcheVar;
    }

    public static WeakReference c(zzche zzcheVar) {
        WeakReference g = zzcheVar.g();
        zzhgd.b(g);
        return g;
    }

    public final WeakReference a() {
        return c(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        return c(this.a);
    }
}
