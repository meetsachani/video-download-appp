package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2094ns {
    public static final AbstractC2094ns A00 = new C0628Be();
    public static final AbstractC2094ns A02 = new C0626Bc(-1);
    public static final AbstractC2094ns A01 = new C0626Bc(1);

    public abstract int A05();

    public abstract AbstractC2094ns A06(int left, int right);

    public abstract AbstractC2094ns A07(long left, long right);

    public abstract <T> AbstractC2094ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2094ns A09(boolean left, boolean right);

    public abstract AbstractC2094ns A0A(boolean left, boolean right);

    public AbstractC2094ns() {
    }

    public /* synthetic */ AbstractC2094ns(C0628Be c0628Be) {
        this();
    }

    public static AbstractC2094ns A01() {
        return A00;
    }
}
