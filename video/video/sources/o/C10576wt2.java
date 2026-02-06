package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.wt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10576wt2 {
    public static final String c = "TransitionManager";
    public static AbstractC5921dt2 d = new C6360fi();
    public static ThreadLocal<WeakReference<C2531Be<ViewGroup, ArrayList<AbstractC5921dt2>>>> e = new ThreadLocal<>();
    public static ArrayList<ViewGroup> f = new ArrayList<>();
    public C2531Be<C5354bY1, AbstractC5921dt2> a = new C2531Be<>();
    public C2531Be<C5354bY1, C2531Be<C5354bY1, AbstractC5921dt2>> b = new C2531Be<>();

    public static void a(ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(ViewGroup viewGroup, AbstractC5921dt2 abstractC5921dt2) {
        if (!f.contains(viewGroup) && viewGroup.isLaidOut()) {
            f.add(viewGroup);
            if (abstractC5921dt2 == null) {
                abstractC5921dt2 = d;
            }
            AbstractC5921dt2 clone = abstractC5921dt2.clone();
            l(viewGroup, clone);
            C5354bY1.g(viewGroup, null);
            k(viewGroup, clone);
        }
    }

    public static void c(C5354bY1 c5354bY1, AbstractC5921dt2 abstractC5921dt2) {
        ViewGroup e2 = c5354bY1.e();
        if (!f.contains(e2)) {
            C5354bY1 c2 = C5354bY1.c(e2);
            if (abstractC5921dt2 == null) {
                if (c2 != null) {
                    c2.b();
                }
                c5354bY1.a();
                return;
            }
            f.add(e2);
            AbstractC5921dt2 clone = abstractC5921dt2.clone();
            if (c2 != null && c2.f()) {
                clone.D0(true);
            }
            l(e2, clone);
            c5354bY1.a();
            k(e2, clone);
        }
    }

    public static InterfaceC2594Bt2 d(ViewGroup viewGroup, AbstractC5921dt2 abstractC5921dt2) {
        if (f.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (abstractC5921dt2.d0()) {
            f.add(viewGroup);
            AbstractC5921dt2 clone = abstractC5921dt2.clone();
            C2692Ct2 c2692Ct2 = new C2692Ct2();
            c2692Ct2.X0(clone);
            l(viewGroup, c2692Ct2);
            C5354bY1.g(viewGroup, null);
            k(viewGroup, c2692Ct2);
            viewGroup.invalidate();
            return c2692Ct2.v();
        }
        throw new IllegalArgumentException("The Transition must support seeking.");
    }

    public static InterfaceC2594Bt2 e(C5354bY1 c5354bY1, AbstractC5921dt2 abstractC5921dt2) {
        ViewGroup e2 = c5354bY1.e();
        if (abstractC5921dt2.d0()) {
            if (f.contains(e2)) {
                return null;
            }
            C5354bY1 c2 = C5354bY1.c(e2);
            if (e2.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
                f.add(e2);
                AbstractC5921dt2 clone = abstractC5921dt2.clone();
                C2692Ct2 c2692Ct2 = new C2692Ct2();
                c2692Ct2.X0(clone);
                if (c2 != null && c2.f()) {
                    c2692Ct2.D0(true);
                }
                l(e2, c2692Ct2);
                c5354bY1.a();
                k(e2, c2692Ct2);
                return c2692Ct2.v();
            }
            if (c2 != null) {
                c2.b();
            }
            c5354bY1.a();
            return null;
        }
        throw new IllegalArgumentException("The Transition must support seeking.");
    }

    public static void f(ViewGroup viewGroup) {
        f.remove(viewGroup);
        ArrayList<AbstractC5921dt2> arrayList = g().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((AbstractC5921dt2) arrayList2.get(size)).I(viewGroup);
            }
        }
    }

    public static C2531Be<ViewGroup, ArrayList<AbstractC5921dt2>> g() {
        C2531Be<ViewGroup, ArrayList<AbstractC5921dt2>> c2531Be;
        WeakReference<C2531Be<ViewGroup, ArrayList<AbstractC5921dt2>>> weakReference = e.get();
        if (weakReference != null && (c2531Be = weakReference.get()) != null) {
            return c2531Be;
        }
        C2531Be<ViewGroup, ArrayList<AbstractC5921dt2>> c2531Be2 = new C2531Be<>();
        e.set(new WeakReference<>(c2531Be2));
        return c2531Be2;
    }

    public static void i(C5354bY1 c5354bY1) {
        c(c5354bY1, d);
    }

    public static void j(C5354bY1 c5354bY1, AbstractC5921dt2 abstractC5921dt2) {
        c(c5354bY1, abstractC5921dt2);
    }

    public static void k(ViewGroup viewGroup, AbstractC5921dt2 abstractC5921dt2) {
        if (abstractC5921dt2 != null && viewGroup != null) {
            a aVar = new a(abstractC5921dt2, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    public static void l(ViewGroup viewGroup, AbstractC5921dt2 abstractC5921dt2) {
        ArrayList<AbstractC5921dt2> arrayList = g().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC5921dt2> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().r0(viewGroup);
            }
        }
        if (abstractC5921dt2 != null) {
            abstractC5921dt2.q(viewGroup, true);
        }
        C5354bY1 c2 = C5354bY1.c(viewGroup);
        if (c2 != null) {
            c2.b();
        }
    }

    public final AbstractC5921dt2 h(C5354bY1 c5354bY1) {
        C2531Be<C5354bY1, AbstractC5921dt2> c2531Be;
        AbstractC5921dt2 abstractC5921dt2;
        C5354bY1 c2 = C5354bY1.c(c5354bY1.e());
        if (c2 != null && (c2531Be = this.b.get(c5354bY1)) != null && (abstractC5921dt2 = c2531Be.get(c2)) != null) {
            return abstractC5921dt2;
        }
        AbstractC5921dt2 abstractC5921dt22 = this.a.get(c5354bY1);
        if (abstractC5921dt22 != null) {
            return abstractC5921dt22;
        }
        return d;
    }

    public void m(C5354bY1 c5354bY1, C5354bY1 c5354bY12, AbstractC5921dt2 abstractC5921dt2) {
        C2531Be<C5354bY1, AbstractC5921dt2> c2531Be = this.b.get(c5354bY12);
        if (c2531Be == null) {
            c2531Be = new C2531Be<>();
            this.b.put(c5354bY12, c2531Be);
        }
        c2531Be.put(c5354bY1, abstractC5921dt2);
    }

    public void n(C5354bY1 c5354bY1, AbstractC5921dt2 abstractC5921dt2) {
        this.a.put(c5354bY1, abstractC5921dt2);
    }

    public void o(C5354bY1 c5354bY1) {
        c(c5354bY1, h(c5354bY1));
    }

    /* renamed from: o.wt2$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public AbstractC5921dt2 X;
        public ViewGroup Y;

        /* renamed from: o.wt2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0353a extends C10333vt2 {
            public final /* synthetic */ C2531Be a;

            public C0353a(C2531Be c2531Be) {
                this.a = c2531Be;
            }

            @Override // o.C10333vt2, o.AbstractC5921dt2.j
            public void g(AbstractC5921dt2 abstractC5921dt2) {
                ((ArrayList) this.a.get(a.this.Y)).remove(abstractC5921dt2);
                abstractC5921dt2.u0(this);
            }
        }

        public a(AbstractC5921dt2 abstractC5921dt2, ViewGroup viewGroup) {
            this.X = abstractC5921dt2;
            this.Y = viewGroup;
        }

        public final void a() {
            this.Y.getViewTreeObserver().removeOnPreDrawListener(this);
            this.Y.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!C10576wt2.f.remove(this.Y)) {
                return true;
            }
            C2531Be<ViewGroup, ArrayList<AbstractC5921dt2>> g = C10576wt2.g();
            ArrayList<AbstractC5921dt2> arrayList = g.get(this.Y);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                g.put(this.Y, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.X);
            this.X.d(new C0353a(g));
            this.X.q(this.Y, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC5921dt2) it.next()).z0(this.Y);
                }
            }
            this.X.s0(this.Y);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            C10576wt2.f.remove(this.Y);
            ArrayList<AbstractC5921dt2> arrayList = C10576wt2.g().get(this.Y);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC5921dt2> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().z0(this.Y);
                }
            }
            this.X.r(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
