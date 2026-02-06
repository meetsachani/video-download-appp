package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzib {
    public static volatile int f = 100;
    public int a;
    public int b;
    public int c;
    public zzif d;
    public boolean e;

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzib d(byte[] bArr, int i, int i2, boolean z) {
        zzia zziaVar = new zzia(bArr, i2);
        try {
            zziaVar.b(i2);
            return zziaVar;
        } catch (zzji e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int l(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract boolean A() throws IOException;

    public abstract boolean B() throws IOException;

    public abstract double a() throws IOException;

    public abstract int b(int i) throws zzji;

    public abstract float e() throws IOException;

    public abstract void f(int i) throws zzji;

    public abstract int g();

    public abstract void h(int i);

    public abstract int i() throws IOException;

    public abstract boolean j(int i) throws IOException;

    public abstract int k() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract long s() throws IOException;

    public abstract long t() throws IOException;

    public abstract long u() throws IOException;

    public abstract long v() throws IOException;

    public abstract long w() throws IOException;

    public abstract zzhm x() throws IOException;

    public abstract String y() throws IOException;

    public abstract String z() throws IOException;

    /* JADX INFO: Access modifiers changed from: private */
    public zzib() {
        this.b = f;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
