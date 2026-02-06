package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgdr {
    public static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void b(Throwable th) {
        if (!(th instanceof Error) || (th instanceof StackOverflowError)) {
            return;
        }
        throw ((Error) th);
    }
}
