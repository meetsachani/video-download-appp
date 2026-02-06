package androidx.camera.lifecycle;

import androidx.camera.core.m;
import androidx.lifecycle.f;
import androidx.lifecycle.l;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC4078Qw;
import o.C10907yF1;
import o.C3984Px;
import o.InterfaceC2797Dw;
import o.JZ0;
import o.KZ0;
import o.UH2;

/* loaded from: classes.dex */
public final class LifecycleCameraRepository {
    public final Object a = new Object();
    public final Map<a, LifecycleCamera> b = new HashMap();
    public final Map<LifecycleCameraRepositoryObserver, Set<a>> c = new HashMap();
    public final ArrayDeque<KZ0> d = new ArrayDeque<>();
    public InterfaceC2797Dw e;

    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements JZ0 {
        public final LifecycleCameraRepository X;
        public final KZ0 Y;

        public LifecycleCameraRepositoryObserver(KZ0 kz0, LifecycleCameraRepository lifecycleCameraRepository) {
            this.Y = kz0;
            this.X = lifecycleCameraRepository;
        }

        public KZ0 a() {
            return this.Y;
        }

        @l(f.a.ON_DESTROY)
        public void onDestroy(KZ0 kz0) {
            this.X.n(kz0);
        }

        @l(f.a.ON_START)
        public void onStart(KZ0 kz0) {
            this.X.i(kz0);
        }

        @l(f.a.ON_STOP)
        public void onStop(KZ0 kz0) {
            this.X.j(kz0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public static a a(KZ0 kz0, C3984Px.b bVar) {
            return new androidx.camera.lifecycle.a(kz0, bVar);
        }

        public abstract C3984Px.b b();

        public abstract KZ0 c();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:4:0x0003, B:6:0x0022, B:21:0x0063, B:22:0x0074, B:24:0x0084, B:25:0x0087, B:28:0x008a, B:29:0x0093, B:11:0x002c, B:12:0x0030, B:14:0x0036, B:16:0x0050, B:19:0x005b, B:20:0x0062), top: B:34:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(LifecycleCamera lifecycleCamera, UH2 uh2, List<AbstractC4078Qw> list, Collection<m> collection, InterfaceC2797Dw interfaceC2797Dw) {
        synchronized (this.a) {
            try {
                C10907yF1.a(!collection.isEmpty());
                this.e = interfaceC2797Dw;
                KZ0 t = lifecycleCamera.t();
                Set<a> set = this.c.get(e(t));
                InterfaceC2797Dw interfaceC2797Dw2 = this.e;
                try {
                    if (interfaceC2797Dw2 != null) {
                        if (interfaceC2797Dw2.e() != 2) {
                        }
                        lifecycleCamera.s().Z(uh2);
                        lifecycleCamera.s().X(list);
                        lifecycleCamera.p(collection);
                        if (t.b().b().g(f.b.STARTED)) {
                            i(t);
                        }
                    }
                    lifecycleCamera.s().Z(uh2);
                    lifecycleCamera.s().X(list);
                    lifecycleCamera.p(collection);
                    if (t.b().b().g(f.b.STARTED)) {
                    }
                } catch (C3984Px.a e) {
                    throw new IllegalArgumentException(e.getMessage());
                }
                for (a aVar : set) {
                    LifecycleCamera lifecycleCamera2 = (LifecycleCamera) C10907yF1.l(this.b.get(aVar));
                    if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.u().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : new HashSet(this.c.keySet())) {
                    n(lifecycleCameraRepositoryObserver.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public LifecycleCamera c(KZ0 kz0, C3984Px c3984Px) {
        boolean z;
        LifecycleCamera lifecycleCamera;
        synchronized (this.a) {
            try {
                if (this.b.get(a.a(kz0, c3984Px.D())) == null) {
                    z = true;
                } else {
                    z = false;
                }
                C10907yF1.b(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                if (kz0.b().b() != f.b.DESTROYED) {
                    lifecycleCamera = new LifecycleCamera(kz0, c3984Px);
                    if (c3984Px.K().isEmpty()) {
                        lifecycleCamera.y();
                    }
                    h(lifecycleCamera);
                } else {
                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lifecycleCamera;
    }

    public LifecycleCamera d(KZ0 kz0, C3984Px.b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.a) {
            lifecycleCamera = this.b.get(a.a(kz0, bVar));
        }
        return lifecycleCamera;
    }

    public final LifecycleCameraRepositoryObserver e(KZ0 kz0) {
        synchronized (this.a) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.c.keySet()) {
                    if (kz0.equals(lifecycleCameraRepositoryObserver.a())) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection<LifecycleCamera> f() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.b.values());
        }
        return unmodifiableCollection;
    }

    public final boolean g(KZ0 kz0) {
        synchronized (this.a) {
            try {
                LifecycleCameraRepositoryObserver e = e(kz0);
                if (e == null) {
                    return false;
                }
                for (a aVar : this.c.get(e)) {
                    if (!((LifecycleCamera) C10907yF1.l(this.b.get(aVar))).u().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(LifecycleCamera lifecycleCamera) {
        Set<a> hashSet;
        synchronized (this.a) {
            try {
                KZ0 t = lifecycleCamera.t();
                a a2 = a.a(t, lifecycleCamera.s().D());
                LifecycleCameraRepositoryObserver e = e(t);
                if (e != null) {
                    hashSet = this.c.get(e);
                } else {
                    hashSet = new HashSet<>();
                }
                hashSet.add(a2);
                this.b.put(a2, lifecycleCamera);
                if (e == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(t, this);
                    this.c.put(lifecycleCameraRepositoryObserver, hashSet);
                    t.b().a(lifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(KZ0 kz0) {
        synchronized (this.a) {
            try {
                if (!g(kz0)) {
                    return;
                }
                if (this.d.isEmpty()) {
                    this.d.push(kz0);
                } else {
                    InterfaceC2797Dw interfaceC2797Dw = this.e;
                    if (interfaceC2797Dw == null || interfaceC2797Dw.e() != 2) {
                        KZ0 peek = this.d.peek();
                        if (!kz0.equals(peek)) {
                            k(peek);
                            this.d.remove(kz0);
                            this.d.push(kz0);
                        }
                    }
                }
                o(kz0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(KZ0 kz0) {
        synchronized (this.a) {
            try {
                this.d.remove(kz0);
                k(kz0);
                if (!this.d.isEmpty()) {
                    o(this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(KZ0 kz0) {
        synchronized (this.a) {
            try {
                LifecycleCameraRepositoryObserver e = e(kz0);
                if (e == null) {
                    return;
                }
                for (a aVar : this.c.get(e)) {
                    ((LifecycleCamera) C10907yF1.l(this.b.get(aVar))).y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(Collection<m> collection) {
        synchronized (this.a) {
            try {
                for (a aVar : this.b.keySet()) {
                    LifecycleCamera lifecycleCamera = this.b.get(aVar);
                    boolean isEmpty = lifecycleCamera.u().isEmpty();
                    lifecycleCamera.z(collection);
                    if (!isEmpty && lifecycleCamera.u().isEmpty()) {
                        j(lifecycleCamera.t());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        synchronized (this.a) {
            try {
                for (a aVar : this.b.keySet()) {
                    LifecycleCamera lifecycleCamera = this.b.get(aVar);
                    lifecycleCamera.A();
                    j(lifecycleCamera.t());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(KZ0 kz0) {
        synchronized (this.a) {
            try {
                LifecycleCameraRepositoryObserver e = e(kz0);
                if (e == null) {
                    return;
                }
                j(kz0);
                for (a aVar : this.c.get(e)) {
                    this.b.remove(aVar);
                }
                this.c.remove(e);
                e.a().b().d(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(KZ0 kz0) {
        synchronized (this.a) {
            try {
                for (a aVar : this.c.get(e(kz0))) {
                    LifecycleCamera lifecycleCamera = this.b.get(aVar);
                    if (!((LifecycleCamera) C10907yF1.l(lifecycleCamera)).u().isEmpty()) {
                        lifecycleCamera.B();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
