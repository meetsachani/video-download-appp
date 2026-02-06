package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import o.ActivityC4864Yy0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;

/* loaded from: classes2.dex */
public final class zabe extends GoogleApiClient implements zabz {
    public final zadc A;
    public final com.google.android.gms.common.internal.zaj B;
    public final Lock e;
    public final com.google.android.gms.common.internal.zak f;
    public final int h;
    public final Context i;
    public final Looper j;
    public volatile boolean l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public final zabc f193o;
    public final GoogleApiAvailability p;
    @InterfaceC11300zs1
    @VisibleForTesting
    public zabx q;
    public final Map<Api.AnyClientKey<?>, Api.Client> r;
    public Set<Scope> s;
    public final ClientSettings t;
    public final Map<Api<?>, Boolean> u;
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> v;
    public final ListenerHolders w;
    public final ArrayList<zat> x;
    public Integer y;
    @InterfaceC11300zs1
    public Set<zada> z;
    @InterfaceC11300zs1
    public zaca g = null;
    @VisibleForTesting
    public final Queue<BaseImplementation.ApiMethodImpl<?, ?>> k = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zat> arrayList) {
        long j;
        if (true != ClientLibraryUtils.c()) {
            j = 120000;
        } else {
            j = 10000;
        }
        this.m = j;
        this.n = 5000L;
        this.s = new HashSet();
        this.w = new ListenerHolders();
        this.y = null;
        this.z = null;
        zaay zaayVar = new zaay(this);
        this.B = zaayVar;
        this.i = context;
        this.e = lock;
        this.f = new com.google.android.gms.common.internal.zak(looper, zaayVar);
        this.j = looper;
        this.f193o = new zabc(this, looper);
        this.p = googleApiAvailability;
        this.h = i;
        if (i >= 0) {
            this.y = Integer.valueOf(i2);
        }
        this.u = map;
        this.r = map2;
        this.x = arrayList;
        this.A = new zadc();
        for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : list) {
            this.f.f(connectionCallbacks);
        }
        for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : list2) {
            this.f.g(onConnectionFailedListener);
        }
        this.t = clientSettings;
        this.v = abstractClientBuilder;
    }

    public static int K(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client client : iterable) {
            z2 |= client.m();
            z3 |= client.e();
        }
        if (z2) {
            if (z3 && z) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    public static String N(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void P(zabe zabeVar) {
        zabeVar.e.lock();
        try {
            if (zabeVar.l) {
                zabeVar.U();
            }
        } finally {
            zabeVar.e.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void Q(zabe zabeVar) {
        zabeVar.e.lock();
        try {
            if (zabeVar.R()) {
                zabeVar.U();
            }
        } finally {
            zabeVar.e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void A() {
        i();
        g();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void B(@InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f.f(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void C(@InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f.g(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> D(@InterfaceC5670cr1 L l) {
        this.e.lock();
        try {
            return this.w.d(l, this.j, "NO_TYPE");
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void E(@InterfaceC5670cr1 ActivityC4864Yy0 activityC4864Yy0) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) activityC4864Yy0);
        if (this.h >= 0) {
            zak.u(lifecycleActivity).w(this.h);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void F(@InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f.h(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void G(@InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f.i(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void H(zada zadaVar) {
        this.e.lock();
        try {
            if (this.z == null) {
                this.z = new HashSet();
            }
            this.z.add(zadaVar);
            this.e.unlock();
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r3 != false) goto L17;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(zada zadaVar) {
        this.e.lock();
        try {
            Set<zada> set = this.z;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(zadaVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else {
                this.e.lock();
                Set<zada> set2 = this.z;
                if (set2 == null) {
                    this.e.unlock();
                } else {
                    boolean isEmpty = set2.isEmpty();
                    this.e.unlock();
                }
                zaca zacaVar = this.g;
                if (zacaVar != null) {
                    zacaVar.h();
                }
            }
            this.e.unlock();
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    public final String M() {
        StringWriter stringWriter = new StringWriter();
        j("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @InterfaceC8223nF0("mLock")
    public final boolean R() {
        if (!this.l) {
            return false;
        }
        this.l = false;
        this.f193o.removeMessages(2);
        this.f193o.removeMessages(1);
        zabx zabxVar = this.q;
        if (zabxVar != null) {
            zabxVar.b();
            this.q = null;
        }
        return true;
    }

    public final void S(int i) {
        zabe zabeVar;
        Integer num = this.y;
        if (num == null) {
            this.y = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String N = N(i);
            String N2 = N(this.y.intValue());
            StringBuilder sb = new StringBuilder(N.length() + 51 + N2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(N);
            sb.append(". Mode was already set to ");
            sb.append(N2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.g != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (Api.Client client : this.r.values()) {
            z |= client.m();
            z2 |= client.e();
        }
        int intValue = this.y.intValue();
        if (intValue != 1) {
            if (intValue != 2 || !z) {
                zabeVar = this;
            } else {
                this.g = zaaa.t(this.i, this, this.e, this.j, this.p, this.r, this.t, this.u, this.v, this.x);
                return;
            }
        } else {
            zabeVar = this;
            if (z) {
                if (z2) {
                    throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
        }
        zabeVar.g = new zabi(zabeVar.i, zabeVar, zabeVar.e, zabeVar.j, zabeVar.p, zabeVar.r, zabeVar.t, zabeVar.u, zabeVar.v, zabeVar.x, this);
    }

    public final void T(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.d.a(googleApiClient).h(new zabb(this, statusPendingResult, z, googleApiClient));
    }

    @InterfaceC8223nF0("mLock")
    public final void U() {
        this.f.b();
        ((zaca) Preconditions.r(this.g)).g();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @InterfaceC8223nF0("mLock")
    public final void a(@InterfaceC11300zs1 Bundle bundle) {
        while (!this.k.isEmpty()) {
            m(this.k.remove());
        }
        this.f.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @InterfaceC8223nF0("mLock")
    public final void b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.l) {
                this.l = true;
                if (this.q == null && !ClientLibraryUtils.c()) {
                    try {
                        this.q = this.p.G(this.i.getApplicationContext(), new zabd(this));
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabcVar = this.f193o;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.m);
                zabc zabcVar2 = this.f193o;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.n);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.A.a.toArray(new BasePendingResult[0])) {
            basePendingResult.l(zadc.c);
        }
        this.f.e(i);
        this.f.a();
        if (i == 2) {
            U();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @InterfaceC8223nF0("mLock")
    public final void c(ConnectionResult connectionResult) {
        if (!this.p.l(this.i, connectionResult.m0())) {
            R();
        }
        if (!this.l) {
            this.f.c(connectionResult);
            this.f.a();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult d() {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.y(z, "blockingConnect must not be called on the UI thread");
        this.e.lock();
        try {
            if (this.h >= 0) {
                if (this.y == null) {
                    z2 = false;
                }
                Preconditions.y(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.y;
                if (num == null) {
                    this.y = Integer.valueOf(K(this.r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            S(((Integer) Preconditions.r(this.y)).intValue());
            this.f.b();
            ConnectionResult f = ((zaca) Preconditions.r(this.g)).f();
            this.e.unlock();
            return f;
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult e(long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.y(z, "blockingConnect must not be called on the UI thread");
        Preconditions.s(timeUnit, "TimeUnit must not be null");
        this.e.lock();
        try {
            Integer num = this.y;
            if (num == null) {
                this.y = Integer.valueOf(K(this.r.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            S(((Integer) Preconditions.r(this.y)).intValue());
            this.f.b();
            ConnectionResult o2 = ((zaca) Preconditions.r(this.g)).o(j, timeUnit);
            this.e.unlock();
            return o2;
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> f() {
        Preconditions.y(u(), "GoogleApiClient is not connected yet.");
        Integer num = this.y;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        Preconditions.y(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.r.containsKey(Common.a)) {
            T(this, statusPendingResult, false);
            return statusPendingResult;
        }
        AtomicReference atomicReference = new AtomicReference();
        zaaz zaazVar = new zaaz(this, atomicReference, statusPendingResult);
        zaba zabaVar = new zaba(this, statusPendingResult);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.i);
        builder.a(Common.b);
        builder.e(zaazVar);
        builder.f(zabaVar);
        builder.m(this.f193o);
        GoogleApiClient h = builder.h();
        atomicReference.set(h);
        h.g();
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void g() {
        boolean z;
        this.e.lock();
        try {
            int i = 2;
            boolean z2 = false;
            if (this.h >= 0) {
                if (this.y != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.y(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.y;
                if (num == null) {
                    this.y = Integer.valueOf(K(this.r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) Preconditions.r(this.y)).intValue();
            this.e.lock();
            if (intValue != 3 && intValue != 1) {
                if (intValue != 2) {
                    i = intValue;
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i);
                    Preconditions.b(z2, sb.toString());
                    S(i);
                    U();
                    this.e.unlock();
                    this.e.unlock();
                }
            } else {
                i = intValue;
            }
            z2 = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            Preconditions.b(z2, sb2.toString());
            S(i);
            U();
            this.e.unlock();
            this.e.unlock();
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void h(int i) {
        this.e.lock();
        boolean z = true;
        if (i != 3 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.b(z, sb.toString());
            S(i);
            U();
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void i() {
        Lock lock;
        this.e.lock();
        try {
            this.A.b();
            zaca zacaVar = this.g;
            if (zacaVar != null) {
                zacaVar.j();
            }
            this.w.e();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.k) {
                apiMethodImpl.v(null);
                apiMethodImpl.f();
            }
            this.k.clear();
            if (this.g == null) {
                lock = this.e;
            } else {
                R();
                this.f.a();
                lock = this.e;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void j(String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.i);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.l);
        printWriter.append(" mWorkQueue.size()=").print(this.k.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A.a.size());
        zaca zacaVar = this.g;
        if (zacaVar != null) {
            zacaVar.l(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T l(@InterfaceC5670cr1 T t) {
        String str;
        Lock lock;
        Api<?> x = t.x();
        boolean containsKey = this.r.containsKey(t.y());
        if (x != null) {
            str = x.d();
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        Preconditions.b(containsKey, sb.toString());
        this.e.lock();
        try {
            zaca zacaVar = this.g;
            if (zacaVar == null) {
                this.k.add(t);
                lock = this.e;
            } else {
                t = (T) zacaVar.p(t);
                lock = this.e;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T m(@InterfaceC5670cr1 T t) {
        String str;
        Lock lock;
        Api<?> x = t.x();
        boolean containsKey = this.r.containsKey(t.y());
        if (x != null) {
            str = x.d();
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        Preconditions.b(containsKey, sb.toString());
        this.e.lock();
        try {
            zaca zacaVar = this.g;
            if (zacaVar != null) {
                if (this.l) {
                    this.k.add(t);
                    while (!this.k.isEmpty()) {
                        BaseImplementation.ApiMethodImpl<?, ?> remove = this.k.remove();
                        this.A.a(remove);
                        remove.b(Status.c1);
                    }
                    lock = this.e;
                } else {
                    t = (T) zacaVar.r(t);
                    lock = this.e;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @InterfaceC5670cr1
    public final <C extends Api.Client> C o(@InterfaceC5670cr1 Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.r.get(anyClientKey);
        Preconditions.s(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @InterfaceC5670cr1
    public final ConnectionResult p(@InterfaceC5670cr1 Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock;
        this.e.lock();
        try {
            if (!u() && !this.l) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (this.r.containsKey(api.b())) {
                ConnectionResult m = ((zaca) Preconditions.r(this.g)).m(api);
                if (m == null) {
                    if (this.l) {
                        connectionResult = ConnectionResult.y1;
                        lock = this.e;
                    } else {
                        Log.w("GoogleApiClientImpl", M());
                        Log.wtf("GoogleApiClientImpl", String.valueOf(api.d()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                        connectionResult = new ConnectionResult(8, null);
                        lock = this.e;
                    }
                    lock.unlock();
                    return connectionResult;
                }
                this.e.unlock();
                return m;
            }
            throw new IllegalArgumentException(String.valueOf(api.d()).concat(" was never registered with GoogleApiClient"));
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context q() {
        return this.i;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper r() {
        return this.j;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean s(@InterfaceC5670cr1 Api<?> api) {
        return this.r.containsKey(api.b());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean t(@InterfaceC5670cr1 Api<?> api) {
        Api.Client client;
        if (!u() || (client = this.r.get(api.b())) == null || !client.a()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean u() {
        zaca zacaVar = this.g;
        if (zacaVar != null && zacaVar.q()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean v() {
        zaca zacaVar = this.g;
        if (zacaVar != null && zacaVar.n()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean w(@InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.f.j(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean x(@InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f.k(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean y(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.g;
        if (zacaVar != null && zacaVar.k(signInConnectionListener)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void z() {
        zaca zacaVar = this.g;
        if (zacaVar != null) {
            zacaVar.i();
        }
    }
}
