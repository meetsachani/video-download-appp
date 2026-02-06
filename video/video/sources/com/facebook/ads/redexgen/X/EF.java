package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C2638Cg0;
import o.C3503Kz;
import o.C8077mf;
import o.C9276rZ;

/* loaded from: assets/audience_network/classes2.dex */
public class EF {
    public static byte[] A0L;
    public static String[] A0M = {"pLRRT7xfKKmC", "sDjB9WgW1E6gHf8gwZURHsTrfoUrQz1T", "uiJP8xmaVv", "5XKoBHy1xynVgVvyT837PyBbXD1HwArb", "BpJCepaU8WbBulVTB", "9USxYKvyty1bKFarGQoBTCJfC9", "y9X2NkRV2raN2WQBQaXrllWfrJ", "7FHQr1tSmfn5NF7ZWaBxZ9Q6x0"};
    public int A01;
    public int A02;
    public InterfaceC1550ej A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C1764iE A0C;
    public final C1673gi A0D;
    public final VA A0E;
    public final InterfaceC1549ei A0F;
    public final InterfaceC1558er A0G;
    public final C1559es A0H;
    public final String A0J;
    public final Map<String, String> A0K;
    public final Object A0I = new Object();
    public int A00 = 0;
    public String A04 = null;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public EF(C1673gi c1673gi, VA va, InterfaceC1549ei interfaceC1549ei, String str, boolean z, int i, int i2, boolean z2, Bundle bundle, Map<String, String> map, InterfaceC1558er interfaceC1558er) {
        this.A02 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A0B = false;
        this.A07 = false;
        this.A06 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0D = c1673gi;
        this.A0E = va;
        this.A0F = interfaceC1549ei;
        this.A0J = str;
        this.A0K = map;
        this.A08 = z;
        this.A07 = z2;
        this.A0G = interfaceC1558er;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EH(this, 0.5d, -1.0d, 2.0d, true));
        arrayList.add(new EG(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A0C = new C1764iE(arrayList, bundle.getBundle(A0H(6, 16, 57)), this.A0G);
            this.A02 = bundle.getInt(A0H(97, 18, 74));
            this.A01 = bundle.getInt(A0H(79, 18, 108));
            this.A06 = bundle.getBoolean(A0H(C3503Kz.j0, 10, 97), false);
            this.A0A = bundle.getBoolean(A0H(171, 20, 71), false);
            this.A09 = bundle.getBoolean(A0H(C3503Kz.p0, 15, 59), false);
        } else {
            this.A02 = i;
            this.A01 = i2;
            this.A0C = new C1764iE(arrayList, this.A0G);
        }
        this.A05 = C1123Up.A2W(this.A0D);
        this.A0B = C1123Up.A2a(this.A0D);
        this.A0H = new C1559es(new Handler(), this);
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0L = new byte[]{-86, -84, -67, -78, -72, -73, C2638Cg0.x7, C2638Cg0.z7, -69, -33, C2638Cg0.x7, -42, -45, -34, -29, -73, C2638Cg0.x7, C2638Cg0.n7, C2638Cg0.x7, -47, C2638Cg0.A7, -36, -75, -56, -67, C2638Cg0.p7, -71, -77, C2638Cg0.p7, C2638Cg0.u7, -65, -48, C2638Cg0.s7, C2638Cg0.v7, C2638Cg0.p7, -71, -70, C2638Cg0.p7, -76, -74, C2638Cg0.v7, -66, C2638Cg0.q7, -70, -76, C2638Cg0.q7, -56, -42, -41, -34, -47, -24, -26, -37, -33, -41, -47, -33, -27, C2638Cg0.A7, -32, C2638Cg0.A7, C2638Cg0.n7, -34, C2638Cg0.v7, -45, C2638Cg0.n7, C2638Cg0.z7, C2638Cg0.A7, -30, -69, C2638Cg0.z7, C2638Cg0.s7, C2638Cg0.t7, C2638Cg0.q7, -73, C2638Cg0.A7, -69, -56, 9, -2, C8077mf.r, 17, -33, C8077mf.n, C8077mf.u, C8077mf.m, 1, -2, C8077mf.q, C8077mf.z, -15, 6, 10, 2, -22, -16, -25, -36, -18, -17, C2638Cg0.x7, -19, -22, -30, -19, -32, -18, -18, C2638Cg0.A7, -28, -24, -32, -56, C2638Cg0.z7, -46, -56, C2638Cg0.t7, C2638Cg0.E7, -60, -46, C2638Cg0.n7, -17, -27, -8, -10, C2638Cg0.C7, -17, -11, C2638Cg0.B7, -46, -35, C2638Cg0.E7, -5, -3, -16, -5, -5, -1, C2638Cg0.q7, C2638Cg0.t7, -69, -65, -73, -44, -37, 5, 6, -13, 6, -9, -15, -10, 1, 0, -9, -33, -32, C2638Cg0.y7, -32, -47, C2638Cg0.x7, C2638Cg0.E7, -34, C2638Cg0.A7, C2638Cg0.x7, -46, -43, -34, -47, -48, -21, -20, C2638Cg0.E7, -20, -35, -41, -18, C2638Cg0.C7, -35, -17, C2638Cg0.E7, C2638Cg0.B7, -28, -35, -41, -34, C2638Cg0.C7, -22, -35, -36, -6, -17, -13, -21, -6, -16, -27, -13, -23, -22, -28, C2638Cg0.B7, -37, C2638Cg0.A7, -26, -85, -91, -99, 31, C8077mf.C, 32, 19, 17, 6, 10, 2, -4, 10, C8077mf.r, -70, -69, -93, -74, -73, -78, C2638Cg0.o7, C2638Cg0.p7, -85, -81, -80, -90, -30, -29, C2638Cg0.E7, C2638Cg0.y7, -28, C8077mf.B, 10, C8077mf.q, 5, C8077mf.r, C8077mf.B};
    }

