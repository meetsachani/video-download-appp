package com.facebook.ads.redexgen.X;

import android.util.Base64;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.C9276rZ;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1457dC {
    public static byte[] A0K;
    public static String[] A0L = {"QJ7W4e4PJvclr77cDyA2o1qIxMihX3tE", "RH0qaB2vXSlWTV", "TMgHIdn8e0jRrsJAq9rOuGvMgMhVzLRj", "8zeB", "h3DHJTryp4843oQXq4V40YlaMfy8fMY9", "5EUDcWbBtTwBMpPZObVlQHA1Luk9oa", "lBOFkjXt9ejA3EivMitoOA5tI6ifJJ8U", "jkkICjKEbDq5EoZUmm0oqZxt7dyZ5DGY"};
    public static final AtomicInteger A0M;
    public static final AtomicInteger A0N;
    public InterfaceC1446d1 A02;
    public InterfaceC1455dA A03;
    public InterfaceC1456dB A04;
    public C1618fp A05;
    public final int A08;
    public final AbstractC1847jd A09;
    public final C1079Sx A0A;
    public final C1673gi A0B;
    public final VA A0C;
    public final VI A0D;
    public final C1444cz A0E;
    public final C0821It A0F;
    public final C1464dJ A0G;
    public final C1465dK A0H;
    public final LinkedList<C1454d9> A0J = new LinkedList<>();
    public Y2 A01 = new Y2();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 56);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{-71, -79, -87, -83, -84, -87, -85, -67, -22, -32, -18, -21, -27, -32, C2638Cg0.s7, -22, -16, C2638Cg0.C7, -18, -30, -35, -33, C2638Cg0.C7, -12, -9, -27, -8, 3, 2, 5, 7, -4, 1, -6, C2638Cg0.E7, -4, 1, -4, 6, -5, -8, -9, -69, -70, -72, 6, -70, -68, C2638Cg0.z7, -37, -34, -52, -33, -22, -23, -20, -18, -29, -24, C2638Cg0.C7, C2638Cg0.y7, -18, -37, -20, -18, -33, -34, -94, -95, -97, -19, -95, -93, -75, -103, -84, -84, -103, -101, -96, -99, -100, -113, -114, -122, -83, -91, -16, -17, 2, -15, -10, -13, -14, -44, 0, -17, -5, -13, -46, -17, 2, -17, 6, C8077mf.B, C8077mf.y, C8077mf.y, 8, 17, C8077mf.A, -6, -7, -15, C8077mf.B, C8077mf.r, 28, 40, C8077mf.A, 35, C8077mf.E, C3307Iz.a0, -52, C2638Cg0.x7, -98, C2638Cg0.o7, -47, C2638Cg0.t7, -45, C2638Cg0.t7, -47, -42, -83, -66, -46, -48, C2638Cg0.q7, C2638Cg0.p7, -123, -124, -126, -48, -124, -122, -104, -29, -30, -75, -41, -24, -35, -22, -35, -24, -19, C2638Cg0.t7, C2638Cg0.E7, -25, -23, C2638Cg0.C7, C2638Cg0.E7, C2638Cg0.n7, -100, -101, -103, -25, -101, -99, -81, C8077mf.x, 19, -24, 17, C8077mf.x, C8077mf.B, 10, -21, C8077mf.D, 17, 17, C8077mf.B, 8, C8077mf.A, 10, 10, 19, -5, C8077mf.p, 10, 28, C2638Cg0.y7, -52, C2638Cg0.w7, C8077mf.B, -52, C2638Cg0.z7, -83, -84, -124, -77, -86, -86, -79, -95, -80, -93, -93, -84, -108, -89, -93, -75, 102, 101, 99, -79, 101, 103, -82, -83, -107, -96, -85, -76, -92, -111, -92, -96, -93, 103, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 104, 122, 28, C8077mf.E, 3, C8077mf.p, C8077mf.C, 34, C8077mf.u, 4, 31, C8077mf.z, C3307Iz.V, C3307Iz.V, C8077mf.u, C8077mf.E, -43, -44, -46, 32, -44, C2638Cg0.E7, C2638Cg0.y7, -44, -46, 32, -44, -42, -24, -71, -85, -87, -75, -76, -86, -91, -87, -82, -89, -76, -76, -85, -78, -81, -95, -80, 125, -79, -80, -92, -121, -95, -75, 100, 99, 97, -81, 99, 104, 99, 97, -81, 99, 101, 119, -9, -23, -8, C2638Cg0.t7, -27, -9, -23, -70, -72, C2638Cg0.s7, -9, -9, -23, -8, -9, -84, -85, -87, -9, -85, -80, -85, -87, -9, -85, -83, C2638Cg0.C7, -45, -30, -80, C2638Cg0.A7, C2638Cg0.C7, -45, -92, -94, -79, -35, -36, -44, -41, -43, -106, -107, -109, C2638Cg0.C7, -107, -102, -107, -109, C2638Cg0.C7, -107, -105, -77, -82, -77, -96, -85, -106, -107, -115, -76, -84, C2638Cg0.t7, C2638Cg0.r7, -67, -34, -47, -52, C2638Cg0.y7, -41, -83, -34, C2638Cg0.y7, -42, -36, -112, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -111, -93, -78, -91, -95, -77, -114, -95, -99, -96, -75, -112, -85, -113, -92, -85, -77, 100, 99, 97, -81, 99, 101, 119};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0i(Map<String, String> map) {
        String A0A = A0A(87, 16, 86);
        if (map.containsKey(A0A) && C1123Up.A20(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(A0A));
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        C1778iT c1778iT = new C1778iT(this.A09.A2E(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        c1778iT.A06(Long.parseLong(string4));
                        arrayList.add(c1778iT);
                    }
                }
                String A01 = C1777iS.A01(arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(115, 6, 126), A01);
                if (A01 != null) {
                    this.A0C.ABy(this.A09.A2E(), hashMap);
                }
            } catch (Exception e) {
                this.A0B.A08().ABC(A0A(C9276rZ.q, 14, 14), 3600, new C1086Te(e));
            }
        }
        boolean containsKey = map.containsKey(A0A);
        if (A0L[0].charAt(7) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[4] = "rUTki8v1ZwD35w0l1wx8OInXS6BY1neH";
        strArr[7] = "OANcXSK4xu3EG1xYwZDVITEIbLyQGtEs";
        if (containsKey) {
            map.remove(A0A);
        }
        this.A0C.ABB(this.A09.A2E(), new C1330b9(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0N = new AtomicInteger();
        A0M = new AtomicInteger();
    }

    public C1457dC(C1673gi c1673gi, AbstractC1847jd abstractC1847jd, VA va, int i) {
        this.A0B = c1673gi;
        this.A0C = va;
        this.A09 = abstractC1847jd;
        this.A08 = i;
        this.A0F = new C0821It(this, c1673gi);
        this.A0A = new C1079Sx(this.A0B);
        this.A0D = new VI(abstractC1847jd.A2E(), va);
        this.A0E = new C1444cz(abstractC1847jd.A1D(), abstractC1847jd.A29().A0H().A09(), i);
        this.A0H = AbstractC1466dL.A00(this.A0B, abstractC1847jd.A1H(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new C1464dJ(this.A0B, this, va, this.A0E, this.A0I, abstractC1847jd.A2E());
    }

    public static AtomicInteger A0B() {
        return A0M;
    }

    private void A0C() {
        A0F(new C1454d9(A0A(288, 22, 4), new String[]{this.A0I, A0A(1, 6, 67)}));
        String replace = Base64.encodeToString(this.A0H.A04.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35));
        String assets = this.A0I;
        A0F(new C1454d9(A0A(310, 26, 76), new String[]{replace, assets}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                C1454d9 poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A0I(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A04(VH.A0L, null);
                        this.A0B.A0F().A65(poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(C1454d9 c1454d9) {
        this.A0J.offer(c1454d9);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return C1123Up.A30(this.A0B, C1600fX.A03());
    }

    public final VI A0K() {
        return this.A0D;
    }

    public final Y2 A0L() {
        return this.A01;
    }

    public final C1444cz A0M() {
        return this.A0E;
    }

    public final InterfaceC1446d1 A0N() {
        return this.A02;
    }

    public final C0821It A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new C1454d9(A0A(23, 26, 91), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new C1454d9(A0A(49, 25, 66), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new C1454d9(A0A(121, 23, 37), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new C1454d9(A0A(168, 27, 109), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new C1454d9(A0A(195, 22, 6), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new C1454d9(A0A(ServiceStarter.g, 22, 4), new String[]{this.A0I}));
    }

    public final void A0X() {
        this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 68));
        this.A0D.A04(VH.A0O, null);
        String str = this.A0H.A00;
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 25);
            jSONObject.put(url, str);
            String url2 = A0A(103, 12, 107);
            jSONObject.put(url2, AbstractC1458dD.A00());
            String url3 = A0A(362, 10, 7);
            jSONObject.put(url3, A0N.getAndIncrement());
            String url4 = A0A(74, 13, 0);
            jSONObject.put(url4, A0M);
        } catch (JSONException unused) {
        }
        this.A0B.A0F().A6B(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new C1454d9(A0A(C3503Kz.h0, 24, 60), new String[]{this.A0I}));
    }

    public final void A0Z(Y2 y2) {
        this.A01 = y2;
    }

    public final void A0a(InterfaceC1446d1 interfaceC1446d1) {
        this.A02 = interfaceC1446d1;
    }

    public final void A0b(InterfaceC1455dA interfaceC1455dA) {
        this.A03 = interfaceC1455dA;
    }

    public final void A0c(InterfaceC1456dB interfaceC1456dB) {
        this.A04 = interfaceC1456dB;
    }

    public final void A0d(InterfaceC0820Is interfaceC0820Is) {
        this.A0G.A0N(interfaceC0820Is);
    }

    public final void A0e(C1618fp c1618fp) {
        this.A05 = c1618fp;
    }

    public final void A0f(String str) {
        A0F(new C1454d9(A0A(247, 27, 117), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new C1454d9(A0A(217, 30, 7), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new C1454d9(A0A(375, 29, 48), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        String replace = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35));
        String assets = this.A0I;
        A0F(new C1454d9(A0A(336, 26, 54), new String[]{replace, assets}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
