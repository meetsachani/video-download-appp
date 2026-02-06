package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import o.ActivityC4864Yy0;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;
import o.TD0;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public abstract class GoogleApiClient {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String a = "<<default account>>";
    public static final int b = 1;
    public static final int c = 2;
    @InterfaceC8223nF0("sAllClients")
    public static final Set<GoogleApiClient> d = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes2.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int d = 1;
        public static final int e = 2;
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void k(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 FileDescriptor fileDescriptor, @InterfaceC5670cr1 PrintWriter printWriter, @InterfaceC5670cr1 String[] strArr) {
        Set<GoogleApiClient> set = d;
        synchronized (set) {
            try {
                String concat = String.valueOf(str).concat(TD0.a.Y0);
                int i = 0;
                for (GoogleApiClient googleApiClient : set) {
                    printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                    googleApiClient.j(concat, fileDescriptor, printWriter, strArr);
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Set<GoogleApiClient> n() {
        Set<GoogleApiClient> set = d;
        synchronized (set) {
        }
        return set;
    }

    public abstract void A();

    public abstract void B(@InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks);

    public abstract void C(@InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener);

    @InterfaceC5670cr1
    @KeepForSdk
    public <L> ListenerHolder<L> D(@InterfaceC5670cr1 L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void E(@InterfaceC5670cr1 ActivityC4864Yy0 activityC4864Yy0);

    public abstract void F(@InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks);

    public abstract void G(@InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener);

    public void H(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void I(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC5670cr1
    public abstract ConnectionResult d();

    @InterfaceC5670cr1
    public abstract ConnectionResult e(long j, @InterfaceC5670cr1 TimeUnit timeUnit);

    @InterfaceC5670cr1
    public abstract PendingResult<Status> f();

    public abstract void g();

    public void h(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void i();

    public abstract void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 FileDescriptor fileDescriptor, @InterfaceC5670cr1 PrintWriter printWriter, @InterfaceC5670cr1 String[] strArr);

    @InterfaceC5670cr1
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T l(@InterfaceC5670cr1 T t) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T m(@InterfaceC5670cr1 T t) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <C extends Api.Client> C o(@InterfaceC5670cr1 Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC5670cr1
    public abstract ConnectionResult p(@InterfaceC5670cr1 Api<?> api);

    @InterfaceC5670cr1
    @KeepForSdk
    public Context q() {
        throw new UnsupportedOperationException();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Looper r() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean s(@InterfaceC5670cr1 Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean t(@InterfaceC5670cr1 Api<?> api);

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w(@InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks);

    public abstract boolean x(@InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean y(@InterfaceC5670cr1 SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void z() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Builder {
        @InterfaceC11300zs1
        public Account a;
        public final Set<Scope> b;
        public final Set<Scope> c;
        public int d;
        public View e;
        public String f;
        public String g;
        public final Map<Api<?>, com.google.android.gms.common.internal.zab> h;
        public final Context i;
        public final Map<Api<?>, Api.ApiOptions> j;
        public LifecycleActivity k;
        public int l;
        @InterfaceC11300zs1
        public OnConnectionFailedListener m;
        public Looper n;

        /* renamed from: o  reason: collision with root package name */
        public GoogleApiAvailability f190o;
        public Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> p;
        public final ArrayList<ConnectionCallbacks> q;
        public final ArrayList<OnConnectionFailedListener> r;

        @KeepForSdk
        public Builder(@InterfaceC5670cr1 Context context) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.h = new C2531Be();
            this.j = new C2531Be();
            this.l = -1;
            this.f190o = GoogleApiAvailability.x();
            this.p = com.google.android.gms.signin.zad.c;
            this.q = new ArrayList<>();
            this.r = new ArrayList<>();
            this.i = context;
            this.n = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        @InterfaceC5670cr1
        public Builder a(@InterfaceC5670cr1 Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.s(api, "Api must not be null");
            this.j.put(api, null);
            List<Scope> a = ((Api.BaseClientBuilder) Preconditions.s(api.c(), "Base client builder must not be null")).a(null);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        @InterfaceC5670cr1
        public <O extends Api.ApiOptions.HasOptions> Builder b(@InterfaceC5670cr1 Api<O> api, @InterfaceC5670cr1 O o2) {
            Preconditions.s(api, "Api must not be null");
            Preconditions.s(o2, "Null options are not permitted for this Api");
            this.j.put(api, o2);
            List<Scope> a = ((Api.BaseClientBuilder) Preconditions.s(api.c(), "Base client builder must not be null")).a(o2);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        @InterfaceC5670cr1
        public <O extends Api.ApiOptions.HasOptions> Builder c(@InterfaceC5670cr1 Api<O> api, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 Scope... scopeArr) {
            Preconditions.s(api, "Api must not be null");
            Preconditions.s(o2, "Null options are not permitted for this Api");
            this.j.put(api, o2);
            q(api, o2, scopeArr);
            return this;
        }

        @InterfaceC5670cr1
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder d(@InterfaceC5670cr1 Api<? extends Api.ApiOptions.NotRequiredOptions> api, @InterfaceC5670cr1 Scope... scopeArr) {
            Preconditions.s(api, "Api must not be null");
            this.j.put(api, null);
            q(api, null, scopeArr);
            return this;
        }

        @InterfaceC5670cr1
        public Builder e(@InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks) {
            Preconditions.s(connectionCallbacks, "Listener must not be null");
            this.q.add(connectionCallbacks);
            return this;
        }

        @InterfaceC5670cr1
        public Builder f(@InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.s(onConnectionFailedListener, "Listener must not be null");
            this.r.add(onConnectionFailedListener);
            return this;
        }

        @InterfaceC5670cr1
        public Builder g(@InterfaceC5670cr1 Scope scope) {
            Preconditions.s(scope, "Scope must not be null");
            this.b.add(scope);
            return this;
        }

        @InterfaceC5670cr1
        public GoogleApiClient h() {
            boolean z;
            Preconditions.b(!this.j.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings p = p();
            Map<Api<?>, com.google.android.gms.common.internal.zab> n = p.n();
            C2531Be c2531Be = new C2531Be();
            C2531Be c2531Be2 = new C2531Be();
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            Api<?> api = null;
            boolean z3 = false;
            for (Api<?> api2 : this.j.keySet()) {
                Api.ApiOptions apiOptions = this.j.get(api2);
                if (n.get(api2) != null) {
                    z = true;
                } else {
                    z = false;
                }
                c2531Be.put(api2, Boolean.valueOf(z));
                zat zatVar = new zat(api2, z);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.r(api2.a());
                Api.Client c = abstractClientBuilder.c(this.i, this.n, p, apiOptions, zatVar, zatVar);
                c2531Be2.put(api2.b(), c);
                if (abstractClientBuilder.b() == 1) {
                    if (apiOptions != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (c.e()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String d = api2.d();
                        String d2 = api.d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
                        sb.append(d);
                        sb.append(" cannot be used with ");
                        sb.append(d2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (api != null) {
                if (!z3) {
                    if (this.a == null) {
                        z2 = true;
                    }
                    Preconditions.z(z2, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.d());
                    Preconditions.z(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.d());
                } else {
                    String d3 = api.d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            zabe zabeVar = new zabe(this.i, new ReentrantLock(), this.n, p, this.f190o, this.p, c2531Be, this.q, this.r, c2531Be2, this.l, zabe.K(c2531Be2.values(), true), arrayList);
            synchronized (GoogleApiClient.d) {
                GoogleApiClient.d.add(zabeVar);
            }
            if (this.l >= 0) {
                zak.u(this.k).v(this.l, zabeVar, this.m);
            }
            return zabeVar;
        }

        @InterfaceC5670cr1
        public Builder i(@InterfaceC5670cr1 ActivityC4864Yy0 activityC4864Yy0, int i, @InterfaceC11300zs1 OnConnectionFailedListener onConnectionFailedListener) {
            boolean z;
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) activityC4864Yy0);
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.b(z, "clientId must be non-negative");
            this.l = i;
            this.m = onConnectionFailedListener;
            this.k = lifecycleActivity;
            return this;
        }

        @InterfaceC5670cr1
        public Builder j(@InterfaceC5670cr1 ActivityC4864Yy0 activityC4864Yy0, @InterfaceC11300zs1 OnConnectionFailedListener onConnectionFailedListener) {
            i(activityC4864Yy0, 0, onConnectionFailedListener);
            return this;
        }

        @InterfaceC5670cr1
        public Builder k(@InterfaceC5670cr1 String str) {
            Account account;
            if (str == null) {
                account = null;
            } else {
                account = new Account(str, AccountType.a);
            }
            this.a = account;
            return this;
        }

        @InterfaceC5670cr1
        public Builder l(int i) {
            this.d = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder m(@InterfaceC5670cr1 Handler handler) {
            Preconditions.s(handler, "Handler must not be null");
            this.n = handler.getLooper();
            return this;
        }

        @InterfaceC5670cr1
        public Builder n(@InterfaceC5670cr1 View view) {
            Preconditions.s(view, "View must not be null");
            this.e = view;
            return this;
        }

        @InterfaceC5670cr1
        public Builder o() {
            k("<<default account>>");
            return this;
        }

        @VisibleForTesting
        @InterfaceC5670cr1
        public final ClientSettings p() {
            SignInOptions signInOptions = SignInOptions.e1;
            Map<Api<?>, Api.ApiOptions> map = this.j;
            Api<SignInOptions> api = com.google.android.gms.signin.zad.g;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.j.get(api);
            }
            return new ClientSettings(this.a, this.b, this.h, this.d, this.e, this.f, this.g, signInOptions, false);
        }

        public final <O extends Api.ApiOptions> void q(Api<O> api, @InterfaceC11300zs1 O o2, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.s(api.c(), "Base client builder must not be null")).a(o2));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.h.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        @KeepForSdk
        public Builder(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.s(connectionCallbacks, "Must provide a connected listener");
            this.q.add(connectionCallbacks);
            Preconditions.s(onConnectionFailedListener, "Must provide a connection failed listener");
            this.r.add(onConnectionFailedListener);
        }
    }
}
