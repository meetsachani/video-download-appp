package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class BaseImplementation {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface ResultHolder<R> {
        @KeepForSdk
        void a(@InterfaceC5670cr1 R r);

        @KeepForSdk
        void b(@InterfaceC5670cr1 Status status);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk
        public final Api.AnyClientKey<A> r;
        @InterfaceC11300zs1
        @KeepForSdk
        public final Api<?> s;

        @KeepForSdk
        @Deprecated
        public ApiMethodImpl(@InterfaceC5670cr1 Api.AnyClientKey<A> anyClientKey, @InterfaceC5670cr1 GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.s(googleApiClient, "GoogleApiClient must not be null"));
            this.r = (Api.AnyClientKey) Preconditions.r(anyClientKey);
            this.s = null;
        }

        @KeepForSdk
        public final void A(@InterfaceC5670cr1 A a) throws DeadObjectException {
            try {
                w(a);
            } catch (DeadObjectException e) {
                B(e);
                throw e;
            } catch (RemoteException e2) {
                B(e2);
            }
        }

        @KeepForSdk
        public final void B(@InterfaceC5670cr1 RemoteException remoteException) {
            b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public /* bridge */ /* synthetic */ void a(@InterfaceC5670cr1 Object obj) {
            super.o((Result) obj);
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public final void b(@InterfaceC5670cr1 Status status) {
            Preconditions.b(!status.S0(), "Failed result must not be success");
            R k = k(status);
            o(k);
            z(k);
        }

        @KeepForSdk
        public abstract void w(@InterfaceC5670cr1 A a) throws RemoteException;

        @InterfaceC11300zs1
        @KeepForSdk
        public final Api<?> x() {
            return this.s;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public final Api.AnyClientKey<A> y() {
            return this.r;
        }

        @KeepForSdk
        public void z(@InterfaceC5670cr1 R r) {
        }

        @KeepForSdk
        public ApiMethodImpl(@InterfaceC5670cr1 Api<?> api, @InterfaceC5670cr1 GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.s(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.s(api, "Api must not be null");
            this.r = (Api.AnyClientKey<A>) api.b();
            this.s = api;
        }

        @InterfaceC5056aJ2
        @KeepForSdk
        public ApiMethodImpl(@InterfaceC5670cr1 BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.r = new Api.AnyClientKey<>();
            this.s = null;
        }
    }
}
