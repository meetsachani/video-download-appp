package o;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5921dt2;
import o.C10593wy;

/* renamed from: o.Hz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3210Hz0 extends AbstractC3014Fz0 {

    /* renamed from: o.Hz0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5921dt2.f {
        public final /* synthetic */ Rect a;

        public a(Rect rect) {
            this.a = rect;
        }

        @Override // o.AbstractC5921dt2.f
        public Rect a(AbstractC5921dt2 abstractC5921dt2) {
            return this.a;
        }
    }

    /* renamed from: o.Hz0$c */
    /* loaded from: classes.dex */
    public class c extends C10333vt2 {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            abstractC5921dt2.u0(this);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
            Object obj = this.a;
            if (obj != null) {
                C3210Hz0.this.n(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                C3210Hz0.this.n(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                C3210Hz0.this.n(obj3, this.f, null);
            }
        }
    }

    /* renamed from: o.Hz0$e */
    /* loaded from: classes.dex */
    public class e extends AbstractC5921dt2.f {
        public final /* synthetic */ Rect a;

        public e(Rect rect) {
            this.a = rect;
        }

        @Override // o.AbstractC5921dt2.f
        public Rect a(AbstractC5921dt2 abstractC5921dt2) {
            Rect rect = this.a;
            if (rect != null && !rect.isEmpty()) {
                return this.a;
            }
            return null;
        }
    }

    public static boolean B(AbstractC5921dt2 abstractC5921dt2) {
        if (AbstractC3014Fz0.i(abstractC5921dt2.U()) && AbstractC3014Fz0.i(abstractC5921dt2.V()) && AbstractC3014Fz0.i(abstractC5921dt2.W())) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void x(Runnable runnable, AbstractC5921dt2 abstractC5921dt2, Runnable runnable2) {
        if (runnable == null) {
            abstractC5921dt2.cancel();
            runnable2.run();
            return;
        }
        runnable.run();
    }

    public Object A(ViewGroup viewGroup, Object obj) {
        return C10576wt2.d(viewGroup, (AbstractC5921dt2) obj);
    }

    public boolean C() {
        return true;
    }

    public boolean D(Object obj) {
        boolean d0 = ((AbstractC5921dt2) obj).d0();
        if (!d0) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return d0;
    }

    public void E(Object obj, float f) {
        InterfaceC2594Bt2 interfaceC2594Bt2 = (InterfaceC2594Bt2) obj;
        if (interfaceC2594Bt2.isReady()) {
            long e2 = f * ((float) interfaceC2594Bt2.e());
            if (e2 == 0) {
                e2 = 1;
            }
            if (e2 == interfaceC2594Bt2.e()) {
                e2 = interfaceC2594Bt2.e() - 1;
            }
            interfaceC2594Bt2.n(e2);
        }
    }

    public void F(Fragment fragment, Object obj, C10593wy c10593wy, final Runnable runnable, final Runnable runnable2) {
        final AbstractC5921dt2 abstractC5921dt2 = (AbstractC5921dt2) obj;
        c10593wy.d(new C10593wy.a() { // from class: o.Gz0
            @Override // o.C10593wy.a
            public final void onCancel() {
                C3210Hz0.x(runnable, abstractC5921dt2, runnable2);
            }
        });
        abstractC5921dt2.d(new d(runnable2));
    }

    @Override // o.AbstractC3014Fz0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC5921dt2) obj).f(view);
        }
    }

    @Override // o.AbstractC3014Fz0
    public void b(Object obj, ArrayList<View> arrayList) {
        AbstractC5921dt2 abstractC5921dt2 = (AbstractC5921dt2) obj;
        if (abstractC5921dt2 != null) {
            int i = 0;
            if (abstractC5921dt2 instanceof C2692Ct2) {
                C2692Ct2 c2692Ct2 = (C2692Ct2) abstractC5921dt2;
                int c1 = c2692Ct2.c1();
                while (i < c1) {
                    b(c2692Ct2.b1(i), arrayList);
                    i++;
                }
            } else if (!B(abstractC5921dt2) && AbstractC3014Fz0.i(abstractC5921dt2.X())) {
                int size = arrayList.size();
                while (i < size) {
                    abstractC5921dt2.f(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // o.AbstractC3014Fz0
    public void c(ViewGroup viewGroup, Object obj) {
        C10576wt2.b(viewGroup, (AbstractC5921dt2) obj);
    }

    @Override // o.AbstractC3014Fz0
    public boolean e(Object obj) {
        return obj instanceof AbstractC5921dt2;
    }

    @Override // o.AbstractC3014Fz0
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC5921dt2) obj).clone();
        }
        return null;
    }

    @Override // o.AbstractC3014Fz0
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC5921dt2 abstractC5921dt2 = (AbstractC5921dt2) obj;
        AbstractC5921dt2 abstractC5921dt22 = (AbstractC5921dt2) obj2;
        AbstractC5921dt2 abstractC5921dt23 = (AbstractC5921dt2) obj3;
        if (abstractC5921dt2 != null && abstractC5921dt22 != null) {
            abstractC5921dt2 = new C2692Ct2().X0(abstractC5921dt2).X0(abstractC5921dt22).m1(1);
        } else if (abstractC5921dt2 == null) {
            if (abstractC5921dt22 != null) {
                abstractC5921dt2 = abstractC5921dt22;
            } else {
                abstractC5921dt2 = null;
            }
        }
        if (abstractC5921dt23 != null) {
            C2692Ct2 c2692Ct2 = new C2692Ct2();
            if (abstractC5921dt2 != null) {
                c2692Ct2.X0(abstractC5921dt2);
            }
            c2692Ct2.X0(abstractC5921dt23);
            return c2692Ct2;
        }
        return abstractC5921dt2;
    }

    @Override // o.AbstractC3014Fz0
    public Object k(Object obj, Object obj2, Object obj3) {
        C2692Ct2 c2692Ct2 = new C2692Ct2();
        if (obj != null) {
            c2692Ct2.X0((AbstractC5921dt2) obj);
        }
        if (obj2 != null) {
            c2692Ct2.X0((AbstractC5921dt2) obj2);
        }
        if (obj3 != null) {
            c2692Ct2.X0((AbstractC5921dt2) obj3);
        }
        return c2692Ct2;
    }

    @Override // o.AbstractC3014Fz0
    public void m(Object obj, View view) {
        if (obj != null) {
            ((AbstractC5921dt2) obj).w0(view);
        }
    }

    @Override // o.AbstractC3014Fz0
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        AbstractC5921dt2 abstractC5921dt2 = (AbstractC5921dt2) obj;
        int i = 0;
        if (abstractC5921dt2 instanceof C2692Ct2) {
            C2692Ct2 c2692Ct2 = (C2692Ct2) abstractC5921dt2;
            int c1 = c2692Ct2.c1();
            while (i < c1) {
                n(c2692Ct2.b1(i), arrayList, arrayList2);
                i++;
            }
        } else if (!B(abstractC5921dt2)) {
            List<View> X = abstractC5921dt2.X();
            if (X.size() == arrayList.size() && X.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    abstractC5921dt2.f(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    abstractC5921dt2.w0(arrayList.get(size2));
                }
            }
        }
    }

    @Override // o.AbstractC3014Fz0
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC5921dt2) obj).d(new b(view, arrayList));
    }

    @Override // o.AbstractC3014Fz0
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC5921dt2) obj).d(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // o.AbstractC3014Fz0
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC5921dt2) obj).J0(new e(rect));
        }
    }

    @Override // o.AbstractC3014Fz0
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC5921dt2) obj).J0(new a(rect));
        }
    }

    @Override // o.AbstractC3014Fz0
    public void s(Fragment fragment, Object obj, C10593wy c10593wy, Runnable runnable) {
        F(fragment, obj, c10593wy, null, runnable);
    }

    @Override // o.AbstractC3014Fz0
    public void u(Object obj, View view, ArrayList<View> arrayList) {
        C2692Ct2 c2692Ct2 = (C2692Ct2) obj;
        List<View> X = c2692Ct2.X();
        X.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC3014Fz0.d(X, arrayList.get(i));
        }
        X.add(view);
        arrayList.add(view);
        b(c2692Ct2, arrayList);
    }

    @Override // o.AbstractC3014Fz0
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2692Ct2 c2692Ct2 = (C2692Ct2) obj;
        if (c2692Ct2 != null) {
            c2692Ct2.X().clear();
            c2692Ct2.X().addAll(arrayList2);
            n(c2692Ct2, arrayList, arrayList2);
        }
    }

    @Override // o.AbstractC3014Fz0
    public Object w(Object obj) {
        if (obj == null) {
            return null;
        }
        C2692Ct2 c2692Ct2 = new C2692Ct2();
        c2692Ct2.X0((AbstractC5921dt2) obj);
        return c2692Ct2;
    }

    public void y(Object obj) {
        ((InterfaceC2594Bt2) obj).b();
    }

    public void z(Object obj, Runnable runnable) {
        ((InterfaceC2594Bt2) obj).o(runnable);
    }

    /* renamed from: o.Hz0$b */
    /* loaded from: classes.dex */
    public class b implements AbstractC5921dt2.j {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            abstractC5921dt2.u0(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
            abstractC5921dt2.u0(this);
            abstractC5921dt2.d(this);
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
        }
    }

    /* renamed from: o.Hz0$d */
    /* loaded from: classes.dex */
    public class d implements AbstractC5921dt2.j {
        public final /* synthetic */ Runnable a;

        public d(Runnable runnable) {
            this.a = runnable;
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            this.a.run();
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
        }
    }
}
