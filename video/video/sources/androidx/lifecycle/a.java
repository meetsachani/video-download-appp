package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.u;
import o.AbstractC6553gR;
import o.C6562gT0;
import o.C9516sY;
import o.CH2;
import o.OX1;

/* loaded from: classes.dex */
public abstract class a extends u.d implements u.b {
    public static final C0027a e = new C0027a(null);
    public static final String f = "androidx.lifecycle.savedstate.vm.tag";
    public androidx.savedstate.a b;
    public f c;
    public Bundle d;

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0027a {
        public /* synthetic */ C0027a(C9516sY c9516sY) {
            this();
        }

        public C0027a() {
        }
    }

    public a() {
    }

    private final <T extends CH2> T e(String str, Class<T> cls) {
        androidx.savedstate.a aVar = this.b;
        C6562gT0.m(aVar);
        f fVar = this.c;
        C6562gT0.m(fVar);
        SavedStateHandleController b = LegacySavedStateHandleController.b(aVar, fVar, str, this.d);
        T t = (T) f(str, cls, b.b());
        t.f("androidx.lifecycle.savedstate.vm.tag", b);
        return t;
    }

    @Override // androidx.lifecycle.u.b
    public <T extends CH2> T a(Class<T> cls, AbstractC6553gR abstractC6553gR) {
        C6562gT0.p(cls, "modelClass");
        C6562gT0.p(abstractC6553gR, "extras");
        String str = (String) abstractC6553gR.a(u.c.d);
        if (str != null) {
            if (this.b != null) {
                return (T) e(str, cls);
            }
            return (T) f(str, cls, q.a(abstractC6553gR));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.u.b
    public <T extends CH2> T b(Class<T> cls) {
        C6562gT0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.c != null) {
                return (T) e(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.u.d
    public void d(CH2 ch2) {
        C6562gT0.p(ch2, "viewModel");
        androidx.savedstate.a aVar = this.b;
        if (aVar != null) {
            C6562gT0.m(aVar);
            f fVar = this.c;
            C6562gT0.m(fVar);
            LegacySavedStateHandleController.a(ch2, aVar, fVar);
        }
    }

    public abstract <T extends CH2> T f(String str, Class<T> cls, p pVar);

    public a(OX1 ox1, Bundle bundle) {
        C6562gT0.p(ox1, "owner");
        this.b = ox1.E();
        this.c = ox1.b();
        this.d = bundle;
    }
}
