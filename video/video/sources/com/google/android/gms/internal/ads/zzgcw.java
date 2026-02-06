package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzgcw {
    public final boolean a;
    public final zzfyc b;

    public /* synthetic */ zzgcw(boolean z, zzfyc zzfycVar, zzgcx zzgcxVar) {
        this.a = z;
        this.b = zzfycVar;
    }

    public final InterfaceFutureC8411o11 a(Callable callable, Executor executor) {
        return new zzgcl(this.b, this.a, executor, callable);
    }
}
