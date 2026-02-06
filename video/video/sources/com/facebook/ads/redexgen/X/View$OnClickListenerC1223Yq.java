package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Yq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1223Yq implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public View$OnClickListenerC1223Yq(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1207Ya interfaceC1207Ya;
        ZK zk;
        InterfaceC1207Ya interfaceC1207Ya2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1207Ya = this.A00.A02;
            if (interfaceC1207Ya != null) {
                zk = this.A00.A09;
                if (zk.A06()) {
                    interfaceC1207Ya2 = this.A00.A02;
                    interfaceC1207Ya2.ACl(this.A00);
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
