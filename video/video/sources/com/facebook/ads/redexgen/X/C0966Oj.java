package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.Oj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0966Oj {
    public static byte[] A03;
    public VI A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{C2638Cg0.x7, -45, C2638Cg0.E7, -30, C2638Cg0.n7, C8077mf.E, C8077mf.q, 28, C8077mf.q, C8077mf.y, 19, 13, C8077mf.q, C8077mf.u, 13, C8077mf.H, 32, 19, C8077mf.x, 19, 32, 19, 28, 17, 19, C3307Iz.V, -7, -6, -2, -13, -7, -8, -3, -23, -3, -17, -10, -17, -19, -2, -17, -18, 66, 67, 48, 65, 67, 0, -2, -16, -3, -22, -11, -6, 0, -3, -7, -16, 4, -36, C2638Cg0.y7, -34, -60, C2638Cg0.t7, -46, -60, C2638Cg0.z7, -60, C2638Cg0.n7, C2638Cg0.w7, C2638Cg0.w7, C2638Cg0.z7, -45, -52, -60, C2638Cg0.E7, C2638Cg0.y7, C2638Cg0.z7, C2638Cg0.n7};
    }

    public C0966Oj() {
    }

    public C0966Oj(VI vi) {
        this.A00 = vi;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(47, 12, 49), new JSONArray((Collection) this.A02).toString());
        hashMap.put(A00(26, 16, 48), new JSONArray((Collection) this.A01).toString());
        return hashMap;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 84));
        if (this.A00 != null) {
            this.A00.A04(VH.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, 117));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 11));
        if (this.A00 != null) {
            this.A00.A04(VH.A0C, null);
        }
    }

    public final void A07(int i) {
        this.A01.add(String.valueOf(i));
    }

    public final void A08(EnumC0965Oi enumC0965Oi) {
        this.A02.add(enumC0965Oi.A03() + A00(1, 4, 26));
        if (this.A00 != null) {
            this.A00.A04(VH.A09, null);
        }
    }

    public final void A09(EnumC0965Oi enumC0965Oi, int i) {
        this.A02.add(enumC0965Oi.A03() + A00(0, 1, 18) + i);
    }

    public final boolean A0A() {
        return (this.A02.isEmpty() && this.A01.isEmpty()) ? false : true;
    }
}
