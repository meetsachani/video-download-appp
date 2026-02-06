package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0951Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1079Sx A00;
    public EnumC1334bD A01 = EnumC1334bD.A05;
    public ArrayList<C1457dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC0950Nt A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, C8077mf.A, 35, 28, C8077mf.E, -66, -29, -23, C2638Cg0.B7, -25, -29, -42, C2638Cg0.C7, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, C2638Cg0.C7, -34, C2638Cg0.E7, -107, -74, C2638Cg0.E7, -66, -29, -37, -28, -93, C8077mf.y, C8077mf.B, 19, C8077mf.B, C8077mf.y, 40, C8077mf.y, 19, C8077mf.z, C3307Iz.a0, 34, C8077mf.B, 32, C8077mf.C, -29, -14, -21, -36, C2638Cg0.C7, C2638Cg0.B7, -30, -25, C2638Cg0.n7, -23, C2638Cg0.B7, -21, C2638Cg0.B7, -26, -20, C8077mf.u, C8077mf.A, C8077mf.r, C8077mf.B, C8077mf.G, C8077mf.x, 19, -16, 19, -13, C8077mf.r, 35, C8077mf.r, -15, 36, C8077mf.G, 19, C8077mf.E, C8077mf.x, ED2.a, 68, 74, 59, 72, 73, 74, ED2.a, 74, ED2.a, 55, 66};
    }

    static {
        A06();
    }

    public C0951Nu(C1673gi c1673gi, O8 o8, InterfaceC0950Nt interfaceC0950Nt, String str) {
        JSONObject dataObject = o8.A03();
        this.A03 = A01(c1673gi, o8, str, dataObject);
        this.A04 = interfaceC0950Nt;
    }

    private AdError A00(C1673gi c1673gi, AbstractC1847jd abstractC1847jd) {
        if (abstractC1847jd == null || abstractC1847jd.A2G().isEmpty()) {
            c1673gi.A08().ABC(A04(62, 3, 33), AbstractC1085Td.A0Z, new C1086Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C1673gi c1673gi, O8 o8, String str, JSONObject jSONObject) {
        NQ nq = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nq = C1839jT.A01(jSONObject, c1673gi, true);
                nq.A1Q(true);
                nq.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nq == null) {
            nq = C05477n.A00(jSONObject, c1673gi);
        }
        nq.A1M(str);
        C1105Tx A01 = o8.A01();
        if (A01 != null) {
            nq.A1I(A01.A06());
        }
        return nq;
    }

    private C1079Sx A03(C1673gi c1673gi) {
        return this.A00 != null ? this.A00 : new C1079Sx(c1673gi);
    }

    private void A08(C1673gi c1673gi, C05477n c05477n) {
        C0945No playableData = c05477n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1334bD.A05);
        C1822jC c1822jC = new C1822jC(this);
        C1079Sx c1079Sx = new C1079Sx(c1673gi);
        boolean z = C1123Up.A2H(c1673gi) && SN.A0A(c05477n.A1H());
        if (z) {
            SN unifiedAssetsLoader = new SN(c1079Sx, c05477n.A1H(), c05477n.A10(), c05477n.A1D(), z, new C1821jB(this));
            c1079Sx.A0e(new VI(c05477n.A2E(), c1673gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c1673gi, c05477n, true, c1822jC);
    }

    private void A09(C1673gi c1673gi, EnumSet<CacheFlag> enumSet, AbstractC1847jd abstractC1847jd, int i, InterfaceC0950Nt interfaceC0950Nt) {
        boolean isDSL = abstractC1847jd.A1g();
        C1079Sx A03 = A03(c1673gi);
        A03.A0e(new VI(abstractC1847jd.A2E(), c1673gi.A0A()));
        boolean z = C1123Up.A2H(c1673gi) && SN.A0A(abstractC1847jd.A1H());
        if (z) {
            new SN(A03, abstractC1847jd.A1H(), abstractC1847jd.A10(), abstractC1847jd.A1D(), z, new C1825jF(this, c1673gi, isDSL, abstractC1847jd, interfaceC0950Nt)).A0B();
            return;
        }
        String A04 = A04(96, 12, 117);
        if (isDSL) {
            C1075St c1075St = new C1075St(abstractC1847jd.A0x(), abstractC1847jd.A1D(), A04);
            c1075St.A04 = true;
            c1075St.A03 = A04(0, 5, 78);
            A03.A0Y(c1075St);
        }
        A03.A0d(new C1077Sv(abstractC1847jd.A2C().A01(), C1510e4.A04, C1510e4.A04, abstractC1847jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean A30 = C1123Up.A30(c1673gi, C1600fX.A03());
        for (NR nr : abstractC1847jd.A2G()) {
            C1077Sv c1077Sv = new C1077Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC1847jd.A1D(), A04(96, 12, 117));
            if (i2 == 0) {
                A03.A0c(c1077Sv);
            } else {
                A03.A0d(c1077Sv);
            }
            for (String str : nr.A0K().A02()) {
                A03.A0d(new C1077Sv(str, -1, -1, abstractC1847jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1075St c1075St2 = new C1075St(nr.A0H().A09(), abstractC1847jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1075St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !A30) {
                        A03.A0Y(c1075St2);
                    } else {
                        A03.A0b(c1075St2);
                    }
                } else if (isDSL && !A30) {
                    A03.A0Z(c1075St2);
                } else {
                    A03.A0a(c1075St2);
                }
            }
            i2++;
        }
        if (abstractC1847jd.A1W() && !TextUtils.isEmpty(abstractC1847jd.A11())) {
            A03.A0d(new C1077Sv(abstractC1847jd.A11(), C0987Pe.A0A, C0987Pe.A0A, abstractC1847jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC1847jd, A03, A04);
        A03.A0X(new C1823jD(this, c1673gi, isDSL, abstractC1847jd, interfaceC0950Nt), new C1072Sq(abstractC1847jd.A1D(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1673gi c1673gi, EnumSet<CacheFlag> enumSet, C1839jT c1839jT, AbstractC1847jd abstractC1847jd, int i, InterfaceC0950Nt interfaceC0950Nt) {
        A09(c1673gi, enumSet, abstractC1847jd, i, new C1827jH(this, c1673gi, abstractC1847jd, c1839jT, i, interfaceC0950Nt, enumSet));
    }

    private void A0B(EnumC1334bD enumC1334bD) {
        this.A01 = enumC1334bD;
    }

    private boolean A0C(C1673gi c1673gi, AbstractC1847jd abstractC1847jd) {
        AdError A00 = A00(c1673gi, abstractC1847jd);
        if (A00 != null) {
            this.A04.ACo(A00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        return com.facebook.ads.redexgen.X.WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WK A0E() {
        if (this.A03.A1b()) {
            return WK.A04;
        }
        AbstractC1847jd abstractC1847jd = (AbstractC1847jd) this.A03;
        if (abstractC1847jd.A1g()) {
            return WK.A06;
        }
        if (abstractC1847jd.A2G().size() > 1) {
            return WK.A0A;
        }
        C0945No A07 = abstractC1847jd.A29().A0H().A07();
        if (A06[4].length() != 14) {
            String[] strArr = A06;
            strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
            strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
            if (A07 != null) {
                if (!abstractC1847jd.A1n()) {
                    boolean A1u = abstractC1847jd.A1u();
                    if (A06[0].length() != 2) {
                        String[] strArr2 = A06;
                        strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
                        strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
                    }
                }
                return WK.A0E;
            }
            boolean A0L = A0L(abstractC1847jd);
            if (A06[0].length() != 2) {
                A06[0] = "iDu";
                if (A0L) {
                    return WK.A0D;
                }
                return WK.A0B;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    public final EnumC1334bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C1839jT) this.A03).A2A();
        }
        return ((AbstractC1847jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1673gi c1673gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C1839jT c1839jT = (C1839jT) this.A03;
            AbstractC1847jd A26 = c1839jT.A26();
            if (A0C(c1673gi, A26) || A26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1673gi, enumSet, c1839jT, A26, 0, this.A04);
            return;
        }
        AbstractC1847jd abstractC1847jd = (AbstractC1847jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1673gi, abstractC1847jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C05477n c05477n = (C05477n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1673gi, c05477n);
                return;
            }
            A08(c1673gi, c05477n);
            return;
        }
        A09(c1673gi, enumSet, (C05477n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC1847jd abstractC1847jd) {
        return !TextUtils.isEmpty(abstractC1847jd.A29().A0H().A09());
    }
}
