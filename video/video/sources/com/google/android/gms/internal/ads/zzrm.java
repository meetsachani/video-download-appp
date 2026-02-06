package com.google.android.gms.internal.ads;

import o.C2936Fe1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzrm implements zzqf {
    public final /* synthetic */ zzro a;

    public /* synthetic */ zzrm(zzro zzroVar, zzrn zzrnVar) {
        this.a = zzroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void a(Exception exc) {
        zzdx.d(C2936Fe1.f3, "Audio sink error", exc);
        zzro.j1(this.a).n(exc);
    }
}
