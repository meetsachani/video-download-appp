package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import o.AbstractC5921dt2;
import o.TD0;

/* renamed from: o.Ct2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2692Ct2 extends AbstractC5921dt2 {
    public static final int c2 = 1;
    public static final int d2 = 2;
    public static final int e2 = 4;
    public static final int f2 = 8;
    public static final int g2 = 0;
    public static final int h2 = 1;
    public ArrayList<AbstractC5921dt2> X1;
    public boolean Y1;
    public int Z1;
    public boolean a2;
    public int b2;

    /* renamed from: o.Ct2$a */
    /* loaded from: classes.dex */
    public class a extends C10333vt2 {
        public final /* synthetic */ AbstractC5921dt2 a;

        public a(AbstractC5921dt2 abstractC5921dt2) {
            this.a = abstractC5921dt2;
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            this.a.C0();
            abstractC5921dt2.u0(this);
        }
    }

    /* renamed from: o.Ct2$b */
    /* loaded from: classes.dex */
    public class b extends C10333vt2 {
        public b() {
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
            C2692Ct2.this.X1.remove(abstractC5921dt2);
            if (!C2692Ct2.this.c0()) {
                C2692Ct2.this.p0(AbstractC5921dt2.k.c, false);
                C2692Ct2 c2692Ct2 = C2692Ct2.this;
                c2692Ct2.w1 = true;
                c2692Ct2.p0(AbstractC5921dt2.k.b, false);
            }
        }
    }

    /* renamed from: o.Ct2$c */
    /* loaded from: classes.dex */
    public static class c extends C10333vt2 {
        public C2692Ct2 a;

        public c(C2692Ct2 c2692Ct2) {
            this.a = c2692Ct2;
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            C2692Ct2 c2692Ct2 = this.a;
            int i = c2692Ct2.Z1 - 1;
            c2692Ct2.Z1 = i;
            if (i == 0) {
                c2692Ct2.a2 = false;
                c2692Ct2.w();
            }
            abstractC5921dt2.u0(this);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
            C2692Ct2 c2692Ct2 = this.a;
            if (!c2692Ct2.a2) {
                c2692Ct2.P0();
                this.a.a2 = true;
            }
        }
    }

    public C2692Ct2() {
        this.X1 = new ArrayList<>();
        this.Y1 = true;
        this.a2 = false;
        this.b2 = 0;
    }

    @Override // o.AbstractC5921dt2
    public AbstractC5921dt2 C(int i, boolean z) {
        for (int i2 = 0; i2 < this.X1.size(); i2++) {
            this.X1.get(i2).C(i, z);
        }
        return super.C(i, z);
    }

    @Override // o.AbstractC5921dt2
    public void C0() {
        if (this.X1.isEmpty()) {
            P0();
            w();
            return;
        }
        o1();
        if (!this.Y1) {
            for (int i = 1; i < this.X1.size(); i++) {
                this.X1.get(i - 1).d(new a(this.X1.get(i)));
            }
            AbstractC5921dt2 abstractC5921dt2 = this.X1.get(0);
            if (abstractC5921dt2 != null) {
                abstractC5921dt2.C0();
                return;
            }
            return;
        }
        Iterator<AbstractC5921dt2> it = this.X1.iterator();
        while (it.hasNext()) {
            it.next().C0();
        }
    }

    @Override // o.AbstractC5921dt2
    public AbstractC5921dt2 D(View view, boolean z) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).D(view, z);
        }
        return super.D(view, z);
    }

    @Override // o.AbstractC5921dt2
    public void D0(boolean z) {
        super.D0(z);
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).D0(z);
        }
    }

    @Override // o.AbstractC5921dt2
    public AbstractC5921dt2 E(Class<?> cls, boolean z) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).E(cls, z);
        }
        return super.E(cls, z);
    }

    @Override // o.AbstractC5921dt2
    public AbstractC5921dt2 F(String str, boolean z) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).F(str, z);
        }
        return super.F(str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC5921dt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F0(long j, long j2) {
        boolean z;
        long j3;
        long Y = Y();
        long j4 = 0;
        if (this.m1 != null) {
            if (j >= 0 || j2 >= 0) {
                if (j > Y && j2 > Y) {
                    return;
                }
            } else {
                return;
            }
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i2 >= 0 && j2 < 0) || (j <= Y && j2 > Y)) {
            this.w1 = false;
            p0(AbstractC5921dt2.k.a, z);
        }
        if (this.Y1) {
            for (int i3 = 0; i3 < this.X1.size(); i3++) {
                this.X1.get(i3).F0(j, j2);
            }
        } else {
            int d1 = d1(j2);
            if (i >= 0) {
                while (d1 < this.X1.size()) {
                    AbstractC5921dt2 abstractC5921dt2 = this.X1.get(d1);
                    long j5 = abstractC5921dt2.G1;
                    j3 = j4;
                    long j6 = j - j5;
                    if (j6 < j3) {
                        break;
                    }
                    abstractC5921dt2.F0(j6, j2 - j5);
                    d1++;
                    j4 = j3;
                }
            } else {
                j3 = 0;
                while (d1 >= 0) {
                    AbstractC5921dt2 abstractC5921dt22 = this.X1.get(d1);
                    long j7 = abstractC5921dt22.G1;
                    long j8 = j - j7;
                    abstractC5921dt22.F0(j8, j2 - j7);
                    if (j8 >= 0) {
                        break;
                    }
                    d1--;
                }
            }
            if (this.m1 == null) {
                int i4 = (j > Y ? 1 : (j == Y ? 0 : -1));
                if ((i4 > 0 && j2 <= Y) || (i2 < 0 && j2 >= j3)) {
                    if (i4 > 0) {
                        this.w1 = true;
                    }
                    p0(AbstractC5921dt2.k.b, z);
                    return;
                }
                return;
            }
            return;
        }
        j3 = j4;
        if (this.m1 == null) {
        }
    }

    @Override // o.AbstractC5921dt2
    public void I(ViewGroup viewGroup) {
        super.I(viewGroup);
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).I(viewGroup);
        }
    }

    @Override // o.AbstractC5921dt2
    public void J0(AbstractC5921dt2.f fVar) {
        super.J0(fVar);
        this.b2 |= 8;
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).J0(fVar);
        }
    }

    @Override // o.AbstractC5921dt2
    public void M0(AbstractC9139qz1 abstractC9139qz1) {
        super.M0(abstractC9139qz1);
        this.b2 |= 4;
        if (this.X1 != null) {
            for (int i = 0; i < this.X1.size(); i++) {
                this.X1.get(i).M0(abstractC9139qz1);
            }
        }
    }

    @Override // o.AbstractC5921dt2
    public void N0(AbstractC11305zt2 abstractC11305zt2) {
        super.N0(abstractC11305zt2);
        this.b2 |= 2;
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).N0(abstractC11305zt2);
        }
    }

    @Override // o.AbstractC5921dt2
    public String Q0(String str) {
        String Q0 = super.Q0(str);
        for (int i = 0; i < this.X1.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(Q0);
            sb.append("\n");
            sb.append(this.X1.get(i).Q0(str + TD0.a.Y0));
            Q0 = sb.toString();
        }
        return Q0;
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: R0 */
    public C2692Ct2 d(AbstractC5921dt2.j jVar) {
        return (C2692Ct2) super.d(jVar);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: S0 */
    public C2692Ct2 e(int i) {
        for (int i2 = 0; i2 < this.X1.size(); i2++) {
            this.X1.get(i2).e(i);
        }
        return (C2692Ct2) super.e(i);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: T0 */
    public C2692Ct2 f(View view) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).f(view);
        }
        return (C2692Ct2) super.f(view);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: V0 */
    public C2692Ct2 g(Class<?> cls) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).g(cls);
        }
        return (C2692Ct2) super.g(cls);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: W0 */
    public C2692Ct2 h(String str) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).h(str);
        }
        return (C2692Ct2) super.h(str);
    }

    public C2692Ct2 X0(AbstractC5921dt2 abstractC5921dt2) {
        Y0(abstractC5921dt2);
        long j = this.Z;
        if (j >= 0) {
            abstractC5921dt2.I0(j);
        }
        if ((this.b2 & 1) != 0) {
            abstractC5921dt2.K0(M());
        }
        if ((this.b2 & 2) != 0) {
            abstractC5921dt2.N0(Q());
        }
        if ((this.b2 & 4) != 0) {
            abstractC5921dt2.M0(P());
        }
        if ((this.b2 & 8) != 0) {
            abstractC5921dt2.J0(L());
        }
        return this;
    }

    public final void Y0(AbstractC5921dt2 abstractC5921dt2) {
        this.X1.add(abstractC5921dt2);
        abstractC5921dt2.m1 = this;
    }

    public int a1() {
        return !this.Y1 ? 1 : 0;
    }

    public AbstractC5921dt2 b1(int i) {
        if (i >= 0 && i < this.X1.size()) {
            return this.X1.get(i);
        }
        return null;
    }

    @Override // o.AbstractC5921dt2
    public boolean c0() {
        for (int i = 0; i < this.X1.size(); i++) {
            if (this.X1.get(i).c0()) {
                return true;
            }
        }
        return false;
    }

    public int c1() {
        return this.X1.size();
    }

    @Override // o.AbstractC5921dt2
    public void cancel() {
        super.cancel();
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).cancel();
        }
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            if (!this.X1.get(i).d0()) {
                return false;
            }
        }
        return true;
    }

    public final int d1(long j) {
        for (int i = 1; i < this.X1.size(); i++) {
            if (this.X1.get(i).G1 > j) {
                return i - 1;
            }
        }
        return this.X1.size() - 1;
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: e1 */
    public C2692Ct2 u0(AbstractC5921dt2.j jVar) {
        return (C2692Ct2) super.u0(jVar);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: f1 */
    public C2692Ct2 v0(int i) {
        for (int i2 = 0; i2 < this.X1.size(); i2++) {
            this.X1.get(i2).v0(i);
        }
        return (C2692Ct2) super.v0(i);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: g1 */
    public C2692Ct2 w0(View view) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).w0(view);
        }
        return (C2692Ct2) super.w0(view);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: h1 */
    public C2692Ct2 x0(Class<?> cls) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).x0(cls);
        }
        return (C2692Ct2) super.x0(cls);
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: i1 */
    public C2692Ct2 y0(String str) {
        for (int i = 0; i < this.X1.size(); i++) {
            this.X1.get(i).y0(str);
        }
        return (C2692Ct2) super.y0(str);
    }

    public C2692Ct2 j1(AbstractC5921dt2 abstractC5921dt2) {
        this.X1.remove(abstractC5921dt2);
        abstractC5921dt2.m1 = null;
        return this;
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: k1 */
    public C2692Ct2 I0(long j) {
        ArrayList<AbstractC5921dt2> arrayList;
        super.I0(j);
        if (this.Z >= 0 && (arrayList = this.X1) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.X1.get(i).I0(j);
            }
        }
        return this;
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: l1 */
    public C2692Ct2 K0(TimeInterpolator timeInterpolator) {
        this.b2 |= 1;
        ArrayList<AbstractC5921dt2> arrayList = this.X1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.X1.get(i).K0(timeInterpolator);
            }
        }
        return (C2692Ct2) super.K0(timeInterpolator);
    }

    @Override // o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        if (h0(c3291It2.b)) {
            Iterator<AbstractC5921dt2> it = this.X1.iterator();
            while (it.hasNext()) {
                AbstractC5921dt2 next = it.next();
                if (next.h0(c3291It2.b)) {
                    next.m(c3291It2);
                    c3291It2.c.add(next);
                }
            }
        }
    }

    public C2692Ct2 m1(int i) {
        if (i != 0) {
            if (i == 1) {
                this.Y1 = false;
                return this;
            }
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        this.Y1 = true;
        return this;
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: n1 */
    public C2692Ct2 O0(long j) {
        return (C2692Ct2) super.O0(j);
    }

    @Override // o.AbstractC5921dt2
    public void o(C3291It2 c3291It2) {
        super.o(c3291It2);
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).o(c3291It2);
        }
    }

    public final void o1() {
        c cVar = new c(this);
        Iterator<AbstractC5921dt2> it = this.X1.iterator();
        while (it.hasNext()) {
            it.next().d(cVar);
        }
        this.Z1 = this.X1.size();
    }

    @Override // o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        if (h0(c3291It2.b)) {
            Iterator<AbstractC5921dt2> it = this.X1.iterator();
            while (it.hasNext()) {
                AbstractC5921dt2 next = it.next();
                if (next.h0(c3291It2.b)) {
                    next.p(c3291It2);
                    c3291It2.c.add(next);
                }
            }
        }
    }

    @Override // o.AbstractC5921dt2
    public void r0(View view) {
        super.r0(view);
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).r0(view);
        }
    }

    @Override // o.AbstractC5921dt2
    /* renamed from: s */
    public AbstractC5921dt2 clone() {
        C2692Ct2 c2692Ct2 = (C2692Ct2) super.clone();
        c2692Ct2.X1 = new ArrayList<>();
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            c2692Ct2.Y0(this.X1.get(i).clone());
        }
        return c2692Ct2;
    }

    @Override // o.AbstractC5921dt2
    public void t0() {
        this.E1 = 0L;
        b bVar = new b();
        for (int i = 0; i < this.X1.size(); i++) {
            AbstractC5921dt2 abstractC5921dt2 = this.X1.get(i);
            abstractC5921dt2.d(bVar);
            abstractC5921dt2.t0();
            long Y = abstractC5921dt2.Y();
            if (this.Y1) {
                this.E1 = Math.max(this.E1, Y);
            } else {
                long j = this.E1;
                abstractC5921dt2.G1 = j;
                this.E1 = j + Y;
            }
        }
    }

    @Override // o.AbstractC5921dt2
    public void u(ViewGroup viewGroup, C3389Jt2 c3389Jt2, C3389Jt2 c3389Jt22, ArrayList<C3291It2> arrayList, ArrayList<C3291It2> arrayList2) {
        long T = T();
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            AbstractC5921dt2 abstractC5921dt2 = this.X1.get(i);
            if (T > 0 && (this.Y1 || i == 0)) {
                long T2 = abstractC5921dt2.T();
                if (T2 > 0) {
                    abstractC5921dt2.O0(T2 + T);
                } else {
                    abstractC5921dt2.O0(T);
                }
            }
            abstractC5921dt2.u(viewGroup, c3389Jt2, c3389Jt22, arrayList, arrayList2);
        }
    }

    @Override // o.AbstractC5921dt2
    public void z0(View view) {
        super.z0(view);
        int size = this.X1.size();
        for (int i = 0; i < size; i++) {
            this.X1.get(i).z0(view);
        }
    }

    public C2692Ct2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X1 = new ArrayList<>();
        this.Y1 = true;
        this.a2 = false;
        this.b2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.i);
        m1(C5206aw2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
