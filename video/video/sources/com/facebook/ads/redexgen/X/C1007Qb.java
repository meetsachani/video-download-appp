package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Qb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1007Qb implements Comparator<C1008Qc> {
    public static String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C1008Qc c1008Qc, C1008Qc c1008Qc2) {
        if ((c1008Qc.A03 == null) != (c1008Qc2.A03 == null)) {
            C7M c7m = c1008Qc.A03;
            if (A00[1].length() != 18) {
                String[] strArr = A00;
                strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
                strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
                return c7m == null ? 1 : -1;
            }
            throw new RuntimeException();
        } else if (c1008Qc.A04 != c1008Qc2.A04) {
            return c1008Qc.A04 ? -1 : 1;
        } else {
            int i = c1008Qc2.A02 - c1008Qc.A02;
            if (i != 0) {
                return i;
            }
            int i2 = c1008Qc.A00;
            int deltaViewVelocity = c1008Qc2.A00;
            int i3 = i2 - deltaViewVelocity;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }
}
