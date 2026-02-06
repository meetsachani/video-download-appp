package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.f;
import androidx.camera.core.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C3051Gi2;
import o.HJ;
import o.InterfaceC6986iD2;

/* renamed from: o.Px  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3984Px implements InterfaceC3099Gv {
    public static final String n1 = "CameraUseCaseAdapter";
    public final InterfaceC7402jx X;
    public final LinkedHashSet<InterfaceC7402jx> Y;
    public final InterfaceC6986iD2 Y0;
    public final InterfaceC3981Pw Z;
    public final b Z0;
    public final InterfaceC2797Dw c1;
    public UH2 d1;
    public androidx.camera.core.m j1;
    public C3716Nd2 k1;
    public final JT1 l1;
    public final KT1 m1;
    public final List<androidx.camera.core.m> a1 = new ArrayList();
    public final List<androidx.camera.core.m> b1 = new ArrayList();
    public List<AbstractC4078Qw> e1 = Collections.EMPTY_LIST;
    public InterfaceC8388nw f1 = C9125qw.a();
    public final Object g1 = new Object();
    public boolean h1 = true;
    public HJ i1 = null;

    /* renamed from: o.Px$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a() {
        }

        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: o.Px$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final List<String> a = new ArrayList();

        public b(LinkedHashSet<InterfaceC7402jx> linkedHashSet) {
            Iterator<InterfaceC7402jx> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.a.add(it.next().n().c());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() * 53;
        }
    }

    /* renamed from: o.Px$c */
    /* loaded from: classes.dex */
    public static class c {
        public InterfaceC6743hD2<?> a;
        public InterfaceC6743hD2<?> b;

        public c(InterfaceC6743hD2<?> interfaceC6743hD2, InterfaceC6743hD2<?> interfaceC6743hD22) {
            this.a = interfaceC6743hD2;
            this.b = interfaceC6743hD22;
        }
    }

    public C3984Px(LinkedHashSet<InterfaceC7402jx> linkedHashSet, InterfaceC2797Dw interfaceC2797Dw, InterfaceC3981Pw interfaceC3981Pw, InterfaceC6986iD2 interfaceC6986iD2) {
        InterfaceC7402jx next = linkedHashSet.iterator().next();
        this.X = next;
        LinkedHashSet<InterfaceC7402jx> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.Y = linkedHashSet2;
        this.Z0 = new b(linkedHashSet2);
        this.c1 = interfaceC2797Dw;
        this.Z = interfaceC3981Pw;
        this.Y0 = interfaceC6986iD2;
        JT1 jt1 = new JT1(next.j());
        this.l1 = jt1;
        this.m1 = new KT1(next.n(), jt1);
    }

    public static b C(LinkedHashSet<InterfaceC7402jx> linkedHashSet) {
        return new b(linkedHashSet);
    }

    public static List<InterfaceC6986iD2.b> G(androidx.camera.core.m mVar) {
        ArrayList arrayList = new ArrayList();
        if (T(mVar)) {
            for (androidx.camera.core.m mVar2 : ((C3716Nd2) mVar).g0()) {
                arrayList.add(mVar2.j().g0());
            }
            return arrayList;
        }
        arrayList.add(mVar.j().g0());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean L(AbstractC4008Qd2 abstractC4008Qd2, T12 t12) {
        HJ d = abstractC4008Qd2.d();
        HJ e = t12.e();
        if (d.f().size() != t12.e().f().size()) {
            return true;
        }
        for (HJ.a<?> aVar : d.f()) {
            if (!e.g(aVar) || !Objects.equals(e.j(aVar), d.j(aVar))) {
                return true;
            }
            while (r5.hasNext()) {
            }
        }
        return false;
    }

    public static boolean R(androidx.camera.core.m mVar) {
        return mVar instanceof androidx.camera.core.f;
    }

    public static boolean S(androidx.camera.core.m mVar) {
        return mVar instanceof androidx.camera.core.k;
    }

    public static boolean T(androidx.camera.core.m mVar) {
        return mVar instanceof C3716Nd2;
    }

    public static boolean U(Collection<androidx.camera.core.m> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (androidx.camera.core.m mVar : collection) {
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (mVar.A(i2)) {
                    if (hashSet.contains(Integer.valueOf(i2))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i2));
                }
            }
        }
        return true;
    }

    public static List<AbstractC4078Qw> Y(List<AbstractC4078Qw> list, Collection<androidx.camera.core.m> collection) {
        boolean z;
        ArrayList arrayList = new ArrayList(list);
        for (androidx.camera.core.m mVar : collection) {
            mVar.R(null);
            for (AbstractC4078Qw abstractC4078Qw : list) {
                if (mVar.A(abstractC4078Qw.f())) {
                    if (mVar.l() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C10907yF1.o(z, mVar + " already has effect" + mVar.l());
                    mVar.R(abstractC4078Qw);
                    arrayList.remove(abstractC4078Qw);
                }
            }
        }
        return arrayList;
    }

    public static void a0(List<AbstractC4078Qw> list, Collection<androidx.camera.core.m> collection, Collection<androidx.camera.core.m> collection2) {
        List<AbstractC4078Qw> Y = Y(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<AbstractC4078Qw> Y2 = Y(Y, arrayList);
        if (Y2.size() > 0) {
            C7433k41.p(n1, "Unused effects: " + Y2);
        }
    }

    public static /* synthetic */ void h(C3051Gi2 c3051Gi2) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c3051Gi2.p().getWidth(), c3051Gi2.p().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        c3051Gi2.t(surface, C5211ay.b(), new InterfaceC10929yL() { // from class: o.Nx
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C3984Px.i(surface, surfaceTexture, (C3051Gi2.g) obj);
            }
        });
    }

    public static /* synthetic */ void i(Surface surface, SurfaceTexture surfaceTexture, C3051Gi2.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static Collection<androidx.camera.core.m> u(Collection<androidx.camera.core.m> collection, androidx.camera.core.m mVar, C3716Nd2 c3716Nd2) {
        ArrayList arrayList = new ArrayList(collection);
        if (mVar != null) {
            arrayList.add(mVar);
        }
        if (c3716Nd2 != null) {
            arrayList.add(c3716Nd2);
            arrayList.removeAll(c3716Nd2.g0());
        }
        return arrayList;
    }

    public static Matrix w(Rect rect, Size size) {
        boolean z;
        if (rect.width() > 0 && rect.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public final C3716Nd2 A(Collection<androidx.camera.core.m> collection, boolean z) {
        synchronized (this.g1) {
            try {
                Set<androidx.camera.core.m> J = J(collection, z);
                if (J.size() < 2) {
                    return null;
                }
                C3716Nd2 c3716Nd2 = this.k1;
                if (c3716Nd2 != null && c3716Nd2.g0().equals(J)) {
                    C3716Nd2 c3716Nd22 = this.k1;
                    Objects.requireNonNull(c3716Nd22);
                    return c3716Nd22;
                } else if (!U(J)) {
                    return null;
                } else {
                    return new C3716Nd2(this.X, J, this.Y0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B() {
        synchronized (this.g1) {
            try {
                if (this.h1) {
                    this.X.m(new ArrayList(this.b1));
                    t();
                    this.h1 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b D() {
        return this.Z0;
    }

    public final int E() {
        synchronized (this.g1) {
            try {
                if (this.c1.e() == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection<androidx.camera.core.m> F() {
        ArrayList arrayList;
        synchronized (this.g1) {
            arrayList = new ArrayList(this.b1);
        }
        return arrayList;
    }

    public final Map<androidx.camera.core.m, c> H(Collection<androidx.camera.core.m> collection, InterfaceC6986iD2 interfaceC6986iD2, InterfaceC6986iD2 interfaceC6986iD22) {
        HashMap hashMap = new HashMap();
        for (androidx.camera.core.m mVar : collection) {
            hashMap.put(mVar, new c(mVar.k(false, interfaceC6986iD2), mVar.k(true, interfaceC6986iD22)));
        }
        return hashMap;
    }

    public final int I(boolean z) {
        int i;
        synchronized (this.g1) {
            try {
                Iterator<AbstractC4078Qw> it = this.e1.iterator();
                AbstractC4078Qw abstractC4078Qw = null;
                while (true) {
                    i = 0;
                    boolean z2 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC4078Qw next = it.next();
                    if (C3553Ll2.d(next.f()) > 1) {
                        if (abstractC4078Qw == null) {
                            z2 = true;
                        }
                        C10907yF1.o(z2, "Can only have one sharing effect.");
                        abstractC4078Qw = next;
                    }
                }
                if (abstractC4078Qw != null) {
                    i = abstractC4078Qw.f();
                }
                if (z) {
                    i |= 3;
                }
            } finally {
            }
        }
        return i;
    }

    public final Set<androidx.camera.core.m> J(Collection<androidx.camera.core.m> collection, boolean z) {
        HashSet hashSet = new HashSet();
        int I = I(z);
        for (androidx.camera.core.m mVar : collection) {
            C10907yF1.b(!T(mVar), "Only support one level of sharing for now.");
            if (mVar.A(I)) {
                hashSet.add(mVar);
            }
        }
        return hashSet;
    }

    public List<androidx.camera.core.m> K() {
        ArrayList arrayList;
        synchronized (this.g1) {
            arrayList = new ArrayList(this.a1);
        }
        return arrayList;
    }

    public final boolean M() {
        boolean z;
        synchronized (this.g1) {
            if (this.f1 == C9125qw.a()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean N() {
        boolean z;
        synchronized (this.g1) {
            z = true;
            if (this.f1.x() != 1) {
                z = false;
            }
        }
        return z;
    }

    public boolean O(C3984Px c3984Px) {
        return this.Z0.equals(c3984Px.D());
    }

    public final boolean P(Collection<androidx.camera.core.m> collection) {
        boolean z = false;
        boolean z2 = false;
        for (androidx.camera.core.m mVar : collection) {
            if (S(mVar)) {
                z = true;
            } else if (R(mVar)) {
                z2 = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    public final boolean Q(Collection<androidx.camera.core.m> collection) {
        boolean z = false;
        boolean z2 = false;
        for (androidx.camera.core.m mVar : collection) {
            if (S(mVar)) {
                z2 = true;
            } else if (R(mVar)) {
                z = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    public void V(Collection<androidx.camera.core.m> collection) {
        synchronized (this.g1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.a1);
            linkedHashSet.removeAll(collection);
            b0(linkedHashSet);
        }
    }

    public final void W() {
        synchronized (this.g1) {
            try {
                if (this.i1 != null) {
                    this.X.j().l(this.i1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void X(List<AbstractC4078Qw> list) {
        synchronized (this.g1) {
            this.e1 = list;
        }
    }

    public void Z(UH2 uh2) {
        synchronized (this.g1) {
            this.d1 = uh2;
        }
    }

    @Override // o.InterfaceC3099Gv
    public InterfaceC9367rw a() {
        return this.l1;
    }

    @Override // o.InterfaceC3099Gv
    public InterfaceC8388nw b() {
        InterfaceC8388nw interfaceC8388nw;
        synchronized (this.g1) {
            interfaceC8388nw = this.f1;
        }
        return interfaceC8388nw;
    }

    public void b0(Collection<androidx.camera.core.m> collection) {
        c0(collection, false);
    }

    @Override // o.InterfaceC3099Gv
    public InterfaceC6420fx c() {
        return this.m1;
    }

    public void c0(Collection<androidx.camera.core.m> collection, boolean z) {
        C3984Px c3984Px;
        AbstractC4008Qd2 abstractC4008Qd2;
        HJ d;
        synchronized (this.g1) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                androidx.camera.core.m v = v(collection);
                C3716Nd2 A = A(collection, z);
                Collection<androidx.camera.core.m> u = u(collection, v, A);
                ArrayList<androidx.camera.core.m> arrayList = new ArrayList(u);
                arrayList.removeAll(this.b1);
                ArrayList<androidx.camera.core.m> arrayList2 = new ArrayList(u);
                arrayList2.retainAll(this.b1);
                ArrayList<androidx.camera.core.m> arrayList3 = new ArrayList(this.b1);
                arrayList3.removeAll(u);
                Map<androidx.camera.core.m, c> H = H(arrayList, this.f1.o(), this.Y0);
                try {
                    c3984Px = this;
                    try {
                        Map<androidx.camera.core.m, AbstractC4008Qd2> x = c3984Px.x(E(), this.X.n(), arrayList, arrayList2, H);
                        d0(x, u);
                        a0(c3984Px.e1, u, collection);
                        for (androidx.camera.core.m mVar : arrayList3) {
                            mVar.W(c3984Px.X);
                        }
                        c3984Px.X.m(arrayList3);
                        if (!arrayList3.isEmpty()) {
                            for (androidx.camera.core.m mVar2 : arrayList2) {
                                if (x.containsKey(mVar2) && (d = (abstractC4008Qd2 = x.get(mVar2)).d()) != null && L(abstractC4008Qd2, mVar2.t())) {
                                    mVar2.Z(d);
                                }
                            }
                        }
                        for (androidx.camera.core.m mVar3 : arrayList) {
                            c cVar = H.get(mVar3);
                            Objects.requireNonNull(cVar);
                            mVar3.b(c3984Px.X, cVar.a, cVar.b);
                            mVar3.Y((AbstractC4008Qd2) C10907yF1.l(x.get(mVar3)));
                        }
                        if (c3984Px.h1) {
                            c3984Px.X.l(arrayList);
                        }
                        for (androidx.camera.core.m mVar4 : arrayList) {
                            mVar4.G();
                        }
                        c3984Px.a1.clear();
                        c3984Px.a1.addAll(collection);
                        c3984Px.b1.clear();
                        c3984Px.b1.addAll(u);
                        c3984Px.j1 = v;
                        c3984Px.k1 = A;
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (!z && M() && c3984Px.c1.e() != 2) {
                            c0(collection, true);
                            return;
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    c3984Px = this;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // o.InterfaceC3099Gv
    public void d(InterfaceC8388nw interfaceC8388nw) {
        synchronized (this.g1) {
            if (interfaceC8388nw == null) {
                try {
                    interfaceC8388nw = C9125qw.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!this.a1.isEmpty() && !this.f1.l0().equals(interfaceC8388nw.l0())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f1 = interfaceC8388nw;
            InterfaceC4988a22 D = interfaceC8388nw.D(null);
            if (D != null) {
                this.l1.r(true, D.g());
            } else {
                this.l1.r(false, null);
            }
            this.X.d(this.f1);
        }
    }

    public final void d0(Map<androidx.camera.core.m, AbstractC4008Qd2> map, Collection<androidx.camera.core.m> collection) {
        boolean z;
        synchronized (this.g1) {
            try {
                if (this.d1 != null) {
                    if (this.X.n().g() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Map<androidx.camera.core.m, Rect> a2 = VH2.a(this.X.j().h(), z, this.d1.a(), this.X.n().t(this.d1.c()), this.d1.d(), this.d1.b(), map);
                    for (androidx.camera.core.m mVar : collection) {
                        mVar.U((Rect) C10907yF1.l(a2.get(mVar)));
                        mVar.S(w(this.X.j().h(), ((AbstractC4008Qd2) C10907yF1.l(map.get(mVar))).e()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC3099Gv
    public LinkedHashSet<InterfaceC7402jx> f() {
        return this.Y;
    }

    public void k(boolean z) {
        this.X.k(z);
    }

    public void p(Collection<androidx.camera.core.m> collection) throws a {
        synchronized (this.g1) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.a1);
                linkedHashSet.addAll(collection);
                try {
                    b0(linkedHashSet);
                } catch (IllegalArgumentException e) {
                    throw new a(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC3099Gv
    public boolean q(androidx.camera.core.m... mVarArr) {
        synchronized (this.g1) {
            try {
                try {
                    x(E(), this.X.n(), Arrays.asList(mVarArr), Collections.EMPTY_LIST, H(Arrays.asList(mVarArr), this.f1.o(), this.Y0));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void s() {
        synchronized (this.g1) {
            try {
                if (!this.h1) {
                    this.X.l(this.b1);
                    W();
                    for (androidx.camera.core.m mVar : this.b1) {
                        mVar.G();
                    }
                    this.h1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        synchronized (this.g1) {
            InterfaceC9610sw j = this.X.j();
            this.i1 = j.k();
            j.q();
        }
    }

    public androidx.camera.core.m v(Collection<androidx.camera.core.m> collection) {
        androidx.camera.core.m mVar;
        synchronized (this.g1) {
            try {
                if (N()) {
                    if (Q(collection)) {
                        if (S(this.j1)) {
                            mVar = this.j1;
                        } else {
                            mVar = z();
                        }
                    } else if (P(collection)) {
                        if (R(this.j1)) {
                            mVar = this.j1;
                        } else {
                            mVar = y();
                        }
                    }
                }
                mVar = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public final Map<androidx.camera.core.m, AbstractC4008Qd2> x(int i, InterfaceC6918hx interfaceC6918hx, Collection<androidx.camera.core.m> collection, Collection<androidx.camera.core.m> collection2, Map<androidx.camera.core.m, c> map) {
        Size size;
        Rect rect;
        ArrayList arrayList = new ArrayList();
        String c2 = interfaceC6918hx.c();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<androidx.camera.core.m> it = collection2.iterator();
        while (true) {
            size = null;
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.core.m next = it.next();
            AbstractC8324ng a2 = AbstractC8324ng.a(this.Z.b(i, c2, next.m(), next.f()), next.m(), next.f(), ((AbstractC4008Qd2) C10907yF1.l(next.e())).b(), G(next), next.e().d(), next.j().E(null));
            arrayList.add(a2);
            hashMap2.put(a2, next);
            hashMap.put(next, next.e());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.X.j().h();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = C5433bs2.m(rect);
            }
            C2742Dh2 c2742Dh2 = new C2742Dh2(interfaceC6918hx, size);
            for (androidx.camera.core.m mVar : collection) {
                c cVar = map.get(mVar);
                InterfaceC6743hD2<?> C = mVar.C(interfaceC6918hx, cVar.a, cVar.b);
                hashMap3.put(C, mVar);
                hashMap4.put(C, c2742Dh2.m(C));
            }
            Pair<Map<InterfaceC6743hD2<?>, AbstractC4008Qd2>, Map<AbstractC8324ng, AbstractC4008Qd2>> a3 = this.Z.a(i, c2, arrayList, hashMap4);
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((androidx.camera.core.m) entry.getValue(), (AbstractC4008Qd2) ((Map) a3.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) a3.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((androidx.camera.core.m) hashMap2.get(entry2.getKey()), (AbstractC4008Qd2) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    public final androidx.camera.core.f y() {
        return new f.b().k("ImageCapture-Extra").build();
    }

    public final androidx.camera.core.k z() {
        androidx.camera.core.k build = new k.a().k("Preview-Extra").build();
        build.p0(new k.c() { // from class: o.Ox
            @Override // androidx.camera.core.k.c
            public final void a(C3051Gi2 c3051Gi2) {
                C3984Px.h(c3051Gi2);
            }
        });
        return build;
    }
}
