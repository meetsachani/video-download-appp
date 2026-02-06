package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import o.C8077mf;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class WW implements VA {
    public static VA A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1669ge A00;
    public final UR A01;
    public final V9 A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, C8077mf.u, C8077mf.D, 7, 3, C8077mf.H, C8077mf.C, C8077mf.r, 87, 3, C8077mf.B, 87, C8077mf.E, C8077mf.B, C8077mf.r, 87, C8077mf.z, C8077mf.C, 87, C8077mf.H, C8077mf.C, 1, C8077mf.z, C8077mf.E, C8077mf.H, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, C8077mf.G, C8077mf.r, C8077mf.C, C8077mf.n};
    }

    static {
        A03();
        A05 = WW.class.getSimpleName();
        A06 = false;
    }

    public WW(C1669ge c1669ge) {
        V8 dispatchCallback;
        this.A00 = c1669ge;
        if (AbstractC1125Ur.A0T(c1669ge)) {
            this.A01 = UP.A00(c1669ge);
            dispatchCallback = VF.A00(c1669ge, this.A01);
        } else {
            AnonymousClass71 A01 = UP.A01(c1669ge);
            dispatchCallback = VF.A01(c1669ge, A01);
            this.A01 = A01;
        }
        this.A02 = new Wm(c1669ge, dispatchCallback);
        YG.A08.execute(new WY(this));
        A04(c1669ge);
    }

    public static synchronized VA A01(C1669ge c1669ge) {
        VA va;
        synchronized (WW.class) {
            if (A03 == null) {
                A03 = new WW(c1669ge);
            }
            va = A03;
        }
        return va;
    }

    public static synchronized void A04(C1669ge c1669ge) {
        synchronized (WW.class) {
            if (A06) {
                return;
            }
            c1669ge.A04().ACn();
            A06 = true;
        }
    }

    private void A05(V7 v7) {
        if (!v7.A0A()) {
            Log.e(A05, A02(7, 29, 55) + v7.A06() + A02(0, 7, 82));
            return;
        }
        A06(v7);
        this.A01.AL6(v7, new WX(this, v7));
    }

    private void A06(V7 v7) {
        switch (v7.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                C1086Te c1086Te = new C1086Te(new Exception(A02(36, 5, 86)));
                c1086Te.A05(1);
                try {
                    c1086Te.A07(new JSONObject().put(A02(48, 4, 41), v7.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A08().ABD(A02(41, 7, 112), AbstractC1085Td.A1H, c1086Te);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AB3(String str, Map<String, String> data) {
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AB5(String str, Map<String, String> data) {
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AB6(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A07).A06(VK.A0A(str, VH.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AB7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A08).A06(VK.A0A(str, VH.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABF(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABJ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0D).A06(VK.A0A(str, VH.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABK(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABL(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0F).A06(VK.A0A(str, VH.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABM(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0K).A06(VK.A0A(str, VH.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABn(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0H).A06(VK.A0A(str, VH.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABp(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A0J).A06(VK.A0A(str, VH.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABq(String str, Map<String, String> data, String str2, VC vc) {
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(vc).A02(VD.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABr(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        V7 adEvent = new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABx(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0N).A06(VK.A0A(str, VH.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ABy(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0O).A06(VK.A0A(str, VH.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AC0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(VC.A04).A02(VD.A0P).A06(VK.A0A(str, VH.A0k)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AC3(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A04).A02(VD.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AC8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0Q).A06(VK.A0A(str, VH.A0o)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AC9(String str, Map<String, String> data) {
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ACB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(VC.A05).A02(VD.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AGz(String str) {
        new AsyncTaskC1644gF(this.A00).execute(str);
    }
}
