package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ar  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0615Ar implements InterfaceC2304rY {
    public final List<InterfaceC2305rZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC2304rY
    public final InterfaceC2305rZ A6i(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2305rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2304rY
    public final int size() {
        return this.A00.size();
    }
}
