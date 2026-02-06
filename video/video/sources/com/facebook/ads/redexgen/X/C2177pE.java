package com.facebook.ads.redexgen.X;

import android.content.Context;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.pE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2177pE implements C5Y {
    public final Context A00;
    public final C5Y A01;
    public final InterfaceC05015t A02;

    public C2177pE(Context context, InterfaceC05015t interfaceC05015t, C5Y c5y) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC05015t;
        this.A01 = c5y;
    }

    public C2177pE(Context context, String str, InterfaceC05015t interfaceC05015t) {
        this(context, interfaceC05015t, new AO().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C5Y
    /* renamed from: A00 */
    public final AP A5I() {
        AP ap = new AP(this.A00, this.A01.A5I());
        if (this.A02 != null) {
            ap.A43(this.A02);
        }
        return ap;
    }
}
