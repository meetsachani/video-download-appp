package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;
import o.EG0;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oI  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2119oI {
    public static int A00(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * EG0.a), 15) * EG0.b);
    }

    public static int A01(int expectedEntries, double loadFactor) {
        int max = Math.max(expectedEntries, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (highestOneBit * loadFactor))) {
            int tableSize = highestOneBit << 1;
            if (tableSize > 0) {
                return tableSize;
            }
            return 1073741824;
        }
        return highestOneBit;
    }

    public static int A02(@CheckForNull Object o2) {
        return A00(o2 == null ? 0 : o2.hashCode());
    }
}
