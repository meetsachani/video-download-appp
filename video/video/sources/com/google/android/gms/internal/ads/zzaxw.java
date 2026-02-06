package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxw extends zzayb {
    public static volatile Long h;
    public static final Object i = new Object();

    public zzaxw(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i2, int i3) {
        super(zzawoVar, "AkswGwusnlvibekdTn6rp1TLruqBIpT26qUqw6ERX2GI+0q3NNodYWGNobvk/KA0", "+ySS/EYovSzthax5b5cNVBSw7OeHS3QqC5FfLg20T6g=", zzaskVar, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = (Long) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.t2(h.longValue());
        }
    }
}
