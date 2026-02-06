package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxv extends zzayb {
    public final zzawv h;
    public long i;

    public zzaxv(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, zzawv zzawvVar) {
        super(zzawoVar, "YdsvNQpLn71zCPsmNiBmaxgvKAoUotN+t67Ej8NmXEez61kI/ElwL7USsI8xuH+E", "BTo9KBR1VAIklcWQcnKn1k6hpYvG+18rom++PUlQVcU=", zzaskVar, i, 53);
        this.h = zzawvVar;
        if (zzawvVar != null) {
            this.i = zzawvVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.h != null) {
            this.d.n2(((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue());
        }
    }
}
