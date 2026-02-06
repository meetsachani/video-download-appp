package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.u;
import java.lang.reflect.Constructor;
import o.AbstractC6553gR;
import o.C6562gT0;
import o.C6724h9;
import o.CH2;
import o.OX1;
import o.PX1;

/* loaded from: classes.dex */
public final class r extends u.d implements u.b {
    public Application b;
    public final u.b c;
    public Bundle d;
    public f e;
    public androidx.savedstate.a f;

    public r() {
        this.c = new u.a();
    }

    @Override // androidx.lifecycle.u.b
    public <T extends CH2> T a(Class<T> cls, AbstractC6553gR abstractC6553gR) {
        Constructor c;
        C6562gT0.p(cls, "modelClass");
        C6562gT0.p(abstractC6553gR, "extras");
        String str = (String) abstractC6553gR.a(u.c.d);
        if (str != null) {
            if (abstractC6553gR.a(q.c) != null && abstractC6553gR.a(q.d) != null) {
                Application application = (Application) abstractC6553gR.a(u.a.i);
                boolean isAssignableFrom = C6724h9.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    c = PX1.c(cls, PX1.a());
                } else {
                    c = PX1.c(cls, PX1.b());
                }
                if (c == null) {
                    return (T) this.c.a(cls, abstractC6553gR);
                }
                if (isAssignableFrom && application != null) {
                    return (T) PX1.d(cls, c, application, q.a(abstractC6553gR));
                }
                return (T) PX1.d(cls, c, q.a(abstractC6553gR));
            } else if (this.e != null) {
                return (T) e(str, cls);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.u.b
    public <T extends CH2> T b(Class<T> cls) {
        C6562gT0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.u.d
    public void d(CH2 ch2) {
        C6562gT0.p(ch2, "viewModel");
        if (this.e != null) {
            androidx.savedstate.a aVar = this.f;
            C6562gT0.m(aVar);
            f fVar = this.e;
            C6562gT0.m(fVar);
            LegacySavedStateHandleController.a(ch2, aVar, fVar);
        }
    }

    public final <T extends CH2> T e(String str, Class<T> cls) {
        Constructor c;
        T t;
        Application application;
        C6562gT0.p(str, "key");
        C6562gT0.p(cls, "modelClass");
        f fVar = this.e;
        if (fVar != null) {
            boolean isAssignableFrom = C6724h9.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.b != null) {
                c = PX1.c(cls, PX1.a());
            } else {
                c = PX1.c(cls, PX1.b());
            }
            if (c == null) {
                if (this.b != null) {
                    return (T) this.c.b(cls);
                }
                return (T) u.c.b.a().b(cls);
            }
            androidx.savedstate.a aVar = this.f;
            C6562gT0.m(aVar);
            SavedStateHandleController b = LegacySavedStateHandleController.b(aVar, fVar, str, this.d);
            if (isAssignableFrom && (application = this.b) != null) {
                C6562gT0.m(application);
                t = (T) PX1.d(cls, c, application, b.b());
            } else {
                t = (T) PX1.d(cls, c, b.b());
            }
            t.f("androidx.lifecycle.savedstate.vm.tag", b);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Application application, OX1 ox1) {
        this(application, ox1, null);
        C6562gT0.p(ox1, "owner");
    }

    public r(Application application, OX1 ox1, Bundle bundle) {
        u.a aVar;
        C6562gT0.p(ox1, "owner");
        this.f = ox1.E();
        this.e = ox1.b();
        this.d = bundle;
        this.b = application;
        if (application != null) {
            aVar = u.a.f.b(application);
        } else {
            aVar = new u.a();
        }
        this.c = aVar;
    }
}
