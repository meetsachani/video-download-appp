package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxl extends zzayb {
    public final zzawg h;

    public zzaxl(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, zzawg zzawgVar) {
        super(zzawoVar, "LLos9e8Ql/sv7oIXEM/FCVf2w4qxksYVSJjnFOiKAZfJ/fOB+3TAGyZw1OkiJRsU", "lmzfMnrRinUoapvwdylnImZxEAh1S0BzbHZ4/bdyts0=", zzaskVar, i, 94);
        this.h = zzawgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.e.invoke(null, this.h.a())).intValue();
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.C2(zzasw.a(intValue));
        }
    }
}
