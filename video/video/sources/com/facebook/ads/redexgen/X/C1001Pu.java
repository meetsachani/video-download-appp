package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Pu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1001Pu implements Comparator<View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(View view, View view2) {
        C0995Po c0995Po = (C0995Po) view.getLayoutParams();
        C0995Po c0995Po2 = (C0995Po) view2.getLayoutParams();
        if (c0995Po.A05 != c0995Po2.A05) {
            return c0995Po.A05 ? 1 : -1;
        }
        return c0995Po.A02 - c0995Po2.A02;
    }
}
