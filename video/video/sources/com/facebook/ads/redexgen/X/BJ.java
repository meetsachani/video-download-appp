package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public enum BJ implements InterfaceC1893kO<Map.Entry<?, ?>, Object> {
    A02 { // from class: com.facebook.ads.redexgen.X.2H
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.InterfaceC1893kO
        @CheckForNull
        /* renamed from: A00 */
        public final Object A4B(Map.Entry<?, ?> entry) {
            return entry.getKey();
        }
    },
    A03 { // from class: com.facebook.ads.redexgen.X.2G
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.InterfaceC1893kO
        @CheckForNull
        /* renamed from: A00 */
        public final Object A4B(Map.Entry<?, ?> entry) {
            return entry.getValue();
        }
    };
    
    public static byte[] A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{C2638Cg0.r7, -67, -47, 4, -17, -6, 3, -13};
    }

    static {
        A02();
    }

    /* synthetic */ BJ(BL bl) {
        this();
    }
}