    static {
        A0O();
    }

    private final float A0F() {
        return Y7.A00(this.A0D) * this.A0F.getVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(EnumC1551ek enumC1551ek) {
        int currentPositionInMillis = this.A0F.getCurrentPositionInMillis();
        int i = this.A00 + 1;
        this.A00 = i;
        return A0K(enumC1551ek, currentPositionInMillis, i);
    }

    private Map<String, String> A0K(EnumC1551ek enumC1551ek, int i, int i2) {
        HashMap hashMap = new HashMap();
        Y7.A03(hashMap, this.A0F.getVideoStartReason() == EnumC1560et.A02, !this.A0F.AAV());
        A0U(hashMap);
        A0S(hashMap);
        A0W(hashMap, i);
        A0V(hashMap);
        A0T(hashMap);
        A0n(enumC1551ek, hashMap);
        hashMap.put(A0H(0, 6, 24), String.valueOf(enumC1551ek.A00));
        hashMap.put(A0H(59, 11, 57), String.valueOf(i2));
        return hashMap;
    }

    private void A0M() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(EnumC1551ek.A04));
    }

    private void A0N() {
        if (this.A07 && this.A06) {
            return;
        }
        String str = this.A0J;
        String[] strArr = A0M;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[6] = "FJm4aBnN5GbAhpBnCwQDj";
        A0R(str, A0J(EnumC1551ek.A0A));
    }

    private final void A0P(int i, boolean z, boolean z2) {
        if (i <= 0.0d || i < this.A02) {
            return;
        }
        if (i > this.A02) {
            this.A0C.A06((i - this.A02) / 1000.0f, A0F());
            double A9V = this.A0G.A9V();
            if (A9V < 0.5d && C1123Up.A1i(this.A0D)) {
                this.A0D.A0F().AKk(String.valueOf(A9V));
            }
            this.A02 = i;
            if (z2 || i - this.A01 >= 5000) {
                String str = this.A0J;
                EnumC1551ek enumC1551ek = EnumC1551ek.A09;
                int i2 = this.A00 + 1;
                this.A00 = i2;
                A0R(str, A0K(enumC1551ek, i, i2));
                this.A01 = this.A02;
                this.A0C.A05();
                return;
            }
        }
        if (z) {
            if (this.A07 && this.A06) {
                return;
            }
            this.A06 = true;
            String str2 = this.A0J;
            EnumC1551ek enumC1551ek2 = EnumC1551ek.A09;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            A0R(str2, A0K(enumC1551ek2, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(String str, Map<String, String> data) {
        this.A0E.ACB(str, data);
        if (this.A03 != null) {
            this.A03.AEk();
        }
    }

    private void A0S(Map<String, String> params) {
        C0962Of A03 = this.A0C.A03();
        C0961Oe A00 = A03.A00();
        params.put(A0H(C9276rZ.p, 3, 25), String.valueOf(A00.A00()));
        params.put(A0H(229, 3, 8), String.valueOf(A00.A06()));
        params.put(A0H(232, 5, 59), String.valueOf(A00.A03()));
        params.put(A0H(212, 8, 108), String.valueOf(A00.A02() * 1000.0d));
        params.put(A0H(47, 12, 65), String.valueOf(A00.A01() * 1000.0d));
        params.put(A0H(122, 7, 81), String.valueOf(A00.A04() * 1000.0d));
        if (this.A04 != null) {
            params.put(A0H(220, 6, 19), this.A04);
        }
        C0961Oe A01 = A03.A01();
        params.put(A0H(195, 3, 83), String.valueOf(A01.A00()));
        params.put(A0H(198, 3, 76), String.valueOf(A01.A06()));
        params.put(A0H(201, 5, 61), String.valueOf(A01.A03()));
        params.put(A0H(22, 8, 35), String.valueOf(A01.A02() * 1000.0d));
        params.put(A0H(35, 12, 36), String.valueOf(A01.A01() * 1000.0d));
        params.put(A0H(115, 7, 52), String.valueOf(A01.A04() * 1000.0d));
    }

    private void A0T(Map<String, String> params) {
        if (this.A0K != null) {
            params.putAll(this.A0K);
        }
    }

    private void A0U(Map<String, String> map) {
        map.put(A0H(70, 9, 37), String.valueOf(this.A0F.AAQ()));
        map.put(A0H(C3503Kz.W, 4, 90), Long.toString(this.A0F.getInitialBufferTime()));
    }

    private void A0V(Map<String, String> params) {
        Rect rect = new Rect();
        this.A0F.getGlobalVisibleRect(rect);
        params.put(A0H(C3503Kz.a0, 2, 90), String.valueOf(rect.top));
        params.put(A0H(131, 2, 60), String.valueOf(rect.left));
        params.put(A0H(129, 2, 57), String.valueOf(this.A0F.getMeasuredHeight()));
        params.put(A0H(C3503Kz.h0, 2, 51), String.valueOf(this.A0F.getMeasuredWidth()));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.A0D.getSystemService(A0H(237, 6, 112))).getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0H(206, 3, 4), String.valueOf(displayMetrics.heightPixels));
        params.put(A0H(C3503Kz.b.y, 3, 120), String.valueOf(displayMetrics.widthPixels));
    }

    private void A0W(Map<String, String> map, int i) {
        map.put(A0H(30, 5, 43), String.valueOf(System.currentTimeMillis()));
        map.put(A0H(C3503Kz.c0, 5, 33), String.valueOf(this.A01 / 1000.0f));
        map.put(A0H(191, 4, 85), String.valueOf(i / 1000.0f));
    }

    public final int A0b() {
        return this.A02;
    }

    public final Bundle A0c() {
        A0l(A0b(), A0b());
        Bundle bundle = new Bundle();
        bundle.putInt(A0H(97, 18, 74), this.A02);
        bundle.putInt(A0H(79, 18, 108), this.A01);
        bundle.putBoolean(A0H(C3503Kz.j0, 10, 97), this.A06);
        bundle.putBoolean(A0H(171, 20, 71), this.A0A);
        bundle.putBoolean(A0H(C3503Kz.p0, 15, 59), this.A09);
        bundle.putBundle(A0H(6, 16, 57), this.A0C.A02());
        return bundle;
    }

    public final void A0d() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(EnumC1551ek.A07));
    }

    public final void A0e() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(EnumC1551ek.A08));
    }

    public final void A0f() {
        if (A0F() < 0.05d) {
            synchronized (this.A0I) {
                if (this.A08) {
                    A0M();
                    this.A08 = false;
                }
            }
            return;
        }
        synchronized (this.A0I) {
            if (!this.A08) {
                A0N();
                this.A08 = true;
            }
        }
    }

    public final void A0g() {
        this.A0D.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A0H);
    }

    public final void A0h() {
        this.A0D.getContentResolver().unregisterContentObserver(this.A0H);
    }

    public final void A0i(int i) {
        if (this.A07 && this.A06) {
            return;
        }
        this.A0C.A04();
        A0R(this.A0J, A0J(EnumC1551ek.A05));
        if (this.A05) {
            A0P(i, false, true);
        } else {
            A0P(i, false, ((double) i) < 2000.0d);
        }
        if (this.A0B) {
            this.A0C.A05();
        }
    }

    public final void A0j(int i) {
        A0P(i, true, false);
        if (!this.A07) {
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0k(int i) {
        A0P(i, false, false);
    }

    public final void A0l(int i, int i2) {
        A0P(i, true, false);
        this.A01 = i2;
        this.A02 = i2;
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0m(InterfaceC1550ej interfaceC1550ej) {
        this.A03 = interfaceC1550ej;
    }

    public void A0n(EnumC1551ek enumC1551ek, Map<String, String> params) {
    }

    public final void A0o(EF ef) {
        ef.A06 = this.A06;
        ef.A07 = this.A07;
        ef.A0A = this.A0A;
        ef.A09 = this.A09;
        ef.A02 = this.A02;
        ef.A01 = this.A01;
    }
}
