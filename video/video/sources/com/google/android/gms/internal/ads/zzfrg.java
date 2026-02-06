package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o.ES1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfrg extends zzfqu {
    public zzfvu<Integer> X;
    public zzfvu<Integer> Y;
    @InterfaceC11300zs1
    public HttpURLConnection Y0;
    @InterfaceC11300zs1
    public zzfrf Z;

    public zzfrg(zzfvu<Integer> zzfvuVar, zzfvu<Integer> zzfvuVar2, @InterfaceC11300zs1 zzfrf zzfrfVar) {
        this.X = zzfvuVar;
        this.Y = zzfvuVar2;
        this.Z = zzfrfVar;
    }

    public static /* synthetic */ Integer j() {
        return -1;
    }

    public static /* synthetic */ Integer k() {
        return -1;
    }

    public static /* synthetic */ Integer l(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer m(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer n(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer o(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer p(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ URLConnection t(URL url) throws IOException {
        int i = zzfqp.a;
        return url.openConnection();
    }

    public static /* synthetic */ URLConnection u(Network network, URL url) throws IOException {
        return network.openConnection(url);
    }

    public static void x(@InterfaceC11300zs1 HttpURLConnection httpURLConnection) {
        zzfqv.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x(this.Y0);
    }

    public HttpURLConnection q() throws IOException {
        zzfqv.b(((Integer) this.X.a()).intValue(), ((Integer) this.Y.a()).intValue());
        zzfrf zzfrfVar = this.Z;
        zzfrfVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfrfVar.a();
        this.Y0 = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection r(zzfrf zzfrfVar, final int i, final int i2) throws IOException {
        this.X = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfqy
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfrg.o(i);
            }
        };
        this.Y = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfqz
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfrg.p(i2);
            }
        };
        this.Z = zzfrfVar;
        return q();
    }

    @ES1(21)
    public HttpURLConnection s(@InterfaceC5670cr1 final Network network, @InterfaceC5670cr1 final URL url, final int i, final int i2) throws IOException {
        this.X = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfra
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfrg.m(i);
            }
        };
        this.Y = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfrb
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfrg.n(i2);
            }
        };
        this.Z = new zzfrf() { // from class: com.google.android.gms.internal.ads.zzfrc
            @Override // com.google.android.gms.internal.ads.zzfrf
            public final URLConnection a() {
                return zzfrg.u(network, url);
            }
        };
        return q();
    }

    public URLConnection v(@InterfaceC5670cr1 final URL url, final int i) throws IOException {
        this.X = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfrd
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfrg.l(i);
            }
        };
        this.Z = new zzfrf() { // from class: com.google.android.gms.internal.ads.zzfre
            @Override // com.google.android.gms.internal.ads.zzfrf
            public final URLConnection a() {
                return zzfrg.t(url);
            }
        };
        return q();
    }

    public zzfrg() {
        this(new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfqw
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfrg.j();
            }
        }, new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfqx
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfrg.k();
            }
        }, null);
    }
}
