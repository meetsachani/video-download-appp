package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.C9755tW1;

/* loaded from: classes2.dex */
public final class zzest implements zzetu {
    public final String a;
    public final int b;

    public zzest(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((zzcuv) obj).b.putString(C9755tW1.f875o, this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        bundle.putString(C9755tW1.f875o, this.a);
        if (this.b == 2) {
            bundle.putInt("sod", 1);
        }
    }
}
