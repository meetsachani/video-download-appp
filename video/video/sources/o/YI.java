package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.C6665gu1;
import o.C9760tY0;

/* loaded from: classes.dex */
public class YI extends AbstractC8588ol {
    public AbstractC7840ll<Float, Float> I;
    public final List<AbstractC8588ol> J;
    public final RectF K;
    public final RectF L;
    public final RectF M;
    public final C6665gu1 N;
    public final C6665gu1.b O;
    public Boolean P;
    public Boolean Q;
    public float R;
    public boolean S;
    public B70 T;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C9760tY0.b.values().length];
            a = iArr;
            try {
                iArr[C9760tY0.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C9760tY0.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public YI(C8431o61 c8431o61, C9760tY0 c9760tY0, List<C9760tY0> list, C10624x51 c10624x51) {
        super(c8431o61, c9760tY0);
        int i;
        AbstractC8588ol abstractC8588ol;
        this.J = new ArrayList();
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new C6665gu1();
        this.O = new C6665gu1.b();
        this.S = true;
        C9177r9 v = c9760tY0.v();
        if (v != null) {
            C8629ov0 a2 = v.a();
            this.I = a2;
            j(a2);
            this.I.a(this);
        } else {
            this.I = null;
        }
        C5484c51 c5484c51 = new C5484c51(c10624x51.k().size());
        int size = list.size() - 1;
        AbstractC8588ol abstractC8588ol2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C9760tY0 c9760tY02 = list.get(size);
            AbstractC8588ol v2 = AbstractC8588ol.v(this, c9760tY02, c8431o61, c10624x51);
            if (v2 != null) {
                c5484c51.n(v2.A().e(), v2);
                if (abstractC8588ol2 != null) {
                    abstractC8588ol2.J(v2);
                    abstractC8588ol2 = null;
                } else {
                    this.J.add(0, v2);
                    int i2 = a.a[c9760tY02.i().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        abstractC8588ol2 = v2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < c5484c51.w(); i++) {
            AbstractC8588ol abstractC8588ol3 = (AbstractC8588ol) c5484c51.h(c5484c51.m(i));
            if (abstractC8588ol3 != null && (abstractC8588ol = (AbstractC8588ol) c5484c51.h(abstractC8588ol3.A().k())) != null) {
                abstractC8588ol3.L(abstractC8588ol);
            }
        }
        if (z() != null) {
            this.T = new B70(this, this, z());
        }
    }

    @Override // o.AbstractC8588ol
    public void I(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            this.J.get(i2).c(ax0, i, list, ax02);
        }
    }

    @Override // o.AbstractC8588ol
    public void K(boolean z) {
        super.K(z);
        for (AbstractC8588ol abstractC8588ol : this.J) {
            abstractC8588ol.K(z);
        }
    }

    @Override // o.AbstractC8588ol
    public void M(float f) {
        if (ZX0.h()) {
            ZX0.b("CompositionLayer#setProgress");
        }
        this.R = f;
        super.M(f);
        if (this.I != null) {
            f = ((this.I.h().floatValue() * this.q.c().i()) - this.q.c().r()) / (this.p.V().e() + 0.01f);
        }
        if (this.I == null) {
            f -= this.q.s();
        }
        if (this.q.w() != 0.0f && !"__container".equals(this.q.j())) {
            f /= this.q.w();
        }
        for (int size = this.J.size() - 1; size >= 0; size--) {
            this.J.get(size).M(f);
        }
        if (ZX0.h()) {
            ZX0.c("CompositionLayer#setProgress");
        }
    }

    public float P() {
        return this.R;
    }

    public boolean Q() {
        if (this.Q == null) {
            for (int size = this.J.size() - 1; size >= 0; size--) {
                AbstractC8588ol abstractC8588ol = this.J.get(size);
                if (abstractC8588ol instanceof Y22) {
                    if (abstractC8588ol.B()) {
                        this.Q = Boolean.TRUE;
                        return true;
                    }
                } else if ((abstractC8588ol instanceof YI) && ((YI) abstractC8588ol).Q()) {
                    this.Q = Boolean.TRUE;
                    return true;
                }
            }
            this.Q = Boolean.FALSE;
        }
        return this.Q.booleanValue();
    }

    public boolean R() {
        if (this.P == null) {
            if (C()) {
                this.P = Boolean.TRUE;
                return true;
            }
            for (int size = this.J.size() - 1; size >= 0; size--) {
                if (this.J.get(size).C()) {
                    this.P = Boolean.TRUE;
                    return true;
                }
            }
            this.P = Boolean.FALSE;
        }
        return this.P.booleanValue();
    }

    public void S(boolean z) {
        this.S = z;
    }

    @Override // o.AbstractC8588ol, o.BX0
    public <T> void d(T t, O61<T> o61) {
        B70 b70;
        B70 b702;
        B70 b703;
        B70 b704;
        B70 b705;
        super.d(t, o61);
        if (t == D61.H) {
            if (o61 == null) {
                AbstractC7840ll<Float, Float> abstractC7840ll = this.I;
                if (abstractC7840ll != null) {
                    abstractC7840ll.o(null);
                    return;
                }
                return;
            }
            CE2 ce2 = new CE2(o61);
            this.I = ce2;
            ce2.a(this);
            j(this.I);
        } else if (t == D61.e && (b705 = this.T) != null) {
            b705.c(o61);
        } else if (t == D61.J && (b704 = this.T) != null) {
            b704.f(o61);
        } else if (t == D61.K && (b703 = this.T) != null) {
            b703.d(o61);
        } else if (t == D61.L && (b702 = this.T) != null) {
            b702.e(o61);
        } else if (t == D61.M && (b70 = this.T) != null) {
            b70.g(o61);
        }
    }

    @Override // o.AbstractC8588ol, o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        super.h(rectF, matrix, z);
        for (int size = this.J.size() - 1; size >= 0; size--) {
            this.K.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.J.get(size).h(this.K, this.f829o, true);
            rectF.union(this.K);
        }
    }

    @Override // o.AbstractC8588ol
    public void u(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        boolean z;
        Canvas canvas2;
        if (ZX0.h()) {
            ZX0.b("CompositionLayer#draw");
        }
        boolean z2 = false;
        if (c10874y70 == null && this.T == null) {
            z = false;
        } else {
            z = true;
        }
        int i2 = 255;
        if ((this.p.u0() && this.J.size() > 1 && i != 255) || (z && this.p.v0())) {
            z2 = true;
        }
        if (!z2) {
            i2 = i;
        }
        B70 b70 = this.T;
        if (b70 != null) {
            c10874y70 = b70.b(matrix, i2);
        }
        if (!this.S && "__container".equals(this.q.j())) {
            this.L.setEmpty();
            for (AbstractC8588ol abstractC8588ol : this.J) {
                abstractC8588ol.h(this.M, matrix, true);
                this.L.union(this.M);
            }
        } else {
            this.L.set(0.0f, 0.0f, this.q.m(), this.q.l());
            matrix.mapRect(this.L);
        }
        if (z2) {
            this.O.f();
            C6665gu1.b bVar = this.O;
            bVar.a = i;
            if (c10874y70 != null) {
                c10874y70.b(bVar);
                c10874y70 = null;
            }
            canvas2 = this.N.j(canvas, this.L, this.O);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.L)) {
            for (int size = this.J.size() - 1; size >= 0; size--) {
                this.J.get(size).e(canvas2, matrix, i2, c10874y70);
            }
        }
        if (z2) {
            this.N.e();
        }
        canvas.restore();
        if (ZX0.h()) {
            ZX0.c("CompositionLayer#draw");
        }
    }
}
