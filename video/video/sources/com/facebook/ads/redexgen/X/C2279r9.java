package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2279r9 {
    public final InterfaceC2283rD A00;
    public final String A01;
    public final Collection<C2293rN> A02;
    public final Collection<C2293rN> A03;
    public final List<Rect> A04;

    public C2279r9(String str, InterfaceC2283rD interfaceC2283rD, List<Rect> rects, Collection<C2293rN> collection, Collection<C2293rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2283rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
