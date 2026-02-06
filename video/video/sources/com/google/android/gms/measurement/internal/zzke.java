package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC10697xN2
/* loaded from: classes3.dex */
public final class zzke implements Runnable {
    public final URL X;
    public final byte[] Y;
    public final String Y0;
    public final zzkb Z;
    public final Map<String, String> Z0;
    public final /* synthetic */ zzkc a1;

    public zzke(zzkc zzkcVar, String str, URL url, byte[] bArr, Map<String, String> map, zzkb zzkbVar) {
        this.a1 = zzkcVar;
        Preconditions.l(str);
        Preconditions.r(url);
        Preconditions.r(zzkbVar);
        this.X = url;
        this.Y = null;
        this.Z = zzkbVar;
        this.Y0 = str;
        this.Z0 = null;
    }

    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.Z.a(this.Y0, i, exc, bArr, map);
    }

    public final void b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.a1.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkd
            @Override // java.lang.Runnable
            public final void run() {
                zzke.this.a(i, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] v;
        this.a1.k();
        int i = 0;
        try {
            URLConnection b = com.google.android.gms.internal.measurement.zzcd.a().b(this.X, "client-measurement");
            if (b instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) b;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                } catch (IOException e) {
                    e = e;
                    map = null;
                } catch (Throwable th) {
                    th = th;
                    map = null;
                }
                try {
                    zzkc zzkcVar = this.a1;
                    v = zzkc.v(httpURLConnection);
                    httpURLConnection.disconnect();
                    b(i, null, v, map);
                    return;
                } catch (IOException e2) {
                    e = e2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, e, null, map);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, null, null, map);
                    throw th;
                }
            }
            throw new IOException("Failed to obtain HTTP connection");
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
