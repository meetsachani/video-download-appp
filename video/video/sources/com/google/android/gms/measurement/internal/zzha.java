package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzha implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ zzgy b;

    public zzha(zzgy zzgyVar, String str) {
        this.b = zzgyVar;
        Preconditions.r(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.j().G().b(this.a, th);
    }
}
