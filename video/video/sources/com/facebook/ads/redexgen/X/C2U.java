package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.C9680tD0;
import o.InterfaceC8148mw2;
import o.Xu2;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.2U  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2U implements CY, InterfaceC1654gP {
    public static byte[] A0A;
    public static String[] A0B = {"IFN7jxPm5iUVHezzrmxS", "S0eu2eNSRgR", "zAFRaPaLH2briFok", "kmV", "0tQTfhSJ7", "pW9DdJxYDevwUXMYU", "23M9j", "tE9Nw4uJT9AR2sagm"};
    public final T8 A00;
    public final TP A01;
    public final InterfaceC1624fv A02;
    public final InterfaceC1655gQ A03;
    public final C1663gY A04;
    public final InterfaceC1664gZ A05;
    public final String A06;
    public final Map<EnumC1650gL, C0650Cb> A09 = new HashMap();
    public final Map<EnumC1650gL, AbstractC04112d> A08 = new HashMap();
    public final List<InterfaceC1668gd> A07 = new ArrayList();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A04() throws Throwable {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        synchronized (this) {
            for (C0650Cb c0650Cb : this.A09.values()) {
                if (c0650Cb.AAe()) {
                    hashMap.put(c0650Cb, EnumC1671gg.A05);
                } else {
                    hashMap.put(c0650Cb, EnumC1671gg.A04);
                }
            }
            new AtomicReference();
            new AtomicReference();
            Iterator<AbstractC04112d> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                InterfaceC1649gK interfaceC1649gK = null;
                if (interfaceC1649gK.AAe()) {
                    throw new NullPointerException(A01(349, 20, 51));
                }
            }
            Iterator<InterfaceC1668gd> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(A01(InterfaceC8148mw2.c.v, 22, 120));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        String.format(Locale.US, A01(Xu2.A, 33, 57), this.A06, A03.toString(2));
        this.A02.AGy(this.A06, (A01(327, 8, 121) + URLEncoder.encode(A03.toString())).getBytes(), new CN(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((Throwable) atomicReference2.get());
            }
            Set<InterfaceC1667gc> A02 = A02((JSONObject) atomicReference.get());
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            for (InterfaceC1667gc interfaceC1667gc : A02) {
                interfaceC1667gc.A4D(hashMap5, hashMap6);
            }
            this.A03.A6b(A00((JSONObject) atomicReference.get()));
            Iterator<InterfaceC1668gd> it3 = this.A07.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw new NullPointerException(A01(401, 23, 20));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{102, -81, -71, 102, -72, -85, -71, -70, -72, -81, -87, -70, -85, -86, 116, 102, -103, -79, -81, -74, -74, -81, -76, -83, 102, -71, -65, -76, -87, -43, 4, 4, -76, -3, 2, -76, -10, -11, -9, -1, -5, 6, 3, 9, 2, -8, C2638Cg0.q7, -67, -37, -24, -24, -23, -18, -102, -35, -20, -33, -37, -18, -33, -102, -19, -33, -20, -16, -33, -20, -102, -36, -17, -24, -34, -26, -33, -102, -15, -29, -18, -30, -102, -24, -23, -24, -89, -19, -33, -20, -16, -33, -20, -102, -23, -15, -24, -33, -34, -102, -36, -17, -24, -34, -26, -33, -102, C2638Cg0.r7, -66, 123, -104, -85, -104, 87, -89, -87, -90, -102, -100, -86, -86, -96, -91, -98, 87, -90, -89, -85, -96, -90, -91, 87, -118, -81, -73, -94, -83, -86, -91, 97, -77, -90, -89, -77, -90, -76, -87, 97, -75, -86, -82, -90, 123, 97, 102, -91, -34, -11, 7, -80, 3, -11, 2, 6, -11, 2, -67, -1, 7, -2, -11, -12, -80, -14, 5, -2, -12, -4, -11, -80, -13, 2, -11, -15, 4, -11, -12, C2638Cg0.w7, -80, -75, 3, -95, C2638Cg0.u7, -68, -79, -74, C2638Cg0.o7, -67, -68, -73, -56, -81, C2638Cg0.q7, -73, -67, -68, 110, C2638Cg0.o7, -77, -65, C2638Cg0.r7, -77, C2638Cg0.p7, C2638Cg0.q7, 110, C2638Cg0.q7, -67, 110, 115, C2638Cg0.p7, -120, 88, 115, C2638Cg0.p7, -34, 4, -7, -18, -13, -3, -6, -7, -12, 5, -20, -1, -12, -6, -7, -85, -3, -16, -2, -5, -6, -7, -2, -16, C2638Cg0.s7, -107, -80, -2, -43, -5, -16, -27, -22, -12, -15, -16, -21, -4, -29, -10, -21, -15, -16, -94, -12, -9, -16, -94, -24, -29, -21, -18, -25, -26, -67, -94, -24, -15, -12, -27, -21, -16, -23, -94, -21, -16, -94, -89, -26, -94, -11, -25, -27, -15, -16, -26, -11, -28, -9, -16, -26, -18, -25, -11, C2638Cg0.r7, C2638Cg0.A7, C2638Cg0.z7, -44, C2638Cg0.s7, C2638Cg0.n7, -44, 124, 121, -116, 121, -90, -87, -82, -89, -91, -78, -80, -78, -87, -82, -76, -2, -17, 7, -6, -3, -17, -14, C2638Cg0.x7, -116, Byte.MAX_VALUE, Byte.MIN_VALUE, -116, Byte.MAX_VALUE, -115, -126, -10, -23, -11, -7, -23, -9, -8, -70, -83, -71, -67, -79, -70, -83, -69, -101, C2638Cg0.p7, -74, -85, -119, -74, -84, -102, -83, -69, -83, -68, -69, -82, -68, -71, -72, -73, -68, -82, 0, -14, -1, 3, -14, -1, -36, 4, -5, -14, -15, C2638Cg0.A7, 2, -5, -15, -7, -14, -48, -1, -14, -18, 1, -14, -15, -100, -94, -105, -116, -111, -101, -104, -105, -110, -93, -118, -99, -110, -104, -105, 111, -110, -105, -110, -100, -111, -114, -115, 0, 6, -5, -16, -11, -1, -4, -5, -10, 7, -18, 1, -10, -4, -5, -32, 1, -18, -1, 1, -14, -15, -11, -30, -13, -24, -26, -11, -32, -13, -26, -25, -13, -26, -12, -23, -32, -12};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(Throwable th) {
        Iterator<InterfaceC1668gd> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(401, 23, 20));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.CY
    public final synchronized InterfaceC1649gK A5U(EnumC1650gL enumC1650gL) {
        if (enumC1650gL.A03() == EnumC1652gN.A04) {
            if (this.A09.containsKey(enumC1650gL)) {
                return this.A09.get(enumC1650gL);
            }
            C0650Cb c0650Cb = new C0650Cb(enumC1650gL);
            this.A09.put(enumC1650gL, c0650Cb);
            Iterator<InterfaceC1668gd> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(377, 24, 120));
            }
            String.format(Locale.US, A01(C3503Kz.m0, 35, 123), enumC1650gL);
            return c0650Cb;
        }
        throw new IllegalArgumentException(A01(47, 59, 101));
    }

    static {
        A05();
    }

    public C2U(T8 t8, TP tp, InterfaceC1624fv interfaceC1624fv, String str, InterfaceC1664gZ interfaceC1664gZ, C1663gY c1663gY, InterfaceC1653gO interfaceC1653gO) {
        this.A00 = t8;
        this.A01 = tp;
        this.A02 = interfaceC1624fv;
        this.A06 = str;
        this.A05 = interfaceC1664gZ;
        this.A04 = c1663gY;
        this.A03 = interfaceC1653gO.A5E(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int time = jSONObject.getJSONObject(A01(335, 7, 5)).getInt(A01(446, 16, 108));
        if (time > 0) {
            return time;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 44), Integer.valueOf(time)));
    }

    private Set<InterfaceC1667gc> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 52));
        JSONObject data = jSONObject.getJSONObject(A01(298, 7, 109));
        Iterator<C0650Cb> it = this.A09.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[0].length()) {
                String[] strArr2 = A0B;
                strArr2[1] = "GiFNWD8Qhge";
                strArr2[3] = "8JT";
                if (hasNext) {
                    final C0650Cb next = it.next();
                    switch (EnumC1672gh.A00(jSONObject2.getString(next.A8F().A04()))) {
                        case A03:
                            final JSONObject fingerprint = data.getJSONObject(next.A8F().A04()).getJSONObject(A01(312, 4, 3));
                            final JSONObject responseObject = data.getJSONObject(next.A8F().A04()).optJSONObject(A01(InterfaceC8148mw2.a.q, 11, 43));
                            hashSet.add(new CL(next, fingerprint, responseObject) { // from class: com.facebook.ads.redexgen.X.2X
                                public final JSONObject A00;
                                public final JSONObject A01;

                                {
                                    EnumC1672gh enumC1672gh = EnumC1672gh.A03;
                                    this.A00 = fingerprint;
                                    this.A01 = responseObject;
                                }

                                @Override // com.facebook.ads.redexgen.X.CL, com.facebook.ads.redexgen.X.InterfaceC1667gc
                                public final void A4D(Map<InterfaceC1649gK, EnumC1672gh> map, Map<SyncModifiableBundle, EnumC1659gU> map2) {
                                    super.A00.A03(this.A00, this.A01);
                                    super.A4D(map, map2);
                                }
                            });
                            break;
                        case A04:
                            hashSet.add(new CL(next) { // from class: com.facebook.ads.redexgen.X.2W
                                {
                                    EnumC1672gh enumC1672gh = EnumC1672gh.A04;
                                }
                            });
                            break;
                        default:
                            throw new AssertionError();
                    }
                } else {
                    Iterator<AbstractC04112d> it2 = this.A08.values().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        InterfaceC1649gK interfaceC1649gK = null;
                        switch (EnumC1659gU.A00(jSONObject2.getString(interfaceC1649gK.A8F().A04()))) {
                            case A03:
                                hashSet.add(new CM(null) { // from class: com.facebook.ads.redexgen.X.2b
                                    {
                                        EnumC1659gU enumC1659gU = EnumC1659gU.A03;
                                    }
                                });
                                break;
                            case A04:
                                hashSet.add(new CM(null) { // from class: com.facebook.ads.redexgen.X.2V
                                    public static byte[] A00;

                                    static {
                                        A01();
                                    }

                                    public static String A00(int i, int i2, int i3) {
                                        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
                                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
                                        }
                                        return new String(copyOfRange);
                                    }

                                    public static void A01() {
                                        A00 = new byte[]{48, 34, 49, C8077mf.q, 34, C3307Iz.f0, 50, C3307Iz.Y, 47, 34, 48, C8077mf.r, 54, C3307Iz.c0, 32};
                                    }

                                    {
                                        EnumC1659gU enumC1659gU = EnumC1659gU.A04;
                                    }

                                    @Override // com.facebook.ads.redexgen.X.CM, com.facebook.ads.redexgen.X.InterfaceC1667gc
                                    public final void A4D(Map<InterfaceC1649gK, EnumC1672gh> map, Map<SyncModifiableBundle, EnumC1659gU> map2) {
                                        throw new NullPointerException(A00(0, 15, 87));
                                    }
                                });
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    return hashSet;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    private JSONObject A03(Map<InterfaceC1649gK, EnumC1671gg> map, Map<SyncModifiableBundle, EnumC1658gT> map2, Map<SyncModifiableBundle, JSONObject> clientBundleData, Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint) throws JSONException {
        String A01;
        JSONObject syncRequest = new JSONObject();
        for (Map.Entry<InterfaceC1649gK, EnumC1671gg> entry : map.entrySet()) {
            syncRequest.put(entry.getKey().A8F().A04(), entry.getValue().A03());
        }
        for (Map.Entry<SyncModifiableBundle, EnumC1658gT> entry2 : map2.entrySet()) {
            entry2.getKey();
            InterfaceC1649gK interfaceC1649gK = null;
            String A04 = interfaceC1649gK.A8F().A04();
            String A03 = entry2.getValue().A03();
            String[] strArr = A0B;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0B[4] = "GjL9vB6wh";
            syncRequest.put(A04, A03);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<InterfaceC1649gK, EnumC1671gg>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(InterfaceC8148mw2.a.q, 11, 43);
            if (!hasNext) {
                break;
            }
            Map.Entry<InterfaceC1649gK, EnumC1671gg> next = it.next();
            if (next.getValue() == EnumC1671gg.A05) {
                JSONObject updateData = new JSONObject();
                InterfaceC1649gK key = next.getKey();
                jSONObject.put(key.A8F().A04(), updateData);
                if (next.getKey().A8F().A05()) {
                    JSONObject request = key.A88();
                    updateData.put(A01, request);
                } else {
                    updateData.put(A01, JSONObject.NULL);
                }
                EnumC1650gL A8F = key.A8F();
                String[] strArr2 = A0B;
                if (strArr2[7].length() != strArr2[2].length()) {
                    String[] strArr3 = A0B;
                    strArr3[1] = "cfjTgROdu8b";
                    strArr3[3] = "qIs";
                    jSONObject.put(A8F.A04(), updateData);
                } else {
                    A0B[4] = "vaTQWmMwm";
                    jSONObject.put(A8F.A04(), updateData);
                }
            }
        }
        for (Map.Entry<SyncModifiableBundle, EnumC1658gT> entry3 : map2.entrySet()) {
            JSONObject updateData2 = new JSONObject();
            InterfaceC1649gK key2 = entry3.getKey();
            JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData2.put(A01, request2);
            if (entry3.getValue() == EnumC1658gT.A05) {
                String A012 = A01(312, 4, 3);
                JSONObject request3 = clientBundleData.get(key2);
                updateData2.put(A012, request3);
                jSONObject.put(key2.A8F().A04(), updateData2);
            } else {
                jSONObject.put(key2.A8F().A04(), updateData2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A7z().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject2.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject bundleData = new JSONObject();
        bundleData.put(A01(342, 7, 111), syncRequest);
        bundleData.put(A01(298, 7, 109), jSONObject);
        bundleData.put(A01(305, 7, 75), jSONObject2);
        return bundleData;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 118), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e) {
            atomicReference2.set(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CY, com.facebook.ads.redexgen.X.TE
    public final void A6d() {
        this.A03.A6c();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1654gP
    public final void AIo() {
        if (this.A01.AAh()) {
            String str = A01(106, 23, 34) + this.A01.A7k().A07() + A01(0, 29, 49);
            A08(new C1670gf());
            return;
        }
        try {
            if (!C1123Up.A27(this.A00) || this.A00.A04().AAU()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 127));
        } catch (Throwable th) {
            String.format(Locale.US, A01(C9680tD0.j, 49, 109), Integer.valueOf(this.A04.A01()));
            A08(th);
            this.A03.A6b(this.A04.A01());
        }
    }
}
