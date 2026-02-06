package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzetr implements zzetu {
    public final Bundle a;

    public zzetr(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (!bundle.isEmpty()) {
            zzcuvVar.b.putBundle("shared_pref", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (!bundle.isEmpty()) {
            zzcuvVar.a.putBundle("shared_pref", bundle);
        }
    }
}
