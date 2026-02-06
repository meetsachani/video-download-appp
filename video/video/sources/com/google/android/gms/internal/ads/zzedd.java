package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import o.AbstractC3181Hq2;
import o.C5273bD0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzedd {
    public final Context a;

    public zzedd(Context context) {
        this.a = context;
    }

    public final InterfaceFutureC8411o11 a(boolean z) {
        try {
            C5273bD0 a = new C5273bD0.a().b(MobileAds.a).c(z).a();
            AbstractC3181Hq2 a2 = AbstractC3181Hq2.a(this.a);
            if (a2 != null) {
                return a2.b(a);
            }
            return zzgcy.g(new IllegalStateException());
        } catch (Exception e) {
            return zzgcy.g(e);
        }
    }
}
