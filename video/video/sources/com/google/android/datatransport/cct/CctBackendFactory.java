package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import o.AbstractC5813dR;
import o.C3209Hz;
import o.InterfaceC3682Mt2;
import o.InterfaceC9319rk;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements InterfaceC9319rk {
    @Override // o.InterfaceC9319rk
    public InterfaceC3682Mt2 create(AbstractC5813dR abstractC5813dR) {
        return new C3209Hz(abstractC5813dR.c(), abstractC5813dR.f(), abstractC5813dR.e());
    }
}
