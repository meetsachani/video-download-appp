package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import o.B8;
import o.C10593wy;
import o.C10662xF;
import o.C5445bv2;
import o.C6516gH2;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.C9698tH2;
import o.InterfaceC3313Ja2;
import o.InterfaceC9511sW0;
import o.XL1;

/* loaded from: classes.dex */
public abstract class k {
    public static final a f = new a(null);
    public final ViewGroup a;
    public final List<c> b;
    public final List<c> c;
    public boolean d;
    public boolean e;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final k a(ViewGroup viewGroup, FragmentManager fragmentManager) {
            C6562gT0.p(viewGroup, C5445bv2.W);
            C6562gT0.p(fragmentManager, "fragmentManager");
            InterfaceC3313Ja2 P0 = fragmentManager.P0();
            C6562gT0.o(P0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, P0);
        }

        @InterfaceC9511sW0
        public final k b(ViewGroup viewGroup, InterfaceC3313Ja2 interfaceC3313Ja2) {
            C6562gT0.p(viewGroup, C5445bv2.W);
            C6562gT0.p(interfaceC3313Ja2, "factory");
            int i = XL1.c.b;
            Object tag = viewGroup.getTag(i);
            if (tag instanceof k) {
                return (k) tag;
            }
            k a = interfaceC3313Ja2.a(viewGroup);
            C6562gT0.o(a, "factory.createController(container)");
            viewGroup.setTag(i, a);
            return a;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c {
        public final h h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(c.b bVar, c.a aVar, h hVar, C10593wy c10593wy) {
            super(bVar, aVar, r0, c10593wy);
            C6562gT0.p(bVar, "finalState");
            C6562gT0.p(aVar, "lifecycleImpact");
            C6562gT0.p(hVar, "fragmentStateManager");
            C6562gT0.p(c10593wy, "cancellationSignal");
            Fragment k = hVar.k();
            C6562gT0.o(k, "fragmentStateManager.fragment");
            this.h = hVar;
        }

        @Override // androidx.fragment.app.k.c
        public void e() {
            super.e();
            this.h.m();
        }

        @Override // androidx.fragment.app.k.c
        public void n() {
            if (i() == c.a.ADDING) {
                Fragment k = this.h.k();
                C6562gT0.o(k, "fragmentStateManager.fragment");
                View findFocus = k.D1.findFocus();
                if (findFocus != null) {
                    k.k2(findFocus);
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View Y1 = h().Y1();
                C6562gT0.o(Y1, "this.fragment.requireView()");
                if (Y1.getParent() == null) {
                    this.h.b();
                    Y1.setAlpha(0.0f);
                }
                if (Y1.getAlpha() == 0.0f && Y1.getVisibility() == 0) {
                    Y1.setVisibility(4);
                }
                Y1.setAlpha(k.V());
            } else if (i() == c.a.REMOVING) {
                Fragment k2 = this.h.k();
                C6562gT0.o(k2, "fragmentStateManager.fragment");
                View Y12 = k2.Y1();
                C6562gT0.o(Y12, "fragment.requireView()");
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + Y12.findFocus() + " on view " + Y12 + " for Fragment " + k2);
                }
                Y12.clearFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public b a;
        public a b;
        public final Fragment c;
        public final List<Runnable> d;
        public final Set<C10593wy> e;
        public boolean f;
        public boolean g;

        /* loaded from: classes.dex */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            public static final a X = new a(null);

            /* loaded from: classes.dex */
            public static final class a {
                public /* synthetic */ a(C9516sY c9516sY) {
                    this();
                }

                public final b a(View view) {
                    C6562gT0.p(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return b.INVISIBLE;
                    }
                    return b(view.getVisibility());
                }

                @InterfaceC9511sW0
                public final b b(int i) {
                    if (i != 0) {
                        if (i != 4) {
                            if (i == 8) {
                                return b.GONE;
                            }
                            throw new IllegalArgumentException("Unknown visibility " + i);
                        }
                        return b.INVISIBLE;
                    }
                    return b.VISIBLE;
                }

                public a() {
                }
            }

            /* renamed from: androidx.fragment.app.k$c$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0025b {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            @InterfaceC9511sW0
            public static final b h(int i) {
                return X.b(i);
            }

            public final void g(View view) {
                ViewGroup viewGroup;
                C6562gT0.p(view, C9698tH2.A);
                int i = C0025b.a[ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (FragmentManager.X0(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.X0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        /* renamed from: androidx.fragment.app.k$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0026c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public c(b bVar, a aVar, Fragment fragment, C10593wy c10593wy) {
            C6562gT0.p(bVar, "finalState");
            C6562gT0.p(aVar, "lifecycleImpact");
            C6562gT0.p(fragment, "fragment");
            C6562gT0.p(c10593wy, "cancellationSignal");
            this.a = bVar;
            this.b = aVar;
            this.c = fragment;
            this.d = new ArrayList();
            this.e = new LinkedHashSet();
            c10593wy.d(new C10593wy.a() { // from class: o.Ia2
                @Override // o.C10593wy.a
                public final void onCancel() {
                    k.c.b(k.c.this);
                }
            });
        }

        public static final void b(c cVar) {
            C6562gT0.p(cVar, "this$0");
            cVar.d();
        }

        public final void c(Runnable runnable) {
            C6562gT0.p(runnable, ServiceSpecificExtraArgs.CastExtraArgs.a);
            this.d.add(runnable);
        }

        public final void d() {
            if (!this.f) {
                this.f = true;
                if (this.e.isEmpty()) {
                    e();
                    return;
                }
                for (C10593wy c10593wy : C10662xF.c6(this.e)) {
                    c10593wy.a();
                }
            }
        }

        public void e() {
            if (!this.g) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.g = true;
                for (Runnable runnable : this.d) {
                    runnable.run();
                }
            }
        }

        public final void f(C10593wy c10593wy) {
            C6562gT0.p(c10593wy, "signal");
            if (this.e.remove(c10593wy) && this.e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.a;
        }

        public final Fragment h() {
            return this.c;
        }

        public final a i() {
            return this.b;
        }

        public final boolean j() {
            return this.f;
        }

        public final boolean k() {
            return this.g;
        }

        public final void l(C10593wy c10593wy) {
            C6562gT0.p(c10593wy, "signal");
            n();
            this.e.add(c10593wy);
        }

        public final void m(b bVar, a aVar) {
            C6562gT0.p(bVar, "finalState");
            C6562gT0.p(aVar, "lifecycleImpact");
            int i = C0026c.a[aVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.a != b.REMOVED) {
                        if (FragmentManager.X0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + B8.d + bVar + '.');
                        }
                        this.a = bVar;
                        return;
                    }
                    return;
                }
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                }
                this.a = b.REMOVED;
                this.b = a.REMOVING;
            } else if (this.a == b.REMOVED) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = b.VISIBLE;
                this.b = a.ADDING;
            }
        }

        public void n() {
        }

        public final void o(b bVar) {
            C6562gT0.p(bVar, "<set-?>");
            this.a = bVar;
        }

        public final void p(a aVar) {
            C6562gT0.p(aVar, "<set-?>");
            this.b = aVar;
        }

        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + '}';
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public k(ViewGroup viewGroup) {
        C6562gT0.p(viewGroup, C5445bv2.W);
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final void d(k kVar, b bVar) {
        C6562gT0.p(kVar, "this$0");
        C6562gT0.p(bVar, "$operation");
        if (kVar.b.contains(bVar)) {
            c.b g = bVar.g();
            View view = bVar.h().D1;
            C6562gT0.o(view, "operation.fragment.mView");
            g.g(view);
        }
    }

    public static final void e(k kVar, b bVar) {
        C6562gT0.p(kVar, "this$0");
        C6562gT0.p(bVar, "$operation");
        kVar.b.remove(bVar);
        kVar.c.remove(bVar);
    }

    @InterfaceC9511sW0
    public static final k r(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f.a(viewGroup, fragmentManager);
    }

    @InterfaceC9511sW0
    public static final k s(ViewGroup viewGroup, InterfaceC3313Ja2 interfaceC3313Ja2) {
        return f.b(viewGroup, interfaceC3313Ja2);
    }

    public final void c(c.b bVar, c.a aVar, h hVar) {
        synchronized (this.b) {
            C10593wy c10593wy = new C10593wy();
            Fragment k = hVar.k();
            C6562gT0.o(k, "fragmentStateManager.fragment");
            c l = l(k);
            if (l != null) {
                l.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, hVar, c10593wy);
            this.b.add(bVar2);
            bVar2.c(new Runnable() { // from class: o.Ga2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.k.d(androidx.fragment.app.k.this, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: o.Ha2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.k.e(androidx.fragment.app.k.this, bVar2);
                }
            });
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    public final void f(c.b bVar, h hVar) {
        C6562gT0.p(bVar, "finalState");
        C6562gT0.p(hVar, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + hVar.k());
        }
        c(bVar, c.a.ADDING, hVar);
    }

    public final void g(h hVar) {
        C6562gT0.p(hVar, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + hVar.k());
        }
        c(c.b.GONE, c.a.NONE, hVar);
    }

    public final void h(h hVar) {
        C6562gT0.p(hVar, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + hVar.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, hVar);
    }

    public final void i(h hVar) {
        C6562gT0.p(hVar, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + hVar.k());
        }
        c(c.b.VISIBLE, c.a.NONE, hVar);
    }

    public abstract void j(List<c> list, boolean z);

    public final void k() {
        if (this.e) {
            return;
        }
        if (!C6516gH2.T0(this.a)) {
            n();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    List<c> b6 = C10662xF.b6(this.c);
                    this.c.clear();
                    for (c cVar : b6) {
                        if (FragmentManager.X0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.c.add(cVar);
                        }
                    }
                    u();
                    List<c> b62 = C10662xF.b6(this.b);
                    this.b.clear();
                    this.c.addAll(b62);
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    for (c cVar2 : b62) {
                        cVar2.n();
                    }
                    j(b62, this.d);
                    this.d = false;
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c l(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                c cVar = (c) obj;
                if (C6562gT0.g(cVar.h(), fragment) && !cVar.j()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (c) obj;
    }

    public final c m(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                c cVar = (c) obj;
                if (C6562gT0.g(cVar.h(), fragment) && !cVar.j()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (c) obj;
    }

    public final void n() {
        String str;
        String str2;
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean T0 = C6516gH2.T0(this.a);
        synchronized (this.b) {
            try {
                u();
                for (c cVar : this.b) {
                    cVar.n();
                }
                for (c cVar2 : C10662xF.b6(this.c)) {
                    if (FragmentManager.X0(2)) {
                        if (T0) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + cVar2);
                    }
                    cVar2.d();
                }
                for (c cVar3 : C10662xF.b6(this.b)) {
                    if (FragmentManager.X0(2)) {
                        if (T0) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + cVar3);
                    }
                    cVar3.d();
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.e) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            k();
        }
    }

    public final c.a p(h hVar) {
        c.a aVar;
        int i;
        C6562gT0.p(hVar, "fragmentStateManager");
        Fragment k = hVar.k();
        C6562gT0.o(k, "fragmentStateManager.fragment");
        c l = l(k);
        c.a aVar2 = null;
        if (l != null) {
            aVar = l.i();
        } else {
            aVar = null;
        }
        c m = m(k);
        if (m != null) {
            aVar2 = m.i();
        }
        if (aVar == null) {
            i = -1;
        } else {
            i = d.a[aVar.ordinal()];
        }
        if (i != -1 && i != 1) {
            return aVar;
        }
        return aVar2;
    }

    public final ViewGroup q() {
        return this.a;
    }

    public final void t() {
        Fragment fragment;
        c cVar;
        boolean z;
        synchronized (this.b) {
            try {
                u();
                List<c> list = this.b;
                ListIterator<c> listIterator = list.listIterator(list.size());
                while (true) {
                    fragment = null;
                    if (listIterator.hasPrevious()) {
                        cVar = listIterator.previous();
                        c cVar2 = cVar;
                        c.b.a aVar = c.b.X;
                        View view = cVar2.h().D1;
                        C6562gT0.o(view, "operation.fragment.mView");
                        c.b a2 = aVar.a(view);
                        c.b g = cVar2.g();
                        c.b bVar = c.b.VISIBLE;
                        if (g == bVar && a2 != bVar) {
                            break;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                c cVar3 = cVar;
                if (cVar3 != null) {
                    fragment = cVar3.h();
                }
                if (fragment != null) {
                    z = fragment.B0();
                } else {
                    z = false;
                }
                this.e = z;
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        for (c cVar : this.b) {
            if (cVar.i() == c.a.ADDING) {
                View Y1 = cVar.h().Y1();
                C6562gT0.o(Y1, "fragment.requireView()");
                cVar.m(c.b.X.b(Y1.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void v(boolean z) {
        this.d = z;
    }
}
