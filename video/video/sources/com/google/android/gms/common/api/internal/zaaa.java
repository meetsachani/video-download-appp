package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import o.C10323vs;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;
import o.TD0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaaa implements zaca {
    public final Context X;
    public final zabe Y;
    public final zabi Y0;
    public final Looper Z;
    public final zabi Z0;
    public final Map<Api.AnyClientKey<?>, zabi> a1;
    @InterfaceC11300zs1
    public final Api.Client c1;
    @InterfaceC11300zs1
    public Bundle d1;
    public final Lock h1;
    public final Set<SignInConnectionListener> b1 = Collections.newSetFromMap(new WeakHashMap());
    @InterfaceC11300zs1
    public ConnectionResult e1 = null;
    @InterfaceC11300zs1
    public ConnectionResult f1 = null;
    public boolean g1 = false;
    @InterfaceC8223nF0("mLock")
    public int i1 = 0;

    public zaaa(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, @InterfaceC11300zs1 Api.Client client, ArrayList<zat> arrayList, ArrayList<zat> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.X = context;
        this.Y = zabeVar;
        this.h1 = lock;
        this.Z = looper;
        this.c1 = client;
        this.Y0 = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zax(this, null));
        this.Z0 = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, null));
        C2531Be c2531Be = new C2531Be();
        for (Api.AnyClientKey<?> anyClientKey : map2.keySet()) {
            c2531Be.put(anyClientKey, this.Y0);
        }
        for (Api.AnyClientKey<?> anyClientKey2 : map.keySet()) {
            c2531Be.put(anyClientKey2, this.Z0);
        }
        this.a1 = Collections.unmodifiableMap(c2531Be);
    }

    public static /* bridge */ /* synthetic */ void A(zaaa zaaaVar, int i, boolean z) {
        zaaaVar.Y.b(i, z);
        zaaaVar.f1 = null;
        zaaaVar.e1 = null;
    }

    public static /* bridge */ /* synthetic */ void B(zaaa zaaaVar, Bundle bundle) {
        Bundle bundle2 = zaaaVar.d1;
        if (bundle2 == null) {
            zaaaVar.d1 = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void C(zaaa zaaaVar) {
        ConnectionResult connectionResult;
        if (e(zaaaVar.e1)) {
            if (!e(zaaaVar.f1) && !zaaaVar.c()) {
                ConnectionResult connectionResult2 = zaaaVar.f1;
                if (connectionResult2 != null) {
                    if (zaaaVar.i1 == 1) {
                        zaaaVar.b();
                        return;
                    }
                    zaaaVar.a(connectionResult2);
                    zaaaVar.Y0.j();
                    return;
                }
                return;
            }
            int i = zaaaVar.i1;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    zaaaVar.i1 = 0;
                }
                ((zabe) Preconditions.r(zaaaVar.Y)).a(zaaaVar.d1);
            }
            zaaaVar.b();
            zaaaVar.i1 = 0;
        } else if (zaaaVar.e1 != null && e(zaaaVar.f1)) {
            zaaaVar.Z0.j();
            zaaaVar.a((ConnectionResult) Preconditions.r(zaaaVar.e1));
        } else {
            ConnectionResult connectionResult3 = zaaaVar.e1;
            if (connectionResult3 != null && (connectionResult = zaaaVar.f1) != null) {
                if (zaaaVar.Z0.h1 < zaaaVar.Y0.h1) {
                    connectionResult3 = connectionResult;
                }
                zaaaVar.a(connectionResult3);
            }
        }
    }

    public static boolean e(@InterfaceC11300zs1 ConnectionResult connectionResult) {
        if (connectionResult != null && connectionResult.H0()) {
            return true;
        }
        return false;
    }

    public static zaaa t(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList) {
        C2531Be c2531Be = new C2531Be();
        C2531Be c2531Be2 = new C2531Be();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (true == value.e()) {
                client = value;
            }
            if (value.m()) {
                c2531Be.put(entry.getKey(), value);
            } else {
                c2531Be2.put(entry.getKey(), value);
            }
        }
        Preconditions.y(!c2531Be.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C2531Be c2531Be3 = new C2531Be();
        C2531Be c2531Be4 = new C2531Be();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> b = api.b();
            if (c2531Be.containsKey(b)) {
                c2531Be3.put(api, map2.get(api));
            } else if (c2531Be2.containsKey(b)) {
                c2531Be4.put(api, map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zat zatVar = arrayList.get(i);
            if (c2531Be3.containsKey(zatVar.X)) {
                arrayList2.add(zatVar);
            } else if (c2531Be4.containsKey(zatVar.X)) {
                arrayList3.add(zatVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zaaa(context, zabeVar, lock, looper, googleApiAvailabilityLight, c2531Be, c2531Be2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, c2531Be3, c2531Be4);
    }

    @InterfaceC11300zs1
    public final PendingIntent E() {
        if (this.c1 == null) {
            return null;
        }
        return com.google.android.gms.internal.base.zal.a(this.X, System.identityHashCode(this.Y), this.c1.w(), com.google.android.gms.internal.base.zal.a | C10323vs.Q0);
    }

    @InterfaceC8223nF0("mLock")
    public final void a(ConnectionResult connectionResult) {
        int i = this.i1;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.i1 = 0;
            }
            this.Y.c(connectionResult);
        }
        b();
        this.i1 = 0;
    }

    @InterfaceC8223nF0("mLock")
    public final void b() {
        for (SignInConnectionListener signInConnectionListener : this.b1) {
            signInConnectionListener.a();
        }
        this.b1.clear();
    }

    @InterfaceC8223nF0("mLock")
    public final boolean c() {
        ConnectionResult connectionResult = this.f1;
        if (connectionResult != null && connectionResult.m0() == 4) {
            return true;
        }
        return false;
    }

    public final boolean d(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        zabi zabiVar = this.a1.get(apiMethodImpl.y());
        Preconditions.s(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.Z0);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final ConnectionResult f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final void g() {
        this.i1 = 2;
        this.g1 = false;
        this.f1 = null;
        this.e1 = null;
        this.Y0.g();
        this.Z0.g();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final void h() {
        this.Y0.h();
        this.Z0.h();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void i() {
        this.h1.lock();
        try {
            boolean n = n();
            this.Z0.j();
            this.f1 = new ConnectionResult(4);
            if (n) {
                new com.google.android.gms.internal.base.zaq(this.Z).post(new zav(this));
            } else {
                b();
            }
            this.h1.unlock();
        } catch (Throwable th) {
            this.h1.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final void j() {
        this.f1 = null;
        this.e1 = null;
        this.i1 = 0;
        this.Y0.j();
        this.Z0.j();
        b();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean k(SignInConnectionListener signInConnectionListener) {
        this.h1.lock();
        try {
            if (!n()) {
                if (q()) {
                }
                this.h1.unlock();
                return false;
            }
            if (!this.Z0.q()) {
                this.b1.add(signInConnectionListener);
                if (this.i1 == 0) {
                    this.i1 = 1;
                }
                this.f1 = null;
                this.Z0.g();
                this.h1.unlock();
                return true;
            }
            this.h1.unlock();
            return false;
        } catch (Throwable th) {
            this.h1.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void l(String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.Z0.l(String.valueOf(str).concat(TD0.a.Y0), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.Y0.l(String.valueOf(str).concat(TD0.a.Y0), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC11300zs1
    @InterfaceC8223nF0("mLock")
    public final ConnectionResult m(@InterfaceC5670cr1 Api<?> api) {
        if (Objects.b(this.a1.get(api.b()), this.Z0)) {
            if (c()) {
                return new ConnectionResult(4, E());
            }
            return this.Z0.m(api);
        }
        return this.Y0.m(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean n() {
        boolean z;
        this.h1.lock();
        try {
            if (this.i1 == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.h1.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final ConnectionResult o(long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T p(@InterfaceC5670cr1 T t) {
        if (d(t)) {
            if (c()) {
                t.b(new Status(4, (String) null, E()));
                return t;
            }
            this.Z0.p(t);
            return t;
        }
        this.Y0.p(t);
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3.i1 == 1) goto L12;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        this.h1.lock();
        try {
            boolean z = false;
            if (this.Y0.q()) {
                if (!this.Z0.q() && !c()) {
                }
                z = true;
            }
            return z;
        } finally {
            this.h1.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @InterfaceC8223nF0("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T r(@InterfaceC5670cr1 T t) {
        if (d(t)) {
            if (c()) {
                t.b(new Status(4, (String) null, E()));
                return t;
            }
            return (T) this.Z0.r(t);
        }
        return (T) this.Y0.r(t);
    }
}
