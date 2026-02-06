package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import o.C2513Az0;
import o.C2807Dz0;
import o.C6516gH2;

/* loaded from: classes.dex */
public abstract class j {
    public static final int A = 7;
    public static final int B = 8;
    public static final int C = 9;
    public static final int D = 10;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 4097;
    public static final int J = 8194;
    public static final int K = 4099;
    public static final int L = 4100;
    public static final int M = 8197;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 5;
    public static final int z = 6;
    public final e a;
    public final ClassLoader b;
    public ArrayList<a> c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public CharSequence m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f34o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public boolean r;
    public ArrayList<Runnable> s;

    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public f.b h;
        public f.b i;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            f.b bVar = f.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(int i, Fragment fragment, boolean z) {
            this.a = i;
            this.b = fragment;
            this.c = z;
            f.b bVar = f.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(int i, Fragment fragment, f.b bVar) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            this.h = fragment.N1;
            this.i = bVar;
        }

        public a(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
        }
    }

    @Deprecated
    public j() {
        this.c = new ArrayList<>();
        this.j = true;
        this.r = false;
        this.a = null;
        this.b = null;
    }

    public final j A(int i, Class<? extends Fragment> cls, Bundle bundle) {
        return B(i, cls, bundle, null);
    }

    public final j B(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return z(i, q(cls, bundle), str);
    }

    public j C(Runnable runnable) {
        s();
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(runnable);
        return this;
    }

    @Deprecated
    public j D(boolean z2) {
        return M(z2);
    }

    @Deprecated
    public j E(int i) {
        this.n = i;
        this.f34o = null;
        return this;
    }

    @Deprecated
    public j F(CharSequence charSequence) {
        this.n = 0;
        this.f34o = charSequence;
        return this;
    }

    @Deprecated
    public j G(int i) {
        this.l = i;
        this.m = null;
        return this;
    }

    @Deprecated
    public j H(CharSequence charSequence) {
        this.l = 0;
        this.m = charSequence;
        return this;
    }

    public j I(int i, int i2) {
        return J(i, i2, 0, 0);
    }

    public j J(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        return this;
    }

    public j K(Fragment fragment, f.b bVar) {
        i(new a(10, fragment, bVar));
        return this;
    }

    public j L(Fragment fragment) {
        i(new a(8, fragment));
        return this;
    }

    public j M(boolean z2) {
        this.r = z2;
        return this;
    }

    public j N(int i) {
        this.h = i;
        return this;
    }

    @Deprecated
    public j O(int i) {
        return this;
    }

    public j P(Fragment fragment) {
        i(new a(5, fragment));
        return this;
    }

    public j b(int i, Fragment fragment) {
        t(i, fragment, null, 1);
        return this;
    }

    public j c(int i, Fragment fragment, String str) {
        t(i, fragment, str, 1);
        return this;
    }

    public final j d(int i, Class<? extends Fragment> cls, Bundle bundle) {
        return b(i, q(cls, bundle));
    }

    public final j e(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return c(i, q(cls, bundle), str);
    }

    public j f(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.C1 = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public j g(Fragment fragment, String str) {
        t(0, fragment, str, 1);
        return this;
    }

    public final j h(Class<? extends Fragment> cls, Bundle bundle, String str) {
        return g(q(cls, bundle), str);
    }

    public void i(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public j j(View view, String str) {
        if (C2807Dz0.f()) {
            String C0 = C6516gH2.C0(view);
            if (C0 != null) {
                if (this.p == null) {
                    this.p = new ArrayList<>();
                    this.q = new ArrayList<>();
                } else if (!this.q.contains(str)) {
                    if (this.p.contains(C0)) {
                        throw new IllegalArgumentException("A shared element with the source name '" + C0 + "' has already been added to the transaction.");
                    }
                } else {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                this.p.add(C0);
                this.q.add(str);
                return this;
            }
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        return this;
    }

    public j k(String str) {
        if (this.j) {
            this.i = true;
            this.k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public j l(Fragment fragment) {
        i(new a(7, fragment));
        return this;
    }

    public abstract int m();

    public abstract int n();

    public abstract void o();

    public abstract void p();

    public final Fragment q(Class<? extends Fragment> cls, Bundle bundle) {
        e eVar = this.a;
        if (eVar != null) {
            ClassLoader classLoader = this.b;
            if (classLoader != null) {
                Fragment a2 = eVar.a(classLoader, cls.getName());
                if (bundle != null) {
                    a2.f2(bundle);
                }
                return a2;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public j r(Fragment fragment) {
        i(new a(6, fragment));
        return this;
    }

    public j s() {
        if (!this.i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void t(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.M1;
        if (str2 != null) {
            C2513Az0.i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.u1;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.u1 + " now " + str);
                }
                fragment.u1 = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.s1;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.s1 + " now " + i);
                    }
                    fragment.s1 = i;
                    fragment.t1 = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            i(new a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public j u(Fragment fragment) {
        i(new a(4, fragment));
        return this;
    }

    public boolean v() {
        return this.j;
    }

    public boolean w() {
        return this.c.isEmpty();
    }

    public j x(Fragment fragment) {
        i(new a(3, fragment));
        return this;
    }

    public j y(int i, Fragment fragment) {
        return z(i, fragment, null);
    }

    public j z(int i, Fragment fragment, String str) {
        if (i != 0) {
            t(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public j(e eVar, ClassLoader classLoader) {
        this.c = new ArrayList<>();
        this.j = true;
        this.r = false;
        this.a = eVar;
        this.b = classLoader;
    }

    public j(e eVar, ClassLoader classLoader, j jVar) {
        this(eVar, classLoader);
        Iterator<a> it = jVar.c.iterator();
        while (it.hasNext()) {
            this.c.add(new a(it.next()));
        }
        this.d = jVar.d;
        this.e = jVar.e;
        this.f = jVar.f;
        this.g = jVar.g;
        this.h = jVar.h;
        this.i = jVar.i;
        this.j = jVar.j;
        this.k = jVar.k;
        this.n = jVar.n;
        this.f34o = jVar.f34o;
        this.l = jVar.l;
        this.m = jVar.m;
        if (jVar.p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.p = arrayList;
            arrayList.addAll(jVar.p);
        }
        if (jVar.q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.q = arrayList2;
            arrayList2.addAll(jVar.q);
        }
        this.r = jVar.r;
    }
}
