package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.ads.androidx.media3.exoplayer.offline.Download;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.CK1;

/* loaded from: assets/audience_network/classes2.dex */
public final class C2 extends Handler {
    public static byte[] A0D;
    public static String[] A0E = {"iNmXvBj9FTihCrbZiC4S7zhCL1s9H33W", "EvGedAo1NbwIZrU2eJLjABwCKULHNO", "OhLMnivBPD1ct3YE1XOZQ5ppblACA0SV", "Bbpc8NZfeBPLrlsLcOoRpsaFZoo07Ukk", "cYMMpvUaIb0CtoOD5hU2j4Ih7c76pz", "QlCwnx", "3GDIv0eUOBpBneHy6OJWPXV1MBWevv42", "cGd21R9dzjO1"};
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final CJ A09;
    public final InterfaceC2098nw A0A;
    public final ArrayList<C0634Bk> A0B;
    public final HashMap<String, C2102o0> A0C;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0D = new byte[]{-42, C2638Cg0.w7, -9, 34, 42, C3307Iz.V, 31, 34, C8077mf.x, C8077mf.A, 0, C8077mf.x, C3307Iz.V, C8077mf.x, C8077mf.D, C8077mf.B, C3307Iz.X, C2638Cg0.r7, -34, -26, -23, -30, C2638Cg0.C7, -99, -15, -20, -99, -23, -20, -34, C2638Cg0.C7, -99, C2638Cg0.C7, -20, -12, -21, -23, -20, -34, C2638Cg0.C7, -73, -99, -109, -82, -74, -71, -78, -79, 109, C2638Cg0.p7, -68, 109, -71, -68, -82, -79, 109, -79, -68, -60, -69, -71, -68, -82, -79, C2638Cg0.o7, 123, -99, -72, C2638Cg0.o7, C2638Cg0.r7, -68, -69, 119, C2638Cg0.x7, C2638Cg0.t7, 119, C2638Cg0.r7, C2638Cg0.t7, -72, -69, 119, C2638Cg0.o7, C2638Cg0.s7, -69, -68, C2638Cg0.A7, -123, -87, -60, -52, C2638Cg0.A7, -56, C2638Cg0.u7, -125, -41, -46, -125, -43, -56, -48, -46, C2638Cg0.E7, -56, -125, C2638Cg0.v7, -43, -46, -48, -125, C2638Cg0.u7, -60, -41, -60, C2638Cg0.s7, -60, -42, -56, -109, -82, -74, -71, -78, -79, 109, C2638Cg0.p7, -68, 109, -65, -78, -70, -68, C2638Cg0.r7, -78, 109, -69, -68, -69, -78, C2638Cg0.s7, -74, C2638Cg0.o7, C2638Cg0.p7, -78, -69, C2638Cg0.p7, 109, -79, -68, -60, -69, -71, -68, -82, -79, -121, 109, -12, C8077mf.q, C8077mf.A, C8077mf.D, 19, C8077mf.u, C2638Cg0.z7, 34, C8077mf.G, C2638Cg0.z7, C3307Iz.V, 19, 34, C2638Cg0.z7, C8077mf.E, C8077mf.q, 28, 35, C8077mf.q, C8077mf.D, C2638Cg0.z7, C3307Iz.V, 34, C8077mf.G, C8077mf.H, C2638Cg0.z7, 32, 19, C8077mf.q, C3307Iz.V, C8077mf.G, 28, -113, -86, -78, -75, -82, -83, 105, -67, -72, 105, -68, -82, -67, 105, -74, -86, -73, -66, -86, -75, 105, -68, -67, -72, -71, 105, -69, -82, -86, -68, -72, -73, -125, 105, -67, C2638Cg0.n7, -32, -29, -36, -37, -105, -21, -26, -105, -20, -25, -37, C2638Cg0.n7, -21, -36, -105, -32, -27, -37, -36, -17, -91, -13, 0, C8077mf.u, 10, -65, 5, 0, 8, C8077mf.m, 4, 3, C2638Cg0.E7, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0Q(DownloadRequest downloadRequest, int i) {
        C0634Bk A06 = A06(downloadRequest.A02, true);
        long currentTimeMillis = System.currentTimeMillis();
        if (A06 != null) {
            A03(C5.A00(A06, downloadRequest, i, currentTimeMillis));
        } else {
            A03(new C0634Bk(downloadRequest, i != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i, 0));
        }
        A0B();
    }

    static {
        A0D();
    }

    public C2(HandlerThread handlerThread, InterfaceC2098nw interfaceC2098nw, CJ cj, Handler handler, int i, int i2, boolean z) {
        super(handlerThread.getLooper());
        this.A08 = handlerThread;
        this.A0A = interfaceC2098nw;
        this.A09 = cj;
        this.A07 = handler;
        this.A02 = i;
        this.A03 = i2;
        this.A05 = z;
        this.A0B = new ArrayList<>();
        this.A0C = new HashMap<>();
    }

    public static int A00(C0634Bk c0634Bk, C0634Bk c0634Bk2) {
        return C5C.A08(c0634Bk.A05, c0634Bk2.A05);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(String str) {
        for (int i = 0; i < i; i++) {
            DownloadRequest downloadRequest = this.A0B.get(i).A07;
            String[] strArr = A0E;
            String str2 = strArr[4];
            String str3 = strArr[2];
            int length = str2.length();
            int i2 = str3.length();
            if (length == i2) {
                throw new RuntimeException();
            }
            A0E[6] = "id4WW5MNYn317aHfBDbhwYGK6MIHb4Bm";
            if (downloadRequest.A02.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private C0634Bk A03(C0634Bk c0634Bk) {
        AbstractC04543y.A08((c0634Bk.A02 == 3 || c0634Bk.A02 == 4) ? false : true);
        int A02 = A02(c0634Bk.A07.A02);
        if (A02 == -1) {
            this.A0B.add(c0634Bk);
            Collections.sort(this.A0B, new C1());
        } else {
            int changedIndex = (c0634Bk.A05 > this.A0B.get(A02).A05 ? 1 : (c0634Bk.A05 == this.A0B.get(A02).A05 ? 0 : -1));
            boolean z = changedIndex != 0;
            this.A0B.set(A02, c0634Bk);
            if (z) {
                Collections.sort(this.A0B, new C1());
            }
        }
        try {
            this.A0A.AHF(c0634Bk);
        } catch (IOException e) {
            AbstractC04624g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A07.obtainMessage(2, new C0(c0634Bk, false, new ArrayList(this.A0B), null)).sendToTarget();
        return c0634Bk;
    }

    private C0634Bk A04(C0634Bk c0634Bk, int i, int i2) {
        AbstractC04543y.A08((i == 3 || i == 4) ? false : true);
        return A03(A05(c0634Bk, i, i2));
    }

    public static C0634Bk A05(C0634Bk c0634Bk, int i, int i2) {
        return new C0634Bk(c0634Bk.A07, i, c0634Bk.A05, System.currentTimeMillis(), c0634Bk.A04, i2, 0, c0634Bk.A00);
    }

    private C0634Bk A06(String str, boolean z) {
        int A02 = A02(str);
        if (A02 != -1) {
            return this.A0B.get(A02);
        }
        if (z) {
            try {
                return this.A0A.A7q(str);
            } catch (IOException e) {
                AbstractC04624g.A08(A08(2, 15, 106), A08(17, 25, 52) + str, e);
                return null;
            }
        }
        return null;
    }

    private C2102o0 A07(C2102o0 c2102o0, C0634Bk c0634Bk) {
        if (c2102o0 != null) {
            AbstractC04543y.A08(!C2102o0.A03(c2102o0));
            c2102o0.A05(false);
            return c2102o0;
        } else if (A0U() && this.A01 < this.A02) {
            C0634Bk A04 = A04(c0634Bk, 2, 0);
            C2102o0 c2102o02 = new C2102o0(A04.A07, this.A09.A5M(A04.A07), A04.A00, false, this.A03, this);
            this.A0C.put(A04.A07.A02, c2102o02);
            int i = this.A01;
            this.A01 = i + 1;
            if (i == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            c2102o02.start();
            return c2102o02;
        } else {
            return null;
        }
    }

    private void A09() {
        for (C2102o0 c2102o0 : this.A0C.values()) {
            c2102o0.A05(true);
        }
        try {
            this.A0A.AJO();
        } catch (IOException e) {
            AbstractC04624g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A0B.clear();
        this.A08.quit();
        synchronized (this) {
            this.A00 = true;
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0A() {
        String A08 = A08(2, 15, 106);
        ArrayList arrayList = new ArrayList();
        try {
            C2105o4 A7r = this.A0A.A7r(3, 4);
            while (A7r.A01()) {
                arrayList.add(A7r.A00());
            }
            if (A7r != null) {
                A7r.close();
            }
        } catch (IOException unused) {
            AbstractC04624g.A05(A08, A08(42, 25, 4));
        }
        for (int i = 0; i < this.A0B.size(); i++) {
            this.A0B.set(i, A05(this.A0B.get(i), 5, 0));
        }
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            if (A0E[6].charAt(14) != 'H') {
                break;
            }
            String[] strArr = A0E;
            strArr[1] = "XqOejHHacjjZLx98zpLnY1LZJhfsrk";
            strArr[7] = "zG4BgrMO4aUj";
            if (i2 < size) {
                ArrayList<C0634Bk> arrayList2 = this.A0B;
                C0634Bk c0634Bk = (C0634Bk) arrayList.get(i2);
                String[] strArr2 = A0E;
                if (strArr2[4].length() == strArr2[2].length()) {
                    break;
                }
                A0E[3] = "KT3y83B5rUupwCjllTydcOADIPFLf4ae";
                arrayList2.add(A05(c0634Bk, 5, 0));
                i2++;
            } else {
                List<Download> terminalDownloads = this.A0B;
                Collections.sort(terminalDownloads, new C1());
                try {
                    this.A0A.AJp();
                } catch (IOException e) {
                    AbstractC04624g.A08(A08, A08(223, 23, 46), e);
                }
                ArrayList arrayList3 = new ArrayList(this.A0B);
                for (int i3 = 0; i3 < this.A0B.size(); i3++) {
                    this.A07.obtainMessage(2, new C0(this.A0B.get(i3), false, arrayList3, null)).sendToTarget();
                }
                A0B();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0B() {
        int i = 0;
        for (int i2 = 0; i2 < accumulatingDownloadTaskCount; i2++) {
            C0634Bk download = this.A0B.get(i2);
            C2102o0 c2102o0 = this.A0C.get(download.A07.A02);
            int accumulatingDownloadTaskCount = download.A02;
            switch (accumulatingDownloadTaskCount) {
                case 0:
                    c2102o0 = A07(c2102o0, download);
                    break;
                case 1:
                    A0M(c2102o0);
                    break;
                case 2:
                    AbstractC04543y.A01(c2102o0);
                    A0P(c2102o0, download, i);
                    break;
                case 3:
                case 4:
                case 6:
                default:
                    throw new IllegalStateException();
                case 5:
                case 7:
                    A0O(c2102o0, download);
                    break;
            }
            if (c2102o0 != null && !C2102o0.A03(c2102o0)) {
                i++;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0C() {
        for (int i = 0; i < i; i++) {
            C0634Bk c0634Bk = this.A0B.get(i);
            if (c0634Bk.A02 == 2) {
                try {
                    this.A0A.AHF(c0634Bk);
                } catch (IOException e) {
                    AbstractC04624g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
                }
            }
        }
        sendEmptyMessageDelayed(11, 5000L);
    }

    private void A0E(int i) {
        this.A04 = i;
        C2105o4 c2105o4 = null;
        try {
            try {
                this.A0A.AJO();
                c2105o4 = this.A0A.A7r(0, 1, 2, 5, 7);
                while (c2105o4.A01()) {
                    this.A0B.add(c2105o4.A00());
                }
            } catch (IOException e) {
                AbstractC04624g.A08(A08(2, 15, 106), A08(67, 21, 14), e);
                this.A0B.clear();
            }
            C5C.A10(c2105o4);
            this.A07.obtainMessage(0, new ArrayList(this.A0B)).sendToTarget();
            A0B();
        } catch (Throwable th) {
            C5C.A10(c2105o4);
            throw th;
        }
    }

    private void A0F(int i) {
        this.A02 = i;
        A0B();
    }

    private void A0G(int i) {
        this.A03 = i;
    }

    private void A0H(int i) {
        this.A04 = i;
        A0B();
    }

    private void A0I(C0634Bk c0634Bk) {
        if (c0634Bk.A02 == 7) {
            int i = c0634Bk.A03 == 0 ? 0 : 1;
            int state = c0634Bk.A03;
            A04(c0634Bk, i, state);
            A0B();
            return;
        }
        this.A0B.remove(A02(c0634Bk.A07.A02));
        try {
            this.A0A.AIR(c0634Bk.A07.A02);
        } catch (IOException unused) {
            String A08 = A08(2, 15, 106);
            String[] strArr = A0E;
            String str = strArr[1];
            String str2 = strArr[7];
            int length = str.length();
            int removeIndex = str2.length();
            if (length == removeIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[4] = "0mOws7zeqclkbY70VWtV8amCVjdjwc";
            strArr2[2] = "5byiBwQrvMTmrLaxdcHCyvzuNe0iHvcw";
            AbstractC04624g.A05(A08, A08(88, 30, 26));
        }
        this.A07.obtainMessage(2, new C0(c0634Bk, true, new ArrayList(this.A0B), null)).sendToTarget();
    }

    private void A0J(C0634Bk c0634Bk, int i) {
        if (i == 0) {
            if (c0634Bk.A02 == 1) {
                A04(c0634Bk, 0, 0);
                return;
            }
            return;
        }
        int i2 = c0634Bk.A03;
        if (A0E[6].charAt(14) != 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "qDoL4xVSTO8RDQU7ZVoZcH2BhkCOc4";
        strArr[2] = "ugBXxeG19GlyVlR2WcoXaVyqVtSsbrKH";
        if (i == i2) {
            return;
        }
        int i3 = c0634Bk.A02;
        A03(new C0634Bk(c0634Bk.A07, (i3 == 0 || i3 == 2) ? 1 : 1, c0634Bk.A05, System.currentTimeMillis(), c0634Bk.A04, i, 0, c0634Bk.A00));
    }

    private void A0K(C0634Bk c0634Bk, Exception exc) {
        int i;
        DownloadRequest downloadRequest = c0634Bk.A07;
        int i2 = exc == null ? 3 : 4;
        long j = c0634Bk.A05;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = c0634Bk.A04;
        int i3 = c0634Bk.A03;
        if (exc == null) {
            i = 0;
        } else {
            i = 1;
        }
        C0634Bk c0634Bk2 = new C0634Bk(downloadRequest, i2, j, currentTimeMillis, j2, i3, i, c0634Bk.A00);
        this.A0B.remove(A02(c0634Bk2.A07.A02));
        try {
            this.A0A.AHF(c0634Bk2);
        } catch (IOException e) {
            AbstractC04624g.A08(A08(2, 15, 106), A08(223, 23, 46), e);
        }
        this.A07.obtainMessage(2, new C0(c0634Bk2, false, new ArrayList(this.A0B), exc)).sendToTarget();
    }

    private void A0L(C2102o0 c2102o0) {
        String str = C2102o0.A01(c2102o0).A02;
        this.A0C.remove(str);
        boolean A03 = C2102o0.A03(c2102o0);
        if (A03) {
            this.A06 = false;
        } else {
            int i = this.A01 - 1;
            this.A01 = i;
            if (i == 0) {
                removeMessages(11);
            }
        }
        if (C2102o0.A04(c2102o0)) {
            A0B();
            return;
        }
        Exception finalException = C2102o0.A02(c2102o0);
        if (finalException != null) {
            StringBuilder sb = new StringBuilder();
            String downloadId = A08(246, 13, 86);
            StringBuilder append = sb.append(downloadId).append(C2102o0.A01(c2102o0));
            String downloadId2 = A08(0, 2, 97);
            String sb2 = append.append(downloadId2).append(A03).toString();
            String downloadId3 = A08(2, 15, 106);
            AbstractC04624g.A08(downloadId3, sb2, finalException);
        }
        C0634Bk A06 = A06(str, false);
        if (A0E[3].charAt(4) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "ylCSlCHYxJLig8GFragBjcnbyuXWai";
        strArr[2] = "OMWcFhgpmCCD5KtgAO70M2kgxcAld7fK";
        C0634Bk c0634Bk = (C0634Bk) AbstractC04543y.A01(A06);
        switch (c0634Bk.A02) {
            case 2:
                AbstractC04543y.A08(!A03);
                A0K(c0634Bk, finalException);
                break;
            case 3:
            case 4:
            case 6:
            default:
                throw new IllegalStateException();
            case 5:
            case 7:
                AbstractC04543y.A08(A03);
                A0I(c0634Bk);
                break;
        }
        A0B();
    }

    private void A0M(C2102o0 c2102o0) {
        if (c2102o0 != null) {
            AbstractC04543y.A08(!C2102o0.A03(c2102o0));
            c2102o0.A05(false);
        }
    }

    private void A0N(C2102o0 c2102o0, long j) {
        C0634Bk c0634Bk = (C0634Bk) AbstractC04543y.A01(A06(C2102o0.A01(c2102o0).A02, false));
        if (j == c0634Bk.A04 || j == -1) {
            return;
        }
        A03(new C0634Bk(c0634Bk.A07, c0634Bk.A02, c0634Bk.A05, System.currentTimeMillis(), j, c0634Bk.A03, c0634Bk.A01, c0634Bk.A00));
    }

    private void A0O(C2102o0 c2102o0, C0634Bk c0634Bk) {
        if (c2102o0 != null) {
            if (!C2102o0.A03(c2102o0)) {
                c2102o0.A05(false);
                return;
            }
            return;
        }
        boolean z = this.A06;
        if (A0E[3].charAt(4) != '8') {
            throw new RuntimeException();
        }
        A0E[0] = "e4XXQnURg6mIpThj5jyh4wOBvzx0EgPt";
        if (z) {
            return;
        }
        C2102o0 c2102o02 = new C2102o0(c0634Bk.A07, this.A09.A5M(c0634Bk.A07), c0634Bk.A00, true, this.A03, this);
        this.A0C.put(c0634Bk.A07.A02, c2102o02);
        this.A06 = true;
        c2102o02.start();
    }

    private void A0P(C2102o0 c2102o0, C0634Bk c0634Bk, int i) {
        AbstractC04543y.A08(!C2102o0.A03(c2102o0));
        if (!A0U() || i >= this.A02) {
            A04(c0634Bk, 0, 0);
            c2102o0.A05(false);
        }
    }

    private void A0R(String str) {
        C0634Bk A06 = A06(str, true);
        if (A06 == null) {
            AbstractC04624g.A05(A08(2, 15, 106), A08(118, 39, 4) + str);
            return;
        }
        A04(A06, 5, 0);
        A0B();
    }

    private void A0S(String str, int i) {
        String A08 = A08(2, 15, 106);
        if (str == null) {
            for (int i2 = 0; i2 < this.A0B.size(); i2++) {
                A0J(this.A0B.get(i2), i);
            }
            try {
                this.A0A.AJq(i);
            } catch (IOException e) {
                AbstractC04624g.A08(A08, A08(C3503Kz.q0, 32, 101), e);
            }
        } else {
            C0634Bk A06 = A06(str, false);
            if (A06 != null) {
                A0J(A06, i);
            } else {
                try {
                    this.A0A.AJr(str, i);
                } catch (IOException e2) {
                    AbstractC04624g.A08(A08, A08(CK1.w, 34, 0) + str, e2);
                }
            }
        }
        A0B();
    }

    private void A0T(boolean z) {
        this.A05 = z;
        A0B();
    }

    private boolean A0U() {
        if (!this.A05) {
            int i = this.A04;
            if (A0E[6].charAt(14) != 'H') {
                throw new RuntimeException();
            }
            A0E[5] = "cfwXoVsCs";
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (WU.A02(this)) {
            return;
        }
        boolean z = true;
        try {
            switch (message.what) {
                case 0:
                    A0E(message.arg1);
                    break;
                case 1:
                    A0T(message.arg1 != 0);
                    break;
                case 2:
                    A0H(message.arg1);
                    break;
                case 3:
                    A0S((String) message.obj, message.arg1);
                    break;
                case 4:
                    A0F(message.arg1);
                    break;
                case 5:
                    A0G(message.arg1);
                    break;
                case 6:
                    A0Q((DownloadRequest) message.obj, message.arg1);
                    break;
                case 7:
                    A0R((String) message.obj);
                    break;
                case 8:
                    A0A();
                    break;
                case 9:
                    A0L((C2102o0) message.obj);
                    z = false;
                    break;
                case 10:
                    A0N((C2102o0) message.obj, C5C.A0N(message.arg1, message.arg2));
                    return;
                case 11:
                    A0C();
                    return;
                case 12:
                    A09();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.A07.obtainMessage(1, z ? 1 : 0, this.A0C.size()).sendToTarget();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
