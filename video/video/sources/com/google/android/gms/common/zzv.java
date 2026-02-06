package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzv extends zzx {
    public final Callable f;

    public /* synthetic */ zzv(Callable callable, zzu zzuVar) {
        super();
        this.f = callable;
    }

    @Override // com.google.android.gms.common.zzx
    public final String a() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
