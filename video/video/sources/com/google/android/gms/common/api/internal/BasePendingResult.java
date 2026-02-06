package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    public static final ThreadLocal<Boolean> p = new zaq();
    public static final /* synthetic */ int q = 0;
    public final Object a;
    @InterfaceC5670cr1
    public final CallbackHandler<R> b;
    @InterfaceC5670cr1
    public final WeakReference<GoogleApiClient> c;
    public final CountDownLatch d;
    public final ArrayList<PendingResult.StatusListener> e;
    @InterfaceC11300zs1
    public ResultCallback<? super R> f;
    public final AtomicReference<zadb> g;
    @InterfaceC11300zs1
    public R h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    @InterfaceC11300zs1
    public ICancelToken m;
    @KeepName
    private zas mResultGuardian;
    public volatile zada<R> n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f191o;

    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.f191o = false;
        this.b = new CallbackHandler<>(Looper.getMainLooper());
        this.c = new WeakReference<>(null);
    }

    public static void t(@InterfaceC11300zs1 Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).g();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void c(@InterfaceC5670cr1 PendingResult.StatusListener statusListener) {
        boolean z;
        if (statusListener != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.b(z, "Callback cannot be null.");
        synchronized (this.a) {
            try {
                if (m()) {
                    statusListener.a(this.i);
                } else {
                    this.e.add(statusListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final R d() {
        Preconditions.q("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.y(!this.j, "Result has already been consumed");
        if (this.n != null) {
            z = false;
        }
        Preconditions.y(z, "Cannot await if then() has been called.");
        try {
            this.d.await();
        } catch (InterruptedException unused) {
            l(Status.b1);
        }
        Preconditions.y(m(), "Result is not ready.");
        return p();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final R e(long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.q("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.y(!this.j, "Result has already been consumed.");
        if (this.n != null) {
            z = false;
        }
        Preconditions.y(z, "Cannot await if then() has been called.");
        try {
            if (!this.d.await(j, timeUnit)) {
                l(Status.d1);
            }
        } catch (InterruptedException unused) {
            l(Status.b1);
        }
        Preconditions.y(m(), "Result is not ready.");
        return p();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void f() {
        synchronized (this.a) {
            if (!this.k && !this.j) {
                ICancelToken iCancelToken = this.m;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                t(this.h);
                this.k = true;
                q(k(Status.e1));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void h(@InterfaceC11300zs1 ResultCallback<? super R> resultCallback) {
        synchronized (this.a) {
            try {
                if (resultCallback == null) {
                    this.f = null;
                    return;
                }
                boolean z = true;
                Preconditions.y(!this.j, "Result has already been consumed.");
                if (this.n != null) {
                    z = false;
                }
                Preconditions.y(z, "Cannot set callbacks if then() has been called.");
                if (g()) {
                    return;
                }
                if (m()) {
                    this.b.a(resultCallback, p());
                } else {
                    this.f = resultCallback;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void i(@InterfaceC5670cr1 ResultCallback<? super R> resultCallback, long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        synchronized (this.a) {
            try {
                if (resultCallback == null) {
                    this.f = null;
                    return;
                }
                boolean z = true;
                Preconditions.y(!this.j, "Result has already been consumed.");
                if (this.n != null) {
                    z = false;
                }
                Preconditions.y(z, "Cannot set callbacks if then() has been called.");
                if (g()) {
                    return;
                }
                if (m()) {
                    this.b.a(resultCallback, p());
                } else {
                    this.f = resultCallback;
                    CallbackHandler<R> callbackHandler = this.b;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final <S extends Result> TransformedResult<S> j(@InterfaceC5670cr1 ResultTransform<? super R, ? extends S> resultTransform) {
        boolean z;
        TransformedResult<S> c;
        Preconditions.y(!this.j, "Result has already been consumed.");
        synchronized (this.a) {
            try {
                boolean z2 = false;
                if (this.n == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.y(z, "Cannot call then() twice.");
                if (this.f == null) {
                    z2 = true;
                }
                Preconditions.y(z2, "Cannot call then() if callbacks are set.");
                Preconditions.y(!this.k, "Cannot call then() if result was canceled.");
                this.f191o = true;
                this.n = new zada<>(this.c);
                c = this.n.c(resultTransform);
                if (m()) {
                    this.b.a(this.n, p());
                } else {
                    this.f = this.n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract R k(@InterfaceC5670cr1 Status status);

    @KeepForSdk
    @Deprecated
    public final void l(@InterfaceC5670cr1 Status status) {
        synchronized (this.a) {
            try {
                if (!m()) {
                    o(k(status));
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public final boolean m() {
        if (this.d.getCount() == 0) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public final void n(@InterfaceC5670cr1 ICancelToken iCancelToken) {
        synchronized (this.a) {
            this.m = iCancelToken;
        }
    }

    @KeepForSdk
    public final void o(@InterfaceC5670cr1 R r) {
        synchronized (this.a) {
            try {
                if (!this.l && !this.k) {
                    m();
                    Preconditions.y(!m(), "Results have already been set");
                    Preconditions.y(!this.j, "Result has already been consumed");
                    q(r);
                    return;
                }
                t(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R p() {
        R r;
        synchronized (this.a) {
            Preconditions.y(!this.j, "Result has already been consumed.");
            Preconditions.y(m(), "Result is not ready.");
            r = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        zadb andSet = this.g.getAndSet(null);
        if (andSet != null) {
            andSet.a.a.remove(this);
        }
        return (R) Preconditions.r(r);
    }

    public final void q(R r) {
        this.h = r;
        this.i = r.h();
        this.m = null;
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            ResultCallback<? super R> resultCallback = this.f;
            if (resultCallback == null) {
                if (this.h instanceof Releasable) {
                    this.mResultGuardian = new zas(this, null);
                }
            } else {
                this.b.removeMessages(2);
                this.b.a(resultCallback, p());
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(this.i);
        }
        this.e.clear();
    }

    public final void s() {
        boolean z = true;
        if (!this.f191o && !p.get().booleanValue()) {
            z = false;
        }
        this.f191o = z;
    }

    public final boolean u() {
        boolean g;
        synchronized (this.a) {
            try {
                if (this.c.get() != null) {
                    if (!this.f191o) {
                    }
                    g = g();
                }
                f();
                g = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        return g;
    }

    public final void v(@InterfaceC11300zs1 zadb zadbVar) {
        this.g.set(zadbVar);
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zaq {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        public final void a(@InterfaceC5670cr1 ResultCallback<? super R> resultCallback, @InterfaceC5670cr1 R r) {
            int i = BasePendingResult.q;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.r(resultCallback), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@InterfaceC5670cr1 Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).l(Status.d1);
                return;
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.a(result);
            } catch (RuntimeException e) {
                BasePendingResult.t(result);
                throw e;
            }
        }

        public CallbackHandler(@InterfaceC5670cr1 Looper looper) {
            super(looper);
        }
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(@InterfaceC5670cr1 Looper looper) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.f191o = false;
        this.b = new CallbackHandler<>(looper);
        this.c = new WeakReference<>(null);
    }

    @KeepForSdk
    public BasePendingResult(@InterfaceC11300zs1 GoogleApiClient googleApiClient) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.f191o = false;
        this.b = new CallbackHandler<>(googleApiClient != null ? googleApiClient.r() : Looper.getMainLooper());
        this.c = new WeakReference<>(googleApiClient);
    }

    @VisibleForTesting
    @KeepForSdk
    public BasePendingResult(@InterfaceC5670cr1 CallbackHandler<R> callbackHandler) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.f191o = false;
        this.b = (CallbackHandler) Preconditions.s(callbackHandler, "CallbackHandler must not be null");
        this.c = new WeakReference<>(null);
    }
}
