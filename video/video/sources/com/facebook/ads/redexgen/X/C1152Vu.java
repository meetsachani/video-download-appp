package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4731Xo;
import o.C7193j50;
import o.C8077mf;
import o.ED2;
import o.QC1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1152Vu {
    public static byte[] A04;
    public static String[] A05 = {"ZYrzMRmVY0fKuwQx318rNacSlgEREo8W", "DFlEfnYj9N0tv35MBsRVrv0NQ03vrQp9", "7c1jEy6Yvwz0PD0sTLnvRvzL7JrMoPnP", "hf", "LVfRkpSB2W01n6UoKBvMpgi93s4V", "wjSsCSJEOA2zcxlJjQpf4WZQJP", "cgSUujLLCITlA6k0bkAALzG3bpp7bkqz", "L2ObalbYjPtjYVm4HCkeGK0BV8R2iNFP"};
    public final EnumC1151Vt A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C1152Vu(T8 t8, String str, String str2, EnumC1148Vq enumC1148Vq) throws C1146Vn {
        String A01 = A01(C4731Xo.d1, 21, 91);
        String A012 = A01(291, 11, 58);
        String A013 = A01(247, 14, 109);
        String A014 = A01(310, 4, 38);
        String A015 = A01(302, 8, 37);
        if (TextUtils.isEmpty(str)) {
            this.A00 = EnumC1151Vt.A04;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (EnumC1151Vt.valueOf(jSONObject.getString(A014).toUpperCase()).ordinal()) {
                case 0:
                    this.A00 = EnumC1151Vt.A03;
                    this.A01 = Long.valueOf(jSONObject.getString(A01(C10997yd1.o2, 6, 127)));
                    if (jSONObject.has(A013)) {
                        this.A02 = jSONObject.getString(A013);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(261, 9, 88));
                    if (!jSONObject.getString(A012).equals(t8.A05().A9T()) && !ProcessUtils.isRemoteRenderingProcess() && AbstractC1126Us.A03(jSONObject) != Boolean.TRUE) {
                        throw new C1146Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 122), this.A01, jSONObject.getString(A012), t8.A05().A9T()));
                    }
                    if (!jSONObject.getString(A01).equals(str2)) {
                        throw new C1146Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 11), this.A01, jSONObject.getString(A01), str2));
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(EnumC1148Vq.A0H.A04()), Integer.valueOf(EnumC1148Vq.A0K.A04()), Integer.valueOf(EnumC1148Vq.A0I.A04()), Integer.valueOf(EnumC1148Vq.A0J.A04())));
                    if (jSONObject.getInt(A015) != enumC1148Vq.A04()) {
                        if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(A015))) || !hashSet.contains(Integer.valueOf(enumC1148Vq.A04()))) {
                            throw new C1146Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(104, 48, 28), this.A01, Integer.valueOf(jSONObject.getInt(A015)), enumC1148Vq));
                        }
                        return;
                    }
                    return;
                default:
                    throw new C1146Vn(AdErrorType.BID_PAYLOAD_ERROR, A01(210, 28, 68) + jSONObject.getString(A014));
            }
        } catch (JSONException e) {
            t8.A08().ABC(A01(C10997yd1.u1, 3, 5), AbstractC1085Td.A0P, new C1086Te(e));
            throw new C1146Vn(AdErrorType.BID_PAYLOAD_ERROR, A01(C3503Kz.l0, 18, 88), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{34, 9, 4, 64, 69, 4, 64, 6, C8077mf.q, C8077mf.u, 64, 51, 36, C3307Iz.c0, 64, C8077mf.z, 5, C8077mf.u, 19, 9, C8077mf.q, C8077mf.p, 64, 69, 19, 64, 2, 5, 9, C8077mf.p, 7, 64, C8077mf.y, 19, 5, 4, 64, C8077mf.q, C8077mf.p, 64, 51, 36, C3307Iz.c0, 64, C8077mf.z, 5, C8077mf.u, 19, 9, C8077mf.q, C8077mf.p, 64, 69, 19, 83, QC1.w, 117, 49, 52, 117, 49, 119, 126, 99, 49, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, 49, 52, 98, 49, 115, 116, QC1.w, Byte.MAX_VALUE, 118, 49, 100, 98, 116, 117, 49, 126, Byte.MAX_VALUE, 49, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, 49, 52, 98, 68, 111, 98, C3307Iz.Y, 35, 98, C3307Iz.Y, 96, 105, 116, C3307Iz.Y, 114, 99, 107, 118, 106, 103, 114, 99, C3307Iz.Y, 35, 117, C3307Iz.Y, 100, 99, 111, 104, 97, C3307Iz.Y, 115, 117, 99, 98, C3307Iz.Y, 105, 104, C3307Iz.Y, 114, 99, 107, 118, 106, 103, 114, 99, C3307Iz.Y, 35, 117, C8077mf.m, C3307Iz.d0, 52, 35, C3307Iz.f0, C3307Iz.c0, C3307Iz.Y, 98, 0, C3307Iz.c0, C3307Iz.Y, C8077mf.u, 35, 59, C3307Iz.f0, C3307Iz.e0, 35, C3307Iz.Y, 71, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, 51, 54, 96, 51, 122, 96, 51, 125, 124, 103, 51, 101, 114, Byte.MAX_VALUE, 122, 119, 51, 113, 114, 125, 125, 118, 97, 51, 103, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, C8077mf.m, 48, C3307Iz.e0, C3307Iz.c0, C3307Iz.f0, C3307Iz.f0, 49, C3307Iz.d0, 42, 59, 58, 126, 28, 55, 58, C8077mf.p, ED2.a, C3307Iz.Z, 50, 49, ED2.a, 58, 126, 42, C3307Iz.Z, C3307Iz.f0, 59, 126, 126, 111, 118, 7, C8077mf.n, 1, 58, C8077mf.n, 1, C8077mf.y, C8077mf.H, 19, 40, 3, C8077mf.H, C8077mf.D, C8077mf.u, 40, 3, C8077mf.B, 28, C8077mf.u, C8077mf.C, C3307Iz.Y, C3307Iz.Z, 52, C3307Iz.c0, C3307Iz.V, C3307Iz.Z, C8077mf.G, C3307Iz.c0, C3307Iz.Y, 51, 36, 50, C3307Iz.f0, C3307Iz.e0, 55, 36, C3307Iz.X, C8077mf.H, 49, C3307Iz.e0, 32, 34, 36, C3307Iz.d0, 36, 47, 53, C8077mf.H, 40, C3307Iz.X, 83, 68, 75, Byte.MAX_VALUE, 86, 69, 82, 83, 73, 79, 78, 75, 90, 82, 79, 83, 94, 75, 90, 72, 69, 76, 89};
    }

    static {
        A02();
    }

    public C1152Vu() {
        this.A00 = EnumC1151Vt.A04;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static EnumC1148Vq A00(String str) throws C1146Vn {
        try {
            return EnumC1148Vq.A00(new JSONObject(str).getInt(A01(302, 8, 37)));
        } catch (JSONException e) {
            throw new C1146Vn(AdErrorType.BID_PAYLOAD_ERROR, A01(C3503Kz.l0, 18, 88), e);
        }
    }

    public static void A03(EnumC1148Vq enumC1148Vq) throws C1146Vn {
        if (!EnumC1148Vq.A0G.equals(enumC1148Vq) && !EnumC1148Vq.A0E.equals(enumC1148Vq) && !EnumC1148Vq.A0F.equals(enumC1148Vq)) {
            boolean equals = EnumC1148Vq.A0D.equals(enumC1148Vq);
            if (A05[1].charAt(20) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "X5uVqi4FyBeSosvF2q5aVclYJStrMHB5";
            strArr[2] = "BOgVvqLcU58P5XEa1Smg5LyKHeBKxxT8";
            if (equals) {
                return;
            }
            throw new C1146Vn(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(C7193j50.f, 40, 9), Integer.valueOf(enumC1148Vq.A04())));
        }
    }

    public final String A04() {
        if (this.A01 == null) {
            return null;
        }
        Long l = this.A01;
        if (A05[4].length() != 4) {
            A05[7] = "9BRFtSg6abebTfCvkl6x8CVGG9ZYJ4hw";
            return l.toString();
        }
        throw new RuntimeException();
    }

    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != EnumC1151Vt.A04;
    }
}
