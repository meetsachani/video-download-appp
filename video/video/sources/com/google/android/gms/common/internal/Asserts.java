package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.messaging.TopicOperation;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;
import o.InterfaceC8557od0;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void a(@InterfaceC5670cr1 String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        Log.e("Asserts", "checkMainThread: current thread " + valueOf + " IS NOT the main thread " + valueOf2 + TopicOperation.d);
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void b(@InterfaceC5670cr1 String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        Log.e("Asserts", "checkNotMainThread: current thread " + valueOf + " IS the main thread " + valueOf2 + TopicOperation.d);
        throw new IllegalStateException(str);
    }

    @InterfaceC8557od0({"#1"})
    @KeepForSdk
    public static void c(@InterfaceC10571ws1 Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("null reference");
    }

    @InterfaceC8557od0({"#1"})
    @KeepForSdk
    public static void d(@InterfaceC10571ws1 Object obj, @InterfaceC5670cr1 Object obj2) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj2));
    }

    @KeepForSdk
    public static void e(@InterfaceC10571ws1 Object obj) {
        if (obj == null) {
            return;
        }
        throw new IllegalArgumentException("non-null reference");
    }

    @KeepForSdk
    public static void f(@InterfaceC10571ws1 Object obj, @InterfaceC5670cr1 Object obj2) {
        if (obj == null) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj2));
    }

    @KeepForSdk
    public static void g(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    @KeepForSdk
    public static void h(boolean z, @InterfaceC5670cr1 Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
