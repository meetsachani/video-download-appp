package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Bh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0631Bh<T> extends AbstractC2244qK<T> implements Serializable {
    public static String[] A01 = {"jVomwQRsen5vglXLuhXzBdwbPq6Ybrnn", "4aFITO9kz2LhtcD79HHzI", "vi18DojAtNgr3DJJSarcVnM7GKn6nndK", "ML5KuQXC", "N0lS1ni31cQ1TBeJZ0107lcHpyRIIPod", "312TaVRQAIGqwiXD4iywzyjTEypEIgK4", "JELmBa89yxiLk2CDuF87Yo0NIlkJ44v9", "QWcb8PBY5hKO"};
    public static final long serialVersionUID = 0;
    public final Comparator<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public C0631Bh(Comparator<T> comparator) {
        this.A00 = (Comparator) AbstractC1912ki.A04(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2244qK, java.util.Comparator
    public final int compare(@ParametricNullness T a, @ParametricNullness T b) {
        return this.A00.compare(a, b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof C0631Bh) {
            return this.A00.equals(((C0631Bh) object).A00);
        }
        String[] strArr = A01;
        if (strArr[0].charAt(22) != strArr[5].charAt(22)) {
            A01[7] = "MG7YcOvDvuMg";
            return false;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public final String toString() {
        return this.A00.toString();
    }
}
