package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    @InterfaceC11300zs1
    public final Feature[] a;
    public final boolean b;
    public final int c;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder<A extends Api.AnyClient, ResultT> {
        public RemoteCall<A, TaskCompletionSource<ResultT>> a;
        public Feature[] c;
        public boolean b = true;
        public int d = 0;

        private Builder() {
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public TaskApiCall<A, ResultT> a() {
            boolean z;
            if (this.a != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.b(z, "execute parameter required");
            return new zacv(this, this.c, this.b, this.d);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> b(@InterfaceC5670cr1 final BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.a = new RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacu
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    BiConsumer.this.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, ResultT> c(@InterfaceC5670cr1 RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.a = remoteCall;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, ResultT> d(boolean z) {
            this.b = z;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, ResultT> e(@InterfaceC5670cr1 Feature... featureArr) {
            this.c = featureArr;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder<A, ResultT> f(int i) {
            this.d = i;
            return this;
        }

        public /* synthetic */ Builder(zacw zacwVar) {
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> a() {
        return new Builder<>(null);
    }

    @KeepForSdk
    public abstract void b(@InterfaceC5670cr1 A a, @InterfaceC5670cr1 TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    @InterfaceC11300zs1
    public final Feature[] e() {
        return this.a;
    }

    @KeepForSdk
    public TaskApiCall(@InterfaceC11300zs1 Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }
}
