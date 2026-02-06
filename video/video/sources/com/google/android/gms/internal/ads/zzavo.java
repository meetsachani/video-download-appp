package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzavo {
    public final InterfaceFutureC8411o11 a;

    public zzavo(final Context context, Executor executor) {
        this.a = zzgcy.j(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzavn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                try {
                    return zzfof.a(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final InterfaceFutureC8411o11 a() {
        return this.a;
    }
}
