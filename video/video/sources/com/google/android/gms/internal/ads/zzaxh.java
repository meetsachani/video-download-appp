package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class zzaxh extends zzayb {
    public final zzawp h;

    public zzaxh(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, zzawp zzawpVar) {
        super(zzawoVar, "L3kNtlg7QY6D9Xl7pPswVVS/MCBOYXcB4vflYd8GjH187tfdUwj4wLKq5xN70kha", "7KShiw4CrXn9e1sAZ1bf68KLoTIikFllvC3ALPO42ag=", zzaskVar, i, 85);
        this.h = zzawpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        Method method = this.e;
        zzawp zzawpVar = this.h;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzawpVar.d()), Long.valueOf(zzawpVar.h()), Long.valueOf(zzawpVar.b()), Long.valueOf(zzawpVar.f()));
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.X2(jArr[0]);
            zzaskVar.W2(jArr[1]);
        }
    }
}
