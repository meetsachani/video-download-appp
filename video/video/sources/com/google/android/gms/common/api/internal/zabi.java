package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;
import o.TD0;

/* loaded from: classes2.dex */
public final class zabi implements zaca, zau {
    public final Lock X;
    public final Condition Y;
    public final GoogleApiAvailabilityLight Y0;
    public final Context Z;
    public final zabh Z0;
    public final Map<Api.AnyClientKey<?>, Api.Client> a1;
    @InterfaceC11300zs1
    public final ClientSettings c1;
    public final Map<Api<?>, Boolean> d1;
    @InterfaceC11300zs1
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> e1;
    @InterfaceC10810xr1
    public volatile zabf f1;
    public int h1;
    public final zabe i1;
    public final zabz j1;
    public final Map<Api.AnyClientKey<?>, ConnectionResult> b1 = new HashMap();
    @InterfaceC11300zs1
    public ConnectionResult g1 = null;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, @InterfaceC11300zs1 ClientSettings clientSettings, Map<Api<?>, Boolean> map2, @InterfaceC11300zs1 Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList, zabz zabzVar) {
        this.Z = context;
        this.X = lock;
        this.Y0 = googleApiAvailabilityLight;
        this.a1 = map;
        this.c1 = clientSettings;
        this.d1 = map2;
        this.e1 = abstractClientBuilder;
        this.i1 = zabeVar;
        this.j1 = zabzVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(this);
        }
        this.Z0 = new zabh(this, looper);
        this.Y = lock.newCondition();
        this.f1 = new zaax(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        this.X.lock();
        try {
            this.f1.a(bundle);
        } finally {
            this.X.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void V3(@InterfaceC5670cr1 ConnectionResult connectionResult, @InterfaceC5670cr1 Api<?> api, boolean z) {
        this.X.lock();
        try {
            this.f1.d(connectionResult, api, z);
        } finally {
            this.X.unlock();
        }
    }

    public final void c() {
        this.X.lock();
        try {
            this.i1.R();
            this.f1 = new zaaj(this);
            this.f1.b();
            this.Y.signalAll();
        } finally {
            this.X.unlock();
        }
    }

    public final void d() {
        zabi zabiVar;
        this.X.lock();
        try {
            zabiVar = this;
        } catch (Throwable th) {
            th = th;
            zabiVar = this;
        }
        try {
            zabiVar.f1 = new zaaw(zabiVar, this.c1, this.d1, this.Y0, this.e1, this.X, this.Z);
            zabiVar.f1.b();
            zabiVar.Y.signalAll();
            zabiVar.X.unlock();
        } catch (Throwable th2) {
            th = th2;
            zabiVar.X.unlock();
            throw th;
        }
    }

    public final void e(@InterfaceC11300zs1 ConnectionResult connectionResult) {
        this.X.lock();
        try {
            this.g1 = connectionResult;
            this.f1 = new zaax(this);
            this.f1.b();
            this.Y.signalAll();
        } finally {
            this.X.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final ConnectionResult f() {
        g();
        while (this.f1 instanceof zaaw) {
            try {
                this.Y.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.f1 instanceof zaaj) {
            return ConnectionResult.y1;
        }
        ConnectionResult connectionResult = this.g1;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final void g() {
        this.f1.c();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void g1(int i) {
        this.X.lock();
        try {
            this.f1.e(i);
        } finally {
            this.X.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final void h() {
        if (this.f1 instanceof zaaj) {
            ((zaaj) this.f1).j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void i() {
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final void j() {
        if (this.f1.g()) {
            this.b1.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean k(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void l(String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr) {
        String concat = String.valueOf(str).concat(TD0.a.Y0);
        printWriter.append((CharSequence) str).append("mState=").println(this.f1);
        for (Api<?> api : this.d1.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.d()).println(":");
            ((Api.Client) Preconditions.r(this.a1.get(api.b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC11300zs1
    @InterfaceC8223nF0("mLock")
    public final ConnectionResult m(@InterfaceC5670cr1 Api<?> api) {
        Api.AnyClientKey<?> b = api.b();
        if (this.a1.containsKey(b)) {
            if (this.a1.get(b).a()) {
                return ConnectionResult.y1;
            }
            if (this.b1.containsKey(b)) {
                return this.b1.get(b);
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean n() {
        return this.f1 instanceof zaaw;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final ConnectionResult o(long j, TimeUnit timeUnit) {
        g();
        long nanos = timeUnit.toNanos(j);
        while (this.f1 instanceof zaaw) {
            if (nanos <= 0) {
                j();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.Y.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.f1 instanceof zaaj) {
            return ConnectionResult.y1;
        }
        ConnectionResult connectionResult = this.g1;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T p(@InterfaceC5670cr1 T t) {
        t.s();
        this.f1.f(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean q() {
        return this.f1 instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T r(@InterfaceC5670cr1 T t) {
        t.s();
        return (T) this.f1.h(t);
    }

    public final void s(zabg zabgVar) {
        this.Z0.sendMessage(this.Z0.obtainMessage(1, zabgVar));
    }

    public final void t(RuntimeException runtimeException) {
        this.Z0.sendMessage(this.Z0.obtainMessage(2, runtimeException));
    }
}
