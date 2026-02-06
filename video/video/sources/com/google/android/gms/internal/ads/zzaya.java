package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzaya {
    public final zzawo a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public zzaya(zzawo zzawoVar, String str, String str2, Class... clsArr) {
        this.a = zzawoVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        zzawoVar.j().submit(new zzaxz(this));
    }

    public static /* bridge */ /* synthetic */ void b(zzaya zzayaVar) {
        try {
            zzawo zzawoVar = zzayaVar.a;
            Class<?> loadClass = zzawoVar.h().loadClass(zzayaVar.c(zzawoVar.s(), zzayaVar.b));
            if (loadClass != null) {
                zzayaVar.d = loadClass.getMethod(zzayaVar.c(zzawoVar.s(), zzayaVar.c), zzayaVar.e);
            }
        } catch (zzavs | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzayaVar.f.countDown();
            throw th;
        }
        zzayaVar.f.countDown();
    }

    public final Method a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            if (!this.f.await(2L, TimeUnit.SECONDS)) {
                return null;
            }
            return this.d;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final String c(byte[] bArr, String str) throws zzavs, UnsupportedEncodingException {
        return new String(this.a.e().b(bArr, str), "UTF-8");
    }
}
