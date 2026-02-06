package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzche {
    public final VersionInfoParcel a;
    public final Context b;
    public final long c;
    public final WeakReference d;

    public /* synthetic */ zzche(zzchc zzchcVar, zzchd zzchdVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j;
        versionInfoParcel = zzchcVar.a;
        this.a = versionInfoParcel;
        context = zzchcVar.b;
        this.b = context;
        weakReference = zzchcVar.d;
        this.d = weakReference;
        j = zzchcVar.c;
        this.c = j;
    }

    public final long a() {
        return this.c;
    }

    public final Context b() {
        return this.b;
    }

    public final com.google.android.gms.ads.internal.zzk c() {
        return new com.google.android.gms.ads.internal.zzk(this.b, this.a);
    }

    public final zzbfo d() {
        return new zzbfo(this.b);
    }

    public final VersionInfoParcel e() {
        return this.a;
    }

    public final String f() {
        return com.google.android.gms.ads.internal.zzv.v().I(this.b, this.a.X);
    }

    public final WeakReference g() {
        return this.d;
    }
}
