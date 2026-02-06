package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbjn implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (zzcfbVar.O() != null) {
            zzcfbVar.O().a();
        }
        com.google.android.gms.ads.internal.overlay.zzm J = zzcfbVar.J();
        if (J != null) {
            J.b();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm K = zzcfbVar.K();
        if (K != null) {
            K.b();
            return;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("A GMSG tried to close something that wasn't an overlay.");
    }
}
