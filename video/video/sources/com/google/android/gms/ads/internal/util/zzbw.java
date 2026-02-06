package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfjj;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbw extends zzb {
    public final com.google.android.gms.ads.internal.util.client.zzu c;
    public final String d;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.util.client.zzv e;

    public zzbw(Context context, String str, String str2, @InterfaceC11300zs1 zzfjj zzfjjVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.c = new com.google.android.gms.ads.internal.util.client.zzu(com.google.android.gms.ads.internal.zzv.v().I(context, str));
        this.d = str2;
        this.e = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void a() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.e;
        if (zzvVar != null) {
            new zzfji(zzvVar.b(), this.c, zzcaa.e, null).d(this.d);
            return;
        }
        this.c.w(this.d);
    }
}
