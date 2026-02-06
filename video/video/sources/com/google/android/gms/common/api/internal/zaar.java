package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import o.InterfaceC9817tn;

/* loaded from: classes2.dex */
final class zaar extends com.google.android.gms.signin.internal.zac {
    public final WeakReference<zaaw> X;

    public zaar(zaaw zaawVar) {
        this.X = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @InterfaceC9817tn
    public final void f2(com.google.android.gms.signin.internal.zak zakVar) {
        zabi zabiVar;
        zaaw zaawVar = this.X.get();
        if (zaawVar != null) {
            zabiVar = zaawVar.a;
            zabiVar.s(new zaaq(this, zaawVar, zaawVar, zakVar));
        }
    }
}
