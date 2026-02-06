package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzelq implements zzetu {
    public final boolean a;

    public zzelq(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str;
        Bundle bundle = ((zzcuv) obj).a;
        if (true != this.a) {
            str = "0";
        } else {
            str = "1";
        }
        bundle.putString("adid_p", str);
    }
}
