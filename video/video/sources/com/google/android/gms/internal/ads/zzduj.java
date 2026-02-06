package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzduj implements zzdcz {
    public final Bundle X = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final synchronized void Q(String str) {
        this.X.putInt(str, 1);
    }

    public final synchronized Bundle a() {
        return new Bundle(this.X);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final synchronized void p0(String str) {
        this.X.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final synchronized void u(String str, String str2) {
        this.X.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void w(String str) {
    }
}
