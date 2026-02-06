package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxj extends zzayb {
    public static volatile Long h;
    public static final Object i = new Object();

    public zzaxj(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i2, int i3) {
        super(zzawoVar, "2yqQbpMMcqKX38M442dN+dCyzykwnAxluzbiBDnzfSZwwykVdh1BxKbQaA6qVZBU", "1XIQFsxUhHfLRHhylour2btyczZCL08SFkmijCbkayQ=", zzaskVar, i2, 22);
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
            zzaskVar.a3(h.longValue());
        }
    }
}
