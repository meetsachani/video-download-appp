package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.InterfaceC7583kh1;
import o.InterfaceC8921q70;
import o.InterfaceC9309rh1;

@Deprecated
/* renamed from: o.wl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10541wl implements InterfaceC7583kh1 {
    @InterfaceC11300zs1
    public Looper Z0;
    @InterfaceC11300zs1
    public AbstractC7373jp2 a1;
    @InterfaceC11300zs1
    public ND1 b1;
    public final ArrayList<InterfaceC7583kh1.c> X = new ArrayList<>(1);
    public final HashSet<InterfaceC7583kh1.c> Y = new HashSet<>(1);
    public final InterfaceC9309rh1.a Z = new InterfaceC9309rh1.a();
    public final InterfaceC8921q70.a Y0 = new InterfaceC8921q70.a();

    @Override // o.InterfaceC7583kh1
    public final void A(InterfaceC7583kh1.c cVar) {
        C9542sf.g(this.Z0);
        boolean isEmpty = this.Y.isEmpty();
        this.Y.add(cVar);
        if (isEmpty) {
            g0();
        }
    }

    @Override // o.InterfaceC7583kh1
    public final void G(InterfaceC7583kh1.c cVar, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, ND1 nd1) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.Z0;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        this.b1 = nd1;
        AbstractC7373jp2 abstractC7373jp2 = this.a1;
        this.X.add(cVar);
        if (this.Z0 == null) {
            this.Z0 = myLooper;
            this.Y.add(cVar);
            k0(interfaceC4261Sr2);
        } else if (abstractC7373jp2 != null) {
            A(cVar);
            cVar.L(this, abstractC7373jp2);
        }
    }

    @Override // o.InterfaceC7583kh1
    public final void T(InterfaceC7583kh1.c cVar) {
        boolean isEmpty = this.Y.isEmpty();
        this.Y.remove(cVar);
        if (!isEmpty && this.Y.isEmpty()) {
            e0();
        }
    }

    @Override // o.InterfaceC7583kh1
    public final void U(InterfaceC9309rh1 interfaceC9309rh1) {
        this.Z.v(interfaceC9309rh1);
    }

    @Override // o.InterfaceC7583kh1
    public final void V(Handler handler, InterfaceC9309rh1 interfaceC9309rh1) {
        C9542sf.g(handler);
        C9542sf.g(interfaceC9309rh1);
        this.Z.g(handler, interfaceC9309rh1);
    }

    public final InterfaceC8921q70.a X(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        return this.Y0.o(i, bVar);
    }

    public final InterfaceC8921q70.a Y(@InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        return this.Y0.o(0, bVar);
    }

    public final InterfaceC9309rh1.a Z(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        return this.Z.y(i, bVar);
    }

    @Override // o.InterfaceC7583kh1
    public final void a(InterfaceC7583kh1.c cVar, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        G(cVar, interfaceC4261Sr2, ND1.b);
    }

    @Deprecated
    public final InterfaceC9309rh1.a a0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, long j) {
        return this.Z.y(i, bVar);
    }

    public final InterfaceC9309rh1.a b0(@InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        return this.Z.y(0, bVar);
    }

    @Deprecated
    public final InterfaceC9309rh1.a c0(InterfaceC7583kh1.b bVar, long j) {
        C9542sf.g(bVar);
        return this.Z.y(0, bVar);
    }

    public final ND1 i0() {
        return (ND1) C9542sf.k(this.b1);
    }

    public final boolean j0() {
        return !this.Y.isEmpty();
    }

    public abstract void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2);

    @Override // o.InterfaceC7583kh1
    public final void m(Handler handler, InterfaceC8921q70 interfaceC8921q70) {
        C9542sf.g(handler);
        C9542sf.g(interfaceC8921q70);
        this.Y0.g(handler, interfaceC8921q70);
    }

    @Override // o.InterfaceC7583kh1
    public final void o(InterfaceC8921q70 interfaceC8921q70) {
        this.Y0.n(interfaceC8921q70);
    }

    public final void p0(AbstractC7373jp2 abstractC7373jp2) {
        this.a1 = abstractC7373jp2;
        Iterator<InterfaceC7583kh1.c> it = this.X.iterator();
        while (it.hasNext()) {
            it.next().L(this, abstractC7373jp2);
        }
    }

    public abstract void q0();

    @Override // o.InterfaceC7583kh1
    public final void u(InterfaceC7583kh1.c cVar) {
        this.X.remove(cVar);
        if (this.X.isEmpty()) {
            this.Z0 = null;
            this.a1 = null;
            this.b1 = null;
            this.Y.clear();
            q0();
            return;
        }
        T(cVar);
    }

    public void e0() {
    }

    public void g0() {
    }
}
