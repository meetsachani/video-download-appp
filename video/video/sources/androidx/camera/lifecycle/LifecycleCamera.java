package androidx.camera.lifecycle;

import androidx.camera.core.m;
import androidx.lifecycle.f;
import androidx.lifecycle.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import o.C3984Px;
import o.InterfaceC3099Gv;
import o.InterfaceC6420fx;
import o.InterfaceC7402jx;
import o.InterfaceC8388nw;
import o.InterfaceC9367rw;
import o.JZ0;
import o.KZ0;

/* loaded from: classes.dex */
final class LifecycleCamera implements JZ0, InterfaceC3099Gv {
    public final KZ0 Y;
    public final C3984Px Z;
    public final Object X = new Object();
    public volatile boolean Y0 = false;
    public boolean Z0 = false;
    public boolean a1 = false;

    public LifecycleCamera(KZ0 kz0, C3984Px c3984Px) {
        this.Y = kz0;
        this.Z = c3984Px;
        if (kz0.b().b().g(f.b.STARTED)) {
            c3984Px.s();
        } else {
            c3984Px.B();
        }
        kz0.b().a(this);
    }

    public void A() {
        synchronized (this.X) {
            C3984Px c3984Px = this.Z;
            c3984Px.V(c3984Px.K());
        }
    }

    public void B() {
        synchronized (this.X) {
            try {
                if (!this.Z0) {
                    return;
                }
                this.Z0 = false;
                if (this.Y.b().b().g(f.b.STARTED)) {
                    onStart(this.Y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC3099Gv
    public InterfaceC9367rw a() {
        return this.Z.a();
    }

    @Override // o.InterfaceC3099Gv
    public InterfaceC8388nw b() {
        return this.Z.b();
    }

    @Override // o.InterfaceC3099Gv
    public InterfaceC6420fx c() {
        return this.Z.c();
    }

    @Override // o.InterfaceC3099Gv
    public void d(InterfaceC8388nw interfaceC8388nw) {
        this.Z.d(interfaceC8388nw);
    }

    @Override // o.InterfaceC3099Gv
    public LinkedHashSet<InterfaceC7402jx> f() {
        return this.Z.f();
    }

    @l(f.a.ON_DESTROY)
    public void onDestroy(KZ0 kz0) {
        synchronized (this.X) {
            C3984Px c3984Px = this.Z;
            c3984Px.V(c3984Px.K());
        }
    }

    @l(f.a.ON_PAUSE)
    public void onPause(KZ0 kz0) {
        this.Z.k(false);
    }

    @l(f.a.ON_RESUME)
    public void onResume(KZ0 kz0) {
        this.Z.k(true);
    }

    @l(f.a.ON_START)
    public void onStart(KZ0 kz0) {
        synchronized (this.X) {
            try {
                if (!this.Z0 && !this.a1) {
                    this.Z.s();
                    this.Y0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @l(f.a.ON_STOP)
    public void onStop(KZ0 kz0) {
        synchronized (this.X) {
            try {
                if (!this.Z0 && !this.a1) {
                    this.Z.B();
                    this.Y0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(Collection<m> collection) throws C3984Px.a {
        synchronized (this.X) {
            this.Z.p(collection);
        }
    }

    @Override // o.InterfaceC3099Gv
    public boolean q(m... mVarArr) {
        return this.Z.q(mVarArr);
    }

    public C3984Px s() {
        return this.Z;
    }

    public KZ0 t() {
        KZ0 kz0;
        synchronized (this.X) {
            kz0 = this.Y;
        }
        return kz0;
    }

    public List<m> u() {
        List<m> unmodifiableList;
        synchronized (this.X) {
            unmodifiableList = Collections.unmodifiableList(this.Z.K());
        }
        return unmodifiableList;
    }

    public boolean v() {
        boolean z;
        synchronized (this.X) {
            z = this.Y0;
        }
        return z;
    }

    public boolean w(m mVar) {
        boolean contains;
        synchronized (this.X) {
            contains = this.Z.K().contains(mVar);
        }
        return contains;
    }

    public void x() {
        synchronized (this.X) {
            this.a1 = true;
            this.Y0 = false;
            this.Y.b().d(this);
        }
    }

    public void y() {
        synchronized (this.X) {
            try {
                if (this.Z0) {
                    return;
                }
                onStop(this.Y);
                this.Z0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(Collection<m> collection) {
        synchronized (this.X) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.Z.K());
            this.Z.V(arrayList);
        }
    }
}
