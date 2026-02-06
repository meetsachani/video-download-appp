package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfrx extends zzgbm {
    public Object c1;

    public zzfrx(Object obj, Runnable runnable) {
        this.c1 = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String j() {
        Object obj = this.c1;
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final void k() {
        this.c1 = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final boolean l(Object obj) {
        return super.l(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final boolean m(Throwable th) {
        return super.m(th);
    }
}
