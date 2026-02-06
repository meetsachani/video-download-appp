package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class zzayb implements Callable {
    public final zzawo a;
    public final String b;
    public final String c;
    public final zzask d;
    public Method e;
    public final int f;
    public final int g;

    public zzayb(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        this.a = zzawoVar;
        this.b = str;
        this.c = str2;
        this.d = zzaskVar;
        this.f = i;
        this.g = i2;
    }

    public abstract void a() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zzawo zzawoVar = this.a;
            Method i2 = zzawoVar.i(this.b, this.c);
            this.e = i2;
            if (i2 != null) {
                a();
                zzavf d = zzawoVar.d();
                if (d != null && (i = this.f) != Integer.MIN_VALUE) {
                    d.c(this.g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
