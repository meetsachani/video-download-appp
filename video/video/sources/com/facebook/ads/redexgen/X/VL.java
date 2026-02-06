package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.Xu2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class VL {
    public static byte[] A00;
    public static final String A01;
    public static final Map<String, Integer> A02;
    public static final AtomicInteger A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, -96, C2638Cg0.z7, -27, -9, -96, -10, C2638Cg0.C7, -20, -11, -27, -70, -96, -111, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, 96, -84, -81, -93, -95, -84, 96, -93, -81, -75, -82, -76, -91, -78, -77, 122, 96, -4, C3307Iz.V, C8077mf.z, C3307Iz.X, C8077mf.B, 32, C8077mf.B, C3307Iz.V, C3307Iz.Z, 28, C3307Iz.V, C8077mf.D, -45, C8077mf.z, 34, 40, C3307Iz.V, C3307Iz.Z, C8077mf.B, C3307Iz.X, -19, -45, -7, 28, C8077mf.r, C8077mf.p, C8077mf.C, -16, 28, 34, C8077mf.E, C3307Iz.V, C8077mf.u, 31, 32, -99, -96, -96, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, -16, -16, C2638Cg0.C7, -23, -20, -16, -84, -86, -66, -80, -79, -67, -88, -82, C2638Cg0.p7, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, -16, -1, -70, C2638Cg0.n7, -37, C2638Cg0.A7, C2638Cg0.y7, C2638Cg0.n7, -21, C2638Cg0.A7, -37, C2638Cg0.C7, C2638Cg0.B7, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, -81, C8077mf.B, C8077mf.E, C8077mf.q, 13, C8077mf.B, C8077mf.m, C8077mf.q, C8077mf.E, C3307Iz.V, C8077mf.D, 32, 17, C8077mf.H, 31, -47, C2638Cg0.q7, C2638Cg0.B7, C2638Cg0.y7, -48, C2638Cg0.q7, C2638Cg0.s7, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, C2638Cg0.y7, C2638Cg0.q7, -47, -45, C2638Cg0.o7, -46, -41, C2638Cg0.z7, C2638Cg0.r7, -67, C2638Cg0.p7, C2638Cg0.y7, C2638Cg0.q7, C2638Cg0.r7};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A06(T8 t8, InterfaceC1624fv interfaceC1624fv, Map<String, ?> map) throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(93, 7, 67), A01(13, 1, 40));
        A0A(t8, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A01(Xu2.A, 7, 36), A01(C3503Kz.q0, 14, 115));
        hashMap2.put(A01(195, 12, 37), String.valueOf(3501));
        hashMap2.put(A01(100, 16, 16), A01(14, 1, 62));
        hashMap2.put(A01(178, 10, 74), A01(65, 13, 116));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (t8.A05().AAO()) {
            String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        hashMap2.put(A01(78, 15, 3), jSONObject.toString());
        A0A(t8, hashMap2);
        U7 A09 = t8.A09();
        JSONObject A05 = C1087Tf.A05(new C1089Th(A09.A01(), A09.A02(), hashMap2));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(A05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(147, 4, 12), new JSONObject(hashMap));
        jSONObject2.put(A01(C3503Kz.k0, 6, 3), jSONArray);
        C1638g9 c1638g9 = new C1638g9();
        c1638g9.put(A01(171, 7, 40), jSONObject2.toString());
        interfaceC1624fv.AGy(t8.A05().A86(), c1638g9.A08(), new WJ(t8));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0A(T8 t8, Map<String, String> map) {
        map.putAll(t8.A04().A5a());
    }

    static {
        A04();
        A01 = VL.class.getSimpleName();
        A03 = new AtomicInteger(0);
        A02 = new HashMap();
    }

    public static void A05(T8 t8) {
        if (A0C(t8)) {
            return;
        }
        synchronized (VL.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            YG.A06.execute(new WR(t8));
        }
    }

    public static void A08(T8 t8, String str) {
        int value;
        int i;
        if (A0C(t8)) {
            return;
        }
        synchronized (VL.class) {
            if (A03.get() != 2) {
                if (A02.containsKey(str)) {
                    i = A02.get(str).intValue();
                } else {
                    i = 0;
                }
                value = i + 1;
                A02.put(str, Integer.valueOf(value));
            } else {
                SharedPreferences sharedPreferences = t8.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 83), t8), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (t8.A05().AAO()) {
                String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + value;
            }
        }
    }

    public static void A09(T8 t8, String str) {
        if (A0C(t8)) {
            return;
        }
        YG.A06.execute(new WO(t8, str));
    }

    public static boolean A0B(double d, int i) {
        return i <= 0 || d >= 1.0d / ((double) i);
    }

    public static boolean A0C(T8 t8) {
        if (t8.A05().AAO()) {
            return false;
        }
        if (!AbstractC1125Ur.A0U(t8)) {
            return true;
        }
        return A0B(t8.A09().A00(), AbstractC1125Ur.A0C(t8));
    }
}
