package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzdnl implements zzgcu {
    public final /* synthetic */ String a = "sendMessageToNativeJs";
    public final /* synthetic */ Map b;

    public zzdnl(zzdns zzdnsVar, String str, Map map) {
        this.b = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((zzcfb) obj).q(this.a, this.b);
    }
}
