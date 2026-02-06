package com.facebook.ads.redexgen.X;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1888kJ implements InterfaceC0928Mw {
    public final /* synthetic */ C1673gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1888kJ(JSONObject jSONObject, C1673gi c1673gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1673gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0928Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0928Mw
    public final Collection<String> A7p() {
        return AbstractC0929Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0928Mw
    public final EnumC0927Mv A8K() {
        return AbstractC0929Mx.A00(this.A02);
    }
}
