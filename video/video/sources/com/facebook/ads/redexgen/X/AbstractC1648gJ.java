package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.gJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1648gJ {
    public static String[] A00 = {"GvbI", "ZazQ", "jGVKLNF9IyZZC6yZD7vUdND", "cIibDuYBy4iZiWhBa7aDKVcHYQepg0dA", "kp8Ba6lLXDz7KYAXK4DvfF3NzckJKvFL", "SSvAaaHsDdE6RjWizyVCXkVcp0DozyD6", "SP8di31m2uLOcP53jnkdZfwtPUUyGlI0", "zoV6YIxZR0JxBorwnPIpT"};

    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            EnumC1647gI t1 = EnumC1647gI.A00(jSONArray, i);
            if (t1 != EnumC1647gI.A00(jSONArray2, i) || !t1.A06(jSONArray, jSONArray2, i)) {
                return false;
            }
        }
        String[] strArr = A00;
        if (strArr[5].charAt(10) != strArr[6].charAt(10)) {
            String[] strArr2 = A00;
            strArr2[7] = "kAUv4Go12E5I6bj9gVym2";
            strArr2[2] = "RoQebNbND8hZkGW6Dl9KhdG";
            return true;
        }
        throw new RuntimeException();
    }

    public static /* synthetic */ boolean A01(JSONArray jSONArray, JSONArray jSONArray2) {
        return A00(jSONArray, jSONArray2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        EnumC1647gI A01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (A00[3].charAt(27) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[1] = "ADTX";
            strArr[0] = "wJhB";
            String str = next;
            if (!jSONObject2.has(str) || (A01 = EnumC1647gI.A01(jSONObject, str)) != EnumC1647gI.A01(jSONObject2, str) || !A01.A08(jSONObject, jSONObject2, str)) {
                return false;
            }
            while (keys.hasNext()) {
            }
        }
        String[] strArr2 = A00;
        String key = strArr2[7];
        if (key.length() != strArr2[2].length()) {
            A00[4] = "f4NlNCElPjJB5pPYNhX2WTR6iFmKnfGM";
            return true;
        }
        throw new RuntimeException();
    }
}
