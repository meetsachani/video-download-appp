package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    public static final String n = "generatefid.lock";

    /* renamed from: o  reason: collision with root package name */
    public static final String f353o = "CHIME_ANDROID_SDK";
    public static final int p = 0;
    public static final int q = 1;
    public static final long r = 30;
    public static final String t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    public static final String u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    public static final String v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    public static final String w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    public final FirebaseApp a;
    public final FirebaseInstallationServiceClient b;
    public final PersistedInstallation c;
    public final Utils d;
    public final Lazy<IidStore> e;
    public final RandomFidGenerator f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    @InterfaceC8710pF0("this")
    public String j;
    @InterfaceC8710pF0("FirebaseInstallations.this")
    public Set<FidListener> k;
    @InterfaceC8710pF0("lock")
    public final List<StateListener> l;
    public static final Object m = new Object();
    public static final ThreadFactory s = new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    };

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations(final FirebaseApp firebaseApp, @InterfaceC5670cr1 Provider<HeartBeatController> provider, @InterfaceC5670cr1 ExecutorService executorService, @InterfaceC5670cr1 Executor executor) {
        this(executorService, executor, firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.n(), provider), new PersistedInstallation(firebaseApp), Utils.c(), new Lazy(new Provider() { // from class: o.Gt0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseInstallations.h(FirebaseApp.this);
            }
        }), new RandomFidGenerator());
    }

    public static /* synthetic */ IidStore h(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    @InterfaceC5670cr1
    public static FirebaseInstallations u() {
        return v(FirebaseApp.p());
    }

    @InterfaceC5670cr1
    public static FirebaseInstallations v(@InterfaceC5670cr1 FirebaseApp firebaseApp) {
        boolean z;
        if (firebaseApp != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.b(z, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.l(FirebaseInstallationsApi.class);
    }

    public final void A(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (m) {
            try {
                CrossProcessLock a = CrossProcessLock.a(this.a.n(), n);
                this.c.c(persistedInstallationEntry);
                if (a != null) {
                    a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B() {
        Preconditions.m(r(), u);
        Preconditions.m(z(), v);
        Preconditions.m(q(), t);
        Preconditions.b(Utils.h(r()), u);
        Preconditions.b(Utils.g(q()), t);
    }

    public final String C(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.a.r().equals(f353o) && !this.a.B()) || !persistedInstallationEntry.m()) {
            return this.f.a();
        }
        String f = t().f();
        if (TextUtils.isEmpty(f)) {
            return this.f.a();
        }
        return f;
    }

    public final PersistedInstallationEntry D(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        String str;
        if (persistedInstallationEntry.d() != null && persistedInstallationEntry.d().length() == 11) {
            str = t().i();
        } else {
            str = null;
        }
        InstallationResponse d = this.b.d(q(), persistedInstallationEntry.d(), z(), r(), str);
        int i = AnonymousClass3.a[d.e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return persistedInstallationEntry.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        return persistedInstallationEntry.s(d.c(), d.d(), this.d.b(), d.b().c(), d.b().d());
    }

    public final void E(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator<StateListener> it = this.l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.g) {
            try {
                Iterator<StateListener> it = this.l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void G(String str) {
        this.j = str;
    }

    public final synchronized void H(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.k.size() != 0 && !TextUtils.equals(persistedInstallationEntry.d(), persistedInstallationEntry2.d())) {
            for (FidListener fidListener : this.k) {
                fidListener.a(persistedInstallationEntry2.d());
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @InterfaceC5670cr1
    public Task<Void> a() {
        return Tasks.d(this.h, new Callable() { // from class: o.Jt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m2;
                m2 = FirebaseInstallations.this.m();
                return m2;
            }
        });
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @InterfaceC5670cr1
    public synchronized FidListenerHandle b(@InterfaceC5670cr1 final FidListener fidListener) {
        this.k.add(fidListener);
        return new FidListenerHandle() { // from class: com.google.firebase.installations.FirebaseInstallations.2
            @Override // com.google.firebase.installations.internal.FidListenerHandle
            public void a() {
                synchronized (FirebaseInstallations.this) {
                    FirebaseInstallations.this.k.remove(fidListener);
                }
            }
        };
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @InterfaceC5670cr1
    public Task<InstallationTokenResult> c(final boolean z) {
        B();
        Task<InstallationTokenResult> j = j();
        this.h.execute(new Runnable() { // from class: o.Kt0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.o(z);
            }
        });
        return j;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @InterfaceC5670cr1
    public Task<String> getId() {
        B();
        String s2 = s();
        if (s2 != null) {
            return Tasks.g(s2);
        }
        Task<String> k = k();
        this.h.execute(new Runnable() { // from class: o.It0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.o(false);
            }
        });
        return k;
    }

    public final Task<InstallationTokenResult> j() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l(new GetAuthTokenListener(this.d, taskCompletionSource));
        return taskCompletionSource.a();
    }

    public final Task<String> k() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l(new GetIdListener(taskCompletionSource));
        return taskCompletionSource.a();
    }

    public final void l(StateListener stateListener) {
        synchronized (this.g) {
            this.l.add(stateListener);
        }
    }

    public final Void m() throws FirebaseInstallationsException {
        G(null);
        PersistedInstallationEntry w2 = w();
        if (w2.k()) {
            this.b.e(q(), w2.d(), z(), w2.f());
        }
        A(w2.r());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(boolean z) {
        PersistedInstallationEntry D;
        PersistedInstallationEntry w2 = w();
        try {
            if (!w2.i() && !w2.l()) {
                if (!z && !this.d.f(w2)) {
                    return;
                }
                D = p(w2);
                A(D);
                H(w2, D);
                if (D.k()) {
                    G(D.d());
                }
                if (!D.i()) {
                    E(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
                    return;
                } else if (D.j()) {
                    E(new IOException(w));
                    return;
                } else {
                    F(D);
                    return;
                }
            }
            D = D(w2);
            A(D);
            H(w2, D);
            if (D.k()) {
            }
            if (!D.i()) {
            }
        } catch (FirebaseInstallationsException e) {
            E(e);
        }
    }

    public final void o(final boolean z) {
        PersistedInstallationEntry y = y();
        if (z) {
            y = y.p();
        }
        F(y);
        this.i.execute(new Runnable() { // from class: o.Ht0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.n(z);
            }
        });
    }

    public final PersistedInstallationEntry p(@InterfaceC5670cr1 PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult f = this.b.f(q(), persistedInstallationEntry.d(), z(), persistedInstallationEntry.f());
        int i = AnonymousClass3.b[f.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    G(null);
                    return persistedInstallationEntry.r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
            }
            return persistedInstallationEntry.q("BAD CONFIG");
        }
        return persistedInstallationEntry.o(f.c(), f.d(), this.d.b());
    }

    @InterfaceC11300zs1
    public String q() {
        return this.a.s().i();
    }

    @InterfaceC5056aJ2
    public String r() {
        return this.a.s().j();
    }

    public final synchronized String s() {
        return this.j;
    }

    public final IidStore t() {
        return this.e.get();
    }

    public final PersistedInstallationEntry w() {
        PersistedInstallationEntry e;
        synchronized (m) {
            try {
                CrossProcessLock a = CrossProcessLock.a(this.a.n(), n);
                e = this.c.e();
                if (a != null) {
                    a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    @InterfaceC5056aJ2
    public String x() {
        return this.a.r();
    }

    public final PersistedInstallationEntry y() {
        PersistedInstallationEntry e;
        synchronized (m) {
            try {
                CrossProcessLock a = CrossProcessLock.a(this.a.n(), n);
                e = this.c.e();
                if (e.j()) {
                    e = this.c.c(e.t(C(e)));
                }
                if (a != null) {
                    a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    @InterfaceC11300zs1
    public String z() {
        return this.a.s().n();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy<IidStore> lazy, RandomFidGenerator randomFidGenerator) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = firebaseApp;
        this.b = firebaseInstallationServiceClient;
        this.c = persistedInstallation;
        this.d = utils;
        this.e = lazy;
        this.f = randomFidGenerator;
        this.h = executorService;
        this.i = executor;
    }
}
