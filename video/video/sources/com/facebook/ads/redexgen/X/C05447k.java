package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05447k extends AbstractC1810j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public AnonymousClass76 A02;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{C8077mf.x, C8077mf.A, C3307Iz.Y, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, C8077mf.m, C3307Iz.Y, 55, C8077mf.E, 40, 40, C3307Iz.X, 40, -42, C3307Iz.e0, C8077mf.H, 31, 34, C8077mf.E, -42, C3307Iz.Y, C8077mf.A, 40, C3307Iz.a0, 31, 36, C8077mf.G, -42, C8077mf.C, C8077mf.H, C8077mf.A, 31, 36, C8077mf.E, C8077mf.D, -42, C8077mf.A, C8077mf.D, C3307Iz.a0, -42, -8, C8077mf.A, 36, 36, C8077mf.E, 40};
    }

    public C05447k(AnonymousClass76 anonymousClass76, O7 o7) {
        super(anonymousClass76, o7);
        this.A00 = 10000L;
        this.A02 = anonymousClass76;
    }

    private C1813j3 A01(Runnable runnable) {
        return new C1813j3(this, runnable);
    }

    private List<JSONObject> A04(O8 o8) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = o8.A03();
        String A033 = A03(22, 12, 71);
        if (A032.has(A033)) {
            try {
                this.A00 = A032.getJSONObject(A033).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((JSONObject) adsArray.get(i));
                    }
                }
            } catch (JSONException unused) {
                String A034 = A03(36, 38, 101);
                this.A02.A0F().A5g(C1145Vm.A01(AdErrorType.UNKNOWN_ERROR, A034).A03().getErrorCode(), A034);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(InterfaceC1878k8 interfaceC1878k8, JSONObject jSONObject, C1105Tx c1105Tx) {
        this.A0C = false;
        C1812j2 c1812j2 = new C1812j2(this, interfaceC1878k8, AbstractC1184Xd.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c1812j2, c1105Tx.A05());
        interfaceC1878k8.AAt(this.A02, this.A09, this.A08.A08, A01(c1812j2), jSONObject, c1105Tx);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
            return;
        }
        this.A02.A0F().A4f();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0R(N1 n1, C1104Tw c1104Tw, C1102Tu c1102Tu, final O8 o8) {
        this.A02.A0F().A4Y();
        final InterfaceC1878k8 interfaceC1878k8 = (InterfaceC1878k8) n1;
        if (interfaceC1878k8.AKL()) {
            final List<JSONObject> A04 = A04(o8);
            A06(interfaceC1878k8, A04.get(0), o8.A01());
            if (A04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C05447k.this.A0a(interfaceC1878k8, A04, o8);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC1878k8, o8.A03(), o8.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0Y(boolean z) {
        super.A0Y(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC1878k8 interfaceC1878k8, List list, O8 o8) {
        A06(interfaceC1878k8, (JSONObject) list.get(1), o8.A01());
    }
}
