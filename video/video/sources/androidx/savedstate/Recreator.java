package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import o.C6562gT0;
import o.C9516sY;
import o.KZ0;
import o.OX1;

/* loaded from: classes.dex */
public final class Recreator implements i {
    public static final a Y = new a(null);
    public static final String Y0 = "androidx.savedstate.Restarter";
    public static final String Z = "classes_to_restore";
    public final OX1 X;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.c {
        public final Set<String> a;

        public b(androidx.savedstate.a aVar) {
            C6562gT0.p(aVar, "registry");
            this.a = new LinkedHashSet();
            aVar.j(Recreator.Y0, this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.Z, new ArrayList<>(this.a));
            return bundle;
        }

        public final void b(String str) {
            C6562gT0.p(str, "className");
            this.a.add(str);
        }
    }

    public Recreator(OX1 ox1) {
        C6562gT0.p(ox1, "owner");
        this.X = ox1;
    }

    public final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0051a.class);
            C6562gT0.o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    C6562gT0.o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0051a) newInstance).a(this.X);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        if (aVar == f.a.ON_CREATE) {
            kz0.b().d(this);
            Bundle b2 = this.X.E().b(Y0);
            if (b2 != null) {
                ArrayList<String> stringArrayList = b2.getStringArrayList(Z);
                if (stringArrayList != null) {
                    for (String str : stringArrayList) {
                        a(str);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
