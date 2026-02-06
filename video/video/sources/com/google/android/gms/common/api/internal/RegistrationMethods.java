package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {
    @InterfaceC5670cr1
    @KeepForSdk
    public final RegisterListenerMethod<A, L> a;
    @InterfaceC5670cr1
    public final UnregisterListenerMethod<A, L> b;
    @InterfaceC5670cr1
    public final Runnable c;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder<A extends Api.AnyClient, L> {
        public RemoteCall<A, TaskCompletionSource<Void>> a;
        public RemoteCall<A, TaskCompletionSource<Boolean>> b;
        public ListenerHolder<L> d;
        public Feature[] e;
        public int g;
        public Runnable c = zacj.X;
        public boolean f = true;

        private Builder() {
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public RegistrationMethods<A, L> a() {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (this.a != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.b(z, "Must set register function");
            if (this.b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.b(z2, "Must set unregister function");
            if (this.d != null) {
                z3 = true;
            }
            Preconditions.b(z3, "Must set holder");
            return new RegistrationMethods<>(new zack(this, this.d, this.e, this.f, this.g), new zacl(this, (ListenerHolder.ListenerKey) Preconditions.s(this.d.b(), "Key must not be null")), this.c, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, L> b(@InterfaceC5670cr1 Runnable runnable) {
            this.c = runnable;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, L> c(@InterfaceC5670cr1 RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.a = remoteCall;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, L> d(boolean z) {
            this.f = z;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, L> e(@InterfaceC5670cr1 Feature... featureArr) {
            this.e = featureArr;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, L> f(int i) {
            this.g = i;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, L> g(@InterfaceC5670cr1 RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.b = remoteCall;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, L> h(@InterfaceC5670cr1 ListenerHolder<L> listenerHolder) {
            this.d = listenerHolder;
            return this;
        }

        public /* synthetic */ Builder(zacm zacmVar) {
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacnVar) {
        this.a = registerListenerMethod;
        this.b = unregisterListenerMethod;
        this.c = runnable;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> a() {
        return new Builder<>(null);
    }
}
