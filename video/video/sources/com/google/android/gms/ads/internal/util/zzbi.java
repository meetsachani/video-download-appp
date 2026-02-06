package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzaqd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbi implements zzapy {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzbk b;

    public zzbi(zzbo zzboVar, String str, zzbk zzbkVar) {
        this.a = str;
        this.b = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapy
    public final void a(zzaqd zzaqdVar) {
        int i = zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Failed to load URL: " + this.a + "\n" + zzaqdVar.toString());
        this.b.b(null);
    }
}
