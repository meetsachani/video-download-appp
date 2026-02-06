package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class ListenerHolder<L> {
    public final Executor a;
    @InterfaceC11300zs1
    public volatile L b;
    @InterfaceC11300zs1
    public volatile ListenerKey<L> c;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ListenerKey<L> {
        public final L a;
        public final String b;

        @KeepForSdk
        public ListenerKey(L l, String str) {
            this.a = l;
            this.b = str;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public String a() {
            String str = this.b;
            int identityHashCode = System.identityHashCode(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("@");
            sb.append(identityHashCode);
            return sb.toString();
        }

        @KeepForSdk
        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            if (this.a == listenerKey.a && this.b.equals(listenerKey.b)) {
                return true;
            }
            return false;
        }

        @KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Notifier<L> {
        @KeepForSdk
        void a(@InterfaceC5670cr1 L l);

        @KeepForSdk
        void b();
    }

    @KeepForSdk
    public ListenerHolder(@InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 L l, @InterfaceC5670cr1 String str) {
        this.a = new HandlerExecutor(looper);
        this.b = (L) Preconditions.s(l, "Listener must not be null");
        this.c = new ListenerKey<>(l, Preconditions.l(str));
    }

    @KeepForSdk
    public void a() {
        this.b = null;
        this.c = null;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public ListenerKey<L> b() {
        return this.c;
    }

    @KeepForSdk
    public boolean c() {
        return this.b != null;
    }

    @KeepForSdk
    public void d(@InterfaceC5670cr1 final Notifier<? super L> notifier) {
        Preconditions.s(notifier, "Notifier must not be null");
        this.a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.this.e(notifier);
            }
        });
    }

    public final void e(Notifier<? super L> notifier) {
        Object obj = (L) this.b;
        if (obj == null) {
            notifier.b();
            return;
        }
        try {
            notifier.a(obj);
        } catch (RuntimeException e) {
            notifier.b();
            throw e;
        }
    }

    @KeepForSdk
    public ListenerHolder(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 L l, @InterfaceC5670cr1 String str) {
        this.a = (Executor) Preconditions.s(executor, "Executor must not be null");
        this.b = (L) Preconditions.s(l, "Listener must not be null");
        this.c = new ListenerKey<>(l, Preconditions.l(str));
    }
}
