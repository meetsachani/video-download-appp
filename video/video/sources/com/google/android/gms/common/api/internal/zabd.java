package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabd extends zabw {
    public final WeakReference<zabe> a;

    public zabd(zabe zabeVar) {
        this.a = new WeakReference<>(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        zabe zabeVar = this.a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.P(zabeVar);
    }
}
