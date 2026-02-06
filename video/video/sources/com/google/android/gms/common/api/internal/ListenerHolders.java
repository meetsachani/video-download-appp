package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class ListenerHolders {
    public final Set<ListenerHolder<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @InterfaceC5670cr1
    @KeepForSdk
    public static <L> ListenerHolder<L> a(@InterfaceC5670cr1 L l, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 String str) {
        Preconditions.s(l, "Listener must not be null");
        Preconditions.s(looper, "Looper must not be null");
        Preconditions.s(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l, str);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <L> ListenerHolder<L> b(@InterfaceC5670cr1 L l, @InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 String str) {
        Preconditions.s(l, "Listener must not be null");
        Preconditions.s(executor, "Executor must not be null");
        Preconditions.s(str, "Listener type must not be null");
        return new ListenerHolder<>(executor, l, str);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> c(@InterfaceC5670cr1 L l, @InterfaceC5670cr1 String str) {
        Preconditions.s(l, "Listener must not be null");
        Preconditions.s(str, "Listener type must not be null");
        Preconditions.m(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey<>(l, str);
    }

    @InterfaceC5670cr1
    public final <L> ListenerHolder<L> d(@InterfaceC5670cr1 L l, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 String str) {
        ListenerHolder<L> a = a(l, looper, "NO_TYPE");
        this.a.add(a);
        return a;
    }

    public final void e() {
        for (ListenerHolder<?> listenerHolder : this.a) {
            listenerHolder.a();
        }
        this.a.clear();
    }
}
