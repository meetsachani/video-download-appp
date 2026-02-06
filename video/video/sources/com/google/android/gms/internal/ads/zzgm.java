package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzgm implements zzgf {
    public final Context a;
    public final zzgf b;

    public zzgm(Context context) {
        zzgo zzgoVar = new zzgo();
        this.a = context.getApplicationContext();
        this.b = zzgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final /* bridge */ /* synthetic */ zzgg a() {
        return new zzgn(this.a, this.b.a());
    }
}
