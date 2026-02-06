package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o.AI0;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.XH0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdt extends zzfz implements zzhb {
    public static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference v = new AtomicReference();
    public final SSLSocketFactory e;
    public final int f;
    public final int g;
    public final String h;
    public final zzha i;
    public zzgl j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public long f236o;
    public long p;
    public long q;
    public long r;
    public int s;
    public final Set t;

    public zzcdt(String str, zzhg zzhgVar, int i, int i2, int i3) {
        super(true);
        this.e = new zzcds(this);
        this.t = new HashSet();
        zzdc.c(str);
        this.h = str;
        this.i = new zzha();
        this.f = i;
        this.g = i2;
        this.s = i3;
        if (zzhgVar != null) {
            b(zzhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzgx {
        try {
            if (this.q != this.f236o) {
                AtomicReference atomicReference = v;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.f236o;
                    if (j != j2) {
                        int read = this.l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (!Thread.interrupted()) {
                            if (read != -1) {
                                this.q += read;
                                A(read);
                            } else {
                                throw new EOFException();
                            }
                        } else {
                            throw new InterruptedIOException();
                        }
                    } else {
                        atomicReference.set(bArr2);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                long j4 = j3 - this.r;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int read2 = this.l.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.r += read2;
            A(read2);
            return read2;
        } catch (IOException e) {
            throw new zzgx(e, this.j, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
        if (r2 == r16) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x0239, B:97:0x0244, B:99:0x0255, B:102:0x025e, B:103:0x026d, B:105:0x0274, B:106:0x027b, B:107:0x027c, B:108:0x0292), top: B:117:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0244 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x0239, B:97:0x0244, B:99:0x0255, B:102:0x025e, B:103:0x026d, B:105:0x0274, B:106:0x027b, B:107:0x027c, B:108:0x0292), top: B:117:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zzgl zzglVar) throws zzgx {
        long j;
        long j2;
        int responseCode;
        String headerField;
        long j3;
        long parseLong;
        String headerField2;
        this.j = zzglVar;
        long j4 = 0;
        this.r = 0L;
        this.q = 0L;
        try {
            URL url = new URL(zzglVar.a.toString());
            long j5 = zzglVar.e;
            long j6 = zzglVar.f;
            boolean b = zzglVar.b(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        j = j4;
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.e);
                    } else {
                        j = j4;
                    }
                    httpURLConnection.setConnectTimeout(this.f);
                    httpURLConnection.setReadTimeout(this.g);
                    for (Map.Entry entry : this.i.a().entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    long j7 = -1;
                    if (j5 == j) {
                        if (j6 != -1) {
                            j2 = j;
                        }
                        httpURLConnection.setRequestProperty("User-Agent", this.h);
                        if (!b) {
                            httpURLConnection.setRequestProperty("Accept-Encoding", XH0.S);
                        }
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.k = httpURLConnection;
                            try {
                                int responseCode2 = httpURLConnection.getResponseCode();
                                this.n = responseCode2;
                                if (responseCode2 >= 200 && responseCode2 <= 299) {
                                    if (responseCode2 == 200) {
                                        j3 = zzglVar.e;
                                    }
                                    j3 = j;
                                    this.f236o = j3;
                                    if (!zzglVar.b(1)) {
                                        long j8 = zzglVar.f;
                                        if (j8 != -1) {
                                            this.p = j8;
                                        } else {
                                            HttpURLConnection httpURLConnection2 = this.k;
                                            String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                            if (!TextUtils.isEmpty(headerField3)) {
                                                try {
                                                    parseLong = Long.parseLong(headerField3);
                                                } catch (NumberFormatException unused) {
                                                    int i3 = com.google.android.gms.ads.internal.util.zze.b;
                                                    com.google.android.gms.ads.internal.util.client.zzo.d("Unexpected Content-Length [" + headerField3 + C6566gU0.g);
                                                }
                                                headerField2 = httpURLConnection2.getHeaderField(AI0.f0);
                                                if (!TextUtils.isEmpty(headerField2)) {
                                                    Matcher matcher = u.matcher(headerField2);
                                                    if (matcher.find()) {
                                                        try {
                                                            int i4 = (parseLong > j ? 1 : (parseLong == j ? 0 : -1));
                                                            long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                            if (i4 < 0) {
                                                                parseLong = parseLong2;
                                                            } else if (parseLong != parseLong2) {
                                                                int i5 = com.google.android.gms.ads.internal.util.zze.b;
                                                                com.google.android.gms.ads.internal.util.client.zzo.g("Inconsistent headers [" + headerField3 + "] [" + headerField2 + C6566gU0.g);
                                                                parseLong = Math.max(parseLong, parseLong2);
                                                            }
                                                        } catch (NumberFormatException unused2) {
                                                            int i6 = com.google.android.gms.ads.internal.util.zze.b;
                                                            com.google.android.gms.ads.internal.util.client.zzo.d("Unexpected Content-Range [" + headerField2 + C6566gU0.g);
                                                        }
                                                    }
                                                }
                                                if (parseLong != -1) {
                                                    j7 = parseLong - this.f236o;
                                                }
                                                this.p = j7;
                                            }
                                            parseLong = -1;
                                            headerField2 = httpURLConnection2.getHeaderField(AI0.f0);
                                            if (!TextUtils.isEmpty(headerField2)) {
                                            }
                                            if (parseLong != -1) {
                                            }
                                            this.p = j7;
                                        }
                                    } else {
                                        this.p = zzglVar.f;
                                    }
                                    try {
                                        this.l = this.k.getInputStream();
                                        this.m = true;
                                        i(zzglVar);
                                        return this.p;
                                    } catch (IOException e) {
                                        n();
                                        throw new zzgx(e, zzglVar, 2000, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.k.getHeaderFields();
                                n();
                                zzgz zzgzVar = new zzgz(this.n, null, null, headerFields, zzglVar, zzeu.b);
                                if (this.n == 416) {
                                    zzgzVar.initCause(new zzgh(2008));
                                }
                                throw zzgzVar;
                            } catch (IOException e2) {
                                n();
                                throw new zzgx("Unable to connect to ".concat(String.valueOf(zzglVar.a.toString())), e2, zzglVar, 2000, 1);
                            }
                        }
                        headerField = httpURLConnection.getHeaderField("Location");
                        httpURLConnection.disconnect();
                        if (headerField == null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                                throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                            }
                            url = url2;
                            i = i2;
                            j4 = j;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        j2 = j5;
                    }
                    String str = "bytes=" + j2 + "-";
                    if (j6 != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append((j2 + j6) - 1);
                        str = sb.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", str);
                    httpURLConnection.setRequestProperty("User-Agent", this.h);
                    if (!b) {
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300) {
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField == null) {
                    }
                } else {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
            }
        } catch (IOException e3) {
            throw new zzgx("Unable to connect to ".concat(String.valueOf(zzglVar.a.toString())), e3, zzglVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Map d() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws zzgx {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                String str = zzeu.a;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgx(e, this.j, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            n();
            if (this.m) {
                this.m = false;
                g();
            }
            this.t.clear();
        }
    }

    public final void m(int i) {
        this.s = i;
        for (Socket socket : this.t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.s);
                } catch (SocketException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.h("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final void n() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }
}
