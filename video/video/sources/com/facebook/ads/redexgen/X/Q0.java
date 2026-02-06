package com.facebook.ads.redexgen.X;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Q0 {
    public static final C1005Pz A00 = new C1750hy() { // from class: com.facebook.ads.redexgen.X.7S
        @Override // com.facebook.ads.redexgen.X.C1005Pz
        public final int A00(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @Override // com.facebook.ads.redexgen.X.C1005Pz
        public final void A01(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    };

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
