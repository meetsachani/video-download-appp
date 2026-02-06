package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxf extends zzayb {
    public final long h;

    public zzaxf(zzawo zzawoVar, String str, String str2, zzask zzaskVar, long j, int i, int i2) {
        super(zzawoVar, "bz3lIaHWpCquphICM8d57wBZcB7vA3QBLpLSSF22FzCVTv7HI8nqsTojeybBUatg", "nJy2u10FH1OsIt1ONuXNmQ7d3Q3+he826LogUVDBAds=", zzaskVar, i, 25);
        this.h = j;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.e.invoke(null, null)).longValue();
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            try {
                zzaskVar.V2(longValue);
                long j = this.h;
                if (j != 0) {
                    zzaskVar.r2(longValue - j);
                    zzaskVar.s2(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
