package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class BE<V> implements InterfaceC1923ku<List<V>>, Serializable {
    public static byte[] A01;
    public static String[] A02 = {"e5wnLSIbQxkq8Zb8jKmA", "K5DmaQySCrjWvleFa", "LWuY7vQYlXU7vsjuD", "M7ok9ovwGeM", "5nYOTBMz755", "tdWE3UbGCkl2", "in1BIrIvXgLkxgASW", "Nc3XS6cKk9DYxfmxbznhVqbsdMI4LYY"};
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            if (A02[0].length() != 20) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "LeP2zF5PzD6";
            strArr[4] = "FkYvCPAL8bA";
            copyOfRange[i4] = (byte) (i5 - 73);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {10, C8077mf.G, C8077mf.y, 10, 8, C8077mf.C, 10, 9, -5, 6, 17, C8077mf.D, 10, C8077mf.B, -11, 10, C8077mf.A, -16, 10, C8077mf.H};
        String[] strArr = A02;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "U6hTL0roTrM";
        strArr2[4] = "z8jhm3qQIoz";
        A01 = bArr;
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    public BE(int expectedValuesPerKey) {
        this.A00 = AbstractC2059nJ.A00(expectedValuesPerKey, A00(0, 20, 92));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1923ku
    /* renamed from: A01 */
    public final List<V> get() {
        return new ArrayList(this.A00);
    }
}
