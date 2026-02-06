package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzchi implements zzhfv {
    public final zzche a;

    public zzchi(zzche zzcheVar) {
        this.a = zzcheVar;
    }

    public static Context c(zzche zzcheVar) {
        Context b = zzcheVar.b();
        zzhgd.b(b);
        return b;
    }

    public final Context a() {
        return c(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        return c(this.a);
    }
}
