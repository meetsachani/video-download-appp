package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9276rZ;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.kh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1911kh implements InterfaceC0891Ll {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{C3307Iz.c0, 98, QC1.w, C3307Iz.c0, 98, 101, Byte.MAX_VALUE, 110, 121, 121, 126, 123, Byte.MAX_VALUE, 110, 111, C3307Iz.V, 117, 110, C3307Iz.V, 102, 49, 47, 50, C3307Iz.f0, 102, C3307Iz.a0, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, C3307Iz.f0, 52, C3307Iz.X, C3307Iz.f0, 52, 109, C3307Iz.d0, C3307Iz.X, C3307Iz.f0, C3307Iz.Z, 52, 40, 122, 96, 5, C8077mf.x, C8077mf.p, 77, 65, 64, 64, 75, 77, 90, 71, 65, 64, C8077mf.p, 71, 93, C8077mf.p, 79, 76, 93, 75, 64, 90, C8077mf.q, C8077mf.x, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, C3307Iz.X, 119, 55, C8077mf.B, 47, 47, 50, 47, 125, 57, 52, C3307Iz.f0, 62, 50, 51, 51, 56, 62, C3307Iz.a0, 52, 51, 58, 125, C8077mf.y, C3307Iz.a0, C3307Iz.a0, C3307Iz.e0, 8, 47, 49, C8077mf.H, 50, 51, 51, 56, 62, C3307Iz.a0, 52, 50, 51, C8077mf.y, 34, 34, ED2.a, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, ED2.a, 112, 54, 34, ED2.a, C4715Xk.i, 112, C8077mf.E, C3307Iz.d0, C3307Iz.d0, 49, C3307Iz.d0, 126, 49, C3307Iz.f0, 59, 48, 55, 48, 57, 126, C4715Xk.i, 49, 48, 48, 59, C4715Xk.i, 42, 55, 49, 48, 126, 56, 49, C3307Iz.d0, 126, 35, C8077mf.x, C8077mf.x, 9, C8077mf.x, 70, C8077mf.x, 3, 7, 2, C8077mf.q, 8, 1, 70, 2, 7, C8077mf.u, 7, 70, 0, C8077mf.x, 9, C8077mf.m, 70, 92, 96, 96, 100, 65, 102, QC1.w, 71, 123, 97, 102, 119, 113, 111, 97, 102, QC1.w, C3307Iz.a0, 51, 101, 70, 74, 72, 93, 64, 70, 71, 0, ED2.a, 42, C3307Iz.V, 111, C3307Iz.d0, 32, C3307Iz.V, C3307Iz.V, 42, C3307Iz.d0, 59, C3307Iz.Y, 32, C3307Iz.V, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, 31, 92, 80, 81, 75, 90, 81, 75, 31, 86, 81, 89, 80, 31, 89, 77, 80, 82, 31, 106, 93, 89, 92, 81, 86, 95, C8077mf.B, 75, 87, 77, 74, 91, 93, C8077mf.B, C3307Iz.V, C8077mf.D, C8077mf.D, 85, C8077mf.B, C8077mf.x, C8077mf.E, C8077mf.n, 85, 7, C8077mf.r, 17, 28, 7, C8077mf.r, C8077mf.z, 1, 6, 79, 85, 92, 6, 28, 81, 85, 81, 89, 6, 28, C8077mf.H, 5, 8, C8077mf.C, C8077mf.q, 65, 99};
    }

    static {
        A04();
        A07 = C1911kh.class.getSimpleName();
    }

    public C1911kh(String str) {
        this(str, C0889Lj.A01(str));
    }

    public C1911kh(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C1911kh(String str, String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) AbstractC0890Lk.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
        if (r6 != 303) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpURLConnection A02(int i, int i2) throws IOException, C1917kn {
        HttpURLConnection httpURLConnection;
        boolean z;
        int code = 0;
        String str = this.A03;
        do {
            String str2 = A01(234, 16, 75) + (i > 0 ? A01(19, 13, 66) + i : A01(0, 0, 127)) + A01(15, 4, 5) + str;
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty(A01(250, 5, 3), A01(322, 6, 120) + i + A01(50, 1, 44));
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                if (A09[3].length() != 13) {
                    throw new RuntimeException();
                }
                A09[0] = "1Ss55MOjwkg";
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            this.A04 = responseCode;
            if (responseCode != 301) {
                String[] strArr = A09;
                String url = strArr[4];
                String str3 = strArr[6];
                int length = url.length();
                int redirectCount = str3.length();
                if (length == redirectCount) {
                    String[] strArr2 = A09;
                    strArr2[1] = "p6lJtanqIpTVtR8wvrkpKJ2zYO";
                    strArr2[5] = "gJMCNOhCywWTIArSLN7pAqKg27";
                }
                if (z) {
                    str = httpURLConnection.getHeaderField(A01(C9276rZ.p, 8, 45));
                    code++;
                    httpURLConnection.disconnect();
                }
                if (code <= 5) {
                    String url2 = A01(293, 20, 113) + code;
                    throw new C1917kn(url2);
                }
            }
            z = true;
            if (z) {
            }
            if (code <= 5) {
            }
        } while (z);
        return httpURLConnection;
    }

    private void A03() throws C1917kn {
        String str = A01(255, 23, 59) + this.A03;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = A02(0, 10000);
                this.A05 = httpURLConnection.getContentLength();
                this.A06 = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                C0889Lj.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e) {
                Log.e(A07, A01(129, 25, 84) + this.A03, e);
                C0889Lj.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            C0889Lj.A05(inputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i2) throws C1917kn {
        try {
            this.A02 = A02(i, i2);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (IOException e) {
            throw new C1917kn(A01(C3503Kz.n0, 29, 90) + this.A03 + A01(19, 13, 66) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final void AGj(int i) throws C1917kn {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final void close() throws C1917kn {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e) {
                throw new C1917kn(A01(92, 37, 89), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final synchronized int length() throws C1917kn {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final int read(byte[] bArr) throws C1917kn {
        InputStream inputStream = this.A01;
        String A01 = A01(C10997yd1.n2, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                throw new C1917kn(A01(278, 15, 60) + this.A03 + A01(0, 15, 15), e) { // from class: com.facebook.ads.redexgen.X.8K
                };
            } catch (IOException e2) {
                throw new C1917kn(A01 + this.A03, e2);
            }
        }
        throw new C1917kn(A01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
