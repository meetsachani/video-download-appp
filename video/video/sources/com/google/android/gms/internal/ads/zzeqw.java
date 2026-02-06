package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeqw implements zzetu {
    public final String a;
    public final boolean b;

    public zzeqw(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((zzcuv) obj).b.putString("gct", this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        bundle.putString("gct", this.a);
        if (this.b) {
            bundle.putString("de", "1");
        }
    }
}
