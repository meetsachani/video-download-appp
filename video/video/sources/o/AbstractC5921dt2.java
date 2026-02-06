package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import o.AbstractC5921dt2;
import o.D80;

/* renamed from: o.dt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5921dt2 implements Cloneable {
    public static final String H1 = "Transition";
    public static final boolean J1 = false;
    public static final int K1 = 1;
    public static final int L1 = 1;
    public static final int M1 = 2;
    public static final int N1 = 3;
    public static final int O1 = 4;
    public static final int P1 = 4;
    public static final String Q1 = "instance";
    public static final String R1 = "name";
    public static final String S1 = "id";
    public static final String T1 = "itemId";
    public AbstractC11305zt2 A1;
    public f B1;
    public C2531Be<String, String> C1;
    public long E1;
    public i F1;
    public long G1;
    public ArrayList<C3291It2> o1;
    public ArrayList<C3291It2> p1;
    public j[] q1;
    public static final Animator[] I1 = new Animator[0];
    public static final int[] U1 = {2, 1, 3, 4};
    public static final AbstractC9139qz1 V1 = new c();
    public static ThreadLocal<C2531Be<Animator, d>> W1 = new ThreadLocal<>();
    public String X = getClass().getName();
    public long Y = -1;
    public long Z = -1;
    public TimeInterpolator Y0 = null;
    public ArrayList<Integer> Z0 = new ArrayList<>();
    public ArrayList<View> a1 = new ArrayList<>();
    public ArrayList<String> b1 = null;
    public ArrayList<Class<?>> c1 = null;
    public ArrayList<Integer> d1 = null;
    public ArrayList<View> e1 = null;
    public ArrayList<Class<?>> f1 = null;
    public ArrayList<String> g1 = null;
    public ArrayList<Integer> h1 = null;
    public ArrayList<View> i1 = null;
    public ArrayList<Class<?>> j1 = null;
    public C3389Jt2 k1 = new C3389Jt2();
    public C3389Jt2 l1 = new C3389Jt2();
    public C2692Ct2 m1 = null;
    public int[] n1 = U1;
    public boolean r1 = false;
    public ArrayList<Animator> s1 = new ArrayList<>();
    public Animator[] t1 = I1;
    public int u1 = 0;
    public boolean v1 = false;
    public boolean w1 = false;
    public AbstractC5921dt2 x1 = null;
    public ArrayList<j> y1 = null;
    public ArrayList<Animator> z1 = new ArrayList<>();
    public AbstractC9139qz1 D1 = V1;

    /* renamed from: o.dt2$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ C2531Be a;

        public a(C2531Be c2531Be) {
            this.a = c2531Be;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            AbstractC5921dt2.this.s1.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC5921dt2.this.s1.add(animator);
        }
    }

    /* renamed from: o.dt2$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5921dt2.this.w();
            animator.removeListener(this);
        }
    }

    /* renamed from: o.dt2$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC9139qz1 {
        @Override // o.AbstractC9139qz1
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: o.dt2$d */
    /* loaded from: classes.dex */
    public static class d {
        public View a;
        public String b;
        public C3291It2 c;
        public WindowId d;
        public AbstractC5921dt2 e;
        public Animator f;

        public d(View view, String str, AbstractC5921dt2 abstractC5921dt2, WindowId windowId, C3291It2 c3291It2, Animator animator) {
            this.a = view;
            this.b = str;
            this.c = c3291It2;
            this.d = windowId;
            this.e = abstractC5921dt2;
            this.f = animator;
        }
    }

    /* renamed from: o.dt2$e */
    /* loaded from: classes.dex */
    public static class e {
        public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> b(ArrayList<T> arrayList, T t) {
            if (arrayList != null) {
                arrayList.remove(t);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    /* renamed from: o.dt2$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract Rect a(AbstractC5921dt2 abstractC5921dt2);
    }

    /* renamed from: o.dt2$g */
    /* loaded from: classes.dex */
    public static class g {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j) {
            C6164et2.a((AnimatorSet) animator, j);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.dt2$h */
    /* loaded from: classes.dex */
    public @interface h {
    }

    /* renamed from: o.dt2$i */
    /* loaded from: classes.dex */
    public class i extends C10333vt2 implements InterfaceC2594Bt2, D80.r {
        public boolean d;
        public boolean e;
        public C5850db2 f;
        public Runnable i;
        public long a = -1;
        public ArrayList<InterfaceC10929yL<InterfaceC2594Bt2>> b = null;
        public ArrayList<InterfaceC10929yL<InterfaceC2594Bt2>> c = null;
        public InterfaceC10929yL<InterfaceC2594Bt2>[] g = null;
        public final PE2 h = new PE2();

        public i() {
        }

        public static /* synthetic */ void s(i iVar, D80 d80, boolean z, float f, float f2) {
            if (!z) {
                if (f < 1.0f) {
                    long e = iVar.e();
                    AbstractC5921dt2 b1 = ((C2692Ct2) AbstractC5921dt2.this).b1(0);
                    AbstractC5921dt2 abstractC5921dt2 = b1.x1;
                    b1.x1 = null;
                    AbstractC5921dt2.this.F0(-1L, iVar.a);
                    AbstractC5921dt2.this.F0(e, -1L);
                    iVar.a = e;
                    Runnable runnable = iVar.i;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AbstractC5921dt2.this.z1.clear();
                    if (abstractC5921dt2 != null) {
                        abstractC5921dt2.p0(k.b, true);
                        return;
                    }
                    return;
                }
                AbstractC5921dt2.this.p0(k.b, false);
                return;
            }
            iVar.getClass();
        }

        @Override // o.InterfaceC2594Bt2
        public long a() {
            return Math.min(e(), Math.max(0L, this.a));
        }

        @Override // o.InterfaceC2594Bt2
        public void b() {
            u();
            this.f.C((float) (e() + 1));
        }

        @Override // o.InterfaceC2594Bt2
        public void c(InterfaceC10929yL<InterfaceC2594Bt2> interfaceC10929yL) {
            ArrayList<InterfaceC10929yL<InterfaceC2594Bt2>> arrayList = this.b;
            if (arrayList != null) {
                arrayList.remove(interfaceC10929yL);
                if (this.b.isEmpty()) {
                    this.b = null;
                }
            }
        }

        @Override // o.InterfaceC2594Bt2
        public long e() {
            return AbstractC5921dt2.this.Y();
        }

        @Override // o.InterfaceC2594Bt2
        public void f(InterfaceC10929yL<InterfaceC2594Bt2> interfaceC10929yL) {
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            this.c.add(interfaceC10929yL);
        }

        @Override // o.InterfaceC2594Bt2
        public float getCurrentFraction() {
            return ((float) a()) / ((float) e());
        }

        @Override // o.InterfaceC2594Bt2
        public void i(InterfaceC10929yL<InterfaceC2594Bt2> interfaceC10929yL) {
            if (isReady()) {
                interfaceC10929yL.accept(this);
                return;
            }
            if (this.b == null) {
                this.b = new ArrayList<>();
            }
            this.b.add(interfaceC10929yL);
        }

        @Override // o.InterfaceC2594Bt2
        public boolean isReady() {
            return this.d;
        }

        @Override // o.InterfaceC2594Bt2
        public void m(float f) {
            if (this.f == null) {
                n(f * ((float) e()));
                return;
            }
            throw new IllegalStateException("setCurrentFraction() called after animation has been started");
        }

        @Override // o.InterfaceC2594Bt2
        public void n(long j) {
            if (this.f == null) {
                if (j != this.a && isReady()) {
                    if (!this.e) {
                        if (j == 0 && this.a > 0) {
                            j = -1;
                        } else {
                            long e = e();
                            if (j == e && this.a < e) {
                                j = 1 + e;
                            }
                        }
                        long j2 = this.a;
                        if (j != j2) {
                            AbstractC5921dt2.this.F0(j, j2);
                            this.a = j;
                        }
                    }
                    t();
                    this.h.a(AnimationUtils.currentAnimationTimeMillis(), (float) j);
                    return;
                }
                return;
            }
            throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
        }

        @Override // o.InterfaceC2594Bt2
        public void o(Runnable runnable) {
            this.i = runnable;
            u();
            this.f.C(0.0f);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
            this.e = true;
        }

        @Override // o.D80.r
        public void q(D80 d80, float f, float f2) {
            long max = Math.max(-1L, Math.min(e() + 1, Math.round(f)));
            AbstractC5921dt2.this.F0(max, this.a);
            this.a = max;
            t();
        }

        @Override // o.InterfaceC2594Bt2
        public void r(InterfaceC10929yL<InterfaceC2594Bt2> interfaceC10929yL) {
            ArrayList<InterfaceC10929yL<InterfaceC2594Bt2>> arrayList = this.c;
            if (arrayList != null) {
                arrayList.remove(interfaceC10929yL);
            }
        }

        public final void t() {
            ArrayList<InterfaceC10929yL<InterfaceC2594Bt2>> arrayList = this.c;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.c.size();
                if (this.g == null) {
                    this.g = new InterfaceC10929yL[size];
                }
                InterfaceC10929yL<InterfaceC2594Bt2>[] interfaceC10929yLArr = (InterfaceC10929yL[]) this.c.toArray(this.g);
                this.g = null;
                for (int i = 0; i < size; i++) {
                    interfaceC10929yLArr[i].accept(this);
                    interfaceC10929yLArr[i] = null;
                }
                this.g = interfaceC10929yLArr;
            }
        }

        public final void u() {
            if (this.f != null) {
                return;
            }
            this.h.a(AnimationUtils.currentAnimationTimeMillis(), (float) this.a);
            this.f = new C5850db2(new C3100Gv0());
            C6092eb2 c6092eb2 = new C6092eb2();
            c6092eb2.g(1.0f);
            c6092eb2.i(200.0f);
            this.f.G(c6092eb2);
            this.f.w((float) this.a);
            this.f.c(this);
            this.f.x(this.h.b());
            this.f.r((float) (e() + 1));
            this.f.s(-1.0f);
            this.f.t(4.0f);
            this.f.b(new D80.q() { // from class: o.ft2
                @Override // o.D80.q
                public final void a(D80 d80, boolean z, float f, float f2) {
                    AbstractC5921dt2.i.s(AbstractC5921dt2.i.this, d80, z, f, f2);
                }
            });
        }

        public void v() {
            long j = 0;
            if (e() == 0) {
                j = 1;
            }
            AbstractC5921dt2.this.F0(j, this.a);
            this.a = j;
        }

        public void w() {
            this.d = true;
            ArrayList<InterfaceC10929yL<InterfaceC2594Bt2>> arrayList = this.b;
            if (arrayList != null) {
                this.b = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(this);
                }
            }
            t();
        }
    }

    /* renamed from: o.dt2$j */
    /* loaded from: classes.dex */
    public interface j {
        void d(AbstractC5921dt2 abstractC5921dt2);

        void g(AbstractC5921dt2 abstractC5921dt2);

        default void h(AbstractC5921dt2 abstractC5921dt2, boolean z) {
            g(abstractC5921dt2);
        }

        void j(AbstractC5921dt2 abstractC5921dt2);

        default void k(AbstractC5921dt2 abstractC5921dt2, boolean z) {
            j(abstractC5921dt2);
        }

        void l(AbstractC5921dt2 abstractC5921dt2);

        void p(AbstractC5921dt2 abstractC5921dt2);
    }

    /* renamed from: o.dt2$k */
    /* loaded from: classes.dex */
    public interface k {
        public static final k a = new k() { // from class: o.gt2
            @Override // o.AbstractC5921dt2.k
            public final void b(AbstractC5921dt2.j jVar, AbstractC5921dt2 abstractC5921dt2, boolean z) {
                jVar.k(abstractC5921dt2, z);
            }
        };
        public static final k b = new k() { // from class: o.ht2
            @Override // o.AbstractC5921dt2.k
            public final void b(AbstractC5921dt2.j jVar, AbstractC5921dt2 abstractC5921dt2, boolean z) {
                jVar.h(abstractC5921dt2, z);
            }
        };
        public static final k c = new k() { // from class: o.it2
            @Override // o.AbstractC5921dt2.k
            public final void b(AbstractC5921dt2.j jVar, AbstractC5921dt2 abstractC5921dt2, boolean z) {
                jVar.p(abstractC5921dt2);
            }
        };
        public static final k d = new k() { // from class: o.jt2
            @Override // o.AbstractC5921dt2.k
            public final void b(AbstractC5921dt2.j jVar, AbstractC5921dt2 abstractC5921dt2, boolean z) {
                jVar.l(abstractC5921dt2);
            }
        };
        public static final k e = new k() { // from class: o.kt2
            @Override // o.AbstractC5921dt2.k
            public final void b(AbstractC5921dt2.j jVar, AbstractC5921dt2 abstractC5921dt2, boolean z) {
                jVar.d(abstractC5921dt2);
            }
        };

        void b(j jVar, AbstractC5921dt2 abstractC5921dt2, boolean z);
    }

    public AbstractC5921dt2() {
    }

    public static <T> ArrayList<T> B(ArrayList<T> arrayList, T t, boolean z) {
        if (t != null) {
            if (z) {
                return e.a(arrayList, t);
            }
            return e.b(arrayList, t);
        }
        return arrayList;
    }

    public static C2531Be<Animator, d> S() {
        C2531Be<Animator, d> c2531Be = W1.get();
        if (c2531Be == null) {
            C2531Be<Animator, d> c2531Be2 = new C2531Be<>();
            W1.set(c2531Be2);
            return c2531Be2;
        }
        return c2531Be;
    }

    public static boolean g0(int i2) {
        if (i2 >= 1 && i2 <= 4) {
            return true;
        }
        return false;
    }

    public static boolean i0(C3291It2 c3291It2, C3291It2 c3291It22, String str) {
        Object obj = c3291It2.a.get(str);
        Object obj2 = c3291It22.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void j(C3389Jt2 c3389Jt2, View view, C3291It2 c3291It2) {
        c3389Jt2.a.put(view, c3291It2);
        int id = view.getId();
        if (id >= 0) {
            if (c3389Jt2.b.indexOfKey(id) >= 0) {
                c3389Jt2.b.put(id, null);
            } else {
                c3389Jt2.b.put(id, view);
            }
        }
        String C0 = C6516gH2.C0(view);
        if (C0 != null) {
            if (c3389Jt2.d.containsKey(C0)) {
                c3389Jt2.d.put(C0, null);
            } else {
                c3389Jt2.d.put(C0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c3389Jt2.c.j(itemIdAtPosition) >= 0) {
                    View h2 = c3389Jt2.c.h(itemIdAtPosition);
                    if (h2 != null) {
                        h2.setHasTransientState(false);
                        c3389Jt2.c.n(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c3389Jt2.c.n(itemIdAtPosition, view);
            }
        }
    }

    public static boolean k(int[] iArr, int i2) {
        int i3 = iArr[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    public static int[] q0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i2] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i2] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i2] = 2;
            } else if (T1.equalsIgnoreCase(trim)) {
                iArr[i2] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                i2--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i2++;
        }
        return iArr;
    }

    public final ArrayList<Integer> A(ArrayList<Integer> arrayList, int i2, boolean z) {
        if (i2 > 0) {
            if (z) {
                return e.a(arrayList, Integer.valueOf(i2));
            }
            return e.b(arrayList, Integer.valueOf(i2));
        }
        return arrayList;
    }

    public final void A0(Animator animator, C2531Be<Animator, d> c2531Be) {
        if (animator != null) {
            animator.addListener(new a(c2531Be));
            l(animator);
        }
    }

    public AbstractC5921dt2 C(int i2, boolean z) {
        this.d1 = A(this.d1, i2, z);
        return this;
    }

    public void C0() {
        P0();
        C2531Be<Animator, d> S = S();
        Iterator<Animator> it = this.z1.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (S.containsKey(next)) {
                P0();
                A0(next, S);
            }
        }
        this.z1.clear();
        w();
    }

    public AbstractC5921dt2 D(View view, boolean z) {
        this.e1 = H(this.e1, view, z);
        return this;
    }

    public void D0(boolean z) {
        this.r1 = z;
    }

    public AbstractC5921dt2 E(Class<?> cls, boolean z) {
        this.f1 = G(this.f1, cls, z);
        return this;
    }

    public AbstractC5921dt2 F(String str, boolean z) {
        this.g1 = B(this.g1, str, z);
        return this;
    }

    public void F0(long j2, long j3) {
        boolean z;
        long Y = Y();
        int i2 = 0;
        if (j2 < j3) {
            z = true;
        } else {
            z = false;
        }
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if ((i3 < 0 && j2 >= 0) || (j3 > Y && j2 <= Y)) {
            this.w1 = false;
            p0(k.a, z);
        }
        int size = this.s1.size();
        Animator[] animatorArr = (Animator[]) this.s1.toArray(this.t1);
        this.t1 = I1;
        while (i2 < size) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            g.b(animator, Math.min(Math.max(0L, j2), g.a(animator)));
            i2++;
            Y = Y;
        }
        long j4 = Y;
        this.t1 = animatorArr;
        int i4 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
        if ((i4 > 0 && j3 <= j4) || (j2 < 0 && i3 >= 0)) {
            if (i4 > 0) {
                this.w1 = true;
            }
            p0(k.b, z);
        }
    }

    public final ArrayList<Class<?>> G(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls != null) {
            if (z) {
                return e.a(arrayList, cls);
            }
            return e.b(arrayList, cls);
        }
        return arrayList;
    }

    public final ArrayList<View> H(ArrayList<View> arrayList, View view, boolean z) {
        if (view != null) {
            if (z) {
                return e.a(arrayList, view);
            }
            return e.b(arrayList, view);
        }
        return arrayList;
    }

    public void I(ViewGroup viewGroup) {
        C2531Be<Animator, d> S = S();
        int size = S.size();
        if (viewGroup != null && size != 0) {
            WindowId windowId = viewGroup.getWindowId();
            C2531Be c2531Be = new C2531Be(S);
            S.clear();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = (d) c2531Be.l(i2);
                if (dVar.a != null && windowId.equals(dVar.d)) {
                    ((Animator) c2531Be.g(i2)).end();
                }
            }
        }
    }

    public AbstractC5921dt2 I0(long j2) {
        this.Z = j2;
        return this;
    }

    public long J() {
        return this.Z;
    }

    public void J0(f fVar) {
        this.B1 = fVar;
    }

    public Rect K() {
        f fVar = this.B1;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    public AbstractC5921dt2 K0(TimeInterpolator timeInterpolator) {
        this.Y0 = timeInterpolator;
        return this;
    }

    public f L() {
        return this.B1;
    }

    public void L0(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (g0(iArr[i2])) {
                    if (k(iArr, i2)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.n1 = (int[]) iArr.clone();
            return;
        }
        this.n1 = U1;
    }

    public TimeInterpolator M() {
        return this.Y0;
    }

    public void M0(AbstractC9139qz1 abstractC9139qz1) {
        if (abstractC9139qz1 == null) {
            this.D1 = V1;
        } else {
            this.D1 = abstractC9139qz1;
        }
    }

    public C3291It2 N(View view, boolean z) {
        ArrayList<C3291It2> arrayList;
        ArrayList<C3291It2> arrayList2;
        C2692Ct2 c2692Ct2 = this.m1;
        if (c2692Ct2 != null) {
            return c2692Ct2.N(view, z);
        }
        if (z) {
            arrayList = this.o1;
        } else {
            arrayList = this.p1;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                C3291It2 c3291It2 = arrayList.get(i2);
                if (c3291It2 == null) {
                    return null;
                }
                if (c3291It2.b == view) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.p1;
        } else {
            arrayList2 = this.o1;
        }
        return arrayList2.get(i2);
    }

    public void N0(AbstractC11305zt2 abstractC11305zt2) {
        this.A1 = abstractC11305zt2;
    }

    public String O() {
        return this.X;
    }

    public AbstractC5921dt2 O0(long j2) {
        this.Y = j2;
        return this;
    }

    public AbstractC9139qz1 P() {
        return this.D1;
    }

    public void P0() {
        if (this.u1 == 0) {
            p0(k.a, false);
            this.w1 = false;
        }
        this.u1++;
    }

    public AbstractC11305zt2 Q() {
        return this.A1;
    }

    public String Q0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.Z != -1) {
            sb.append("dur(");
            sb.append(this.Z);
            sb.append(") ");
        }
        if (this.Y != -1) {
            sb.append("dly(");
            sb.append(this.Y);
            sb.append(") ");
        }
        if (this.Y0 != null) {
            sb.append("interp(");
            sb.append(this.Y0);
            sb.append(") ");
        }
        if (this.Z0.size() > 0 || this.a1.size() > 0) {
            sb.append("tgts(");
            if (this.Z0.size() > 0) {
                for (int i2 = 0; i2 < this.Z0.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(C6566gU0.h);
                    }
                    sb.append(this.Z0.get(i2));
                }
            }
            if (this.a1.size() > 0) {
                for (int i3 = 0; i3 < this.a1.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(C6566gU0.h);
                    }
                    sb.append(this.a1.get(i3));
                }
            }
            sb.append(C9811tl1.d);
        }
        return sb.toString();
    }

    public final AbstractC5921dt2 R() {
        C2692Ct2 c2692Ct2 = this.m1;
        if (c2692Ct2 != null) {
            return c2692Ct2.R();
        }
        return this;
    }

    public long T() {
        return this.Y;
    }

    public List<Integer> U() {
        return this.Z0;
    }

    public List<String> V() {
        return this.b1;
    }

    public List<Class<?>> W() {
        return this.c1;
    }

    public List<View> X() {
        return this.a1;
    }

    public final long Y() {
        return this.E1;
    }

    public String[] Z() {
        return null;
    }

    public C3291It2 b0(View view, boolean z) {
        C3389Jt2 c3389Jt2;
        C2692Ct2 c2692Ct2 = this.m1;
        if (c2692Ct2 != null) {
            return c2692Ct2.b0(view, z);
        }
        if (z) {
            c3389Jt2 = this.k1;
        } else {
            c3389Jt2 = this.l1;
        }
        return c3389Jt2.a.get(view);
    }

    public boolean c0() {
        return !this.s1.isEmpty();
    }

    public void cancel() {
        int size = this.s1.size();
        Animator[] animatorArr = (Animator[]) this.s1.toArray(this.t1);
        this.t1 = I1;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.t1 = animatorArr;
        p0(k.c, false);
    }

    public AbstractC5921dt2 d(j jVar) {
        if (this.y1 == null) {
            this.y1 = new ArrayList<>();
        }
        this.y1.add(jVar);
        return this;
    }

    public boolean d0() {
        return false;
    }

    public AbstractC5921dt2 e(int i2) {
        if (i2 != 0) {
            this.Z0.add(Integer.valueOf(i2));
        }
        return this;
    }

    public AbstractC5921dt2 f(View view) {
        this.a1.add(view);
        return this;
    }

    public boolean f0(C3291It2 c3291It2, C3291It2 c3291It22) {
        if (c3291It2 != null && c3291It22 != null) {
            String[] Z = Z();
            if (Z != null) {
                for (String str : Z) {
                    if (i0(c3291It2, c3291It22, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : c3291It2.a.keySet()) {
                    if (i0(c3291It2, c3291It22, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public AbstractC5921dt2 g(Class<?> cls) {
        if (this.c1 == null) {
            this.c1 = new ArrayList<>();
        }
        this.c1.add(cls);
        return this;
    }

    public AbstractC5921dt2 h(String str) {
        if (this.b1 == null) {
            this.b1 = new ArrayList<>();
        }
        this.b1.add(str);
        return this;
    }

    public boolean h0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.d1;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.e1;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f1;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f1.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.g1 != null && C6516gH2.C0(view) != null && this.g1.contains(C6516gH2.C0(view))) {
            return false;
        }
        if ((this.Z0.size() == 0 && this.a1.size() == 0 && (((arrayList = this.c1) == null || arrayList.isEmpty()) && ((arrayList2 = this.b1) == null || arrayList2.isEmpty()))) || this.Z0.contains(Integer.valueOf(id)) || this.a1.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.b1;
        if (arrayList6 != null && arrayList6.contains(C6516gH2.C0(view))) {
            return true;
        }
        if (this.c1 != null) {
            for (int i3 = 0; i3 < this.c1.size(); i3++) {
                if (this.c1.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void i(C2531Be<View, C3291It2> c2531Be, C2531Be<View, C3291It2> c2531Be2) {
        for (int i2 = 0; i2 < c2531Be.size(); i2++) {
            C3291It2 l = c2531Be.l(i2);
            if (h0(l.b)) {
                this.o1.add(l);
                this.p1.add(null);
            }
        }
        for (int i3 = 0; i3 < c2531Be2.size(); i3++) {
            C3291It2 l2 = c2531Be2.l(i3);
            if (h0(l2.b)) {
                this.p1.add(l2);
                this.o1.add(null);
            }
        }
    }

    public final void j0(C2531Be<View, C3291It2> c2531Be, C2531Be<View, C3291It2> c2531Be2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && h0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && h0(view)) {
                C3291It2 c3291It2 = c2531Be.get(valueAt);
                C3291It2 c3291It22 = c2531Be2.get(view);
                if (c3291It2 != null && c3291It22 != null) {
                    this.o1.add(c3291It2);
                    this.p1.add(c3291It22);
                    c2531Be.remove(valueAt);
                    c2531Be2.remove(view);
                }
            }
        }
    }

    public final void k0(C2531Be<View, C3291It2> c2531Be, C2531Be<View, C3291It2> c2531Be2) {
        C3291It2 remove;
        for (int size = c2531Be.size() - 1; size >= 0; size--) {
            View g2 = c2531Be.g(size);
            if (g2 != null && h0(g2) && (remove = c2531Be2.remove(g2)) != null && h0(remove.b)) {
                this.o1.add(c2531Be.j(size));
                this.p1.add(remove);
            }
        }
    }

    public void l(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (J() >= 0) {
            animator.setDuration(J());
        }
        if (T() >= 0) {
            animator.setStartDelay(T() + animator.getStartDelay());
        }
        if (M() != null) {
            animator.setInterpolator(M());
        }
        animator.addListener(new b());
        animator.start();
    }

    public final void l0(C2531Be<View, C3291It2> c2531Be, C2531Be<View, C3291It2> c2531Be2, C5484c51<View> c5484c51, C5484c51<View> c5484c512) {
        View h2;
        int w = c5484c51.w();
        for (int i2 = 0; i2 < w; i2++) {
            View x = c5484c51.x(i2);
            if (x != null && h0(x) && (h2 = c5484c512.h(c5484c51.m(i2))) != null && h0(h2)) {
                C3291It2 c3291It2 = c2531Be.get(x);
                C3291It2 c3291It22 = c2531Be2.get(h2);
                if (c3291It2 != null && c3291It22 != null) {
                    this.o1.add(c3291It2);
                    this.p1.add(c3291It22);
                    c2531Be.remove(x);
                    c2531Be2.remove(h2);
                }
            }
        }
    }

    public abstract void m(C3291It2 c3291It2);

    public final void m0(C2531Be<View, C3291It2> c2531Be, C2531Be<View, C3291It2> c2531Be2, C2531Be<String, View> c2531Be3, C2531Be<String, View> c2531Be4) {
        View view;
        int size = c2531Be3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View l = c2531Be3.l(i2);
            if (l != null && h0(l) && (view = c2531Be4.get(c2531Be3.g(i2))) != null && h0(view)) {
                C3291It2 c3291It2 = c2531Be.get(l);
                C3291It2 c3291It22 = c2531Be2.get(view);
                if (c3291It2 != null && c3291It22 != null) {
                    this.o1.add(c3291It2);
                    this.p1.add(c3291It22);
                    c2531Be.remove(l);
                    c2531Be2.remove(view);
                }
            }
        }
    }

    public final void n(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.d1;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.e1;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f1;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (this.f1.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C3291It2 c3291It2 = new C3291It2(view);
                        if (z) {
                            p(c3291It2);
                        } else {
                            m(c3291It2);
                        }
                        c3291It2.c.add(this);
                        o(c3291It2);
                        if (z) {
                            j(this.k1, view, c3291It2);
                        } else {
                            j(this.l1, view, c3291It2);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.h1;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.i1;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.j1;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        if (this.j1.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    n(viewGroup.getChildAt(i4), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void n0(C3389Jt2 c3389Jt2, C3389Jt2 c3389Jt22) {
        C2531Be<View, C3291It2> c2531Be = new C2531Be<>(c3389Jt2.a);
        C2531Be<View, C3291It2> c2531Be2 = new C2531Be<>(c3389Jt22.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.n1;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                l0(c2531Be, c2531Be2, c3389Jt2.c, c3389Jt22.c);
                            }
                        } else {
                            j0(c2531Be, c2531Be2, c3389Jt2.b, c3389Jt22.b);
                        }
                    } else {
                        m0(c2531Be, c2531Be2, c3389Jt2.d, c3389Jt22.d);
                    }
                } else {
                    k0(c2531Be, c2531Be2);
                }
                i2++;
            } else {
                i(c2531Be, c2531Be2);
                return;
            }
        }
    }

    public void o(C3291It2 c3291It2) {
        String[] b2;
        if (this.A1 != null && !c3291It2.a.isEmpty() && (b2 = this.A1.b()) != null) {
            for (String str : b2) {
                if (!c3291It2.a.containsKey(str)) {
                    this.A1.a(c3291It2);
                    return;
                }
            }
        }
    }

    public final void o0(AbstractC5921dt2 abstractC5921dt2, k kVar, boolean z) {
        AbstractC5921dt2 abstractC5921dt22 = this.x1;
        if (abstractC5921dt22 != null) {
            abstractC5921dt22.o0(abstractC5921dt2, kVar, z);
        }
        ArrayList<j> arrayList = this.y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.y1.size();
            j[] jVarArr = this.q1;
            if (jVarArr == null) {
                jVarArr = new j[size];
            }
            this.q1 = null;
            j[] jVarArr2 = (j[]) this.y1.toArray(jVarArr);
            for (int i2 = 0; i2 < size; i2++) {
                kVar.b(jVarArr2[i2], abstractC5921dt2, z);
                jVarArr2[i2] = null;
            }
            this.q1 = jVarArr2;
        }
    }

    public abstract void p(C3291It2 c3291It2);

    public void p0(k kVar, boolean z) {
        o0(this, kVar, z);
    }

    public void q(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C2531Be<String, String> c2531Be;
        r(z);
        if ((this.Z0.size() <= 0 && this.a1.size() <= 0) || (((arrayList = this.b1) != null && !arrayList.isEmpty()) || ((arrayList2 = this.c1) != null && !arrayList2.isEmpty()))) {
            n(viewGroup, z);
        } else {
            for (int i2 = 0; i2 < this.Z0.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.Z0.get(i2).intValue());
                if (findViewById != null) {
                    C3291It2 c3291It2 = new C3291It2(findViewById);
                    if (z) {
                        p(c3291It2);
                    } else {
                        m(c3291It2);
                    }
                    c3291It2.c.add(this);
                    o(c3291It2);
                    if (z) {
                        j(this.k1, findViewById, c3291It2);
                    } else {
                        j(this.l1, findViewById, c3291It2);
                    }
                }
            }
            for (int i3 = 0; i3 < this.a1.size(); i3++) {
                View view = this.a1.get(i3);
                C3291It2 c3291It22 = new C3291It2(view);
                if (z) {
                    p(c3291It22);
                } else {
                    m(c3291It22);
                }
                c3291It22.c.add(this);
                o(c3291It22);
                if (z) {
                    j(this.k1, view, c3291It22);
                } else {
                    j(this.l1, view, c3291It22);
                }
            }
        }
        if (!z && (c2531Be = this.C1) != null) {
            int size = c2531Be.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.k1.d.remove(this.C1.g(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.k1.d.put(this.C1.l(i5), view2);
                }
            }
        }
    }

    public void r(boolean z) {
        if (z) {
            this.k1.a.clear();
            this.k1.b.clear();
            this.k1.c.c();
            return;
        }
        this.l1.a.clear();
        this.l1.b.clear();
        this.l1.c.c();
    }

    public void r0(View view) {
        if (!this.w1) {
            int size = this.s1.size();
            Animator[] animatorArr = (Animator[]) this.s1.toArray(this.t1);
            this.t1 = I1;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                Animator animator = animatorArr[i2];
                animatorArr[i2] = null;
                animator.pause();
            }
            this.t1 = animatorArr;
            p0(k.d, false);
            this.v1 = true;
        }
    }

    @Override // 
    /* renamed from: s */
    public AbstractC5921dt2 clone() {
        try {
            AbstractC5921dt2 abstractC5921dt2 = (AbstractC5921dt2) super.clone();
            abstractC5921dt2.z1 = new ArrayList<>();
            abstractC5921dt2.k1 = new C3389Jt2();
            abstractC5921dt2.l1 = new C3389Jt2();
            abstractC5921dt2.o1 = null;
            abstractC5921dt2.p1 = null;
            abstractC5921dt2.F1 = null;
            abstractC5921dt2.x1 = this;
            abstractC5921dt2.y1 = null;
            return abstractC5921dt2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void s0(ViewGroup viewGroup) {
        d dVar;
        this.o1 = new ArrayList<>();
        this.p1 = new ArrayList<>();
        n0(this.k1, this.l1);
        C2531Be<Animator, d> S = S();
        int size = S.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator g2 = S.g(i2);
            if (g2 != null && (dVar = S.get(g2)) != null && dVar.a != null && windowId.equals(dVar.d)) {
                C3291It2 c3291It2 = dVar.c;
                View view = dVar.a;
                C3291It2 b0 = b0(view, true);
                C3291It2 N = N(view, true);
                if (b0 == null && N == null) {
                    N = this.l1.a.get(view);
                }
                if ((b0 != null || N != null) && dVar.e.f0(c3291It2, N)) {
                    AbstractC5921dt2 abstractC5921dt2 = dVar.e;
                    if (abstractC5921dt2.R().F1 != null) {
                        g2.cancel();
                        abstractC5921dt2.s1.remove(g2);
                        S.remove(g2);
                        if (abstractC5921dt2.s1.size() == 0) {
                            abstractC5921dt2.p0(k.c, false);
                            if (!abstractC5921dt2.w1) {
                                abstractC5921dt2.w1 = true;
                                abstractC5921dt2.p0(k.b, false);
                            }
                        }
                    } else if (!g2.isRunning() && !g2.isStarted()) {
                        S.remove(g2);
                    } else {
                        g2.cancel();
                    }
                }
            }
        }
        u(viewGroup, this.k1, this.l1, this.o1, this.p1);
        if (this.F1 == null) {
            C0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            t0();
            this.F1.v();
            this.F1.w();
        }
    }

    public Animator t(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        return null;
    }

    public void t0() {
        C2531Be<Animator, d> S = S();
        this.E1 = 0L;
        for (int i2 = 0; i2 < this.z1.size(); i2++) {
            Animator animator = this.z1.get(i2);
            d dVar = S.get(animator);
            if (animator != null && dVar != null) {
                if (J() >= 0) {
                    dVar.f.setDuration(J());
                }
                if (T() >= 0) {
                    dVar.f.setStartDelay(T() + dVar.f.getStartDelay());
                }
                if (M() != null) {
                    dVar.f.setInterpolator(M());
                }
                this.s1.add(animator);
                this.E1 = Math.max(this.E1, g.a(animator));
            }
        }
        this.z1.clear();
    }

    public String toString() {
        return Q0("");
    }

    public void u(ViewGroup viewGroup, C3389Jt2 c3389Jt2, C3389Jt2 c3389Jt22, ArrayList<C3291It2> arrayList, ArrayList<C3291It2> arrayList2) {
        boolean z;
        Animator t;
        Animator animator;
        int i2;
        boolean z2;
        int i3;
        View view;
        C3291It2 c3291It2;
        AnimatorSet animatorSet;
        View view2;
        Animator animator2;
        C2531Be<Animator, d> S = S();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        if (R().F1 != null) {
            z = true;
        } else {
            z = false;
        }
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            C3291It2 c3291It22 = arrayList.get(i4);
            C3291It2 c3291It23 = arrayList2.get(i4);
            if (c3291It22 != null && !c3291It22.c.contains(this)) {
                c3291It22 = null;
            }
            if (c3291It23 != null && !c3291It23.c.contains(this)) {
                c3291It23 = null;
            }
            if ((c3291It22 == null && c3291It23 == null) || ((c3291It22 != null && c3291It23 != null && !f0(c3291It22, c3291It23)) || (t = t(viewGroup, c3291It22, c3291It23)) == null)) {
                i2 = size;
                z2 = z;
                i3 = i4;
            } else {
                if (c3291It23 != null) {
                    View view3 = c3291It23.b;
                    String[] Z = Z();
                    if (Z != null && Z.length > 0) {
                        c3291It2 = new C3291It2(view3);
                        i2 = size;
                        z2 = z;
                        C3291It2 c3291It24 = c3389Jt22.a.get(view3);
                        i3 = i4;
                        if (c3291It24 != null) {
                            int i5 = 0;
                            while (i5 < Z.length) {
                                Map<String, Object> map = c3291It2.a;
                                int i6 = i5;
                                String str = Z[i6];
                                map.put(str, c3291It24.a.get(str));
                                i5 = i6 + 1;
                                Z = Z;
                            }
                        }
                        int size2 = S.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                d dVar = S.get(S.g(i7));
                                if (dVar.c != null && dVar.a == view3) {
                                    view2 = view3;
                                    if (dVar.b.equals(O()) && dVar.c.equals(c3291It2)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i7++;
                                view3 = view2;
                            } else {
                                view2 = view3;
                                animator2 = t;
                                break;
                            }
                        }
                    } else {
                        view2 = view3;
                        i2 = size;
                        z2 = z;
                        i3 = i4;
                        animator2 = t;
                        c3291It2 = null;
                    }
                    animator = animator2;
                    view = view2;
                } else {
                    animator = t;
                    i2 = size;
                    z2 = z;
                    i3 = i4;
                    view = c3291It22.b;
                    c3291It2 = null;
                }
                if (animator != null) {
                    AbstractC11305zt2 abstractC11305zt2 = this.A1;
                    if (abstractC11305zt2 != null) {
                        long c2 = abstractC11305zt2.c(viewGroup, this, c3291It22, c3291It23);
                        sparseIntArray.put(this.z1.size(), (int) c2);
                        j2 = Math.min(c2, j2);
                    }
                    long j3 = j2;
                    View view4 = view;
                    C3291It2 c3291It25 = c3291It2;
                    Animator animator3 = animator;
                    d dVar2 = new d(view4, O(), this, viewGroup.getWindowId(), c3291It25, animator3);
                    if (z2) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(animator3);
                        animatorSet = animatorSet2;
                    } else {
                        animatorSet = animator3;
                    }
                    S.put(animatorSet, dVar2);
                    this.z1.add(animatorSet);
                    j2 = j3;
                }
            }
            i4 = i3 + 1;
            size = i2;
            z = z2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                d dVar3 = S.get(this.z1.get(sparseIntArray.keyAt(i8)));
                dVar3.f.setStartDelay((sparseIntArray.valueAt(i8) - j2) + dVar3.f.getStartDelay());
            }
        }
    }

    public AbstractC5921dt2 u0(j jVar) {
        AbstractC5921dt2 abstractC5921dt2;
        ArrayList<j> arrayList = this.y1;
        if (arrayList != null) {
            if (!arrayList.remove(jVar) && (abstractC5921dt2 = this.x1) != null) {
                abstractC5921dt2.u0(jVar);
            }
            if (this.y1.size() == 0) {
                this.y1 = null;
            }
        }
        return this;
    }

    public InterfaceC2594Bt2 v() {
        i iVar = new i();
        this.F1 = iVar;
        d(iVar);
        return this.F1;
    }

    public AbstractC5921dt2 v0(int i2) {
        if (i2 != 0) {
            this.Z0.remove(Integer.valueOf(i2));
        }
        return this;
    }

    public void w() {
        int i2 = this.u1 - 1;
        this.u1 = i2;
        if (i2 == 0) {
            p0(k.b, false);
            for (int i3 = 0; i3 < this.k1.c.w(); i3++) {
                View x = this.k1.c.x(i3);
                if (x != null) {
                    x.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.l1.c.w(); i4++) {
                View x2 = this.l1.c.x(i4);
                if (x2 != null) {
                    x2.setHasTransientState(false);
                }
            }
            this.w1 = true;
        }
    }

    public AbstractC5921dt2 w0(View view) {
        this.a1.remove(view);
        return this;
    }

    public AbstractC5921dt2 x(int i2, boolean z) {
        this.h1 = A(this.h1, i2, z);
        return this;
    }

    public AbstractC5921dt2 x0(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.c1;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public AbstractC5921dt2 y(View view, boolean z) {
        this.i1 = H(this.i1, view, z);
        return this;
    }

    public AbstractC5921dt2 y0(String str) {
        ArrayList<String> arrayList = this.b1;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public AbstractC5921dt2 z(Class<?> cls, boolean z) {
        this.j1 = G(this.j1, cls, z);
        return this;
    }

    public void z0(View view) {
        if (this.v1) {
            if (!this.w1) {
                int size = this.s1.size();
                Animator[] animatorArr = (Animator[]) this.s1.toArray(this.t1);
                this.t1 = I1;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.t1 = animatorArr;
                p0(k.e, false);
            }
            this.v1 = false;
        }
    }

    public AbstractC5921dt2(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k2 = C5206aw2.k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k2 >= 0) {
            I0(k2);
        }
        long k3 = C5206aw2.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k3 > 0) {
            O0(k3);
        }
        int l = C5206aw2.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            K0(AnimationUtils.loadInterpolator(context, l));
        }
        String m = C5206aw2.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            L0(q0(m));
        }
        obtainStyledAttributes.recycle();
    }
}
