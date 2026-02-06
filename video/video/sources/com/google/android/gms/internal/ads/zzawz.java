package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzawz extends zzayb {
    public zzawz(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        super(zzawoVar, "G6tpJfcfsXNaUQhDJn9Qju0vku5y/oa1fF8zdhZ2CFQQ0yJpdIBybAnW8Cnq7FGe", "fIK5mOsPYa+LmT3H4ctpyCeP1IjF5A1bfJROt5z4ppI=", zzaskVar, i, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.e.invoke(null, null);
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.K2(str);
        }
    }
}
