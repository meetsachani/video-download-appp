package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9276rZ;
import o.QC1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.jT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1839jT extends NQ implements Serializable {
    public static byte[] A0E = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A08;
    public boolean A09;
    public final List<AbstractC1847jd> A0D;
    public final ArrayList<Integer> A0C = new ArrayList<>();
    public boolean A0A = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public String A05 = A02(280, 2, 22);
    public final String A0B = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{93, 88, 79, 117, 126, 119, Byte.MAX_VALUE, QC1.w, 73, 102, 119, 100, 119, 123, 101, 17, C8077mf.D, 19, C8077mf.E, 28, C8077mf.A, C8077mf.z, C3307Iz.e0, 19, C8077mf.z, 1, C3307Iz.e0, 17, C8077mf.G, 7, 28, 6, 54, C4715Xk.i, 52, 60, 59, 48, 49, 10, 52, 49, C3307Iz.Y, 10, 56, 52, C3307Iz.e0, 10, 49, 32, C3307Iz.Z, 52, C3307Iz.V, 60, 58, 59, 73, 66, 75, 67, 68, 79, 78, 117, 75, 78, 89, 117, 92, 75, 88, 67, 79, 68, 94, 74, 65, 72, 64, 71, 64, 71, 78, 118, 79, 70, 91, 74, 76, 118, 95, 64, 76, 94, 118, 93, 64, 68, 76, 90, 110, 101, 111, 84, 104, 106, 121, 111, 84, 106, 126, Byte.MAX_VALUE, 100, 84, 104, 103, 100, QC1.w, 110, 84, Byte.MAX_VALUE, 98, 102, 110, 118, 113, 123, 122, 103, 64, 107, 112, 64, 109, 122, 111, 112, 109, 107, 64, 115, 112, 126, 123, 122, 123, 65, 86, 67, 92, 65, 71, 108, 85, 90, 65, 64, 71, 108, 86, 80, 67, 94, 108, 92, 93, 95, 74, C8077mf.n, C8077mf.E, C8077mf.p, 17, C8077mf.n, 10, C3307Iz.V, C8077mf.B, C8077mf.A, C8077mf.n, 13, 10, C3307Iz.V, C8077mf.A, 19, C8077mf.p, C8077mf.n, C8077mf.E, 13, 13, C8077mf.A, 17, C8077mf.r, C3307Iz.V, 17, C8077mf.r, C8077mf.u, 7, 17, 10, 13, C8077mf.y, C4715Xk.i, 17, 7, 1, 13, C8077mf.n, 6, C4715Xk.i, 3, 6, C4715Xk.i, 13, C8077mf.n, C4715Xk.i, 3, 6, C4715Xk.i, C8077mf.r, 7, C8077mf.u, 13, C8077mf.r, C8077mf.z, C8077mf.m, C8077mf.n, 5, C8077mf.p, C8077mf.y, C8077mf.u, 10, 34, C8077mf.p, C8077mf.B, C8077mf.H, C8077mf.u, 19, C8077mf.C, 34, 28, C8077mf.C, 34, C8077mf.u, 19, 34, C8077mf.m, C8077mf.x, C8077mf.C, C8077mf.B, C8077mf.u, 34, 13, 17, 28, 4, 31, 28, C8077mf.H, C8077mf.z, 34, C8077mf.B, C8077mf.q, C8077mf.q, C8077mf.u, C8077mf.q, 3, 0, 28, C8077mf.C, 4, 47, C8077mf.z, 31, 2, 19, C8077mf.y, 47, 6, C8077mf.C, C8077mf.y, 7, 72, 78};
    }

    public C1839jT(List<AbstractC1847jd> list) {
        this.A0D = list;
    }

    public static C1839jT A00(JSONObject jSONObject, C1673gi c1673gi) throws JSONException {
        return A01(jSONObject, c1673gi, false);
    }

    public static C1839jT A01(JSONObject jSONObject, C1673gi c1673gi, boolean z) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A02(0, 3, 25));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (z) {
                arrayList.add(C05477n.A00(jSONArray.getJSONObject(i), c1673gi));
            } else {
                arrayList.add(C05457l.A00(jSONArray.getJSONObject(i), c1673gi));
            }
        }
        C1839jT c1839jT = new C1839jT(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A02(3, 12, 51));
        c1839jT.A05 = chainingParams.toString();
        c1839jT.A01 = chainingParams.optInt(A02(15, 17, 87), arrayList.size());
        c1839jT.A04 = chainingParams.optInt(A02(32, 24, 112), 0);
        c1839jT.A02 = chainingParams.optInt(A02(100, 24, 46), 0);
        c1839jT.A03 = chainingParams.optInt(A02(124, 22, 58), 0);
        c1839jT.A09 = chainingParams.optBoolean(A02(C9276rZ.p, 38, 88), true);
        c1839jT.A08 = chainingParams.optBoolean(A02(196, 30, 71), true);
        c1839jT.A00 = chainingParams.optInt(A02(56, 19, 15), 2);
        c1839jT.A1P(chainingParams);
        c1839jT.A0A = chainingParams.optBoolean(A02(264, 16, 85), false);
        c1839jT.A07 = chainingParams.optBoolean(A02(168, 28, 91), false);
        c1839jT.A06 = chainingParams.optBoolean(A02(C3503Kz.j0, 22, 22), false);
        JSONArray optJSONArray = chainingParams.optJSONArray(A02(75, 25, 12));
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                c1839jT.A0C.add(Integer.valueOf(optJSONArray.optInt(i2, 0)));
            }
        }
        return c1839jT;
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final int A0o() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final int A0p() {
        return this.A04 + this.A02;
    }

    public final int A22() {
        return this.A00;
    }

    public final int A23() {
        return this.A01;
    }

    public final int A24() {
        return this.A02;
    }

    public final int A25() {
        return this.A03;
    }

    public final AbstractC1847jd A26() {
        if (!this.A0D.isEmpty()) {
            return this.A0D.get(0);
        }
        return null;
    }

    public final AbstractC1847jd A27(int i) {
        return this.A0D.get(i);
    }

    public final String A28() {
        return this.A0B;
    }

    public final String A29() {
        return this.A05;
    }

    public final String A2A() {
        AbstractC1847jd firstAdDataBundle = A26();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A2E();
        }
        return null;
    }

    public final ArrayList<Integer> A2B() {
        return this.A0C;
    }

    public final void A2C(int i) {
        this.A0D.remove(i);
        this.A01--;
    }

    public final boolean A2D() {
        return this.A00 == 0;
    }

    public final boolean A2E() {
        return this.A06;
    }

    public final boolean A2F() {
        return this.A07;
    }

    public final boolean A2G() {
        return this.A08;
    }

    public final boolean A2H() {
        return this.A09;
    }

    public final boolean A2I() {
        return this.A0A;
    }

    public final boolean A2J(int i) {
        return i >= 0 && i < this.A0D.size();
    }
}
