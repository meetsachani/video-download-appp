package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import o.InterfaceC11300zs1;
import o.InterfaceC8223nF0;

/* loaded from: classes2.dex */
public final class zaaw implements zabf {
    public final zabi a;
    public final Lock b;
    public final Context c;
    public final GoogleApiAvailabilityLight d;
    @InterfaceC11300zs1
    public ConnectionResult e;
    public int f;
    public int h;
    @InterfaceC11300zs1
    public com.google.android.gms.signin.zae k;
    public boolean l;
    public boolean m;
    public boolean n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public IAccountAccessor f192o;
    public boolean p;
    public boolean q;
    @InterfaceC11300zs1
    public final ClientSettings r;
    public final Map<Api<?>, Boolean> s;
    @InterfaceC11300zs1
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> t;
    public int g = 0;
    public final Bundle i = new Bundle();
    public final Set<Api.AnyClientKey> j = new HashSet();
    public final ArrayList<Future<?>> u = new ArrayList<>();

    public zaaw(zabi zabiVar, @InterfaceC11300zs1 ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @InterfaceC11300zs1 Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.a = zabiVar;
        this.r = clientSettings;
        this.s = map;
        this.d = googleApiAvailabilityLight;
        this.t = abstractClientBuilder;
        this.b = lock;
        this.c = context;
    }

    public static /* bridge */ /* synthetic */ void B(zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        if (!zaawVar.o(0)) {
            return;
        }
        ConnectionResult m0 = zakVar.m0();
        if (m0.H0()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.r(zakVar.B0());
            ConnectionResult m02 = zavVar.m0();
            if (!m02.H0()) {
                String valueOf = String.valueOf(m02);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                zaawVar.l(m02);
                return;
            }
            zaawVar.n = true;
            zaawVar.f192o = (IAccountAccessor) Preconditions.r(zavVar.B0());
            zaawVar.p = zavVar.E0();
            zaawVar.q = zavVar.G0();
            zaawVar.n();
        } else if (zaawVar.q(m0)) {
            zaawVar.i();
            zaawVar.n();
        } else {
            zaawVar.l(m0);
        }
    }

