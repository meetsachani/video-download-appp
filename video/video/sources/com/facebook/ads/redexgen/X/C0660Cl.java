package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.CK1;
import o.FF0;
import o.QC1;
import o.S92;

/* renamed from: com.facebook.ads.redexgen.X.Cl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0660Cl implements InterfaceC1624fv {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public InterfaceC1084Tc A00;
    public Executor A01;
    public boolean A02;
    public C1629g0 A03;
    public final InterfaceC1634g5 A04 = new C0668Cu();
    public final InterfaceC1639gA A05;
    public final InterfaceC1640gB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC1623fu A01(AbstractC1636g7 abstractC1636g7) throws C1637g8 {
        String A072 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        InterfaceC1623fu interfaceC1623fu = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC1636g7.A05(), XD.A04() ? A09() : null);
                A0H(A082, abstractC1636g7);
                A0G(A082, abstractC1636g7);
                if (this.A06.AAZ()) {
                    this.A06.ABt(A082, abstractC1636g7.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z2 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        AbstractC1641gC.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.ABz(A072, AbstractC1085Td.A1z, new C1086Te(e));
                    } catch (Exception e2) {
                        this.A00.ABz(A072, AbstractC1085Td.A1y, new C1086Te(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC1636g7.A06() != null) {
                    A00(A082, abstractC1636g7.A06());
                }
                C0661Cm A06 = A082.getDoInput() ? A06(A082) : new C0661Cm(A082, null);
                if (this.A06.AAZ()) {
                    this.A06.ABu(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Exception e3) {
                try {
                    C0661Cm A05 = A05(null);
                    if (A08[7].length() != 19) {
                        A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                        if (A05 == null || A05.A9C() <= 0) {
                            throw new C1637g8(e3, A05);
                        }
                        if (this.A06.AAZ()) {
                            this.A06.ABu(A05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return A05;
                    }
                    throw new RuntimeException();
                } catch (Exception unused) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 98), e3);
                    if (0 == 0 || interfaceC1623fu.A9C() <= 0) {
                        throw new C1637g8(e3, null);
                    }
                    if (this.A06.AAZ()) {
                        this.A06.ABu(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
            }
        } catch (Throwable th) {
            if (this.A06.AAZ()) {
                this.A06.ABu(null);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, C8077mf.p, 102, 100, 77, 64, 9, 77, 79, C8077mf.H, 93, 75, 76, 82, C8077mf.H, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, C8077mf.z, 80, 75, QC1.w, 116, C8077mf.A, 0, 116, 105, 116, 55, 59, 73, 79, 59, C3307Iz.Y, 59, C3307Iz.Y, 42, 126, QC1.w, 115, 99, 100, 109, 42, 94, 4, 34, C3307Iz.c0, C3307Iz.Y, 55, 52, 34, 35, 71, 51, C3307Iz.f0, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, C4715Xk.i, C8077mf.z, 7, 4, 28, 1, C8077mf.B, 83, C8077mf.z, 1, 1, 28, 1, C8077mf.A, C8077mf.z, 4, 111, 122, C8077mf.z, 7, 7, C8077mf.E, C8077mf.H, C8077mf.x, C8077mf.z, 3, C8077mf.H, C8077mf.B, C8077mf.C, 88, C8077mf.q, 90, 0, 0, 0, 90, 17, C8077mf.B, 5, C8077mf.D, 90, 2, 5, C8077mf.E, C8077mf.u, C8077mf.C, C8077mf.x, C8077mf.B, 19, C8077mf.u, 19, 76, C8077mf.x, 31, C8077mf.z, 5, 4, C8077mf.u, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, C8077mf.D, C8077mf.A, 81, C8077mf.D, C8077mf.A, 83, QC1.w, 100, 100, 96, 62, 96, 98, Byte.MAX_VALUE, 104, 105, 88, Byte.MAX_VALUE, 99, 100, C8077mf.E, 7, 7, 3, 93, 3, 1, 28, C8077mf.m, 10, 35, 28, 1, 7, C3307Iz.a0, 34, 51, 48, 40, 53, C3307Iz.d0};
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
        if (r9.A72() != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
        r3 = r9.A72().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r30.A04 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0165, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0167, code lost:
        r7.ABo(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0183, code lost:
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1623fu A0J(AbstractC1636g7 abstractC1636g7) throws C1637g8 {
        long j;
        InterfaceC1623fu A01;
        int i = 0;
        long currentTimeMillis = System.currentTimeMillis();
        int A012 = abstractC1636g7.A02().A01();
        long A03 = abstractC1636g7.A02().A03();
        long currentTimeMillis2 = System.currentTimeMillis() + abstractC1636g7.A02().A04();
        while (true) {
            if (i >= A012 || currentTimeMillis2 <= System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.AAZ()) {
                    String str = (i + 1) + A07(37, 4, 97) + A012 + A07(56, 9, 27) + abstractC1636g7.A05();
                }
                currentTimeMillis = System.currentTimeMillis();
                A01 = A01(abstractC1636g7);
            } catch (C1637g8 e) {
                if (A0I(e, currentTimeMillis, abstractC1636g7)) {
                    int i2 = A012 - 1;
                    if (A08[1].charAt(0) == 'l') {
                        throw new RuntimeException();
                    }
                    A08[1] = "iDEOxz3pTPjJqVLmMx3mPs9K2XOoyKBI";
                    if (i < i2) {
                        continue;
                    }
                }
                if (!this.A05.ADs(e) || i >= A012 - 1) {
                    InterfaceC1623fu A00 = e.A00();
                    InterfaceC1084Tc interfaceC1084Tc = this.A00;
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    if (A08[1].charAt(0) != 'l') {
                        A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                    } else {
                        A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                    }
                    interfaceC1084Tc.ABo(currentTimeMillis, currentTimeMillis3, j, abstractC1636g7.A04 == null ? 0L : abstractC1636g7.A04.length, A00 == null ? 0 : A00.A9C(), e);
                    throw e;
                } else if (A03 > 0) {
                    try {
                        Thread.sleep(A03);
                    } catch (InterruptedException e2) {
                        this.A00.ABo(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, 0L, abstractC1636g7.A04 != null ? abstractC1636g7.A04.length : 0L, 0, e2);
                        throw e;
                    }
                } else {
                    continue;
                }
            }
            if (A01 != null) {
                this.A00.ABo(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, A01.A72().length, abstractC1636g7.A04 == null ? 0L : abstractC1636g7.A04.length, A01.A9C(), null);
                return A01;
            }
            continue;
            i++;
        }
    }

    static {
        A0A();
        A09 = InterfaceC1624fv.class.getSimpleName();
    }

    public C0660Cl(C1629g0 c1629g0, InterfaceC1084Tc interfaceC1084Tc, Executor executor) {
        A0B();
        this.A03 = c1629g0;
        this.A06 = new C0659Ck(c1629g0.A04());
        final InterfaceC1640gB interfaceC1640gB = this.A06;
        this.A05 = new AbstractC0667Ct(interfaceC1640gB) { // from class: com.facebook.ads.redexgen.X.2i
        };
        this.A01 = executor;
        this.A00 = interfaceC1084Tc;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AGn(httpURLConnection);
            if (outputStream != null) {
                this.A05.AL8(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC1623fu A02(AbstractC1636g7 abstractC1636g7) {
        if (this.A03.A04()) {
            A0C(abstractC1636g7);
        }
        InterfaceC1623fu interfaceC1623fu = null;
        try {
            interfaceC1623fu = A01(abstractC1636g7);
            return interfaceC1623fu;
        } catch (C1637g8 hre) {
            this.A05.ADs(hre);
            return interfaceC1623fu;
        } catch (Exception e) {
            this.A05.ADs(new C1637g8(e, interfaceC1623fu));
            return interfaceC1623fu;
        }
    }

    private final InterfaceC1623fu A03(String str, C1638g9 c1638g9, C1632g3 c1632g3) {
        return A02(new C0663Co(str, c1638g9, c1632g3));
    }

    private final InterfaceC1623fu A04(String str, String str2, byte[] bArr, C1632g3 c1632g3) {
        return A02(new C0662Cn(str, null, str2, bArr, c1632g3));
    }

    private final C0661Cm A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AHT(inputStream);
            }
            C0661Cm c0661Cm = new C0661Cm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c0661Cm;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final C0661Cm A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AGm(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AHT(inputStream);
            }
            C0661Cm c0661Cm = new C0661Cm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c0661Cm;
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AGl(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(CK1.x, 14, 1));
        String proxyAddress = System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (C0660Cl.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC1636g7 abstractC1636g7) {
        StringBuilder sb = new StringBuilder(A07(FF0.q, 10, 43));
        boolean equals = abstractC1636g7.A03().equals(EnumC1635g6.A06);
        String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = abstractC1636g7.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new String(abstractC1636g7.A06(), Charset.forName(A07(130, 5, 83))));
                sb.append(A072);
            }
        }
        for (Map.Entry<String, String> entry : abstractC1636g7.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 10));
        sb.append(abstractC1636g7.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / S92.y) + 1);
    }

    private void A0D(AbstractC1636g7 abstractC1636g7, InterfaceC1625fw interfaceC1625fw) {
        this.A04.A6y(this, interfaceC1625fw, this.A01).A04(abstractC1636g7);
        if (this.A03.A04()) {
            A0C(abstractC1636g7);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 47) + i + A07(65, 1, 96) + i2;
        if (str.length() > 4000) {
            str.substring(0, S92.y);
            A0E(str.substring(S92.y), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC1625fw interfaceC1625fw, C1632g3 c1632g3) {
        C0662Cn req = new C0662Cn(str, null, str2, bArr, c1632g3);
        A0D(req, interfaceC1625fw);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC1636g7 abstractC1636g7) {
        Map<String, String> A06 = abstractC1636g7.A02().A06();
        InterfaceC1622ft A05 = abstractC1636g7.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A6g = A05.A6g(this.A03.A03());
            for (String str2 : A6g.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6g.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC1636g7 abstractC1636g7) throws IOException {
        C1632g3 A02 = abstractC1636g7.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AH6(httpURLConnection, abstractC1636g7.A03(), abstractC1636g7.A04());
    }

    private final boolean A0I(Throwable th, long j, AbstractC1636g7 abstractC1636g7) {
        C1632g3 A02 = abstractC1636g7.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.A06.AAZ()) {
            String str = A07(67, 15, 118) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            int i = (currentTimeMillis > A02.A02() ? 1 : (currentTimeMillis == A02.A02() ? 0 : -1));
            if (A08[4].charAt(1) != 'Y') {
                A08[7] = "tgQXMymp9cIZW";
                return i >= 0;
            }
            throw new RuntimeException();
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final C1629g0 A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fv
    @Deprecated
    public final InterfaceC1623fu AGw(String str, Map<String, String> parameters) {
        return A03(str, new C1638g9(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fv
    @Deprecated
    public final InterfaceC1623fu AGx(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fv
    public final void AGy(String str, byte[] bArr, InterfaceC1625fw interfaceC1625fw) {
        A0F(str, A07(135, 47, 102), bArr, interfaceC1625fw, this.A03.A00());
    }
}
