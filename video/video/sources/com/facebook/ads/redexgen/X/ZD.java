package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.internal.C2372q;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import o.C2638Cg0;
import o.InterfaceC8148mw2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZD implements UR {
    public static byte[] A03;
    public static String[] A04 = {"Mm6eOmxrkeU2", "MUq44yb", "oKRPVLX0GnKoqIxxSACkHhthyeGglJDi", "kpHGdbOqKKCIQYGNabgqln8bHLF6fw56", "0pAnM9hA2pxuChyanVmC1wYC", "qxO1zNdoKC3MMUxTs0mhMJ4wGZPx", "", "oKuuJ477mGyxhVSdv1rWN1Mids3hq7ZK"};
    public static final String A05;
    public final C1669ge A00;
    public final InterfaceC1110Uc<V7> A01;
    public final InterfaceC1110Uc<V7> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A04[4] = "X42DzCMkQ4HFIzVdD0OsfCNEPJzG";
            copyOfRange[i4] = (byte) (i5 - 23);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        if (A04[4].length() == 9) {
            throw new RuntimeException();
        }
        A04[4] = "UWvzDGqGj7QUhJ5x6ip4Rlib";
        A03 = new byte[]{101, 99, -78, -87, 99, -73, -68, -77, -88, 125, 99, 115, -106, 119, -88, -105, -96, -90, -123, -90, -95, -92, -109, -103, -105, -124, -105, -107, -95, -92, -106, 118, -109, -90, -109, -108, -109, -91, -105, -110, -77, -70, -77, C2638Cg0.q7, -77, -78, 110, -77, -60, -77, -68, C2638Cg0.q7, -120, 110, 112, -90, C2638Cg0.p7, C2638Cg0.v7, -52, C2638Cg0.s7, -60, Byte.MIN_VALUE, -44, C2638Cg0.A7, Byte.MIN_VALUE, C2638Cg0.r7, -52, C2638Cg0.s7, C2638Cg0.p7, -46, Byte.MIN_VALUE, C2638Cg0.s7, -42, C2638Cg0.s7, C2638Cg0.z7, -44, -45, Byte.MIN_VALUE, -45, -44, C2638Cg0.A7, -46, C2638Cg0.p7, C2638Cg0.u7, C2638Cg0.s7, 107, -122, -114, -111, -118, -119, 69, -103, -108, 69, -119, -118, -104, -118, -105, -114, -122, -111, -114, -97, -118, 69, -122, -109, 69, -118, -101, -118, -109, -103, 69, -117, -105, -108, -110, 69, -119, -122, -103, -122, -121, -122, -104, -118, 69, -74, -47, C2638Cg0.E7, -36, -43, -44, -112, -28, -33, -112, -35, -33, -26, -43, -112, -43, -26, -43, -34, -28, -29, -112, -42, -30, -33, -35, -112, C2638Cg0.E7, -34, -99, -42, -36, C2638Cg0.E7, -41, C2638Cg0.n7, -28, -112, -29, -28, -33, -30, -47, -41, -43, -112, -46, -47, -45, -37, -112, -28, -33, -112, -43, -26, -43, -34, -28, -29, -112, -44, -47, -28, -47, -46, -47, -29, -43, C2638Cg0.n7, -13, -5, -2, -9, -10, -78, 6, 1, -78, 2, -13, 4, 5, -9, -78, -13, 0, -78, -9, 8, -9, 0, 6, -78, -8, 4, 1, -1, -78, -5, 0, -65, -8, -2, -5, -7, -6, 6, -78, 5, 6, 1, 4, -13, -7, -9, 112, -117, -109, -106, -113, -114, 74, -98, -103, 74, -100, -113, -117, -114, 74, -98, -110, -113, 74, -104, -97, -105, -116, -113, -100, 74, -103, -112, 74, -113, -96, -113, -104, -98, -99, 74, -112, -100, -103, -105, 74, -114, -117, -98, -117, -116, -117, -99, -113, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -76, -90, -77, -86, -94, -83, -86, -69, -90, 97, -94, -91, 97, -90, -73, -90, -81, -75, C2638Cg0.o7, -27, -35, -29, -32, -34, -33, -21, -92, -72, -37, -68, -19, -36, -27, -21, C2638Cg0.w7, -21, -26, -23, C2638Cg0.n7, -34, -36, C2638Cg0.v7, -36, C2638Cg0.B7, -26, -23, -37, -69, C2638Cg0.n7, -21, C2638Cg0.n7, C2638Cg0.E7, C2638Cg0.n7, -22, -36, -37, -18, -20, -8, -5, -19, -87, -19, -22, -3, -22, -21, -22, -4, -18, -87, -17, -22, -14, -11, -2, -5, -18, -87, -8, -20, -20, -2, -5, -5, -18, -19, -87, 0, -15, -18, -9, -87, -5, -18, -22, -19, -14, -9, -16, -87, -18, -1, -18, -9, -3, -4, -73, -16, 3, 3, -12, -4, -1, 3, -78, -81, C2638Cg0.q7, -81, -14, -19, -116, Byte.MAX_VALUE, 125, -119, -116, 126, 121, 126, 123, -114, 123, 124, 123, -115, Byte.MAX_VALUE, -98, -112, -98, -98, -108, -102, -103, -118, -108, -113, 7, -7, 7, 7, -3, 3, 2, -13, 8, -3, 1, -7, -68, -79, -75, -83, -22, -27, C2638Cg0.C7, -37, -28, -93, -88, -97, -108, -3, -10, -13, -10, -9, -1, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2 A[Catch: Ul -> 0x0138, TryCatch #1 {Ul -> 0x0138, blocks: (B:33:0x00e6, B:35:0x00f2, B:36:0x0101, B:22:0x0089, B:24:0x008f, B:26:0x009b, B:27:0x00dc, B:39:0x010a, B:40:0x010e, B:42:0x0114, B:43:0x0124, B:44:0x0128, B:46:0x012e), top: B:59:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A0B(int i, Set<String> set, Set<String> set2) {
        String A00 = A00(C2372q.n, 7, 120);
        int i2 = 0;
        int[] iArr = new int[30];
        byte[] bArr = new byte[30000];
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.add(this.A02.A6W(bArr, iArr));
            List<JSONObject> A01 = A01(new LinkedList(), bArr, iArr);
            while (((InterfaceC1109Ub) linkedList.getLast()).ACO()) {
                Arrays.fill(iArr, 0);
                linkedList.add(this.A02.A6W(bArr, iArr));
                A01 = A01(A01, bArr, iArr);
            }
            Iterator<JSONObject> it = A01.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String string = next.getString(A00(InterfaceC8148mw2.c.u, 2, 114));
                    try {
                        if (set.contains(string)) {
                            int i3 = next.getInt(A00) + 1;
                            if (i3 < i) {
                                try {
                                    next.put(A00, i3);
                                    this.A01.AKH(A09(next));
                                } catch (C1119Ul e) {
                                    e = e;
                                    if (this.A00.A05().AAO()) {
                                    }
                                    A05(AbstractC1085Td.A2L, e);
                                    return i2;
                                } catch (JSONException e2) {
                                    e = e2;
                                    try {
                                        if (this.A00.A05().AAO()) {
                                        }
                                        A05(AbstractC1085Td.A2P, e);
                                    } catch (C1119Ul e3) {
                                        e = e3;
                                        if (this.A00.A05().AAO()) {
                                            Log.e(A05, A00(130, 68, 89), e);
                                        }
                                        A05(AbstractC1085Td.A2L, e);
                                        return i2;
                                    }
                                }
                            } else {
                                i2++;
                            }
                            it.remove();
                        } else {
                            try {
                                if (set2.contains(string)) {
                                    if (this.A00.A05().AAO()) {
                                        String str = A00(39, 16, 55) + string + A00(0, 11, 44) + next.optString(A00(471, 4, 24), A00(475, 7, 113));
                                    }
                                    it.remove();
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                if (this.A00.A05().AAO()) {
                                    Log.e(A05, A00(198, 47, 123), e);
                                }
                                A05(AbstractC1085Td.A2P, e);
                            }
                        }
                    } catch (C1119Ul e5) {
                        e = e5;
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } catch (JSONException e7) {
                    e = e7;
                }
            }
            for (JSONObject jSONObject : A01) {
                this.A02.AKH(A09(jSONObject));
            }
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1109Ub) it2.next()).A5p();
            }
        } catch (C1119Ul e8) {
            e = e8;
        }
        return i2;
    }

    static {
        A03();
        A05 = ZD.class.getSimpleName();
    }

    public ZD(C1669ge c1669ge) throws IOException {
        this.A00 = c1669ge;
        this.A01 = new Y3(UZ.A00(A00(11, 28, 27), c1669ge), new ZF(this));
        this.A02 = new Y3(UZ.A00(A00(322, 37, 96), c1669ge), new ZE(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException jsone) {
                if (this.A00.A05().AAO()) {
                    Log.e(A05, A00(85, 45, 14), jsone);
                }
                int start = AbstractC1085Td.A2P;
                A05(start, jsone);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        C1086Te c1086Te = new C1086Te(str);
        c1086Te.A05(1);
        this.A00.A08().ABD(A00(InterfaceC8148mw2.c.w, 15, 3), i, c1086Te);
    }

    private void A05(int i, Throwable th) {
        this.A00.A08().ABC(A00(InterfaceC8148mw2.c.w, 15, 3), i, new C1086Te(th));
    }

    public static byte[] A07(T8 t8, String str, V7 v7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(InterfaceC8148mw2.c.u, 2, 114), str);
            jSONObject.put(A00(466, 5, 95), v7.A08());
            jSONObject.put(A00(471, 4, 24), v7.A06().toString());
            jSONObject.put(A00(462, 4, 49), Y1.A03(v7.A04()));
            jSONObject.put(A00(450, 12, 125), Y1.A03(v7.A03()));
            jSONObject.put(A00(440, 10, 20), v7.A07());
            jSONObject.put(A00(419, 4, 55), new JSONObject(v7.A09()));
            jSONObject.put(A00(C2372q.n, 7, 120), 0);
        } catch (JSONException e) {
            if (t8.A05().AAO()) {
                Log.e(A05, A00(294, 28, 42), e);
            }
        }
        String jSONObject2 = jSONObject.toString();
        if (A04[3].charAt(18) != '3') {
            A04[3] = "qXIRiOsc7TnqBEY389oLdIOolYF6NOqr";
            return jSONObject2.getBytes();
        }
        throw new RuntimeException();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A8s();
        } catch (C1119Ul e) {
            if (this.A00.A05().AAO()) {
                Log.e(A05, A00(245, 49, 19), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0053 */
    /* JADX WARN: Incorrect condition in loop: B:21:0x006d */
    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<JSONObject> A0C(int i) {
        int totalFetched = 0;
        if (i == -1) {
            totalFetched = 1;
            i = 30;
        }
        int[] eventSizes = new int[i];
        byte[] bArr = new byte[i * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC1109Ub A6W = this.A01.A6W(bArr, eventSizes);
            linkedList2.add(A6W);
            int A6X = A6W.A6X();
            linkedList = A01(linkedList, bArr, eventSizes);
            while (noLimit && (A6X < i || totalFetched != 0)) {
                if (totalFetched != 0) {
                    Arrays.fill(eventSizes, 0);
                } else {
                    eventSizes = new int[i - A6X];
                }
                A6W = this.A01.A6W(bArr, eventSizes);
                linkedList2.add(A6W);
                linkedList = A01(linkedList, bArr, eventSizes);
            }
            Iterator<JSONObject> it = linkedList.iterator();
            while (noLimit) {
                this.A02.AKH(A09(it.next()));
            }
            Iterator it2 = linkedList2.iterator();
            while (noLimit) {
                ((InterfaceC1109Ub) it2.next()).A5p();
            }
        } catch (C1119Ul e) {
            boolean noLimit = this.A00.A05().AAO();
            if (noLimit) {
                Log.e(A05, A00(359, 53, 114), e);
            }
            A05(AbstractC1085Td.A2M, e);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.X.UR
    public final void A51() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C1119Ul e) {
            if (this.A00.A05().AAO()) {
                Log.e(A05, A00(55, 30, 73), e);
            }
            A05(AbstractC1085Td.A2J, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.UR
    public final void AL6(V7 v7, UO<String> uo) {
        YD.A00(YG.A07, new US(v7, uo, this.A01, this.A00), new Void[0]);
    }
}
