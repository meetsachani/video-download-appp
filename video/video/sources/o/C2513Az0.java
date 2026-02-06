package o;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import o.C2513Az0;

/* renamed from: o.Az0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2513Az0 {
    public static final String b = "FragmentStrictMode";
    public static final C2513Az0 a = new C2513Az0();
    public static c c = c.e;

    /* renamed from: o.Az0$a */
    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: o.Az0$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(QI2 qi2);
    }

    /* renamed from: o.Az0$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final b d = new b(null);
        public static final c e = new c(B22.k(), null, C8926q81.z());
        public final Set<a> a;
        public final b b;
        public final Map<String, Set<Class<? extends QI2>>> c;

        /* renamed from: o.Az0$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            public b b;
            public final Set<a> a = new LinkedHashSet();
            public final Map<String, Set<Class<? extends QI2>>> c = new LinkedHashMap();

            public final a a(Class<? extends Fragment> cls, Class<? extends QI2> cls2) {
                C6562gT0.p(cls, "fragmentClass");
                C6562gT0.p(cls2, "violationClass");
                String name = cls.getName();
                C6562gT0.o(name, "fragmentClassString");
                return b(name, cls2);
            }

            public final a b(String str, Class<? extends QI2> cls) {
                C6562gT0.p(str, "fragmentClass");
                C6562gT0.p(cls, "violationClass");
                Set<Class<? extends QI2>> set = this.c.get(str);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(cls);
                this.c.put(str, set);
                return this;
            }

            public final c c() {
                if (this.b == null && !this.a.contains(a.PENALTY_DEATH)) {
                    m();
                }
                return new c(this.a, this.b, this.c);
            }

            public final a d() {
                this.a.add(a.DETECT_FRAGMENT_REUSE);
                return this;
            }

            public final a e() {
                this.a.add(a.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            public final a f() {
                this.a.add(a.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            public final a g() {
                this.a.add(a.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            public final a h() {
                this.a.add(a.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            public final a i() {
                this.a.add(a.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            public final a j() {
                this.a.add(a.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            public final a k() {
                this.a.add(a.PENALTY_DEATH);
                return this;
            }

            public final a l(b bVar) {
                C6562gT0.p(bVar, ServiceSpecificExtraArgs.CastExtraArgs.a);
                this.b = bVar;
                return this;
            }

            public final a m() {
                this.a.add(a.PENALTY_LOG);
                return this;
            }
        }

        /* renamed from: o.Az0$c$b */
        /* loaded from: classes.dex */
        public static final class b {
            public /* synthetic */ b(C9516sY c9516sY) {
                this();
            }

            public b() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends QI2>>> map) {
            C6562gT0.p(set, "flags");
            C6562gT0.p(map, "allowedViolations");
            this.a = set;
            this.b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends QI2>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.c = linkedHashMap;
        }

        public final Set<a> a() {
            return this.a;
        }

        public final b b() {
            return this.b;
        }

        public final Map<String, Set<Class<? extends QI2>>> c() {
            return this.c;
        }
    }

    public static final void f(c cVar, QI2 qi2) {
        C6562gT0.p(cVar, "$policy");
        C6562gT0.p(qi2, "$violation");
        cVar.b().a(qi2);
    }

    public static final void g(String str, QI2 qi2) {
        C6562gT0.p(qi2, "$violation");
        Log.e(b, "Policy violation with PENALTY_DEATH in " + str, qi2);
        throw qi2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void i(Fragment fragment, String str) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(str, "previousFragmentId");
        C9623sz0 c9623sz0 = new C9623sz0(fragment, str);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(c9623sz0);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_FRAGMENT_REUSE) && c2513Az0.v(d, fragment.getClass(), c9623sz0.getClass())) {
            c2513Az0.e(d, c9623sz0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void j(Fragment fragment, ViewGroup viewGroup) {
        C6562gT0.p(fragment, "fragment");
        C2709Cz0 c2709Cz0 = new C2709Cz0(fragment, viewGroup);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(c2709Cz0);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c2513Az0.v(d, fragment.getClass(), c2709Cz0.getClass())) {
            c2513Az0.e(d, c2709Cz0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void k(Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        YC0 yc0 = new YC0(fragment);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(yc0);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c2513Az0.v(d, fragment.getClass(), yc0.getClass())) {
            c2513Az0.e(d, yc0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void l(Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        ZC0 zc0 = new ZC0(fragment);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(zc0);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c2513Az0.v(d, fragment.getClass(), zc0.getClass())) {
            c2513Az0.e(d, zc0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void m(Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        C5030aD0 c5030aD0 = new C5030aD0(fragment);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(c5030aD0);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c2513Az0.v(d, fragment.getClass(), c5030aD0.getClass())) {
            c2513Az0.e(d, c5030aD0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void o(Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        C8903q22 c8903q22 = new C8903q22(fragment);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(c8903q22);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c2513Az0.v(d, fragment.getClass(), c8903q22.getClass())) {
            c2513Az0.e(d, c8903q22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void p(Fragment fragment, Fragment fragment2, int i) {
        C6562gT0.p(fragment, "violatingFragment");
        C6562gT0.p(fragment2, "targetFragment");
        C9152r22 c9152r22 = new C9152r22(fragment, fragment2, i);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(c9152r22);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c2513Az0.v(d, fragment.getClass(), c9152r22.getClass())) {
            c2513Az0.e(d, c9152r22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void q(Fragment fragment, boolean z) {
        C6562gT0.p(fragment, "fragment");
        C9881u22 c9881u22 = new C9881u22(fragment, z);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(c9881u22);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && c2513Az0.v(d, fragment.getClass(), c9881u22.getClass())) {
            c2513Az0.e(d, c9881u22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void r(Fragment fragment, ViewGroup viewGroup) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(viewGroup, C5445bv2.W);
        RN2 rn2 = new RN2(fragment, viewGroup);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(rn2);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c2513Az0.v(d, fragment.getClass(), rn2.getClass())) {
            c2513Az0.e(d, rn2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9511sW0
    public static final void s(Fragment fragment, Fragment fragment2, int i) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(fragment2, "expectedParentFragment");
        SN2 sn2 = new SN2(fragment, fragment2, i);
        C2513Az0 c2513Az0 = a;
        c2513Az0.h(sn2);
        c d = c2513Az0.d(fragment);
        if (d.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c2513Az0.v(d, fragment.getClass(), sn2.getClass())) {
            c2513Az0.e(d, sn2);
        }
    }

    public final c c() {
        return c;
    }

    public final c d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.v0()) {
                FragmentManager O = fragment.O();
                C6562gT0.o(O, "declaringFragment.parentFragmentManager");
                if (O.Q0() != null) {
                    c Q0 = O.Q0();
                    C6562gT0.m(Q0);
                    return Q0;
                }
            }
            fragment = fragment.N();
        }
        return c;
    }

    public final void e(final c cVar, final QI2 qi2) {
        Fragment a2 = qi2.a();
        final String name = a2.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d(b, "Policy violation in " + name, qi2);
        }
        if (cVar.b() != null) {
            t(a2, new Runnable() { // from class: o.yz0
                @Override // java.lang.Runnable
                public final void run() {
                    C2513Az0.f(C2513Az0.c.this, qi2);
                }
            });
        }
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            t(a2, new Runnable() { // from class: o.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    C2513Az0.g(name, qi2);
                }
            });
        }
    }

    public final void h(QI2 qi2) {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + qi2.a().getClass().getName(), qi2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(QI2 qi2) {
        C6562gT0.p(qi2, "violation");
        h(qi2);
        Fragment a2 = qi2.a();
        c d = d(a2);
        if (v(d, a2.getClass(), qi2.getClass())) {
            e(d, qi2);
        }
    }

    public final void t(Fragment fragment, Runnable runnable) {
        if (fragment.v0()) {
            Handler h = fragment.O().K0().h();
            C6562gT0.o(h, "fragment.parentFragmentManager.host.handler");
            if (C6562gT0.g(h.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                h.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public final void u(c cVar) {
        C6562gT0.p(cVar, "<set-?>");
        c = cVar;
    }

    public final boolean v(c cVar, Class<? extends Fragment> cls, Class<? extends QI2> cls2) {
        Set<Class<? extends QI2>> set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!C6562gT0.g(cls2.getSuperclass(), QI2.class) && C10662xF.Y1(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
