package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2x  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04292x {
    public Uri A00;
    public List<Integer> A01;
    public Map<String, String> A02;
    public UUID A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;

    @Deprecated
    public C04292x() {
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyList();
    }

    public final C04302y A08() {
        return new C04302y(this);
    }
}
