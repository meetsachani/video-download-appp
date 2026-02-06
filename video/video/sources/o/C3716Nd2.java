package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C9800ti2;
import o.InterfaceC6743hD2;
import o.InterfaceC6986iD2;
import o.T12;
import o.V00;

/* renamed from: o.Nd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3716Nd2 extends androidx.camera.core.m {
    public static final String u = "StreamSharing";
    public final C3911Pd2 n;

    /* renamed from: o  reason: collision with root package name */
    public final RI2 f553o;
    public C9800ti2 p;
    public C9800ti2 q;
    public C6618gi2 r;
    public C6618gi2 s;
    public T12.b t;

    /* renamed from: o.Nd2$a */
    /* loaded from: classes.dex */
    public interface a {
        InterfaceFutureC8411o11<Void> a(int i, int i2);
    }

    public C3716Nd2(InterfaceC7402jx interfaceC7402jx, Set<androidx.camera.core.m> set, InterfaceC6986iD2 interfaceC6986iD2) {
        super(i0(set));
        this.n = i0(set);
        this.f553o = new RI2(interfaceC7402jx, set, interfaceC6986iD2, new a() { // from class: o.Md2
            @Override // o.C3716Nd2.a
            public final InterfaceFutureC8411o11 a(int i, int i2) {
                return C3716Nd2.b0(C3716Nd2.this, i, i2);
            }
        });
    }

    public static /* synthetic */ void a0(C3716Nd2 c3716Nd2, String str, InterfaceC6743hD2 interfaceC6743hD2, AbstractC4008Qd2 abstractC4008Qd2, T12 t12, T12.f fVar) {
        c3716Nd2.d0();
        if (c3716Nd2.z(str)) {
            c3716Nd2.X(c3716Nd2.e0(str, interfaceC6743hD2, abstractC4008Qd2));
            c3716Nd2.F();
            c3716Nd2.f553o.J();
        }
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b0(C3716Nd2 c3716Nd2, int i, int i2) {
        C9800ti2 c9800ti2 = c3716Nd2.q;
        if (c9800ti2 != null) {
            return c9800ti2.f().c(i, i2);
        }
        return C7221jC0.f(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void d0() {
        C6618gi2 c6618gi2 = this.r;
        if (c6618gi2 != null) {
            c6618gi2.i();
            this.r = null;
        }
        C6618gi2 c6618gi22 = this.s;
        if (c6618gi22 != null) {
            c6618gi22.i();
            this.s = null;
        }
        C9800ti2 c9800ti2 = this.q;
        if (c9800ti2 != null) {
            c9800ti2.g();
            this.q = null;
        }
        C9800ti2 c9800ti22 = this.p;
        if (c9800ti22 != null) {
            c9800ti22.g();
            this.p = null;
        }
    }

    private Rect h0(Size size) {
        if (y() != null) {
            return y();
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static C3911Pd2 i0(Set<androidx.camera.core.m> set) {
        InterfaceC3849Om1 e = new C3814Od2().e();
        e.h0(InterfaceC5070aN0.h, 34);
        e.h0(InterfaceC6743hD2.I, InterfaceC6986iD2.b.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.m mVar : set) {
            if (mVar.j().g(InterfaceC6743hD2.I)) {
                arrayList.add(mVar.j().g0());
            } else {
                Log.e(u, "A child does not have capture type.");
            }
        }
        e.h0(C3911Pd2.L, arrayList);
        e.h0(InterfaceC6040eN0.f723o, 2);
        return new C3911Pd2(C5932dw1.t0(e));
    }

    @Override // androidx.camera.core.m
    public void I() {
        super.I();
        this.f553o.t();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> K(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2.a<?, ?, ?> aVar) {
        this.f553o.G(aVar.e());
        return aVar.t();
    }

    @Override // androidx.camera.core.m
    public void L() {
        super.L();
        this.f553o.H();
    }

    @Override // androidx.camera.core.m
    public void M() {
        super.M();
        this.f553o.I();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 N(HJ hj) {
        this.t.h(hj);
        X(this.t.q());
        return e().f().d(hj).a();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 O(AbstractC4008Qd2 abstractC4008Qd2) {
        X(e0(i(), j(), abstractC4008Qd2));
        D();
        return abstractC4008Qd2;
    }

    @Override // androidx.camera.core.m
    public void P() {
        super.P();
        d0();
        this.f553o.M();
    }

    public final void c0(T12.b bVar, final String str, final InterfaceC6743hD2<?> interfaceC6743hD2, final AbstractC4008Qd2 abstractC4008Qd2) {
        bVar.g(new T12.c() { // from class: o.Ld2
            @Override // o.T12.c
            public final void a(T12 t12, T12.f fVar) {
                C3716Nd2.a0(C3716Nd2.this, str, interfaceC6743hD2, abstractC4008Qd2, t12, fVar);
            }
        });
    }

    public final T12 e0(String str, InterfaceC6743hD2<?> interfaceC6743hD2, AbstractC4008Qd2 abstractC4008Qd2) {
        C5901do2.c();
        InterfaceC7402jx interfaceC7402jx = (InterfaceC7402jx) C10907yF1.l(g());
        Matrix s = s();
        boolean r = interfaceC7402jx.r();
        Rect h0 = h0(abstractC4008Qd2.e());
        Objects.requireNonNull(h0);
        C6618gi2 c6618gi2 = new C6618gi2(3, 34, abstractC4008Qd2, s, r, h0, p(interfaceC7402jx), -1, B(interfaceC7402jx));
        this.r = c6618gi2;
        this.s = j0(c6618gi2, interfaceC7402jx);
        this.q = new C9800ti2(interfaceC7402jx, V00.a.a(abstractC4008Qd2.b()));
        Map<androidx.camera.core.m, C9800ti2.d> B = this.f553o.B(this.s);
        C9800ti2.c a2 = this.q.a(C9800ti2.b.c(this.s, new ArrayList(B.values())));
        HashMap hashMap = new HashMap();
        for (Map.Entry<androidx.camera.core.m, C9800ti2.d> entry : B.entrySet()) {
            hashMap.put(entry.getKey(), a2.get(entry.getValue()));
        }
        this.f553o.L(hashMap);
        T12.b s2 = T12.b.s(interfaceC6743hD2, abstractC4008Qd2.e());
        s2.n(this.r.o());
        s2.l(this.f553o.D());
        if (abstractC4008Qd2.d() != null) {
            s2.h(abstractC4008Qd2.d());
        }
        c0(s2, str, interfaceC6743hD2, abstractC4008Qd2);
        this.t = s2;
        return s2.q();
    }

    public C6618gi2 f0() {
        return this.r;
    }

    public Set<androidx.camera.core.m> g0() {
        return this.f553o.A();
    }

    public final C6618gi2 j0(C6618gi2 c6618gi2, InterfaceC7402jx interfaceC7402jx) {
        if (l() == null) {
            return c6618gi2;
        }
        this.p = new C9800ti2(interfaceC7402jx, l().a());
        C9800ti2.d h = C9800ti2.d.h(c6618gi2.v(), c6618gi2.q(), c6618gi2.n(), C5433bs2.f(c6618gi2.n(), 0), 0, false);
        C6618gi2 c6618gi22 = this.p.a(C9800ti2.b.c(c6618gi2, Collections.singletonList(h))).get(h);
        Objects.requireNonNull(c6618gi22);
        return c6618gi22;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> k(boolean z, InterfaceC6986iD2 interfaceC6986iD2) {
        HJ a2 = interfaceC6986iD2.a(this.n.g0(), 1);
        if (z) {
            a2 = HJ.J(a2, this.n.d());
        }
        if (a2 == null) {
            return null;
        }
        return x(a2).t();
    }

    public C9800ti2 k0() {
        return this.q;
    }

    public RI2 l0() {
        return this.f553o;
    }

    @Override // androidx.camera.core.m
    public Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.m
    public InterfaceC6743hD2.a<?, ?, ?> x(HJ hj) {
        return new C3814Od2(C2569Bn1.v0(hj));
    }
}
