package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0628Be extends AbstractC2094ns {
    public C0628Be() {
        super(null);
    }

    private final AbstractC2094ns A00(int result) {
        AbstractC2094ns abstractC2094ns;
        AbstractC2094ns abstractC2094ns2;
        AbstractC2094ns abstractC2094ns3;
        if (result < 0) {
            abstractC2094ns3 = AbstractC2094ns.A02;
            return abstractC2094ns3;
        } else if (result > 0) {
            abstractC2094ns2 = AbstractC2094ns.A01;
            return abstractC2094ns2;
        } else {
            abstractC2094ns = AbstractC2094ns.A00;
            return abstractC2094ns;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2094ns
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2094ns
    public final AbstractC2094ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2094ns
    public final AbstractC2094ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2094ns
    public final <T> AbstractC2094ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2094ns
    public final AbstractC2094ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2094ns
    public final AbstractC2094ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
