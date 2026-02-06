package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzeri implements zzetu {
    public final Boolean a;

    public zzeri(Boolean bool) {
        this.a = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Boolean bool = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (bool != null) {
            zzcuvVar.a.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
