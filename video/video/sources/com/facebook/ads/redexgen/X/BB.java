package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.Arrays;
import o.C3307Iz;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class BB extends AbstractC2244qK<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"JDLm", "59j9VSz50JRV62zRfQhUHOfkCXfgeUgK", "B91zWfVJnglJ6qaTwxSE2cgOmWPFgOKk", "ELqJY4", "RV9gCl0i3PKSKYNXbtai8ngQK3fccqTs", "fKxm10xyRNZ", "83zGhfyjGQem9Bncw", "2Nxy8TZF5cPmoYOpvxnNSToHaqPSrsmH"};
    public static final BB A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
            if (A01[5].length() == 31) {
                throw new RuntimeException();
            }
            A01[3] = "F1rbTbQwQjJP2vUBRKO1k8FP";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{13, 48, C3307Iz.Y, C3307Iz.Z, 48, C3307Iz.c0, C3307Iz.d0, C3307Iz.X, 108, C3307Iz.d0, 35, 54, 55, 48, 35, C3307Iz.f0, 106, 107};
    }

    static {
        A02();
        A02 = new BB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC2244qK, java.util.Comparator
    /* renamed from: A00 */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC1912ki.A04(left);
        AbstractC1912ki.A04(right);
        return left.compareTo(right);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2244qK
    public final <S extends Comparable<?>> AbstractC2244qK<S> A06() {
        return B8.A02;
    }

    public final String toString() {
        return A01(0, 18, 23);
    }
}
