package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import o.C10490wX1;
import o.C6562gT0;
import o.C9516sY;
import o.KZ0;
import o.OX1;

/* loaded from: classes.dex */
public final class a {
    public static final b g = new b(null);
    @Deprecated
    public static final String h = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    public boolean b;
    public Bundle c;
    public boolean d;
    public Recreator.b e;
    public final C10490wX1<String, c> a = new C10490wX1<>();
    public boolean f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0051a {
        void a(OX1 ox1);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Bundle a();
    }

    public static final void f(a aVar, KZ0 kz0, f.a aVar2) {
        C6562gT0.p(aVar, "this$0");
        C6562gT0.p(kz0, "<anonymous parameter 0>");
        C6562gT0.p(aVar2, "event");
        if (aVar2 == f.a.ON_START) {
            aVar.f = true;
        } else if (aVar2 == f.a.ON_STOP) {
            aVar.f = false;
        }
    }

    public final Bundle b(String str) {
        Bundle bundle;
        C6562gT0.p(str, "key");
        if (this.d) {
            Bundle bundle2 = this.c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle;
            }
            this.c = null;
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final c c(String str) {
        C6562gT0.p(str, "key");
        Iterator<Map.Entry<String, c>> it = this.a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            C6562gT0.o(next, "components");
            c value = next.getValue();
            if (C6562gT0.g(next.getKey(), str)) {
                return value;
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.d;
    }

    public final void g(f fVar) {
        C6562gT0.p(fVar, "lifecycle");
        if (!this.b) {
            fVar.a(new i() { // from class: o.MX1
                @Override // androidx.lifecycle.i
                public final void i(KZ0 kz0, f.a aVar) {
                    androidx.savedstate.a.f(androidx.savedstate.a.this, kz0, aVar);
                }
            });
            this.b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }

    public final void h(Bundle bundle) {
        Bundle bundle2;
        if (this.b) {
            if (!this.d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle(h);
                } else {
                    bundle2 = null;
                }
                this.c = bundle2;
                this.d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
    }

    public final void i(Bundle bundle) {
        C6562gT0.p(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C10490wX1<String, c>.d f = this.a.f();
        C6562gT0.o(f, "this.components.iteratorWithAdditions()");
        while (f.hasNext()) {
            Map.Entry next = f.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle(h, bundle2);
        }
    }

    public final void j(String str, c cVar) {
        C6562gT0.p(str, "key");
        C6562gT0.p(cVar, "provider");
        if (this.a.j(str, cVar) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public final void k(Class<? extends InterfaceC0051a> cls) {
        C6562gT0.p(cls, "clazz");
        if (this.f) {
            Recreator.b bVar = this.e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.e = bVar;
            try {
                cls.getDeclaredConstructor(null);
                Recreator.b bVar2 = this.e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    C6562gT0.o(name, "clazz.name");
                    bVar2.b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final void l(boolean z) {
        this.f = z;
    }

    public final void m(String str) {
        C6562gT0.p(str, "key");
        this.a.k(str);
    }
}
