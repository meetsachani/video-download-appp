package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network/classes2.dex */
public class BK<K, V> extends AbstractC03851d<Map.Entry<K, V>, V> {
    public BK(Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03851d
    @ParametricNullness
    /* renamed from: A00 */
    public final V A01(Map.Entry<K, V> entry) {
        return entry.getValue();
    }
}
