package o;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import androidx.lifecycle.u;

/* renamed from: o.Kz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3504Kz0 implements androidx.lifecycle.e, OX1, HH2 {
    public final Fragment X;
    public final GH2 Y;
    public u.b Y0;
    public final Runnable Z;
    public androidx.lifecycle.j Z0 = null;
    public NX1 a1 = null;

    public C3504Kz0(Fragment fragment, GH2 gh2, Runnable runnable) {
        this.X = fragment;
        this.Y = gh2;
        this.Z = runnable;
    }

    @Override // o.HH2
    public GH2 A() {
        c();
        return this.Y;
    }

    @Override // o.OX1
    public androidx.savedstate.a E() {
        c();
        return this.a1.b();
    }

    @Override // androidx.lifecycle.e
    public u.b T() {
        Application application;
        u.b T = this.X.T();
        if (!T.equals(this.X.R1)) {
            this.Y0 = T;
            return T;
        }
        if (this.Y0 == null) {
            Context applicationContext = this.X.U1().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            Fragment fragment = this.X;
            this.Y0 = new androidx.lifecycle.r(application, fragment, fragment.s());
        }
        return this.Y0;
    }

    @Override // androidx.lifecycle.e
    public AbstractC6553gR U() {
        Application application;
        Context applicationContext = this.X.U1().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C3946Pm1 c3946Pm1 = new C3946Pm1();
        if (application != null) {
            c3946Pm1.c(u.a.i, application);
        }
        c3946Pm1.c(androidx.lifecycle.q.c, this.X);
        c3946Pm1.c(androidx.lifecycle.q.d, this);
        if (this.X.s() != null) {
            c3946Pm1.c(androidx.lifecycle.q.e, this.X.s());
        }
        return c3946Pm1;
    }

    public void a(f.a aVar) {
        this.Z0.l(aVar);
    }

    @Override // o.KZ0
    public androidx.lifecycle.f b() {
        c();
        return this.Z0;
    }

    public void c() {
        if (this.Z0 == null) {
            this.Z0 = new androidx.lifecycle.j(this);
            NX1 a = NX1.a(this);
            this.a1 = a;
            a.c();
            this.Z.run();
        }
    }

    public boolean d() {
        if (this.Z0 != null) {
            return true;
        }
        return false;
    }

    public void e(Bundle bundle) {
        this.a1.d(bundle);
    }

    public void f(Bundle bundle) {
        this.a1.e(bundle);
    }

    public void g(f.b bVar) {
        this.Z0.s(bVar);
    }
}
