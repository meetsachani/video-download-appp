package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;

/* loaded from: classes2.dex */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    public final WeakReference<GoogleApiClient> g;
    public final zacz h;
    @InterfaceC11300zs1
    public ResultTransform<? super R, ? extends Result> a = null;
    @InterfaceC11300zs1
    public zada<? extends Result> b = null;
    @InterfaceC11300zs1
    public volatile ResultCallbacks<? super R> c = null;
    @InterfaceC11300zs1
    public PendingResult<R> d = null;
    public final Object e = new Object();
    @InterfaceC11300zs1
    public Status f = null;
    public boolean i = false;

    public zada(WeakReference<GoogleApiClient> weakReference) {
        Looper mainLooper;
        Preconditions.s(weakReference, "GoogleApiClient reference must not be null");
        this.g = weakReference;
        GoogleApiClient googleApiClient = weakReference.get();
        if (googleApiClient != null) {
            mainLooper = googleApiClient.r();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.h = new zacz(this, mainLooper);
    }

    public static final void q(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).g();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(R r) {
        synchronized (this.e) {
            try {
                if (r.h().S0()) {
                    if (this.a != null) {
                        zaco.a().submit(new zacy(this, r));
                    } else if (p()) {
                        ((ResultCallbacks) Preconditions.r(this.c)).c(r);
                    }
                } else {
                    m(r.h());
                    q(r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void b(@InterfaceC5670cr1 ResultCallbacks<? super R> resultCallbacks) {
        boolean z;
        synchronized (this.e) {
            boolean z2 = false;
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.y(z, "Cannot call andFinally() twice.");
            if (this.a == null) {
                z2 = true;
            }
            Preconditions.y(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.c = resultCallbacks;
            n();
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @InterfaceC5670cr1
    public final <S extends Result> TransformedResult<S> c(@InterfaceC5670cr1 ResultTransform<? super R, ? extends S> resultTransform) {
        boolean z;
        zada<? extends Result> zadaVar;
        synchronized (this.e) {
            boolean z2 = false;
            if (this.a == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.y(z, "Cannot call then() twice.");
            if (this.c == null) {
                z2 = true;
            }
            Preconditions.y(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.a = resultTransform;
            zadaVar = new zada<>(this.g);
            this.b = zadaVar;
            n();
        }
        return zadaVar;
    }

    public final void k() {
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(PendingResult<?> pendingResult) {
        synchronized (this.e) {
            this.d = pendingResult;
            n();
        }
    }

    public final void m(Status status) {
        synchronized (this.e) {
            this.f = status;
            o(status);
        }
    }

    @InterfaceC8223nF0("mSyncToken")
    public final void n() {
        if (this.a != null || this.c != null) {
            GoogleApiClient googleApiClient = this.g.get();
            if (!this.i && this.a != null && googleApiClient != null) {
                googleApiClient.H(this);
                this.i = true;
            }
            Status status = this.f;
            if (status != null) {
                o(status);
                return;
            }
            PendingResult<R> pendingResult = this.d;
            if (pendingResult != null) {
                pendingResult.h(this);
            }
        }
    }

    public final void o(Status status) {
        synchronized (this.e) {
            try {
                ResultTransform<? super R, ? extends Result> resultTransform = this.a;
                if (resultTransform != null) {
                    ((zada) Preconditions.r(this.b)).m((Status) Preconditions.s(resultTransform.b(status), "onFailure must not return null"));
                } else if (p()) {
                    ((ResultCallbacks) Preconditions.r(this.c)).b(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC8223nF0("mSyncToken")
    public final boolean p() {
        GoogleApiClient googleApiClient = this.g.get();
        if (this.c != null && googleApiClient != null) {
            return true;
        }
        return false;
    }
}
