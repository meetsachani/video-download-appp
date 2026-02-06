package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzfdw implements zzcvw {
    public final HashSet X = new HashSet();
    public final Context Y;
    public final zzbzr Z;

    public zzfdw(Context context, zzbzr zzbzrVar) {
        this.Y = context;
        this.Z = zzbzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final synchronized void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.X != 3) {
            this.Z.k(this.X);
        }
    }

    public final Bundle a() {
        return this.Z.m(this.Y, this);
    }

    public final synchronized void b(HashSet hashSet) {
        HashSet hashSet2 = this.X;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }
}
