package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeyq implements zzfex {
    public final zzezk a;
    public final zzezm b;
    public final com.google.android.gms.ads.internal.client.zzm c;
    public final String d;
    public final Executor e;
    public final com.google.android.gms.ads.internal.client.zzx f;
    public final zzfem g;

    public zzeyq(zzezk zzezkVar, zzezm zzezmVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfem zzfemVar) {
        this.a = zzezkVar;
        this.b = zzezmVar;
        this.c = zzmVar;
        this.d = str;
        this.e = executor;
        this.f = zzxVar;
        this.g = zzfemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfex
    public final zzfem a() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzfex
    public final Executor b() {
        return this.e;
    }
}
