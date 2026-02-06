package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class N7 {
    public static byte[] A03;
    public static String[] A04 = {"yonrCQ0uoeCYCSmT5ejKLJLtf9VOp321", "NDuBqnzzJqzb1WeHMragxAHoyIt26Von", "hWL4zdMk8yywijkAtqHNVn2pZmfj34f9", "9i7qyia1evnFwuCuocWilq3mxIKRQ8Gt", "sdkV7vC", "3a", "fP", "wcot"};
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 32));

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-67, -65, C2638Cg0.p7, -65, C2638Cg0.z7, -3, 6, -5, 10, 17, 8, C8077mf.n, -3, -4, -9, -7, -4, -9, 1, -4, -9, 7, 10, 1, -1, 1, 6, -7, 4, -19, -10, -21, -6, 1, -8, -4, -19, -20, -25, -15, -20, C8077mf.C, 13, 36, C8077mf.m, C8077mf.q, 13, 28, 28, 17, C8077mf.r, C8077mf.m, 13, C8077mf.H, C8077mf.H, 13, C3307Iz.X, C8077mf.m, C8077mf.B, 17, C8077mf.D, 19, 32, C8077mf.x, 47, 35, 35, 53, 50, 50, C3307Iz.X, C3307Iz.f0, 35, C3307Iz.X, 51, -1, -12, 1, -8, -2, -13, C3307Iz.X, 28, 34, C3307Iz.V, C8077mf.n, 28, C8077mf.r, C8077mf.r, 34, 31, 31, C8077mf.u, C8077mf.E, C8077mf.r, C8077mf.u, C8077mf.n, 32, C8077mf.u, C8077mf.r, 32, C8077mf.H, C8077mf.y, C8077mf.E, C8077mf.D, 5, C8077mf.z, C8077mf.m, C8077mf.B, C8077mf.q, C8077mf.y, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A0A(@Nullable String str) throws JSONException, C1086Te {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = this.A00.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.A00.get(next) instanceof String) {
                        hashMap.put(next, A00(next, new JSONObject((String) this.A00.get(next))));
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.A00.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        A02();
    }

    private final synchronized C0936Nf A00(String str, JSONObject jSONObject) throws JSONException, C1086Te {
        C0936Nf frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 70), null))) {
            frequencyCappingData = new C0936Nf(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            C1086Te c1086Te = new C1086Te(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 86), str);
            c1086Te.A07(jSONObject);
            c1086Te.A05(1);
            throw c1086Te;
        }
        return frequencyCappingData;
    }

    private void A03(C0936Nf c0936Nf, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt(A01(75, 6, 77));
        int optInt2 = jSONObject.optInt(A01(101, 11, 100));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 106), 50);
        long optLong = jSONObject.optLong(A01(2, 3, 28));
        String A01 = A01(64, 11, 126);
        if (jSONObject.has(A01)) {
            c0936Nf.A06((JSONArray) jSONObject.get(A01));
        }
        String A012 = A01(81, 20, 107);
        if (jSONObject.has(A012)) {
            int cappingTimeSecs = jSONObject.optInt(A012);
            c0936Nf.A04(cappingTimeSecs);
        }
        c0936Nf.A05(optInt, optInt2, optLong, maxCappedArrayLength);
    }

    public final String A04() {
        String list = this.A02.get();
        if (list == null) {
            if (A04[0].charAt(21) != 'J') {
                throw new RuntimeException();
            }
            A04[7] = "Yd8WV87KlA8AS9IbyfadEkj";
            return A01(0, 2, 32);
        }
        return list;
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C0936Nf.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        C1070So.A03();
    }

    public final synchronized void A08(@Nullable String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < C0936Nf.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        C1070So.A03();
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C0936Nf frequencyCappingData;
        String optString = jSONObject.optString(A01(29, 12, 70), null);
        if (optString == null) {
            return;
        }
        if (this.A00.has(optString) && (this.A00.get(optString) instanceof C0936Nf)) {
            frequencyCappingData = (C0936Nf) this.A00.get(optString);
        } else {
            frequencyCappingData = new C0936Nf(optString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(optString, frequencyCappingData);
    }
}
