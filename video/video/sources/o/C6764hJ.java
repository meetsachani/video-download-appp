package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C8322nf1;
import o.InterfaceC7583kh1;
import o.U52;

@Deprecated
/* renamed from: o.hJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6764hJ extends TI<e> {
    public static final int r1 = 0;
    public static final int s1 = 1;
    public static final int t1 = 2;
    public static final int u1 = 3;
    public static final int v1 = 4;
    public static final int w1 = 5;
    public static final C8322nf1 x1 = new C8322nf1.c().L(Uri.EMPTY).a();
    @InterfaceC8710pF0("this")
    public final List<e> f1;
    @InterfaceC8710pF0("this")
    public final Set<d> g1;
    @InterfaceC8710pF0("this")
    @InterfaceC11300zs1
    public Handler h1;
    public final List<e> i1;
    public final IdentityHashMap<InterfaceC4410Ug1, e> j1;
    public final Map<Object, e> k1;
    public final Set<e> l1;
    public final boolean m1;
    public final boolean n1;
    public boolean o1;
    public Set<d> p1;
    public U52 q1;

    /* renamed from: o.hJ$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC8892q0 {
        public final int d1;
        public final int e1;
        public final int[] f1;
        public final int[] g1;
        public final AbstractC7373jp2[] h1;
        public final Object[] i1;
        public final HashMap<Object, Integer> j1;

        public b(Collection<e> collection, U52 u52, boolean z) {
            super(z, u52);
            int size = collection.size();
            this.f1 = new int[size];
            this.g1 = new int[size];
            this.h1 = new AbstractC7373jp2[size];
            this.i1 = new Object[size];
            this.j1 = new HashMap<>();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (e eVar : collection) {
                this.h1[i3] = eVar.a.S0();
                this.g1[i3] = i;
                this.f1[i3] = i2;
                i += this.h1[i3].w();
                i2 += this.h1[i3].n();
                Object[] objArr = this.i1;
                Object obj = eVar.b;
                objArr[i3] = obj;
                this.j1.put(obj, Integer.valueOf(i3));
                i3++;
            }
            this.d1 = i;
            this.e1 = i2;
        }

        @Override // o.AbstractC8892q0
        public int A(Object obj) {
            Integer num = this.j1.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // o.AbstractC8892q0
        public int B(int i) {
            return TD2.m(this.f1, i + 1, false, false);
        }

        @Override // o.AbstractC8892q0
        public int C(int i) {
            return TD2.m(this.g1, i + 1, false, false);
        }

        @Override // o.AbstractC8892q0
        public Object F(int i) {
            return this.i1[i];
        }

        @Override // o.AbstractC8892q0
        public int H(int i) {
            return this.f1[i];
        }

        @Override // o.AbstractC8892q0
        public int I(int i) {
            return this.g1[i];
        }

        @Override // o.AbstractC8892q0
        public AbstractC7373jp2 L(int i) {
            return this.h1[i];
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return this.e1;
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return this.d1;
        }
    }

    /* renamed from: o.hJ$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final Handler a;
        public final Runnable b;

        public d(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        public void a() {
            this.a.post(this.b);
        }
    }

    /* renamed from: o.hJ$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public final K81 a;
        public int d;
        public int e;
        public boolean f;
        public final List<InterfaceC7583kh1.b> c = new ArrayList();
        public final Object b = new Object();

        public e(InterfaceC7583kh1 interfaceC7583kh1, boolean z) {
            this.a = new K81(interfaceC7583kh1, z);
        }

        public void a(int i, int i2) {
            this.d = i;
            this.e = i2;
            this.f = false;
            this.c.clear();
        }
    }

    /* renamed from: o.hJ$f */
    /* loaded from: classes2.dex */
    public static final class f<T> {
        public final int a;
        public final T b;
        @InterfaceC11300zs1
        public final d c;

        public f(int i, T t, @InterfaceC11300zs1 d dVar) {
            this.a = i;
            this.b = t;
            this.c = dVar;
        }
    }

    public C6764hJ(InterfaceC7583kh1... interfaceC7583kh1Arr) {
        this(false, interfaceC7583kh1Arr);
    }

    private void T0() {
        Iterator<e> it = this.l1.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.c.isEmpty()) {
                t0(next);
                it.remove();
            }
        }
    }

    private static Object W0(Object obj) {
        return AbstractC8892q0.D(obj);
    }

    public static Object Z0(Object obj) {
        return AbstractC8892q0.E(obj);
    }

    public static Object a1(e eVar, Object obj) {
        return AbstractC8892q0.G(eVar.b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e1(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                U0((Set) TD2.o(message.obj));
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            x1();
                        }
                    } else {
                        f fVar = (f) TD2.o(message.obj);
                        this.q1 = (U52) fVar.b;
                        s1(fVar.c);
                    }
                } else {
                    f fVar2 = (f) TD2.o(message.obj);
                    U52 u52 = this.q1;
                    int i2 = fVar2.a;
                    U52 a2 = u52.a(i2, i2 + 1);
                    this.q1 = a2;
                    this.q1 = a2.g(((Integer) fVar2.b).intValue(), 1);
                    i1(fVar2.a, ((Integer) fVar2.b).intValue());
                    s1(fVar2.c);
                }
            } else {
                f fVar3 = (f) TD2.o(message.obj);
                int i3 = fVar3.a;
                int intValue = ((Integer) fVar3.b).intValue();
                if (i3 == 0 && intValue == this.q1.getLength()) {
                    this.q1 = this.q1.e();
                } else {
                    this.q1 = this.q1.a(i3, intValue);
                }
                for (int i4 = intValue - 1; i4 >= i3; i4--) {
                    n1(i4);
                }
                s1(fVar3.c);
            }
        } else {
            f fVar4 = (f) TD2.o(message.obj);
            this.q1 = this.q1.g(fVar4.a, ((Collection) fVar4.b).size());
            N0(fVar4.a, (Collection) fVar4.b);
            s1(fVar4.c);
        }
        return true;
    }

    private void r1() {
        s1(null);
    }

    public synchronized void E0(int i, InterfaceC7583kh1 interfaceC7583kh1) {
        O0(i, Collections.singletonList(interfaceC7583kh1), null, null);
    }

    public synchronized void F0(int i, InterfaceC7583kh1 interfaceC7583kh1, Handler handler, Runnable runnable) {
        O0(i, Collections.singletonList(interfaceC7583kh1), handler, runnable);
    }

    public synchronized void G0(InterfaceC7583kh1 interfaceC7583kh1) {
        E0(this.f1.size(), interfaceC7583kh1);
    }

    public synchronized void H0(InterfaceC7583kh1 interfaceC7583kh1, Handler handler, Runnable runnable) {
        F0(this.f1.size(), interfaceC7583kh1, handler, runnable);
    }

    public final void I0(int i, e eVar) {
        if (i > 0) {
            e eVar2 = this.i1.get(i - 1);
            eVar.a(i, eVar2.e + eVar2.a.S0().w());
        } else {
            eVar.a(i, 0);
        }
        R0(i, 1, eVar.a.S0().w());
        this.i1.add(i, eVar);
        this.k1.put(eVar.b, eVar);
        A0(eVar, eVar.a);
        if (j0() && this.j1.isEmpty()) {
            this.l1.add(eVar);
        } else {
            t0(eVar);
        }
    }

    public synchronized void J0(int i, Collection<InterfaceC7583kh1> collection) {
        O0(i, collection, null, null);
    }

    public synchronized void K0(int i, Collection<InterfaceC7583kh1> collection, Handler handler, Runnable runnable) {
        O0(i, collection, handler, runnable);
    }

    public synchronized void L0(Collection<InterfaceC7583kh1> collection) {
        O0(this.f1.size(), collection, null, null);
    }

    public synchronized void M0(Collection<InterfaceC7583kh1> collection, Handler handler, Runnable runnable) {
        O0(this.f1.size(), collection, handler, runnable);
    }

    public final void N0(int i, Collection<e> collection) {
        for (e eVar : collection) {
            I0(i, eVar);
            i++;
        }
    }

    @InterfaceC8710pF0("this")
    public final void O0(int i, Collection<InterfaceC7583kh1> collection, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (handler == null) {
            z = true;
        } else {
            z = false;
        }
        if (runnable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = false;
        }
        C9542sf.a(z3);
        Handler handler2 = this.h1;
        for (InterfaceC7583kh1 interfaceC7583kh1 : collection) {
            C9542sf.g(interfaceC7583kh1);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (InterfaceC7583kh1 interfaceC7583kh12 : collection) {
            arrayList.add(new e(interfaceC7583kh12, this.n1));
        }
        this.f1.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i, arrayList, S0(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public synchronized void P0() {
        o1(0, c1());
    }

    public synchronized void Q0(Handler handler, Runnable runnable) {
        p1(0, c1(), handler, runnable);
    }

    @Override // o.InterfaceC7583kh1
    public boolean R() {
        return false;
    }

    public final void R0(int i, int i2, int i3) {
        while (i < this.i1.size()) {
            e eVar = this.i1.get(i);
            eVar.d += i2;
            eVar.e += i3;
            i++;
        }
    }

    @Override // o.InterfaceC7583kh1
    public synchronized AbstractC7373jp2 S() {
        U52 u52;
        try {
            if (this.q1.getLength() != this.f1.size()) {
                u52 = this.q1.e().g(0, this.f1.size());
            } else {
                u52 = this.q1;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new b(this.f1, u52, this.m1);
    }

    @InterfaceC8710pF0("this")
    @InterfaceC11300zs1
    public final d S0(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 Runnable runnable) {
        if (handler != null && runnable != null) {
            d dVar = new d(handler, runnable);
            this.g1.add(dVar);
            return dVar;
        }
        return null;
    }

    public final synchronized void U0(Set<d> set) {
        try {
            for (d dVar : set) {
                dVar.a();
            }
            this.g1.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void V0(e eVar) {
        this.l1.add(eVar);
        v0(eVar);
    }

    @Override // o.TI
    @InterfaceC11300zs1
    /* renamed from: X0 */
    public InterfaceC7583kh1.b w0(e eVar, InterfaceC7583kh1.b bVar) {
        for (int i = 0; i < eVar.c.size(); i++) {
            if (eVar.c.get(i).d == bVar.d) {
                return bVar.a(a1(eVar, bVar.a));
            }
        }
        return null;
    }

    public synchronized InterfaceC7583kh1 Y0(int i) {
        return this.f1.get(i).a;
    }

    public final Handler b1() {
        return (Handler) C9542sf.g(this.h1);
    }

    public synchronized int c1() {
        return this.f1.size();
    }

    @Override // o.TI
    /* renamed from: d1 */
    public int y0(e eVar, int i) {
        return i + eVar.e;
    }

    @Override // o.TI, o.AbstractC10541wl
    public void e0() {
        super.e0();
        this.l1.clear();
    }

    public final void f1(e eVar) {
        if (eVar.f && eVar.c.isEmpty()) {
            this.l1.remove(eVar);
            B0(eVar);
        }
    }

    public synchronized void g1(int i, int i2) {
        j1(i, i2, null, null);
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        Object Z0 = Z0(bVar.a);
        InterfaceC7583kh1.b a2 = bVar.a(W0(bVar.a));
        e eVar = this.k1.get(Z0);
        if (eVar == null) {
            eVar = new e(new c(), this.n1);
            eVar.f = true;
            A0(eVar, eVar.a);
        }
        V0(eVar);
        eVar.c.add(a2);
        J81 h = eVar.a.h(a2, interfaceC10877y8, j);
        this.j1.put(h, eVar);
        T0();
        return h;
    }

    public synchronized void h1(int i, int i2, Handler handler, Runnable runnable) {
        j1(i, i2, handler, runnable);
    }

    public final void i1(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = this.i1.get(min).e;
        List<e> list = this.i1;
        list.add(i2, list.remove(i));
        while (min <= max) {
            e eVar = this.i1.get(min);
            eVar.d = min;
            eVar.e = i3;
            i3 += eVar.a.S0().w();
            min++;
        }
    }

    @InterfaceC8710pF0("this")
    public final void j1(int i, int i2, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (handler == null) {
            z = true;
        } else {
            z = false;
        }
        if (runnable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        }
        C9542sf.a(z3);
        Handler handler2 = this.h1;
        List<e> list = this.f1;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i, Integer.valueOf(i2), S0(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return x1;
    }

    @Override // o.TI, o.AbstractC10541wl
    public synchronized void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        try {
            super.k0(interfaceC4261Sr2);
            this.h1 = new Handler(new Handler.Callback() { // from class: o.gJ
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean e1;
                    e1 = C6764hJ.this.e1(message);
                    return e1;
                }
            });
            if (this.f1.isEmpty()) {
                x1();
            } else {
                this.q1 = this.q1.g(0, this.f1.size());
                N0(0, this.f1);
                r1();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.TI
    /* renamed from: k1 */
    public void z0(e eVar, InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
        w1(eVar, abstractC7373jp2);
    }

    public synchronized InterfaceC7583kh1 l1(int i) {
        InterfaceC7583kh1 Y0;
        Y0 = Y0(i);
        q1(i, i + 1, null, null);
        return Y0;
    }

    public synchronized InterfaceC7583kh1 m1(int i, Handler handler, Runnable runnable) {
        InterfaceC7583kh1 Y0;
        Y0 = Y0(i);
        q1(i, i + 1, handler, runnable);
        return Y0;
    }

    public final void n1(int i) {
        e remove = this.i1.remove(i);
        this.k1.remove(remove.b);
        R0(i, -1, -remove.a.S0().w());
        remove.f = true;
        f1(remove);
    }

    public synchronized void o1(int i, int i2) {
        q1(i, i2, null, null);
    }

    public synchronized void p1(int i, int i2, Handler handler, Runnable runnable) {
        q1(i, i2, handler, runnable);
    }

    @Override // o.TI, o.AbstractC10541wl
    public synchronized void q0() {
        try {
            super.q0();
            this.i1.clear();
            this.l1.clear();
            this.k1.clear();
            this.q1 = this.q1.e();
            Handler handler = this.h1;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.h1 = null;
            }
            this.o1 = false;
            this.p1.clear();
            U0(this.g1);
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC8710pF0("this")
    public final void q1(int i, int i2, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (handler == null) {
            z = true;
        } else {
            z = false;
        }
        if (runnable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        }
        C9542sf.a(z3);
        Handler handler2 = this.h1;
        TD2.z1(this.f1, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i, Integer.valueOf(i2), S0(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        e eVar = (e) C9542sf.g(this.j1.remove(interfaceC4410Ug1));
        eVar.a.s(interfaceC4410Ug1);
        eVar.c.remove(((J81) interfaceC4410Ug1).X);
        if (!this.j1.isEmpty()) {
            T0();
        }
        f1(eVar);
    }

    public final void s1(@InterfaceC11300zs1 d dVar) {
        if (!this.o1) {
            b1().obtainMessage(4).sendToTarget();
            this.o1 = true;
        }
        if (dVar != null) {
            this.p1.add(dVar);
        }
    }

    @InterfaceC8710pF0("this")
    public final void t1(U52 u52, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (handler == null) {
            z = true;
        } else {
            z = false;
        }
        if (runnable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = false;
        }
        C9542sf.a(z3);
        Handler handler2 = this.h1;
        if (handler2 != null) {
            int c1 = c1();
            if (u52.getLength() != c1) {
                u52 = u52.e().g(0, c1);
            }
            handler2.obtainMessage(3, new f(0, u52, S0(handler, runnable))).sendToTarget();
            return;
        }
        if (u52.getLength() > 0) {
            u52 = u52.e();
        }
        this.q1 = u52;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public synchronized void u1(U52 u52) {
        t1(u52, null, null);
    }

    public synchronized void v1(U52 u52, Handler handler, Runnable runnable) {
        t1(u52, handler, runnable);
    }

    public final void w1(e eVar, AbstractC7373jp2 abstractC7373jp2) {
        int w;
        if (eVar.d + 1 < this.i1.size() && (w = abstractC7373jp2.w() - (this.i1.get(eVar.d + 1).e - eVar.e)) != 0) {
            R0(eVar.d + 1, 0, w);
        }
        r1();
    }

    public final void x1() {
        this.o1 = false;
        Set<d> set = this.p1;
        this.p1 = new HashSet();
        p0(new b(this.i1, this.q1, this.m1));
        b1().obtainMessage(5, set).sendToTarget();
    }

    public C6764hJ(boolean z, InterfaceC7583kh1... interfaceC7583kh1Arr) {
        this(z, new U52.a(0), interfaceC7583kh1Arr);
    }

    public C6764hJ(boolean z, U52 u52, InterfaceC7583kh1... interfaceC7583kh1Arr) {
        this(z, false, u52, interfaceC7583kh1Arr);
    }

    public C6764hJ(boolean z, boolean z2, U52 u52, InterfaceC7583kh1... interfaceC7583kh1Arr) {
        for (InterfaceC7583kh1 interfaceC7583kh1 : interfaceC7583kh1Arr) {
            C9542sf.g(interfaceC7583kh1);
        }
        this.q1 = u52.getLength() > 0 ? u52.e() : u52;
        this.j1 = new IdentityHashMap<>();
        this.k1 = new HashMap();
        this.f1 = new ArrayList();
        this.i1 = new ArrayList();
        this.p1 = new HashSet();
        this.g1 = new HashSet();
        this.l1 = new HashSet();
        this.m1 = z;
        this.n1 = z2;
        L0(Arrays.asList(interfaceC7583kh1Arr));
    }

    /* renamed from: o.hJ$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC10541wl {
        public c() {
        }

        @Override // o.InterfaceC7583kh1
        public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.InterfaceC7583kh1
        public C8322nf1 k() {
            return C6764hJ.x1;
        }

        @Override // o.InterfaceC7583kh1
        public void Q() {
        }

        @Override // o.AbstractC10541wl
        public void q0() {
        }

        @Override // o.AbstractC10541wl
        public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        }

        @Override // o.InterfaceC7583kh1
        public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        }
    }

    @Override // o.TI, o.AbstractC10541wl
    public void g0() {
    }
}
