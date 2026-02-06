package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;

/* loaded from: classes.dex */
public class E60 extends Drawable implements Drawable.Callback {
    public static final boolean h1 = false;
    public static final String i1 = "DrawableContainerCompat";
    public static final boolean j1 = true;
    public d X;
    public Rect Y;
    public Drawable Y0;
    public Drawable Z;
    public boolean a1;
    public boolean c1;
    public Runnable d1;
    public long e1;
    public long f1;
    public c g1;
    public int Z0 = 255;
    public int b1 = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            E60.this.a(true);
            E60.this.invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final E60 a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray<Drawable.ConstantState> f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f444o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public d(d dVar, E60 e60, Resources resources) {
            Resources resources2;
            int i;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = e60;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.b;
            } else {
                resources2 = null;
            }
            this.b = resources2;
            if (dVar != null) {
                i = dVar.c;
            } else {
                i = 0;
            }
            int g = E60.g(resources, i);
            this.c = g;
            if (dVar != null) {
                this.d = dVar.d;
                this.e = dVar.e;
                this.v = true;
                this.w = true;
                this.i = dVar.i;
                this.l = dVar.l;
                this.x = dVar.x;
                this.y = dVar.y;
                this.z = dVar.z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.c == g) {
                    if (dVar.j) {
                        this.k = dVar.k != null ? new Rect(dVar.k) : null;
                        this.j = true;
                    }
                    if (dVar.m) {
                        this.n = dVar.n;
                        this.f444o = dVar.f444o;
                        this.p = dVar.p;
                        this.q = dVar.q;
                        this.m = true;
                    }
                }
                if (dVar.r) {
                    this.s = dVar.s;
                    this.r = true;
                }
                if (dVar.t) {
                    this.u = dVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = dVar.g;
                this.g = new Drawable[drawableArr.length];
                this.h = dVar.h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f;
                if (sparseArray != null) {
                    this.f = sparseArray.clone();
                } else {
                    this.f = new SparseArray<>(this.h);
                }
                int i2 = this.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f.put(i3, constantState);
                        } else {
                            this.g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        public final boolean A(int i, int i2) {
            int i3 = this.h;
            Drawable[] drawableArr = this.g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean m = D60.m(drawable, i);
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.z = i;
            return z;
        }

        public final void B(boolean z) {
            this.i = z;
        }

        public final void C(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int g = E60.g(resources, this.c);
                int i = this.c;
                this.c = g;
                if (i != g) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i = this.h;
            if (i >= this.g.length) {
                r(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.g[i] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            s();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i = this.h;
                Drawable[] drawableArr = this.g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && D60.b(drawable)) {
                        D60.a(drawableArr[i2], theme);
                        this.e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                C(b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.w;
            }
            f();
            this.v = true;
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (D60.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f.get(i2);
                    if (constantState != null && b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void d() {
            this.y = false;
        }

        public void e() {
            this.m = true;
            f();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            this.f444o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f444o) {
                    this.f444o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.g[this.f.keyAt(i)] = w(this.f.valueAt(i).newDrawable(this.b));
                }
                this.f = null;
            }
        }

        public final int g() {
            return this.g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Drawable h(int i) {
            int indexOfKey;
            Drawable drawable = this.g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable w = w(this.f.valueAt(indexOfKey).newDrawable(this.b));
            this.g[i] = w;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return w;
        }

        public final int i() {
            return this.h;
        }

        public final int j() {
            if (!this.m) {
                e();
            }
            return this.f444o;
        }

        public final int k() {
            if (!this.m) {
                e();
            }
            return this.q;
        }

        public final int l() {
            if (!this.m) {
                e();
            }
            return this.p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.i) {
                return null;
            }
            Rect rect2 = this.k;
            if (rect2 == null && !this.j) {
                f();
                Rect rect3 = new Rect();
                int i = this.h;
                Drawable[] drawableArr = this.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect3.left;
                        if (i3 > rect.left) {
                            rect.left = i3;
                        }
                        int i4 = rect3.top;
                        if (i4 > rect.top) {
                            rect.top = i4;
                        }
                        int i5 = rect3.right;
                        if (i5 > rect.right) {
                            rect.right = i5;
                        }
                        int i6 = rect3.bottom;
                        if (i6 > rect.bottom) {
                            rect.bottom = i6;
                        }
                    }
                }
                this.j = true;
                this.k = rect;
                return rect;
            }
            return rect2;
        }

        public final int n() {
            if (!this.m) {
                e();
            }
            return this.n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            int i;
            if (this.r) {
                return this.s;
            }
            f();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.s = i;
            this.r = true;
            return i;
        }

        public void r(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.g = drawableArr;
        }

        public void s() {
            this.r = false;
            this.t = false;
        }

        public final boolean t() {
            return this.l;
        }

        public final boolean u() {
            if (this.t) {
                return this.u;
            }
            f();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.u = z;
            this.t = true;
            return z;
        }

        public void v() {
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.y = true;
        }

        public final Drawable w(Drawable drawable) {
            D60.m(drawable, this.z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        public final void x(boolean z) {
            this.l = z;
        }

        public final void y(int i) {
            this.A = i;
        }

        public final void z(int i) {
            this.B = i;
        }
    }

    public static int g(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.a1 = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            long j = this.e1;
            if (j != 0) {
                if (j <= uptimeMillis) {
                    drawable2.setAlpha(this.Z0);
                    this.e1 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.X.A)) * this.Z0) / 255);
                    z2 = true;
                    drawable = this.Y0;
                    if (drawable == null) {
                        long j2 = this.f1;
                        if (j2 != 0) {
                            if (j2 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.Y0 = null;
                                this.f1 = 0L;
                            } else {
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.X.B) * this.Z0) / 255);
                                if (z && z3) {
                                    scheduleSelf(this.d1, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        this.f1 = 0L;
                    }
                    z3 = z2;
                    if (z) {
                        return;
                    }
                    return;
                }
            }
        } else {
            this.e1 = 0L;
        }
        z2 = false;
        drawable = this.Y0;
        if (drawable == null) {
        }
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.X.b(theme);
    }

    public void b() {
        this.X.d();
        this.c1 = false;
    }

    public d c() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.X.canApplyTheme();
    }

    public int d() {
        return this.b1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.Z;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.Y0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e(Drawable drawable) {
        if (this.g1 == null) {
            this.g1 = new c();
        }
        drawable.setCallback(this.g1.b(drawable.getCallback()));
        try {
            if (this.X.A <= 0 && this.a1) {
                drawable.setAlpha(this.Z0);
            }
            d dVar = this.X;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    D60.o(drawable, dVar.F);
                }
                d dVar2 = this.X;
                if (dVar2.I) {
                    D60.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.X.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            D60.m(drawable, D60.f(this));
            D60.j(drawable, this.X.C);
            Rect rect = this.Y;
            if (rect != null) {
                D60.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.g1.a());
        } catch (Throwable th) {
            drawable.setCallback(this.g1.a());
            throw th;
        }
    }

    public final boolean f() {
        if (isAutoMirrored() && D60.f(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Z0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.X.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.X.c()) {
            this.X.d = getChangingConfigurations();
            return this.X;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.Z;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.Y;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.X.t()) {
            return this.X.j();
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.X.t()) {
            return this.X.n();
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.X.t()) {
            return this.X.k();
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.X.t()) {
            return this.X.l();
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.Z;
        if (drawable != null && drawable.isVisible()) {
            return this.X.q();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.Z;
        if (drawable != null) {
            b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m = this.X.m();
        if (m != null) {
            rect.set(m);
            if ((m.right | m.left | m.top | m.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.Z;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (f()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(int i) {
        Runnable runnable;
        if (i == this.b1) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.X.B > 0) {
            Drawable drawable = this.Y0;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.Z;
            if (drawable2 != null) {
                this.Y0 = drawable2;
                this.f1 = this.X.B + uptimeMillis;
            } else {
                this.Y0 = null;
                this.f1 = 0L;
            }
        } else {
            Drawable drawable3 = this.Z;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            d dVar = this.X;
            if (i < dVar.h) {
                Drawable h = dVar.h(i);
                this.Z = h;
                this.b1 = i;
                if (h != null) {
                    int i2 = this.X.A;
                    if (i2 > 0) {
                        this.e1 = uptimeMillis + i2;
                    }
                    e(h);
                }
                if (this.e1 == 0 || this.f1 != 0) {
                    runnable = this.d1;
                    if (runnable != null) {
                        this.d1 = new a();
                    } else {
                        unscheduleSelf(runnable);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.Z = null;
        this.b1 = -1;
        if (this.e1 == 0) {
        }
        runnable = this.d1;
        if (runnable != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public void i(d dVar) {
        this.X = dVar;
        int i = this.b1;
        if (i >= 0) {
            Drawable h = dVar.h(i);
            this.Z = h;
            if (h != null) {
                e(h);
            }
        }
        this.Y0 = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.X;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable == this.Z && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.X.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.X.u();
    }

    public void j(int i) {
        h(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.Y0;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.Y0 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.a1) {
                this.Z.setAlpha(this.Z0);
            }
        }
        if (this.f1 != 0) {
            this.f1 = 0L;
            z = true;
        }
        if (this.e1 != 0) {
            this.e1 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public void k(int i) {
        this.X.A = i;
    }

    public void l(int i) {
        this.X.B = i;
    }

    public final void m(Resources resources) {
        this.X.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.c1 && super.mutate() == this) {
            d c2 = c();
            c2.v();
            i(c2);
            this.c1 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.Y0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.X.A(i, d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.Y0;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.Y0;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.Z && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.a1 || this.Z0 != i) {
            this.a1 = true;
            this.Z0 = i;
            Drawable drawable = this.Z;
            if (drawable != null) {
                if (this.e1 == 0) {
                    drawable.setAlpha(i);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        d dVar = this.X;
        if (dVar.C != z) {
            dVar.C = z;
            Drawable drawable = this.Z;
            if (drawable != null) {
                D60.j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.X;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.Z;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        d dVar = this.X;
        if (dVar.x != z) {
            dVar.x = z;
            Drawable drawable = this.Z;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.Z;
        if (drawable != null) {
            D60.k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.Y;
        if (rect == null) {
            this.Y = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            D60.l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.X;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            D60.o(this.Z, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.X;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            D60.p(this.Z, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.Y0;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.Z && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {
        public Drawable.Callback X;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.X;
            this.X = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.X = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.X;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.X;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
