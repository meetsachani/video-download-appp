package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C7834lj1;
import o.C8077mf;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfSpecParser;", "", "<init>", "()V", "parseImfSpec", "", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "imfInlineSpec", "", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.j9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1819j9 {
    public static byte[] A00;
    public static final C1819j9 A01;

    static {
        A02();
        A01 = new C1819j9();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{C8077mf.A, C8077mf.G, C8077mf.D, C3307Iz.e0, C8077mf.D, C8077mf.n, C8077mf.H, 32, C3307Iz.Y, C8077mf.H, C3307Iz.Z, C3307Iz.e0, C3307Iz.d0, 8, 5, C8077mf.B, 5, -8, C8077mf.z, 5, 7, C8077mf.q, C4715Xk.i, 70, 60, C3307Iz.d0, 65, 69, C4715Xk.i, 72, 76, 69, 40, 77, 75, 72, 77, 68, 50, 79, 68, 66, C8077mf.q, 2, 9, -2, 17, 6, 19, 2, -27, 2, 6, 4, 5, 17, 47, 34, C3307Iz.a0, C8077mf.H, 49, C3307Iz.Y, 51, 34, C8077mf.x, C3307Iz.Y, C3307Iz.V, 49, C3307Iz.X, 98, 85, 92, 81, 100, 89, 102, 85, 72, C3307Iz.a0, 28, 35, C8077mf.B, C3307Iz.c0, 32, C3307Iz.e0, 28, C8077mf.r, C8077mf.q, C8077mf.n, 17, -2, 17, 6, C8077mf.n, C8077mf.m, C2638Cg0.C7, 2, 4, C8077mf.q, 2, 2, C8077mf.r, 58, C3307Iz.d0, C3307Iz.f0, 52, C3307Iz.d0, 53, 59, C8077mf.m, 40, 59, 40, 17, 58, 54, 53, 108, 109, 90, 107, 109, 77, 98, 102, 94, C8077mf.A, C8077mf.B, 13, 7, C8077mf.q, 9, C8077mf.z, -27, C8077mf.A, C8077mf.A, 9, C8077mf.B, -19, 8, C8077mf.x, C8077mf.y, 10, 4, C8077mf.n, 6, 19, -11, C8077mf.D, 17, 6, 104, 93, 97, 89, 70, 85, 98, 91, 89, 106, 95, 99, 91, 76, 87, 98, 107, 91, 105, 103, 86, 88, 96, 56, 100, 98, 101, 100, 104, 94, 105, 94, 100, 99, 104, 48, C3307Iz.f0, C8077mf.G, 31, C3307Iz.Z, 0, C8077mf.G, 48, C8077mf.G, 6, 47, C3307Iz.c0, 42, -12, -14, C2638Cg0.C7, -29, -21, C2638Cg0.z7, C2638Cg0.C7, -19, -27};
    }

    @JvmStatic
    public static final List<C1818j8> A01(String str) throws JSONException {
        C2256qY.A09(str, A00(29, 13, 101));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(str).getJSONObject(A00(C7834lj1.G, 17, 123)).getJSONArray(A00(0, 1, 105));
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject imfTrack = jSONArray.getJSONObject(i).getJSONObject(A00(13, 9, 42));
            String string = imfTrack.getString(A00(199, 9, 6));
            JSONObject jSONObject = new JSONObject(imfTrack.getString(A00(C10997yd1.Q1, 13, 66)));
            String string2 = jSONObject.getString(A00(C3503Kz.d0, 11, 39));
            String string3 = jSONObject.getString(A00(126, 14, 42));
            C2256qY.A06(string2);
            C2256qY.A06(string3);
            C1817j7 c1817j7 = new C1817j7(string2, string3);
            JSONArray jSONArray2 = imfTrack.getJSONArray(A00(1, 12, 63));
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject dataTrack = jSONArray2.getJSONObject(i2);
                String A002 = A00(C3503Kz.k0, 9, 122);
                JSONObject jSONObject2 = dataTrack.getJSONObject(A002).getJSONObject(A00(117, 9, 127));
                String A003 = A00(160, 9, 124);
                long j = jSONObject2.getLong(A003);
                long j2 = dataTrack.getJSONObject(A002).getJSONObject(A00(22, 7, 94)).getLong(A003);
                JSONObject jSONObject3 = new JSONObject(dataTrack.getString(A00(102, 15, 77)));
                C2256qY.A06(string);
                arrayList.add(new C1818j8(string, j, j2, c1817j7, new C1816j6(jSONObject3.getDouble(A00(69, 9, 118)), jSONObject3.getDouble(A00(78, 9, 61)), jSONObject3.getDouble(A00(56, 13, 67)), jSONObject3.getDouble(A00(42, 14, 35)), jSONObject3.getDouble(A00(87, 15, 35)))));
            }
        }
        return arrayList;
    }
}
