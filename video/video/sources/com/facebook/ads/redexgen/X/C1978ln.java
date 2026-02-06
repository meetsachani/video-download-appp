package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import o.C2638Cg0;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: com.facebook.ads.redexgen.X.ln  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1978ln<K> implements Iterator<K> {
    public static byte[] A03;
    @CheckForNull
    public Map.Entry<K, Collection<V>> A00;
    public final /* synthetic */ C2O A01;
    public final /* synthetic */ Iterator A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{C2638Cg0.E7, C2638Cg0.B7, -117, C2638Cg0.z7, -52, -41, -41, -34, -117, -33, C2638Cg0.B7, -117, C2638Cg0.E7, -48, -29, -33, -109, -108, -117, -34, -44, C2638Cg0.E7, C2638Cg0.z7, -48, -117, -33, -45, -48, -117, -41, -52, -34, -33, -117, C2638Cg0.z7, -52, -41, -41, -117, -33, C2638Cg0.B7, -117, -35, -48, C2638Cg0.n7, C2638Cg0.B7, C2638Cg0.C7, -48, -109, -108};
    }

    public C1978ln(final C2O this$1, final Iterator val$entryIterator) {
        this.A02 = val$entryIterator;
        this.A01 = this$1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final K next() {
        this.A00 = (Map.Entry) this.A02.next();
        return this.A00.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1912ki.A0F(this.A00 != null, A00(0, 50, 26));
        Collection collection = (Collection) this.A00.getValue();
        this.A02.remove();
        C2L.A03(this.A01.A00, collection.size());
        collection.clear();
        this.A00 = null;
    }
}
