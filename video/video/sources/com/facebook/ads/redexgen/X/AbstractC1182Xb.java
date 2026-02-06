package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1182Xb {
    public static byte[] A00;
    public static String[] A01 = {"CrCy7lrq6K7x8XfVc2fNdD07yQrJARzJ", "2MxjV7VZ3w9mO7JRBJp513kJ", "rmUL5G3ocM8QXPjdZtuh6zbaNsDgif4G", "2yiBwXDvjLEglhUZ76UGTCKc6ACbYUli", "XTHqKjDvfaB7R0kK8woS2JMLPY9kkXKh", "8qNbzU9VaySgM9v1BVYKE0up", "2SD8", "5eH9HzTGPv5UTtfJbfYv5z17pUBai2pZ"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{C8077mf.n, C8077mf.E, C8077mf.E, C8077mf.A, C8077mf.x, C8077mf.p, C8077mf.n, 31, C8077mf.x, C8077mf.D, C8077mf.C, C2638Cg0.B7, C8077mf.E, C8077mf.q, 17, -3, 9, -2, -1, 40, C3307Iz.a0, 55, C3307Iz.Z, 54, C3307Iz.e0, 52, 56, C3307Iz.e0, 51, 50, -24, -27, -33};
    }

    static {
        A03();
    }

    public static String A01(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(15, 4, 57), i);
            jSONObject.put(A00(19, 11, 99), str);
            JSONObject errorMsgObj = jSONObject.put(A00(30, 3, 18), str2);
            errorMsgObj.toString();
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        String[] strArr = A01;
        if (strArr[2].charAt(8) != strArr[4].charAt(8)) {
            A01[3] = "VgY5LYgsJRJxHdOPZ6f9tdfdxgenUCo4";
            return jSONObject2;
        }
        throw new RuntimeException();
    }

    public static String A02(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String A002 = A00(0, 0, 114);
        if (isEmpty) {
            return A002;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return A002;
        }
        String extension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return extension;
    }

    public static boolean A04(String str) {
        return A00(0, 15, 74).equalsIgnoreCase(A02(str));
    }
}
