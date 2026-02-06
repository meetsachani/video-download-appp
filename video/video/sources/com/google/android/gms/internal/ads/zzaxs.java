package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxs extends zzayb {
    public final boolean h;

    public zzaxs(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        super(zzawoVar, "jIv42z2v6FXxayFh75bTXtsxRSsCK/ciQjkFKmgks8cLq7HP+HDebRZyGvyOBC97", "2wHbvH170oRSgA6rj2BMxMfMsZs+WbUtizDquheRwWE=", zzaskVar, i, 61);
        this.h = zzawoVar.q();
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.e.invoke(null, this.a.b(), Boolean.valueOf(this.h))).longValue();
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.a2(longValue);
        }
    }
}
