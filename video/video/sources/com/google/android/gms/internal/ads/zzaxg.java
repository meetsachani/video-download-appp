package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzaxg implements Callable {
    public final zzawo a;
    public final zzask b;

    public zzaxg(zzawo zzawoVar, zzask zzaskVar) {
        this.a = zzawoVar;
        this.b = zzaskVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzawo zzawoVar = this.a;
        if (zzawoVar.k() != null) {
            zzawoVar.k().get();
        }
        zzath c = zzawoVar.c();
        if (c != null) {
            try {
                zzask zzaskVar = this.b;
                synchronized (zzaskVar) {
                    zzaskVar.v1(c.b1(), zzgyc.a());
                }
                return null;
            } catch (zzgzh | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
