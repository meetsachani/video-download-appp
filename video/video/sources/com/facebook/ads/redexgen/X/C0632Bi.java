package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Bi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0632Bi<K, V> extends AbstractC1982lr<K, V> {
    public int A00;
    @ParametricNullness
    public final K A01;
    public final /* synthetic */ C2083nh A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1982lr, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        Object A0F;
        Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) AbstractC2239qF.A01(A0h.get(this.A01));
        }
        A00();
        if (this.A00 == -1) {
            return (V) AbstractC2239qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        return (V) A0F;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1982lr, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V value) {
        Object A0F;
        Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) AbstractC2239qF.A01(A0h.put(this.A01, value));
        }
        A00();
        if (this.A00 == -1) {
            this.A02.put(this.A01, value);
            return (V) AbstractC2239qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        V v = (V) A0F;
        this.A02.A0R(this.A00, value);
        return v;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    public C0632Bi(final C2083nh this$0, int index) {
        Object A0E;
        this.A02 = this$0;
        A0E = this$0.A0E(index);
        this.A01 = (K) A0E;
        this.A00 = index;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    private void A00() {
        int A07;
        Object A0E;
        if (this.A00 != -1 && this.A00 < this.A02.size()) {
            K k = this.A01;
            A0E = this.A02.A0E(this.A00);
            if (CB.A01(k, A0E)) {
                return;
            }
        }
        A07 = this.A02.A07(this.A01);
        this.A00 = A07;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    @Override // com.facebook.ads.redexgen.X.AbstractC1982lr, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A01;
    }
}
