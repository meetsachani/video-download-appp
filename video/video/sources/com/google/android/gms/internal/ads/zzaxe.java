package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxe extends zzayb {
    public static volatile Long h;
    public static final Object i = new Object();

    public zzaxe(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i2, int i3) {
        super(zzawoVar, "n8+dbEkb8sSSkj8RrAZPAIBpRkB5kUln+00UVnn84X80gYgRIiK8WSxHPJEqxXHc", "yKnJQpgvAxtK/oRpf77IDthT8ZJJ6VXKsBNJ0lMvjYQ=", zzaskVar, i2, 44);
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
            zzaskVar.S2(h.longValue());
        }
    }
}
