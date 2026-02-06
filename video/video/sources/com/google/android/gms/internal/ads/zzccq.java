package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class zzccq implements zzgg {
    public final Context a;
    public final zzgg b;
    public final String c;
    public final int d;
    public final boolean e;
    public InputStream f;
    public boolean g;
    public Uri h;
    public volatile zzbbf i;
    public boolean j = false;
    public boolean k = false;
    public zzgl l;

    public zzccq(Context context, zzgg zzggVar, String str, int i, zzhg zzhgVar, zzccp zzccpVar) {
        this.a = context;
        this.b = zzggVar;
        this.c = str;
        this.d = i;
        new AtomicLong(-1L);
        this.e = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        if (this.g) {
            InputStream inputStream = this.f;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            }
            return this.b.D(bArr, i, i2);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws IOException {
        Long l;
        if (!this.g) {
            this.g = true;
            Uri uri = zzglVar.a;
            this.h = uri;
            this.l = zzglVar;
            this.i = zzbbf.m0(uri);
            zzbbc zzbbcVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A4)).booleanValue()) {
                if (this.i != null) {
                    this.i.c1 = zzglVar.e;
                    this.i.d1 = zzfvt.c(this.c);
                    this.i.e1 = this.d;
                    if (this.i.b1) {
                        l = (Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C4);
                    } else {
                        l = (Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B4);
                    }
                    long longValue = l.longValue();
                    com.google.android.gms.ads.internal.zzv.d().b();
                    com.google.android.gms.ads.internal.zzv.h();
                    Future a = zzbbq.a(this.a, this.i);
                    try {
                        try {
                            zzbbr zzbbrVar = (zzbbr) a.get(longValue, TimeUnit.MILLISECONDS);
                            zzbbrVar.d();
                            this.j = zzbbrVar.f();
                            this.k = zzbbrVar.e();
                            zzbbrVar.a();
                            if (!g()) {
                                this.f = zzbbrVar.c();
                            }
                        } catch (InterruptedException unused) {
                            a.cancel(false);
                            Thread.currentThread().interrupt();
                        } catch (ExecutionException | TimeoutException unused2) {
                            a.cancel(false);
                        }
                    } catch (Throwable unused3) {
                    }
                    com.google.android.gms.ads.internal.zzv.d().b();
                    throw null;
                }
            } else {
                if (this.i != null) {
                    this.i.c1 = zzglVar.e;
                    this.i.d1 = zzfvt.c(this.c);
                    this.i.e1 = this.d;
                    zzbbcVar = com.google.android.gms.ads.internal.zzv.g().b(this.i);
                }
                if (zzbbcVar != null && zzbbcVar.H0()) {
                    this.j = zzbbcVar.O0();
                    this.k = zzbbcVar.I0();
                    if (!g()) {
                        this.f = zzbbcVar.E0();
                        return -1L;
                    }
                }
            }
            if (this.i != null) {
                zzgj a2 = zzglVar.a();
                a2.d(Uri.parse(this.i.X));
                this.l = a2.e();
            }
            return this.b.a(this.l);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void b(zzhg zzhgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Uri c() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final /* synthetic */ Map d() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws IOException {
        if (this.g) {
            this.g = false;
            this.h = null;
            InputStream inputStream = this.f;
            if (inputStream != null) {
                IOUtils.b(inputStream);
                this.f = null;
                return;
            }
            this.b.f();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    public final boolean g() {
        if (!this.e) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D4)).booleanValue() && !this.j) {
            return true;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E4)).booleanValue() || this.k) {
            return false;
        }
        return true;
    }
}
