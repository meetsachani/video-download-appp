package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.vV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10237vV0 extends DV0 implements Iterable<DV0> {
    public final ArrayList<DV0> X;

    public C10237vV0() {
        this.X = new ArrayList<>();
    }

    @Override // o.DV0
    public long F() {
        return j0().F();
    }

    @Override // o.DV0
    public Number G() {
        return j0().G();
    }

    @Override // o.DV0
    public short H() {
        return j0().H();
    }

    @Override // o.DV0
    public String J() {
        return j0().J();
    }

    public void U(Boolean bool) {
        DV0 mv0;
        ArrayList<DV0> arrayList = this.X;
        if (bool == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(bool);
        }
        arrayList.add(mv0);
    }

    public void V(Character ch) {
        DV0 mv0;
        ArrayList<DV0> arrayList = this.X;
        if (ch == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(ch);
        }
        arrayList.add(mv0);
    }

    public void X(Number number) {
        DV0 mv0;
        ArrayList<DV0> arrayList = this.X;
        if (number == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(number);
        }
        arrayList.add(mv0);
    }

    public void Y(String str) {
        DV0 mv0;
        ArrayList<DV0> arrayList = this.X;
        if (str == null) {
            mv0 = HV0.X;
        } else {
            mv0 = new MV0(str);
        }
        arrayList.add(mv0);
    }

    public void a0(DV0 dv0) {
        if (dv0 == null) {
            dv0 = HV0.X;
        }
        this.X.add(dv0);
    }

    public void b0(C10237vV0 c10237vV0) {
        this.X.addAll(c10237vV0.X);
    }

    public List<DV0> d0() {
        return new C6155er1(this.X);
    }

    @Override // o.DV0
    public BigDecimal e() {
        return j0().e();
    }

    public boolean e0(DV0 dv0) {
        return this.X.contains(dv0);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C10237vV0) || !((C10237vV0) obj).X.equals(this.X)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // o.DV0
    public BigInteger f() {
        return j0().f();
    }

    @Override // o.DV0
    /* renamed from: f0 */
    public C10237vV0 d() {
        if (!this.X.isEmpty()) {
            C10237vV0 c10237vV0 = new C10237vV0(this.X.size());
            Iterator<DV0> it = this.X.iterator();
            while (it.hasNext()) {
                c10237vV0.a0(it.next().d());
            }
            return c10237vV0;
        }
        return new C10237vV0();
    }

    @Override // o.DV0
    public boolean h() {
        return j0().h();
    }

    public DV0 h0(int i) {
        return this.X.get(i);
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // o.DV0
    public byte i() {
        return j0().i();
    }

    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<DV0> iterator() {
        return this.X.iterator();
    }

    @Override // o.DV0
    @Deprecated
    public char j() {
        return j0().j();
    }

    public final DV0 j0() {
        int size = this.X.size();
        if (size == 1) {
            return this.X.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // o.DV0
    public double k() {
        return j0().k();
    }

    @InterfaceC6181ey
    public DV0 k0(int i) {
        return this.X.remove(i);
    }

    @Override // o.DV0
    public float l() {
        return j0().l();
    }

    @InterfaceC6181ey
    public boolean l0(DV0 dv0) {
        return this.X.remove(dv0);
    }

    @InterfaceC6181ey
    public DV0 m0(int i, DV0 dv0) {
        ArrayList<DV0> arrayList = this.X;
        if (dv0 == null) {
            dv0 = HV0.X;
        }
        return arrayList.set(i, dv0);
    }

    @Override // o.DV0
    public int p() {
        return j0().p();
    }

    public int size() {
        return this.X.size();
    }

    public C10237vV0(int i) {
        this.X = new ArrayList<>(i);
    }
}
