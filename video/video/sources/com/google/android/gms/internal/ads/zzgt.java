package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import o.AI0;
import o.C8541oZ;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.XH0;

/* loaded from: classes2.dex */
public final class zzgt extends zzfz implements zzhb {
    public final boolean e;
    public final int f;
    public final int g;
    @InterfaceC11300zs1
    public final String h;
    @InterfaceC11300zs1
    public final zzha i;
    public final zzha j;
    @InterfaceC11300zs1
    public zzgl k;
    @InterfaceC11300zs1
    public HttpURLConnection l;
    @InterfaceC11300zs1
    public InputStream m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f284o;
    public long p;
    public long q;

    public /* synthetic */ zzgt(String str, int i, int i2, boolean z, boolean z2, zzha zzhaVar, zzfvd zzfvdVar, boolean z3, zzgs zzgsVar) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = zzhaVar;
        this.j = new zzha();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzgx {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.p;
            if (j != -1) {
                long j2 = j - this.q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.m;
            String str = zzeu.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.q += read;
            A(read);
            return read;
        } catch (IOException e) {
            zzgl zzglVar = this.k;
            String str2 = zzeu.a;
            throw zzgx.a(e, zzglVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (r10 == r16) goto L66;
     */
    @Override // com.google.android.gms.internal.ads.zzgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zzgl zzglVar) throws zzgx {
        zzgt zzgtVar;
        int i;
        long j;
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        zzgh zzghVar;
        long j2;
        zzgt zzgtVar2 = this;
        zzgtVar2.k = zzglVar;
        long j3 = 0;
        zzgtVar2.q = 0L;
        zzgtVar2.p = 0L;
        h(zzglVar);
        try {
            URL url = new URL(zzglVar.a.toString());
            long j4 = zzglVar.e;
            long j5 = zzglVar.f;
            boolean b = zzglVar.b(1);
            int i2 = 0;
            try {
                if (!zzgtVar2.e) {
                    i = 0;
                    httpURLConnection = zzgtVar2.k(url, 1, null, j4, j5, b, true, zzglVar.d);
                    zzgtVar = this;
                    j = 0;
                } else {
                    i = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (i2 <= 20) {
                            j = j3;
                            zzgtVar2 = this;
                            HttpURLConnection k = zzgtVar2.k(url, 1, null, j4, j5, b, false, zzglVar.d);
                            URL url2 = url;
                            long j6 = j5;
                            zzgtVar = zzgtVar2;
                            try {
                                int responseCode = k.getResponseCode();
                                String headerField = k.getHeaderField("Location");
                                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                    httpURLConnection = k;
                                    break;
                                }
                                k.disconnect();
                                URL l = zzgtVar.l(url2, headerField, zzglVar);
                                j5 = j6;
                                url = l;
                                i2 = i3;
                                j3 = j;
                            } catch (IOException e) {
                                e = e;
                                zzgtVar.m();
                                throw zzgx.a(e, zzglVar, 1);
                            }
                        } else {
                            throw new zzgx(new NoRouteToHostException("Too many redirects: " + i3), zzglVar, 2001, 1);
                        }
                    }
                }
                zzgtVar.l = httpURLConnection;
                zzgtVar.f284o = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                int i4 = zzgtVar.f284o;
                long j7 = -1;
                if (i4 >= 200 && i4 <= 299) {
                    httpURLConnection.getContentType();
                    if (zzgtVar.f284o == 200) {
                        j2 = zzglVar.e;
                    }
                    j2 = j;
                    boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
                    if (!equalsIgnoreCase) {
                        long j8 = zzglVar.f;
                        if (j8 != -1) {
                            zzgtVar.p = j8;
                        } else {
                            long a = zzhc.a(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField(AI0.f0));
                            if (a != -1) {
                                j7 = a - j2;
                            }
                            zzgtVar.p = j7;
                        }
                    } else {
                        zzgtVar.p = zzglVar.f;
                    }
                    try {
                        zzgtVar.m = httpURLConnection.getInputStream();
                        if (equalsIgnoreCase) {
                            zzgtVar.m = new GZIPInputStream(zzgtVar.m);
                        }
                        zzgtVar.n = true;
                        i(zzglVar);
                        if (j2 != j) {
                            try {
                                byte[] bArr2 = new byte[4096];
                                while (j2 > j) {
                                    int min = (int) Math.min(j2, (long) PlaybackStateCompat.t1);
                                    InputStream inputStream = zzgtVar.m;
                                    String str = zzeu.a;
                                    int read = inputStream.read(bArr2, i, min);
                                    if (!Thread.currentThread().isInterrupted()) {
                                        if (read != -1) {
                                            j2 -= read;
                                            zzgtVar.A(read);
                                        } else {
                                            throw new zzgx(zzglVar, 2008, 1);
                                        }
                                    } else {
                                        throw new zzgx(new InterruptedIOException(), zzglVar, 2000, 1);
                                    }
                                }
                            } catch (IOException e2) {
                                zzgtVar.m();
                                if (e2 instanceof zzgx) {
                                    throw ((zzgx) e2);
                                }
                                throw new zzgx(e2, zzglVar, 2000, 1);
                            }
                        }
                        return zzgtVar.p;
                    } catch (IOException e3) {
                        zzgtVar.m();
                        throw new zzgx(e3, zzglVar, 2000, 1);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (zzgtVar.f284o == 416) {
                    if (zzglVar.e == zzhc.b(httpURLConnection.getHeaderField(AI0.f0))) {
                        zzgtVar.n = true;
                        i(zzglVar);
                        long j9 = zzglVar.f;
                        if (j9 != -1) {
                            return j9;
                        }
                        return j;
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        bArr = zzgas.b(errorStream);
                    } else {
                        bArr = zzeu.b;
                    }
                } catch (IOException unused) {
                    bArr = zzeu.b;
                }
                zzgtVar.m();
                if (zzgtVar.f284o == 416) {
                    zzghVar = new zzgh(2008);
                } else {
                    zzghVar = null;
                }
                throw new zzgz(zzgtVar.f284o, responseMessage, zzghVar, headerFields, zzglVar, bArr);
            } catch (IOException e4) {
                e = e4;
                zzgtVar = this;
            }
        } catch (IOException e5) {
            e = e5;
            zzgtVar = zzgtVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzgl zzglVar = this.k;
        if (zzglVar != null) {
            return zzglVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzgg
    public final Map d() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return zzfyf.d();
        }
        return new zzgr(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.net.HttpURLConnection, com.google.android.gms.internal.ads.zzgl, java.io.InputStream] */
    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws zzgx {
        try {
            InputStream inputStream = this.m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzgl zzglVar = this.k;
                    String str = zzeu.a;
                    throw new zzgx(e, zzglVar, 2000, 3);
                }
            }
        } finally {
            this.m = null;
            m();
            if (this.n) {
                this.n = false;
                g();
            }
            this.l = null;
            this.k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection k(URL url, int i, @InterfaceC11300zs1 byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String sb;
        String str;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.i.a());
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.h;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                if (true == z) {
                    str2 = XH0.S;
                } else {
                    str2 = "gzip";
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", str2);
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = zzgl.h;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.h;
        if (str != null) {
        }
        if (true == z) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str2);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = zzgl.h;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL l(URL url, @InterfaceC11300zs1 String str, zzgl zzglVar) throws zzgx {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new zzgx("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzglVar, 2001, 1);
                }
                if (!this.e && !protocol.equals(url.getProtocol())) {
                    String protocol2 = url.getProtocol();
                    throw new zzgx("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + C9811tl1.d, zzglVar, 2001, 1);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new zzgx(e, zzglVar, 2001, 1);
            }
        }
        throw new zzgx("Null location redirect", zzglVar, 2001, 1);
    }

    public final void m() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdx.d(C8541oZ.w, "Unexpected error while disconnecting", e);
            }
        }
    }
}
