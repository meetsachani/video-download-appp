package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhbo {
    public final Unsafe a;

    public zzhbo(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract double b(Object obj, long j);

    public abstract float c(Object obj, long j);

    public abstract void d(long j, byte[] bArr, long j2, long j3);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(Object obj, long j, byte b);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public abstract boolean i(Object obj, long j);
}
