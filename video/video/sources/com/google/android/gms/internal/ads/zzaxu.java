package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxu extends zzayb {
    public zzaxu(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        super(zzawoVar, "ZfusKpZJ8SBLRBp0x6BWNud7pIzhvWIkVd0V0uxTu84aE2cfWFwKn+FMoh4smXgk", "VN0WZ1yYObu9EYHkfC3f48JbFLjOwnUEkH1X8nPNLSU=", zzaskVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzawj zzawjVar = new zzawj((String) this.e.invoke(null, null));
            zzaskVar.T2(zzawjVar.b.longValue());
            zzaskVar.U2(zzawjVar.c.longValue());
        }
    }
}
