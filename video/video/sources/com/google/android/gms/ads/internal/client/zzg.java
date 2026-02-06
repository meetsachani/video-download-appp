package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* loaded from: classes2.dex */
public final class zzg extends zzbj {
    public final AdListener X;

    public zzg(AdListener adListener) {
        this.X = adListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void E(int i) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void G(zze zzeVar) {
        AdListener adListener = this.X;
        if (adListener != null) {
            adListener.g(zzeVar.B0());
        }
    }

    public final AdListener W7() {
        return this.X;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void c() {
        AdListener adListener = this.X;
        if (adListener != null) {
            adListener.y();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void f() {
        AdListener adListener = this.X;
        if (adListener != null) {
            adListener.e();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void g() {
        AdListener adListener = this.X;
        if (adListener != null) {
            adListener.h();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void h() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void i() {
        AdListener adListener = this.X;
        if (adListener != null) {
            adListener.k();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void j() {
        AdListener adListener = this.X;
        if (adListener != null) {
            adListener.n();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void k() {
        AdListener adListener = this.X;
        if (adListener != null) {
            adListener.q();
        }
    }
}
