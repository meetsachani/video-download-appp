package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AbstractC7840ll;
import o.C11122z81;
import o.C9760tY0;

/* renamed from: o.ol  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8588ol implements InterfaceC6474g70, AbstractC7840ll.b, BX0 {
    public static final int E = 2;
    public static final int F = 16;
    public static final int G = 1;
    public static final int H = 19;
    public Paint A;
    public float B;
    public BlurMaskFilter C;
    public C5353bY0 D;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final Paint d = new C5353bY0(1);
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final Matrix f829o;
    public final C8431o61 p;
    public final C9760tY0 q;
    public C81 r;
    public C8629ov0 s;
    public AbstractC8588ol t;
    public AbstractC8588ol u;
    public List<AbstractC8588ol> v;
    public final List<AbstractC7840ll<?, ?>> w;
    public final C5190as2 x;
    public boolean y;
    public boolean z;

    /* renamed from: o.ol$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[C11122z81.a.values().length];
            b = iArr;
            try {
                iArr[C11122z81.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[C11122z81.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[C11122z81.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[C11122z81.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C9760tY0.a.values().length];
            a = iArr2;
            try {
                iArr2[C9760tY0.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C9760tY0.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[C9760tY0.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C9760tY0.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C9760tY0.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[C9760tY0.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[C9760tY0.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public AbstractC8588ol(C8431o61 c8431o61, C9760tY0 c9760tY0) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new C5353bY0(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new C5353bY0(1, mode2);
        C5353bY0 c5353bY0 = new C5353bY0(1);
        this.g = c5353bY0;
        this.h = new C5353bY0(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.f829o = new Matrix();
        this.w = new ArrayList();
        this.y = true;
        this.B = 0.0f;
        this.p = c8431o61;
        this.q = c9760tY0;
        this.n = c9760tY0.j() + "#draw";
        if (c9760tY0.i() == C9760tY0.b.INVERT) {
            c5353bY0.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c5353bY0.setXfermode(new PorterDuffXfermode(mode));
        }
        C5190as2 b = c9760tY0.x().b();
        this.x = b;
        b.e(this);
        if (c9760tY0.h() != null && !c9760tY0.h().isEmpty()) {
            C81 c81 = new C81(c9760tY0.h());
            this.r = c81;
            for (AbstractC7840ll<R22, Path> abstractC7840ll : c81.a()) {
                abstractC7840ll.a(this);
            }
            for (AbstractC7840ll<Integer, Integer> abstractC7840ll2 : this.r.c()) {
                j(abstractC7840ll2);
                abstractC7840ll2.a(this);
            }
        }
        O();
    }

    public static /* synthetic */ void i(AbstractC8588ol abstractC8588ol) {
        boolean z;
        if (abstractC8588ol.s.r() == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        abstractC8588ol.N(z);
    }

    public static AbstractC8588ol v(YI yi, C9760tY0 c9760tY0, C8431o61 c8431o61, C10624x51 c10624x51) {
        switch (a.a[c9760tY0.g().ordinal()]) {
            case 1:
                return new Y22(c8431o61, c9760tY0, yi, c10624x51);
            case 2:
                return new YI(c8431o61, c9760tY0, c10624x51.p(c9760tY0.n()), c10624x51);
            case 3:
                return new P92(c8431o61, c9760tY0);
            case 4:
                return new C5313bN0(c8431o61, c9760tY0);
            case 5:
                return new C7870ls1(c8431o61, c9760tY0);
            case 6:
                return new C3752Nm2(c8431o61, c9760tY0);
            default:
                C7190j41.e("Unknown layer type " + c9760tY0.g());
                return null;
        }
    }

    public C9760tY0 A() {
        return this.q;
    }

    public boolean B() {
        C81 c81 = this.r;
        if (c81 != null && !c81.a().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean C() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public final void D(RectF rectF, Matrix matrix) {
        this.k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.r.b().size();
            for (int i = 0; i < size; i++) {
                C11122z81 c11122z81 = this.r.b().get(i);
                Path h = this.r.a().get(i).h();
                if (h != null) {
                    this.a.set(h);
                    this.a.transform(matrix);
                    int i2 = a.b[c11122z81.a().ordinal()];
                    if (i2 != 1 && i2 != 2) {
                        if ((i2 != 3 && i2 != 4) || !c11122z81.d()) {
                            this.a.computeBounds(this.m, false);
                            if (i == 0) {
                                this.k.set(this.m);
                            } else {
                                RectF rectF2 = this.k;
                                rectF2.set(Math.min(rectF2.left, this.m.left), Math.min(this.k.top, this.m.top), Math.max(this.k.right, this.m.right), Math.max(this.k.bottom, this.m.bottom));
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (!rectF.intersect(this.k)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public final void E(RectF rectF, Matrix matrix) {
        if (C() && this.q.i() != C9760tY0.b.INVERT) {
            this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.t.h(this.l, matrix, true);
            if (!rectF.intersect(this.l)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public final void F() {
        this.p.invalidateSelf();
    }

    public final void G(float f) {
        this.p.V().o().e(this.q.j(), f);
    }

    public void H(AbstractC7840ll<?, ?> abstractC7840ll) {
        this.w.remove(abstractC7840ll);
    }

    public void J(AbstractC8588ol abstractC8588ol) {
        this.t = abstractC8588ol;
    }

    public void K(boolean z) {
        if (z && this.A == null) {
            this.A = new C5353bY0();
        }
        this.z = z;
    }

    public void L(AbstractC8588ol abstractC8588ol) {
        this.u = abstractC8588ol;
    }

    public void M(float f) {
        if (ZX0.h()) {
            ZX0.b("BaseLayer#setProgress");
            ZX0.b("BaseLayer#setProgress.transform");
        }
        this.x.m(f);
        if (ZX0.h()) {
            ZX0.c("BaseLayer#setProgress.transform");
        }
        if (this.r != null) {
            if (ZX0.h()) {
                ZX0.b("BaseLayer#setProgress.mask");
            }
            for (int i = 0; i < this.r.a().size(); i++) {
                this.r.a().get(i).n(f);
            }
            if (ZX0.h()) {
                ZX0.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.s != null) {
            if (ZX0.h()) {
                ZX0.b("BaseLayer#setProgress.inout");
            }
            this.s.n(f);
            if (ZX0.h()) {
                ZX0.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.t != null) {
            if (ZX0.h()) {
                ZX0.b("BaseLayer#setProgress.matte");
            }
            this.t.M(f);
            if (ZX0.h()) {
                ZX0.c("BaseLayer#setProgress.matte");
            }
        }
        if (ZX0.h()) {
            ZX0.b("BaseLayer#setProgress.animations." + this.w.size());
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            this.w.get(i2).n(f);
        }
        if (ZX0.h()) {
            ZX0.c("BaseLayer#setProgress.animations." + this.w.size());
            ZX0.c("BaseLayer#setProgress");
        }
    }

    public final void N(boolean z) {
        if (z != this.y) {
            this.y = z;
            F();
        }
    }

    public final void O() {
        boolean z = true;
        if (!this.q.f().isEmpty()) {
            C8629ov0 c8629ov0 = new C8629ov0(this.q.f());
            this.s = c8629ov0;
            c8629ov0.m();
            this.s.a(new AbstractC7840ll.b() { // from class: o.nl
                @Override // o.AbstractC7840ll.b
                public final void a() {
                    AbstractC8588ol.i(AbstractC8588ol.this);
                }
            });
            if (this.s.h().floatValue() != 1.0f) {
                z = false;
            }
            N(z);
            j(this.s);
            return;
        }
        N(true);
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        F();
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        AbstractC8588ol abstractC8588ol = this.t;
        if (abstractC8588ol != null) {
            AX0 a2 = ax02.a(abstractC8588ol.getName());
            if (ax0.c(this.t.getName(), i)) {
                list.add(a2.j(this.t));
            }
            if (ax0.h(this.t.getName(), i) && ax0.i(getName(), i)) {
                this.t.I(ax0, ax0.e(this.t.getName(), i) + i, list, a2);
            }
        }
        if (ax0.h(getName(), i)) {
            if (!"__container".equals(getName())) {
                ax02 = ax02.a(getName());
                if (ax0.c(getName(), i)) {
                    list.add(ax02.j(this));
                }
            }
            if (ax0.i(getName(), i)) {
                I(ax0, i + ax0.e(getName(), i), list, ax02);
            }
        }
    }

    public <T> void d(T t, O61<T> o61) {
        this.x.f(t, o61);
    }

    @Override // o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        int i2;
        Paint paint;
        Integer h;
        ZX0.b(this.n);
        if (this.y && !this.q.y()) {
            s();
            if (ZX0.h()) {
                ZX0.b("Layer#parentMatrix");
            }
            this.b.reset();
            this.b.set(matrix);
            for (int size = this.v.size() - 1; size >= 0; size--) {
                this.b.preConcat(this.v.get(size).x.i());
            }
            if (ZX0.h()) {
                ZX0.c("Layer#parentMatrix");
            }
            AbstractC7840ll<?, Integer> k = this.x.k();
            if (k != null && (h = k.h()) != null) {
                i2 = h.intValue();
            } else {
                i2 = 100;
            }
            int i3 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
            if (!C() && !B() && w() == EnumC5110aY0.NORMAL) {
                this.b.preConcat(this.x.i());
                if (ZX0.h()) {
                    ZX0.b("Layer#drawLayer");
                }
                u(canvas, this.b, i3, c10874y70);
                if (ZX0.h()) {
                    ZX0.c("Layer#drawLayer");
                }
                G(ZX0.c(this.n));
                return;
            }
            if (ZX0.h()) {
                ZX0.b("Layer#computeBounds");
            }
            h(this.i, this.b, false);
            E(this.i, matrix);
            this.b.preConcat(this.x.i());
            D(this.i, this.b);
            this.j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.c);
            if (!this.c.isIdentity()) {
                Matrix matrix2 = this.c;
                matrix2.invert(matrix2);
                this.c.mapRect(this.j);
            }
            if (!this.i.intersect(this.j)) {
                this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            if (ZX0.h()) {
                ZX0.c("Layer#computeBounds");
            }
            if (this.i.width() >= 1.0f && this.i.height() >= 1.0f) {
                if (ZX0.h()) {
                    ZX0.b("Layer#saveLayer");
                }
                this.d.setAlpha(255);
                C3889Ox1.c(this.d, w().g());
                C6006eE2.o(canvas, this.i, this.d);
                if (ZX0.h()) {
                    ZX0.c("Layer#saveLayer");
                }
                if (w() != EnumC5110aY0.MULTIPLY) {
                    t(canvas);
                } else if (Build.VERSION.SDK_INT < 29) {
                    if (this.D == null) {
                        C5353bY0 c5353bY0 = new C5353bY0();
                        this.D = c5353bY0;
                        c5353bY0.setColor(-1);
                    }
                    RectF rectF = this.i;
                    canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.D);
                }
                if (ZX0.h()) {
                    ZX0.b("Layer#drawLayer");
                }
                u(canvas, this.b, i3, c10874y70);
                if (ZX0.h()) {
                    ZX0.c("Layer#drawLayer");
                }
                if (B()) {
                    p(canvas, this.b);
                }
                if (C()) {
                    if (ZX0.h()) {
                        ZX0.b("Layer#drawMatte");
                        ZX0.b("Layer#saveLayer");
                    }
                    C6006eE2.p(canvas, this.i, this.g, 19);
                    if (ZX0.h()) {
                        ZX0.c("Layer#saveLayer");
                    }
                    t(canvas);
                    this.t.e(canvas, matrix, i, null);
                    if (ZX0.h()) {
                        ZX0.b("Layer#restoreLayer");
                    }
                    canvas.restore();
                    if (ZX0.h()) {
                        ZX0.c("Layer#restoreLayer");
                        ZX0.c("Layer#drawMatte");
                    }
                }
                if (ZX0.h()) {
                    ZX0.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (ZX0.h()) {
                    ZX0.c("Layer#restoreLayer");
                }
            }
            if (this.z && (paint = this.A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.A.setColor(-251901);
                this.A.setStrokeWidth(4.0f);
                canvas.drawRect(this.i, this.A);
                this.A.setStyle(Paint.Style.FILL);
                this.A.setColor(1357638635);
                canvas.drawRect(this.i, this.A);
            }
            G(ZX0.c(this.n));
            return;
        }
        ZX0.c(this.n);
    }

    @Override // o.DL
    public String getName() {
        return this.q.j();
    }

    @Override // o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f829o.set(matrix);
        if (z) {
            List<AbstractC8588ol> list = this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f829o.preConcat(this.v.get(size).x.i());
                }
            } else {
                AbstractC8588ol abstractC8588ol = this.u;
                if (abstractC8588ol != null) {
                    this.f829o.preConcat(abstractC8588ol.x.i());
                }
            }
        }
        this.f829o.preConcat(this.x.i());
    }

    public void j(AbstractC7840ll<?, ?> abstractC7840ll) {
        if (abstractC7840ll == null) {
            return;
        }
        this.w.add(abstractC7840ll);
    }

    public final void k(Canvas canvas, Matrix matrix, AbstractC7840ll<R22, Path> abstractC7840ll, AbstractC7840ll<Integer, Integer> abstractC7840ll2) {
        this.a.set(abstractC7840ll.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (abstractC7840ll2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
    }

    public final void l(Canvas canvas, Matrix matrix, AbstractC7840ll<R22, Path> abstractC7840ll, AbstractC7840ll<Integer, Integer> abstractC7840ll2) {
        C6006eE2.o(canvas, this.i, this.e);
        this.a.set(abstractC7840ll.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (abstractC7840ll2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, AbstractC7840ll<R22, Path> abstractC7840ll, AbstractC7840ll<Integer, Integer> abstractC7840ll2) {
        C6006eE2.o(canvas, this.i, this.d);
        canvas.drawRect(this.i, this.d);
        this.a.set(abstractC7840ll.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (abstractC7840ll2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, AbstractC7840ll<R22, Path> abstractC7840ll, AbstractC7840ll<Integer, Integer> abstractC7840ll2) {
        C6006eE2.o(canvas, this.i, this.e);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (abstractC7840ll2.h().intValue() * 2.55f));
        this.a.set(abstractC7840ll.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix, AbstractC7840ll<R22, Path> abstractC7840ll, AbstractC7840ll<Integer, Integer> abstractC7840ll2) {
        C6006eE2.o(canvas, this.i, this.f);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (abstractC7840ll2.h().intValue() * 2.55f));
        this.a.set(abstractC7840ll.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void p(Canvas canvas, Matrix matrix) {
        if (ZX0.h()) {
            ZX0.b("Layer#saveLayer");
        }
        C6006eE2.p(canvas, this.i, this.e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (ZX0.h()) {
            ZX0.c("Layer#saveLayer");
        }
        for (int i = 0; i < this.r.b().size(); i++) {
            C11122z81 c11122z81 = this.r.b().get(i);
            AbstractC7840ll<R22, Path> abstractC7840ll = this.r.a().get(i);
            AbstractC7840ll<Integer, Integer> abstractC7840ll2 = this.r.c().get(i);
            int i2 = a.b[c11122z81.a().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (c11122z81.d()) {
                                m(canvas, matrix, abstractC7840ll, abstractC7840ll2);
                            } else {
                                k(canvas, matrix, abstractC7840ll, abstractC7840ll2);
                            }
                        }
                    } else if (c11122z81.d()) {
                        n(canvas, matrix, abstractC7840ll, abstractC7840ll2);
                    } else {
                        l(canvas, matrix, abstractC7840ll, abstractC7840ll2);
                    }
                } else {
                    if (i == 0) {
                        this.d.setColor(-16777216);
                        this.d.setAlpha(255);
                        canvas.drawRect(this.i, this.d);
                    }
                    if (c11122z81.d()) {
                        o(canvas, matrix, abstractC7840ll, abstractC7840ll2);
                    } else {
                        q(canvas, matrix, abstractC7840ll);
                    }
                }
            } else if (r()) {
                this.d.setAlpha(255);
                canvas.drawRect(this.i, this.d);
            }
        }
        if (ZX0.h()) {
            ZX0.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (ZX0.h()) {
            ZX0.c("Layer#restoreLayer");
        }
    }

    public final void q(Canvas canvas, Matrix matrix, AbstractC7840ll<R22, Path> abstractC7840ll) {
        this.a.set(abstractC7840ll.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
    }

    public final boolean r() {
        if (this.r.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.r.b().size(); i++) {
            if (this.r.b().get(i).a() != C11122z81.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
        if (this.v == null) {
            if (this.u == null) {
                this.v = Collections.EMPTY_LIST;
                return;
            }
            this.v = new ArrayList();
            for (AbstractC8588ol abstractC8588ol = this.u; abstractC8588ol != null; abstractC8588ol = abstractC8588ol.u) {
                this.v.add(abstractC8588ol);
            }
        }
    }

    public final void t(Canvas canvas) {
        if (ZX0.h()) {
            ZX0.b("Layer#clearLayer");
        }
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        if (ZX0.h()) {
            ZX0.c("Layer#clearLayer");
        }
    }

    public abstract void u(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70);

    public EnumC5110aY0 w() {
        return this.q.a();
    }

    public C11039yo x() {
        return this.q.b();
    }

    public BlurMaskFilter y(float f) {
        if (this.B == f) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f;
        return blurMaskFilter;
    }

    public C11117z70 z() {
        return this.q.d();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
    }

    public void I(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
    }
}
