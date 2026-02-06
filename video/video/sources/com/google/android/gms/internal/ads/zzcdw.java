package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzcdw extends zzfz {
    public final Context e;
    public final zzgg f;
    public final String g;
    public final int h;
    public final boolean i;
    public InputStream j;
    public boolean k;
    public Uri l;
    public volatile zzbbf m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f237o;
    public boolean p;
    public boolean q;
    public long r;
    public InterfaceFutureC8411o11 s;
    public final AtomicLong t;
    public final zzceg u;

    public zzcdw(Context context, zzgg zzggVar, String str, int i, zzhg zzhgVar, zzceg zzcegVar) {
        super(false);
        this.e = context;
        this.f = zzggVar;
        this.u = zzcegVar;
        this.g = str;
        this.h = i;
        this.n = false;
        this.f237o = false;
        this.p = false;
        this.q = false;
        this.r = 0L;
        this.t = new AtomicLong(-1L);
        this.s = null;
        this.i = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue();
        b(zzhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        int D;
        if (this.k) {
            InputStream inputStream = this.j;
            if (inputStream != null) {
                D = inputStream.read(bArr, i, i2);
            } else {
                D = this.f.D(bArr, i, i2);
            }
            if (this.i && this.j == null) {
                return D;
            }
            A(D);
            return D;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zzgl zzglVar) throws IOException {
        zzbbc zzbbcVar;
        Long l;
        boolean z;
        boolean z2;
        long b;
        zzbbr zzbbrVar;
        String str = "ms";
        if (!this.k) {
            boolean z3 = true;
            this.k = true;
            Uri uri = zzglVar.a;
            this.l = uri;
            ?? r4 = this.i;
            if (r4 == 0) {
                i(zzglVar);
            }
            this.m = zzbbf.m0(uri);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A4)).booleanValue()) {
                if (this.m != null) {
                    this.m.c1 = zzglVar.e;
                    this.m.d1 = zzfvt.c(this.g);
                    this.m.e1 = this.h;
                    if (this.m.b1) {
                        l = (Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C4);
                    } else {
                        l = (Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B4);
                    }
                    long longValue = l.longValue();
                    long b2 = com.google.android.gms.ads.internal.zzv.d().b();
                    com.google.android.gms.ads.internal.zzv.h();
                    Future a = zzbbq.a(this.e, this.m);
                    try {
                        try {
                            zzbbrVar = (zzbbr) a.get(longValue, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                            z2 = false;
                        } catch (ExecutionException | TimeoutException unused2) {
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            z3 = false;
                        }
                        try {
                            this.n = zzbbrVar.d();
                            this.p = zzbbrVar.f();
                            this.q = zzbbrVar.e();
                            this.r = zzbbrVar.a();
                        } catch (InterruptedException unused3) {
                            z2 = true;
                            a.cancel(true);
                            Thread.currentThread().interrupt();
                            b = com.google.android.gms.ads.internal.zzv.d().b() - b2;
                            zzcej.b0(this.u.a, z2, b);
                            this.f237o = z2;
                            r4 = new StringBuilder();
                            r4.append("Cache connection took ");
                            r4.append(b);
                            r4.append("ms");
                            str = r4.toString();
                            com.google.android.gms.ads.internal.util.zze.k(str);
                            this.f237o = false;
                            if (this.m != null) {
                            }
                            return this.f.a(zzglVar);
                        } catch (ExecutionException | TimeoutException unused4) {
                            z = true;
                            a.cancel(true);
                            b = com.google.android.gms.ads.internal.zzv.d().b() - b2;
                            zzcej.b0(this.u.a, z, b);
                            this.f237o = z;
                            r4 = new StringBuilder();
                            r4.append("Cache connection took ");
                            r4.append(b);
                            r4.append("ms");
                            str = r4.toString();
                            com.google.android.gms.ads.internal.util.zze.k(str);
                            this.f237o = false;
                            if (this.m != null) {
                            }
                            return this.f.a(zzglVar);
                        } catch (Throwable th2) {
                            th = th2;
                            long b3 = com.google.android.gms.ads.internal.zzv.d().b() - b2;
                            zzcej.b0(this.u.a, z3, b3);
                            this.f237o = z3;
                            com.google.android.gms.ads.internal.util.zze.k("Cache connection took " + b3 + str);
                            throw th;
                        }
                        if (!r()) {
                            this.j = zzbbrVar.c();
                            if (r4 != 0) {
                                i(zzglVar);
                            }
                            long b4 = com.google.android.gms.ads.internal.zzv.d().b() - b2;
                            zzcej.b0(this.u.a, true, b4);
                            this.f237o = true;
                            com.google.android.gms.ads.internal.util.zze.k("Cache connection took " + b4 + "ms");
                            return -1L;
                        }
                        long b5 = com.google.android.gms.ads.internal.zzv.d().b() - b2;
                        zzcej.b0(this.u.a, true, b5);
                        this.f237o = true;
                        str = "Cache connection took " + b5 + "ms";
                        com.google.android.gms.ads.internal.util.zze.k(str);
                    } catch (Throwable th3) {
                        th = th3;
                        z3 = r4;
                    }
                }
            } else {
                if (this.m != null) {
                    this.m.c1 = zzglVar.e;
                    this.m.d1 = zzfvt.c(this.g);
                    this.m.e1 = this.h;
                    zzbbcVar = com.google.android.gms.ads.internal.zzv.g().b(this.m);
                } else {
                    zzbbcVar = null;
                }
                if (zzbbcVar != null && zzbbcVar.H0()) {
                    this.n = zzbbcVar.G0();
                    this.p = zzbbcVar.O0();
                    this.q = zzbbcVar.I0();
                    this.r = zzbbcVar.m0();
                    this.f237o = true;
                    if (!r()) {
                        this.j = zzbbcVar.E0();
                        if (this.i) {
                            i(zzglVar);
                        }
                        return -1L;
                    }
                }
            }
            this.f237o = false;
            if (this.m != null) {
                zzgj a2 = zzglVar.a();
                a2.d(Uri.parse(this.m.X));
                zzglVar = a2.e();
            }
            return this.f.a(zzglVar);
        }
        throw new IOException("Attempt to open an already open GcacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Uri c() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws IOException {
        if (this.k) {
            boolean z = false;
            this.k = false;
            this.l = null;
            if (!this.i || this.j != null) {
                z = true;
            }
            InputStream inputStream = this.j;
            if (inputStream != null) {
                IOUtils.b(inputStream);
                this.j = null;
            } else {
                this.f.f();
            }
            if (z) {
                g();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final long k() {
        return this.r;
    }

    public final long l() {
        if (this.m != null) {
            AtomicLong atomicLong = this.t;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.s == null) {
                        this.s = zzcaa.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdv
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Long valueOf;
                                valueOf = Long.valueOf(com.google.android.gms.ads.internal.zzv.g().a(zzcdw.this.m));
                                return valueOf;
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.s.isDone()) {
                try {
                    this.t.compareAndSet(-1L, ((Long) this.s.get()).longValue());
                    return this.t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean n() {
        return this.n;
    }

    public final boolean o() {
        return this.q;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.f237o;
    }

    public final boolean r() {
        if (!this.i) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D4)).booleanValue() && !this.p) {
            return true;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E4)).booleanValue() || this.q) {
            return false;
        }
        return true;
    }
}
