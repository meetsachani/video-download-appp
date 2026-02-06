package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C2638Cg0;
import o.QC1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1464dJ {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C1457dC> A00;
    public WeakReference<InterfaceC0820Is> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1673gi A03;
    public final C1444cz A04;
    public final String A05;
    public final String A06;
    public final WeakReference<VA> A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, Byte.MAX_VALUE, QC1.w, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, C2638Cg0.v7, -72, C2638Cg0.q7, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, C2638Cg0.C7, -30, C2638Cg0.A7, -32, -30, -45, -46, -80, -25, C2638Cg0.r7, C2638Cg0.C7, -45, -32, -14, -13, -32, -13, -28, C2638Cg0.E7, -42, -48, -81, C2638Cg0.v7, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C1464dJ(C1673gi c1673gi, C1457dC c1457dC, VA va, C1444cz c1444cz, String str, String str2) {
        this.A03 = c1673gi;
        this.A00 = new WeakReference<>(c1457dC);
        this.A07 = new WeakReference<>(va);
        this.A04 = c1444cz;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        InterfaceC0820Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        InterfaceC0820Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9k();
    }

    private void A06() {
        InterfaceC0820Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AAm();
    }

    private void A07() {
        this.A03.A0F().A64();
        this.A02 = true;
        InterfaceC0820Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AKD();
        if (C1123Up.A1z(this.A03)) {
            this.A03.A0B().ADb();
        }
    }

    private void A08() {
        InterfaceC0820Is uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AE0();
    }

    private void A0A(C1457dC c1457dC, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = WN.A00(this.A03);
        String A01 = A01(57, 5, 77);
        String A012 = A01(0, 0, 53);
        String storageValue = jSONObject.optString(A01, A012);
        String key = jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34));
        String string = A00.getString(A01(14, 4, 0) + key, A012);
        if (string != null) {
            A012 = string;
        }
        c1457dC.A0g(storageValue, A012);
    }

    private void A0B(C1457dC c1457dC, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(98, 5, 42);
        String A012 = A01(0, 0, 53);
        String optString = jSONObject.optString(A01, A012);
        String optString2 = jSONObject.optString(A01(57, 5, 77), A012);
        WN.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), optString).apply();
        c1457dC.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC1462dH enumC1462dH, String str) throws JSONException {
        switch (enumC1462dH.ordinal()) {
            case 0:
                A0I(new JSONObject(str));
                break;
            case 1:
                A06();
                break;
            case 2:
                A04();
                break;
            case 5:
                A07();
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A0K(new JSONObject(str));
                break;
            case 9:
                A0L(new JSONObject(str));
                break;
            case 10:
                A05();
            case 11:
                this.A03.A0F().A6G(str);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                A0D(enumC1462dH, str);
                break;
            case 19:
                A0J(new JSONObject(str));
                break;
            case 20:
                A08();
                break;
            case 21:
                A0M(new JSONObject(str));
                break;
        }
        C1457dC c1457dC = this.A00.get();
        if (c1457dC == null) {
            return;
        }
        switch (enumC1462dH.ordinal()) {
            case 3:
                c1457dC.A0S();
                return;
            case 4:
                c1457dC.A0R();
                return;
            case 6:
                c1457dC.A0i(A03(new JSONObject(str)));
                return;
            case 17:
                A0B(c1457dC, str);
                return;
            case 18:
                A0A(c1457dC, str);
                return;
            default:
                return;
        }
    }

    private void A0D(EnumC1462dH enumC1462dH, String str) throws JSONException {
        InterfaceC0820Is interfaceC0820Is = this.A01.get();
        if (interfaceC0820Is == null) {
            return;
        }
        switch (enumC1462dH.ordinal()) {
            case 12:
                A0E(interfaceC0820Is, str);
                return;
            case 13:
                interfaceC0820Is.AE4();
                return;
            case 14:
                interfaceC0820Is.AFz();
                return;
            case 15:
                A0G(interfaceC0820Is, str);
                return;
            case 16:
                A0F(interfaceC0820Is, str);
                return;
            default:
                return;
        }
    }

    private void A0E(InterfaceC0820Is interfaceC0820Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 115);
        interfaceC0820Is.AEu(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(InterfaceC0820Is interfaceC0820Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        interfaceC0820Is.AGX(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(InterfaceC0820Is interfaceC0820Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 98);
        interfaceC0820Is.AGZ(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC0820Is interfaceC0820Is = this.A01.get();
        if (interfaceC0820Is == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(productUrl)) {
            interfaceC0820Is.A9f();
        } else {
            interfaceC0820Is.A9g(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        InterfaceC0820Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        VA va = this.A07.get();
        if (va == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String key = jSONObject.optString(A01(43, 11, 127));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        VI handler = new VI(this.A06, va);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (optInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 56));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0F().ABA(optInt, message);
        String[] strArr = A09;
        String message2 = strArr[2];
        String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(JSONObject jSONObject) {
        InterfaceC0820Is interfaceC0820Is = this.A01.get();
        if (interfaceC0820Is == null) {
            return;
        }
        String A01 = A01(92, 6, 88);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        String optString = jSONObject.optString(A01);
        if (optString == null) {
            return;
        }
        interfaceC0820Is.AGo(optString);
    }

    public final void A0N(InterfaceC0820Is interfaceC0820Is) {
        this.A01 = new WeakReference<>(interfaceC0820Is);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        Y4.A00(new RunnableC1461dG(this, str));
    }
}
