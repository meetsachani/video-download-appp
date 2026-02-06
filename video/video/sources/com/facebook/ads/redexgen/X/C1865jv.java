package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1865jv extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C1864ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1865jv(C1864ju c1864ju, Map map, Map map2) {
        this.A00 = c1864ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1852ji c1852ji;
        C1673gi c1673gi;
        C1852ji c1852ji2;
        c1852ji = this.A00.A01;
        if (!TextUtils.isEmpty(c1852ji.A7O())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1673gi = this.A00.A0A;
            VA A0A = c1673gi.A0A();
            c1852ji2 = this.A00.A01;
            A0A.AC3(c1852ji2.A7O(), hashMap);
        }
    }
}
