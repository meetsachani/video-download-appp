package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC10697xN2
/* loaded from: classes3.dex */
public final class zzgc implements Runnable {
    public final URL X;
    public final byte[] Y;
    public final String Y0;
    public final zzfx Z;
    public final Map<String, String> Z0;
    public final /* synthetic */ zzfy a1;

    public zzgc(zzfy zzfyVar, String str, URL url, byte[] bArr, Map<String, String> map, zzfx zzfxVar) {
        this.a1 = zzfyVar;
        Preconditions.l(str);
        Preconditions.r(url);
        Preconditions.r(zzfxVar);
        this.X = url;
        this.Y = bArr;
        this.Z = zzfxVar;
        this.Y0 = str;
        this.Z0 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        IOException iOException;
        Map<String, List<String>> map;
        OutputStream outputStream2;
        int i;
        Map<String, List<String>> map2;
        int i2;
        byte[] z;
        this.a1.k();
        OutputStream outputStream3 = null;
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
                    Map<String, String> map3 = this.Z0;
                    if (map3 != null) {
                        for (Map.Entry<String, String> entry : map3.entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    if (this.Y != null) {
                        byte[] g0 = this.a1.o().g0(this.Y);
                        this.a1.j().K().b("Uploading data. size", Integer.valueOf(g0.length));
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(g0.length);
                        httpURLConnection.connect();
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(g0);
                            outputStream.close();
                        } catch (IOException e) {
                            iOException = e;
                            map = null;
                            i = 0;
                            outputStream3 = outputStream;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e2) {
                                    this.a1.j().G().c("Error closing HTTP compressed POST connection output stream. appId", zzfr.v(this.Y0), e2);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.a1.l().D(new zzga(this.Y0, this.Z, i, iOException, null, map));
                        } catch (Throwable th) {
                            th = th;
                            outputStream2 = null;
                            i2 = 0;
                            map2 = outputStream2;
                            Throwable th2 = th;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    this.a1.j().G().c("Error closing HTTP compressed POST connection output stream. appId", zzfr.v(this.Y0), e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.a1.l().D(new zzga(this.Y0, this.Z, i2, null, null, map2));
                            throw th2;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            zzfy zzfyVar = this.a1;
                            z = zzfy.z(httpURLConnection);
                            httpURLConnection.disconnect();
                            this.a1.l().D(new zzga(this.Y0, this.Z, responseCode, null, z, headerFields));
                        } catch (IOException e4) {
                            e = e4;
                            i = responseCode;
                            map = headerFields;
                            iOException = e;
                            if (outputStream3 != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            this.a1.l().D(new zzga(this.Y0, this.Z, i, iOException, null, map));
                        } catch (Throwable th3) {
                            th = th3;
                            outputStream = null;
                            i2 = responseCode;
                            map2 = headerFields;
                            Throwable th22 = th;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            this.a1.l().D(new zzga(this.Y0, this.Z, i2, null, null, map2));
                            throw th22;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        map = null;
                        i = responseCode;
                    } catch (Throwable th4) {
                        th = th4;
                        outputStream = null;
                        map2 = 0;
                        i2 = responseCode;
                    }
                } catch (IOException e6) {
                    iOException = e6;
                    map = null;
                    i = 0;
                    if (outputStream3 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.a1.l().D(new zzga(this.Y0, this.Z, i, iOException, null, map));
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = null;
                    outputStream2 = outputStream;
                    i2 = 0;
                    map2 = outputStream2;
                    Throwable th222 = th;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.a1.l().D(new zzga(this.Y0, this.Z, i2, null, null, map2));
                    throw th222;
                }
            } else {
                throw new IOException("Failed to obtain HTTP connection");
            }
        } catch (IOException e7) {
            iOException = e7;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
