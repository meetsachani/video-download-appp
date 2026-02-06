package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgcj extends zzgck {
    public final Callable Z0;
    public final /* synthetic */ zzgcl a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcj(zzgcl zzgclVar, Callable callable, Executor executor) {
        super(zzgclVar, executor);
        this.a1 = zzgclVar;
        this.Z0 = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Object a() throws Exception {
        return this.Z0.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final String b() {
        return this.Z0.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgck
    public final void h(Object obj) {
        this.a1.l(obj);
    }
}
