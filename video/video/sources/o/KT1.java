package o;

import android.util.Range;
import android.util.Rational;
import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public class KT1 extends C4376Tx0 {
    public final InterfaceC6918hx g;
    public final JT1 h;

    /* loaded from: classes.dex */
    public class a implements InterfaceC9802tj0 {
        public a() {
        }

        @Override // o.InterfaceC9802tj0
        public int a() {
            return 0;
        }

        @Override // o.InterfaceC9802tj0
        public Rational b() {
            return Rational.ZERO;
        }

        @Override // o.InterfaceC9802tj0
        public boolean c() {
            return false;
        }

        @Override // o.InterfaceC9802tj0
        public Range<Integer> d() {
            return new Range<>(0, 0);
        }
    }

    public KT1(InterfaceC6918hx interfaceC6918hx, JT1 jt1) {
        super(interfaceC6918hx);
        this.g = interfaceC6918hx;
        this.h = jt1;
    }

    @Override // o.C4376Tx0, o.InterfaceC6918hx
    public InterfaceC6918hx getImplementation() {
        return this.g;
    }

    @Override // o.C4376Tx0, o.InterfaceC6420fx
    public boolean h(C2602Bw0 c2602Bw0) {
        if (this.h.s(c2602Bw0) == null) {
            return false;
        }
        return this.g.h(c2602Bw0);
    }

    @Override // o.C4376Tx0, o.InterfaceC6420fx
    public boolean l() {
        if (!this.h.t(5)) {
            return false;
        }
        return this.g.l();
    }

    @Override // o.C4376Tx0, o.InterfaceC6420fx
    public LiveData<Integer> o() {
        if (!this.h.t(6)) {
            return new C7364jn1(0);
        }
        return this.g.o();
    }

    @Override // o.C4376Tx0, o.InterfaceC6420fx
    public InterfaceC9802tj0 q() {
        if (!this.h.t(7)) {
            return new a();
        }
        return this.g.q();
    }

    @Override // o.C4376Tx0, o.InterfaceC6420fx
    public LiveData<InterfaceC9483sO2> x() {
        if (!this.h.t(0)) {
            return new C7364jn1(HO0.e(1.0f, 1.0f, 1.0f, 0.0f));
        }
        return this.g.x();
    }
}
