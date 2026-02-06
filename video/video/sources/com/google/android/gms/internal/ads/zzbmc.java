package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* loaded from: classes2.dex */
public final class zzbmc implements AdapterStatus {
    public final AdapterStatus.State a;
    public final String b;
    public final int c;

    public zzbmc(AdapterStatus.State state, String str, int i) {
        this.a = state;
        this.b = str;
        this.c = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State b() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.b;
    }
}
