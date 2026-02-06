package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* loaded from: classes2.dex */
public final class zzazi extends com.google.android.gms.ads.internal.client.zzck {
    public final AppEventListener X;

    public zzazi(AppEventListener appEventListener) {
        this.X = appEventListener;
    }

    public final AppEventListener X7() {
        return this.X;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void n1(String str, String str2) {
        this.X.u(str, str2);
    }
}
