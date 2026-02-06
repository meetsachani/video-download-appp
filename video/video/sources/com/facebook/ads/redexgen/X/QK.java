package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: assets/audience_network/classes2.dex */
public class QK implements InterfaceC1198Xr {
    public final Collection<String> A00;

    public QK() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1198Xr
    public final void AH8(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1198Xr
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.A00) {
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
