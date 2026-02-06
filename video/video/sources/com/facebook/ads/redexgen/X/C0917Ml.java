package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.Ml  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0917Ml {
    public static byte[] A02;
    public static String[] A03 = {"TCwFA", "n8MKtp9dwzEQhpBe6BR2lxKd", "DvIgkYTRPnnTPXJJnoSR1kudzHpByEo2", "", "ukKEwC6XKRrkT9sIUNjxPleVuSFlcA27", "xINsVOhHX0SgxNuz70RgaHOI4yPeG", "tcBEB0UiUFi9btMnbz6doT8G4EON6", ""};
    public final Map<String, Object> A01 = new HashMap();
    public final List<String> A00 = new ArrayList();

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {79, 82, 69, 117, 70, 79, 68, C3307Iz.c0, 54, C3307Iz.V, 17, 60, C3307Iz.c0, 42, C3307Iz.Z, 60};
        if (A03[2].charAt(26) == 'i') {
            throw new RuntimeException();
        }
        A03[4] = "OztgjXBJYpDAKFMtRJu6AzmPW9OlK9cP";
        A02 = bArr;
    }

    static {
        A07();
    }

    public static C0917Ml A00(C0917Ml c0917Ml, long j) {
        return c0917Ml.A03(A06(0, 7, 94), j);
    }

    public static C0917Ml A01(C0917Ml c0917Ml, Uri uri) {
        String A06 = A06(7, 9, 58);
        if (uri == null) {
            return c0917Ml.A02(A06);
        }
        return c0917Ml.A05(A06, uri.toString());
    }

    private final C0917Ml A02(String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    private final C0917Ml A03(String str, long j) {
        return A04(str, Long.valueOf(j));
    }

    private C0917Ml A04(String str, Object obj) {
        this.A01.put((String) AbstractC04543y.A01(str), AbstractC04543y.A01(obj));
        this.A00.remove(str);
        return this;
    }

    private final C0917Ml A05(String str, String str2) {
        return A04(str, str2);
    }

    public final List<String> A08() {
        return Collections.unmodifiableList(new ArrayList(this.A00));
    }

    public final Map<String, Object> A09() {
        HashMap hashMap = new HashMap(this.A01);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            boolean z = value instanceof byte[];
            if (A03[2].charAt(26) == 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "";
            strArr[3] = "";
            if (z) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
