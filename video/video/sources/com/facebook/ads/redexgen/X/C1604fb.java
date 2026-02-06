package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.fb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1604fb {
    public static C5O A06;
    public static C5 A07;
    public static MP A08;
    public static C1604fb A09;
    public static File A0A;
    public static byte[] A0B;
    public static String[] A0C = {"4y", "AwMrvrZaA3qCUMe4DaWf", "nMell2jjCxhf1iVkS1T4", "JoDZxKxhXC6KTCYPanywHJvOgx3oSz2Q", "c4TvbpAtmy9oRzm3BRhbekxSipSfphPN", "JNxty2uNXQJQugnl9tUmEGg4l4lnFcO6", "Bo5IZ2fGdsUyi7NqIQl4cfXztCU0TldF", "nOSbM9ZPEjvtyh7HAXbSWFPDuf7zpKmZ"};
    public boolean A00;
    public final C1669ge A04;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final SparseArray<C1602fZ> A02 = new SparseArray<>();
    public final Runnable A05 = new RunnableC1601fY(this);
    public final C4 A03 = new D3(this);

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{C8077mf.m, 6, C8077mf.m, 73, 82, 95, 78, 88, 116, 79, 68, 92, 69, 71, 68, 74, 79, 78, 79, 17, 55, 58, 55, 103, 114, 101, 116, 114, 121, 99, 118, 112, 114, 55, 115, QC1.w, 96, 121, 123, QC1.w, 118, 115, 114, 115, C3307Iz.e0, 123, 118, 123, 40, 47, 58, 47, 62, 97, 35, 65, 122, 119, 102, 112, 57, 35, C3307Iz.V, 99, QC1.w, 117, 100, 114, C3307Iz.V, 4, 4, 4, 4, 9, 91, 76, 88, 92, 76, 90, 93, 96, 77, 19, C8077mf.C, 50, 42, 51, 49, 50, 60, 57, 56, 57, 115, 125, C8077mf.p, C3307Iz.a0, 60, C3307Iz.a0, 56, 103, 125, 62, 9, 9, C8077mf.x, 9, 85, 91, 40, C8077mf.q, C8077mf.D, C8077mf.q, C8077mf.H, 65, 91, 110, 91, 73, 81, 126, 123, 113, 104, 50, 123, 112, 104, 113, 115, 112, 126, 123, 108, C3307Iz.X, 32, 55, 84, 86, 84, 95, 82};
    }

    static {
        A0D();
    }

    public C1604fb(C1669ge c1669ge, C5 c5) {
        this.A04 = c1669ge;
        if (c5 != null) {
            A07 = c5;
            c5.A0F(this.A03);
        }
        A03().A0E();
    }

    public static synchronized C5O A01(Context context) {
        C5O c5o;
        synchronized (C1604fb.class) {
            if (A06 == null) {
                A06 = new C2181pI(context);
            }
            c5o = A06;
        }
        return c5o;
    }

    private AO A02() {
        return new AO().A01(A08(135, 3, 65)).A00(null);
    }

    private synchronized C5 A03() {
        A0E();
        return A07;
    }

    public static synchronized MP A04(Context context) {
        MP mp;
        synchronized (C1604fb.class) {
            if (A08 == null) {
                A08 = new C1891kM(new File(A07(context), A08(121, 14, 26)), new AnonymousClass89(C1123Up.A0T(context)));
            }
            mp = A08;
        }
        return mp;
    }

    public static C1898kT A05(C2177pE c2177pE, MP mp) {
        return new C1898kT().A06(mp).A05(c2177pE).A04(new C2171p8()).A03(2);
    }

    public static synchronized C1604fb A06(C1669ge c1669ge) {
        C1604fb c1604fb;
        synchronized (C1604fb.class) {
            if (A09 == null) {
                A09 = new C1604fb(c1669ge, null);
            }
            c1604fb = A09;
        }
        return c1604fb;
    }

    public static synchronized File A07(Context context) {
        File file;
        synchronized (C1604fb.class) {
            if (A0A == null) {
                A0A = context.getCacheDir();
                if (A0A == null) {
                    A0A = context.getFilesDir();
                }
            }
            file = A0A;
        }
        return file;
    }

    public static String A09(C1669ge c1669ge, Uri uri) {
        try {
            if (!C1123Up.A1w(c1669ge)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            c1669ge.A08().ABC(A08(138, 5, 50), AbstractC1085Td.A0u, new C1086Te(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        for (C0634Bk c0634Bk : A03().A0D()) {
            int requestId = c0634Bk.A07.A02.hashCode();
            C1602fZ c1602fZ = this.A02.get(requestId);
            boolean z = c0634Bk.A02 == 2 && c0634Bk.A01() > 0;
            String str = A08(69, 15, 44) + requestId + A08(20, 25, 18) + c0634Bk.A00() + A08(0, 20, 46) + c0634Bk.A01() + A08(45, 9, 94) + c0634Bk.A02;
            if (c1602fZ != null) {
                int state = c0634Bk.A02;
                if (state != 3 && !z && c0634Bk.A00() < 100.0f) {
                    long A01 = c0634Bk.A01();
                    String[] strArr = A0C;
                    if (strArr[7].charAt(29) == strArr[4].charAt(29)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0C;
                    strArr2[3] = "Dot6Q3Penl8IgXRyTYIqC6CBr4bXo7x7";
                    strArr2[6] = "9ocSvY8ybipVJ0ZgVUYrz9Eev0RZQ1px";
                    if (A01 <= c1602fZ.A00) {
                        if (state == 4 || state == 1) {
                            String str2 = A08(103, 14, 126) + state;
                            c1602fZ.A01.ADr(new Throwable(String.valueOf(c0634Bk.A01)));
                            this.A02.remove(requestId);
                        }
                    }
                }
                String str3 = A08(84, 19, 88) + state + A08(54, 8, 6) + c0634Bk.A01();
                c1602fZ.A01.ADj(c1602fZ.A02);
                this.A02.remove(requestId);
            }
            String str4 = A08(117, 4, 63) + requestId + A08(62, 7, 4) + c0634Bk.A01();
        }
    }

    private void A0B() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.post(this.A05);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A01.removeCallbacks(this.A05);
        this.A00 = false;
    }

    private synchronized void A0E() {
        if (A07 == null) {
            A07 = new C5(this.A04, A01(this.A04), A04(this.A04), A0H(this.A04), Executors.newFixedThreadPool(6));
            A07.A0F(this.A03);
        }
    }

    public final C5Y A0H(Context context) {
        return A05(new C2177pE(context, (InterfaceC05015t) null, A02()), A04(context));
    }

    public final void A0I(Uri uri, InterfaceC1603fa interfaceC1603fa, long j) {
        String cacheKey = A09(this.A04, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean A0J = A0J(cacheKey);
        DownloadRequest A05 = new C8(uri.toString(), uri).A00(cacheKey).A05();
        A03().A0G(A05);
        this.A02.put(A05.A02.hashCode(), new C1602fZ(interfaceC1603fa, j, A0J, null));
        A0B();
    }

    public final boolean A0J(String str) {
        return A04(this.A04).A7C(str, 0L, 1L) > 0;
    }
}
