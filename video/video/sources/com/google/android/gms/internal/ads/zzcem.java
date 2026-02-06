package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AI0;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.XH0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcem extends zzfz implements zzhb {
    public static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int e;
    public final int f;
    public final String g;
    public final zzha h;
    public zzgl i;
    public HttpURLConnection j;
    public final Queue k;
    public InputStream l;
    public boolean m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public long f238o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final long t;
    public final long u;

    public zzcem(String str, zzhg zzhgVar, int i, int i2, long j, long j2) {
        super(true);
        zzdc.c(str);
        this.g = str;
        this.h = new zzha();
        this.e = i;
        this.f = i2;
        this.k = new ArrayDeque();
        this.t = j;
        this.u = j2;
        if (zzhgVar != null) {
            b(zzhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzgx {
        long j;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j2 = this.f238o;
            long j3 = this.p;
            if (j2 - j3 == 0) {
                return -1;
            }
            long j4 = this.q + j3;
            long j5 = i2;
            long j6 = j4 + j5 + this.u;
            long j7 = this.s;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.r;
                if (j7 < j9) {
                    long min = Math.min(j9, Math.max(((this.t + j8) - j) - 1, (j8 + j5) - 1));
                    k(j8, min, 2);
                    this.s = min;
                    j7 = min;
                }
            }
            int read = this.l.read(bArr, i, (int) Math.min(j5, ((j7 + 1) - this.q) - this.p));
            if (read != -1) {
                this.p += read;
                A(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzgx(e, this.i, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws zzgx {
        long min;
        this.i = zzglVar;
        this.p = 0L;
        long j = zzglVar.e;
        long j2 = zzglVar.f;
        if (j2 == -1) {
            min = this.t;
        } else {
            min = Math.min(this.t, j2);
        }
        this.q = j;
        HttpURLConnection k = k(j, (min + j) - 1, 1);
        this.j = k;
        String headerField = k.getHeaderField(AI0.f0);
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = zzglVar.f;
                    if (j3 != -1) {
                        this.f238o = j3;
                        this.r = Math.max(parseLong, (this.q + j3) - 1);
                    } else {
                        this.f238o = parseLong2 - this.q;
                        this.r = parseLong2 - 1;
                    }
                    this.s = parseLong;
                    this.m = true;
                    i(zzglVar);
                    return this.f238o;
                } catch (NumberFormatException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.d("Unexpected Content-Range [" + headerField + C6566gU0.g);
                }
            }
        }
        throw new zzcek(headerField, zzglVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Map d() {
        HttpURLConnection httpURLConnection = this.j;
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
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgx(e, this.i, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            l();
            if (this.m) {
                this.m = false;
                g();
            }
        }
    }

    @InterfaceC5056aJ2
    public final HttpURLConnection k(long j, long j2, int i) throws zzgx {
        int i2;
        IOException iOException;
        String uri = this.i.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            for (Map.Entry entry : this.h.a().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e) {
                    iOException = e;
                    i2 = i;
                    String valueOf = String.valueOf(uri);
                    throw new zzgx("Unable to connect to ".concat(valueOf), iOException, this.i, 2000, i2);
                }
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", XH0.S);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.k.add(httpURLConnection);
            String uri2 = this.i.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.n = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.l != null) {
                            inputStream = new SequenceInputStream(this.l, inputStream);
                        }
                        this.l = inputStream;
                        return httpURLConnection;
                    } catch (IOException e2) {
                        l();
                        throw new zzgx(e2, this.i, 2000, i);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                l();
                throw new zzcel(this.n, headerFields, this.i, i);
            } catch (IOException e3) {
                l();
                String valueOf2 = String.valueOf(uri2);
                throw new zzgx("Unable to connect to ".concat(valueOf2), e3, this.i, 2000, i);
            }
        } catch (IOException e4) {
            i2 = i;
            iOException = e4;
        }
    }

    public final void l() {
        while (true) {
            Queue queue = this.k;
            if (!queue.isEmpty()) {
                try {
                    ((HttpURLConnection) queue.remove()).disconnect();
                } catch (Exception e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Unexpected error while disconnecting", e);
                }
            } else {
                this.j = null;
                return;
            }
        }
    }
}
