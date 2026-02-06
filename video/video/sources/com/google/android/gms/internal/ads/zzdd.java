package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdd {
    @InterfaceC11300zs1
    public static Executor a;

    public static synchronized Executor a() {
        Executor executor;
        synchronized (zzdd.class) {
            try {
                if (a == null) {
                    a = zzeu.f("ExoPlayer:BackgroundExecutor");
                }
                executor = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
