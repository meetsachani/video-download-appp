package com.google.android.gms.tasks;

/* loaded from: classes3.dex */
final class zza implements OnSuccessListener {
    public final /* synthetic */ OnTokenCanceledListener a;

    public zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.a = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void r1 = (Void) obj;
        this.a.b();
    }
}
