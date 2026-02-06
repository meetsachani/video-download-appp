package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzflw extends zzflz {
    @SuppressLint({"StaticFieldLeak"})
    public static final zzflw Y0 = new zzflw();

    private zzflw() {
    }

    public static zzflw i() {
        return Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzflz
    public final void b(boolean z) {
        for (zzflf zzflfVar : zzflx.a().c()) {
            zzflfVar.g().k(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflz
    public final boolean c() {
        for (zzflf zzflfVar : zzflx.a().b()) {
            View f = zzflfVar.f();
            if (f != null && f.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
