package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1253Zu implements View.OnClickListener {
    public static String[] A03 = {"qTn7FHoQ", "BapBypyKyXgi02nUaikHNoU7eY2sLlHG", "hAbogJy7", "1kKCdLvWKNxoPSiH", "Xjk6qTkQoY8vuVUP", "RHy2P55wnjv0LaFNgRpD8dXF", "4s2GzZI6q8xqZAbl0Skgz3P6Lr2GKXBU", "B9Ul8cdGX1dUct8fF9ORVNarLvr0UfHM"};
    public final /* synthetic */ C0967Ok A00;
    public final /* synthetic */ C1240Zh A01;
    public final /* synthetic */ C1254Zv A02;

    public View$OnClickListenerC1253Zu(C1254Zv c1254Zv, C1240Zh c1240Zh, C0967Ok c0967Ok) {
        this.A02 = c1254Zv;
        this.A01 = c1240Zh;
        this.A00 = c0967Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1238Zf interfaceC1238Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC1238Zf = this.A02.A02;
            interfaceC1238Zf.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A03;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "Wxfvm9MNAlg6MGh9";
            strArr2[4] = "9MWDJcBk5PnwUytH";
        }
    }
}
