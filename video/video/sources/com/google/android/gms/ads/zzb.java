package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.internal.ads.zzbph;

/* loaded from: classes2.dex */
public final class zzb {
    public static volatile zzch a;

    private zzb() {
    }

    public static zzch a(Context context) {
        if (a == null) {
            synchronized (zzb.class) {
                try {
                    if (a == null) {
                        a = zzbb.a().g(context, new zzbph());
                    }
                } finally {
                }
            }
        }
        return a;
    }
}
