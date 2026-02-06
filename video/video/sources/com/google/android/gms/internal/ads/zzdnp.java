package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdnp implements Callable {
    public final com.google.android.gms.ads.internal.zza a;
    public final Context b;
    public final zzdsd c;
    public final zzebt d;
    public final Executor e;
    public final zzavl f;
    public final VersionInfoParcel g;
    public final zzfjr h;
    public final zzece i;
    public final zzfct j;

    public zzdnp(Context context, Executor executor, zzavl zzavlVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcfo zzcfoVar, zzebt zzebtVar, zzfjr zzfjrVar, zzdsd zzdsdVar, zzece zzeceVar, zzfct zzfctVar) {
        this.b = context;
        this.e = executor;
        this.f = zzavlVar;
        this.g = versionInfoParcel;
        this.a = zzaVar;
        this.d = zzebtVar;
        this.h = zzfjrVar;
        this.c = zzdsdVar;
        this.i = zzeceVar;
        this.j = zzfctVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdns zzdnsVar = new zzdns(this);
        zzdnsVar.k();
        return zzdnsVar;
    }
}
