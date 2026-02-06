package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import o.C6515gH1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public class UserMetadata {
    public static final String h = "user-data";
    public static final String i = "keys";
    public static final String j = "internal-keys";
    public static final String k = "rollouts-state";
    @InterfaceC5056aJ2
    public static final int l = 64;
    @InterfaceC5056aJ2
    public static final int m = 1024;
    @InterfaceC5056aJ2
    public static final int n = 8192;
    @InterfaceC5056aJ2

    /* renamed from: o  reason: collision with root package name */
    public static final int f344o = 128;
    public final MetaDataStore a;
    public final CrashlyticsBackgroundWorker b;
    public String c;
    public final SerializeableKeysMap d = new SerializeableKeysMap(false);
    public final SerializeableKeysMap e = new SerializeableKeysMap(true);
    public final RolloutAssignmentList f = new RolloutAssignmentList(128);
    public final AtomicMarkableReference<String> g = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes3.dex */
    public class SerializeableKeysMap {
        public final AtomicMarkableReference<KeysMap> a;
        public final AtomicReference<Callable<Void>> b = new AtomicReference<>(null);
        public final boolean c;

        public SerializeableKeysMap(boolean z) {
            int i;
            this.c = z;
            if (z) {
                i = 8192;
            } else {
                i = 1024;
            }
            this.a = new AtomicMarkableReference<>(new KeysMap(64, i), false);
        }

        public static /* synthetic */ Void a(SerializeableKeysMap serializeableKeysMap) {
            serializeableKeysMap.b.set(null);
            serializeableKeysMap.d();
            return null;
        }

        public Map<String, String> b() {
            return this.a.getReference().a();
        }

        public final void c() {
            Callable callable = new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return UserMetadata.SerializeableKeysMap.a(UserMetadata.SerializeableKeysMap.this);
                }
            };
            if (C6515gH1.a(this.b, null, callable)) {
                UserMetadata.this.b.h(callable);
            }
        }

        public final void d() {
            Map<String, String> map;
            synchronized (this) {
                try {
                    if (this.a.isMarked()) {
                        map = this.a.getReference().a();
                        AtomicMarkableReference<KeysMap> atomicMarkableReference = this.a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                UserMetadata.this.a.r(UserMetadata.this.c, map, this.c);
            }
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Map<String, String> map) {
            synchronized (this) {
                this.a.getReference().e(map);
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            c();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.c = str;
        this.a = new MetaDataStore(fileStore);
        this.b = crashlyticsBackgroundWorker;
    }

    public static /* synthetic */ Object a(UserMetadata userMetadata, List list) {
        userMetadata.a.s(userMetadata.c, list);
        return null;
    }

    public static /* synthetic */ Object b(UserMetadata userMetadata) {
        userMetadata.l();
        return null;
    }

    public static UserMetadata j(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        userMetadata.d.a.getReference().e(metaDataStore.j(str, false));
        userMetadata.e.a.getReference().e(metaDataStore.j(str, true));
        userMetadata.g.set(metaDataStore.l(str), false);
        userMetadata.f.c(metaDataStore.k(str));
        return userMetadata;
    }

    @InterfaceC11300zs1
    public static String k(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).l(str);
    }

    public Map<String, String> f() {
        return this.d.b();
    }

    public Map<String, String> g() {
        return this.e.b();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> h() {
        return this.f.a();
    }

    @InterfaceC11300zs1
    public String i() {
        return this.g.getReference();
    }

    public final void l() {
        boolean z;
        String str;
        synchronized (this.g) {
            try {
                z = false;
                if (this.g.isMarked()) {
                    str = i();
                    this.g.set(str, false);
                    z = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.t(this.c, str);
        }
    }

    public boolean m(String str, String str2) {
        return this.d.e(str, str2);
    }

    public void n(Map<String, String> map) {
        this.d.f(map);
    }

    public boolean o(String str, String str2) {
        return this.e.e(str, str2);
    }

    public void p(String str) {
        synchronized (this.c) {
            try {
                this.c = str;
                Map<String, String> b = this.d.b();
                List<RolloutAssignment> b2 = this.f.b();
                if (i() != null) {
                    this.a.t(str, i());
                }
                if (!b.isEmpty()) {
                    this.a.q(str, b);
                }
                if (!b2.isEmpty()) {
                    this.a.s(str, b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(String str) {
        String c = KeysMap.c(str, 1024);
        synchronized (this.g) {
            try {
                if (CommonUtils.A(c, this.g.getReference())) {
                    return;
                }
                this.g.set(c, true);
                this.b.h(new Callable() { // from class: o.wD2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UserMetadata.b(UserMetadata.this);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r(List<RolloutAssignment> list) {
        synchronized (this.f) {
            try {
                if (!this.f.c(list)) {
                    return false;
                }
                final List<RolloutAssignment> b = this.f.b();
                this.b.h(new Callable() { // from class: o.vD2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UserMetadata.a(UserMetadata.this, b);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