    public static final String r(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set y(zaaw zaawVar) {
        ClientSettings clientSettings = zaawVar.r;
        if (clientSettings == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(clientSettings.i());
        Map<Api<?>, com.google.android.gms.common.internal.zab> n = zaawVar.r.n();
        for (Api<?> api : n.keySet()) {
            if (!zaawVar.a.b1.containsKey(api.b())) {
                hashSet.addAll(n.get(api).a);
            }
        }
        return hashSet;
    }

    public final void J() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.u.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @InterfaceC8223nF0("mLock")
    public final void a(@InterfaceC11300zs1 Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @InterfaceC8223nF0("mLock")
    public final void b() {
        boolean z;
        this.a.b1.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (Api<?> api : this.s.keySet()) {
            Api.Client client = (Api.Client) Preconditions.r(this.a.a1.get(api.b()));
            if (api.c().b() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = this.s.get(api).booleanValue();
            if (client.m()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(api.b());
                } else {
                    this.l = false;
                }
            }
            hashMap.put(client, new zaal(this, api, booleanValue));
        }
        if (z2) {
            this.m = false;
        }
        if (this.m) {
            Preconditions.r(this.r);
            Preconditions.r(this.t);
            this.r.o(Integer.valueOf(System.identityHashCode(this.a.i1)));
            zaat zaatVar = new zaat(this, null);
            Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.t;
            Context context = this.c;
            Looper r = this.a.i1.r();
            ClientSettings clientSettings = this.r;
            this.k = abstractClientBuilder.c(context, r, clientSettings, clientSettings.k(), zaatVar, zaatVar);
        }
        this.h = this.a.a1.size();
        this.u.add(zabj.a().submit(new zaao(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @InterfaceC8223nF0("mLock")
    public final void d(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (o(1)) {
            m(connectionResult, api, z);
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @InterfaceC8223nF0("mLock")
    public final void e(int i) {
        l(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T f(T t) {
        this.a.i1.k.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @InterfaceC8223nF0("mLock")
    public final boolean g() {
        J();
        j(true);
        this.a.e(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T h(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @InterfaceC8223nF0("mLock")
    public final void i() {
        this.m = false;
        this.a.i1.s = Collections.EMPTY_SET;
        for (Api.AnyClientKey<?> anyClientKey : this.j) {
            if (!this.a.b1.containsKey(anyClientKey)) {
                this.a.b1.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    @InterfaceC8223nF0("mLock")
    public final void j(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.k;
        if (zaeVar != null) {
            if (zaeVar.a() && z) {
                zaeVar.d();
            }
            zaeVar.c();
            ClientSettings clientSettings = (ClientSettings) Preconditions.r(this.r);
            this.f192o = null;
        }
    }

    @InterfaceC8223nF0("mLock")
    public final void k() {
        Bundle bundle;
        this.a.c();
        zabj.a().execute(new zaak(this));
        com.google.android.gms.signin.zae zaeVar = this.k;
        if (zaeVar != null) {
            if (this.p) {
                zaeVar.u((IAccountAccessor) Preconditions.r(this.f192o), this.q);
            }
            j(false);
        }
        for (Api.AnyClientKey<?> anyClientKey : this.a.b1.keySet()) {
            ((Api.Client) Preconditions.r(this.a.a1.get(anyClientKey))).c();
        }
        if (this.i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.i;
        }
        this.a.j1.a(bundle);
    }

    @InterfaceC8223nF0("mLock")
    public final void l(ConnectionResult connectionResult) {
        J();
        j(!connectionResult.G0());
        this.a.e(connectionResult);
        this.a.j1.c(connectionResult);
    }

    @InterfaceC8223nF0("mLock")
    public final void m(ConnectionResult connectionResult, Api<?> api, boolean z) {
        int b = api.c().b();
        if ((!z || connectionResult.G0() || this.d.d(connectionResult.m0()) != null) && (this.e == null || b < this.f)) {
            this.e = connectionResult;
            this.f = b;
        }
        this.a.b1.put(api.b(), connectionResult);
    }

    @InterfaceC8223nF0("mLock")
    public final void n() {
        if (this.h == 0) {
            if (!this.m || this.n) {
                ArrayList arrayList = new ArrayList();
                this.g = 1;
                this.h = this.a.a1.size();
                for (Api.AnyClientKey<?> anyClientKey : this.a.a1.keySet()) {
                    if (this.a.b1.containsKey(anyClientKey)) {
                        if (p()) {
                            k();
                        }
                    } else {
                        arrayList.add(this.a.a1.get(anyClientKey));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(zabj.a().submit(new zaap(this, arrayList)));
                }
            }
        }
    }

    @InterfaceC8223nF0("mLock")
    public final boolean o(int i) {
        if (this.g != i) {
            Log.w("GACConnecting", this.a.i1.M());
            Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
            int i2 = this.h;
            StringBuilder sb = new StringBuilder(33);
            sb.append("mRemainingConnections=");
            sb.append(i2);
            Log.w("GACConnecting", sb.toString());
            String r = r(this.g);
            String r2 = r(i);
            StringBuilder sb2 = new StringBuilder(r.length() + 70 + r2.length());
            sb2.append("GoogleApiClient connecting is in step ");
            sb2.append(r);
            sb2.append(" but received callback for step ");
            sb2.append(r2);
            Log.e("GACConnecting", sb2.toString(), new Exception());
            l(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    @InterfaceC8223nF0("mLock")
    public final boolean p() {
        int i = this.h - 1;
        this.h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.a.i1.M());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            l(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.e;
        if (connectionResult != null) {
            this.a.h1 = this.f;
            l(connectionResult);
            return false;
        }
        return true;
    }

    @InterfaceC8223nF0("mLock")
    public final boolean q(ConnectionResult connectionResult) {
        if (this.l && !connectionResult.G0()) {
            return true;
        }
        return false;
    }
}
