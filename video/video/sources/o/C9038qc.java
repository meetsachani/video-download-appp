package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import o.C9010qT1;
import o.OL1;

/* renamed from: o.qc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9038qc {
    public static final String b = "AppCompatDrawableManag";
    public static final boolean c = false;
    public static final PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;
    public static C9038qc e;
    public C9010qT1 a;

    /* renamed from: o.qc$a */
    /* loaded from: classes.dex */
    public class a implements C9010qT1.f {
        public final int[] a = {OL1.f.y0, OL1.f.w0, OL1.f.a};
        public final int[] b = {OL1.f.y, OL1.f.h0, OL1.f.F, OL1.f.A, OL1.f.B, OL1.f.E, OL1.f.D};
        public final int[] c = {OL1.f.v0, OL1.f.x0, OL1.f.r, OL1.f.r0, OL1.f.s0, OL1.f.t0, OL1.f.u0};
        public final int[] d = {OL1.f.X, OL1.f.p, OL1.f.W};
        public final int[] e = {OL1.f.p0, OL1.f.z0};
        public final int[] f = {OL1.f.d, OL1.f.j, OL1.f.e, OL1.f.k};

        @Override // o.C9010qT1.f
        public Drawable a(C9010qT1 c9010qT1, Context context, int i) {
            if (i == OL1.f.q) {
                return new LayerDrawable(new Drawable[]{c9010qT1.j(context, OL1.f.p), c9010qT1.j(context, OL1.f.r)});
            }
            if (i == OL1.f.Z) {
                return l(c9010qT1, context, OL1.e.abc_star_big);
            }
            if (i == OL1.f.Y) {
                return l(c9010qT1, context, OL1.e.abc_star_medium);
            }
            if (i == OL1.f.a0) {
                return l(c9010qT1, context, OL1.e.abc_star_small);
            }
            return null;
        }

        @Override // o.C9010qT1.f
        public ColorStateList b(Context context, int i) {
            if (i == OL1.f.u) {
                return C3220Ic.a(context, OL1.d.v);
            }
            if (i == OL1.f.o0) {
                return C3220Ic.a(context, OL1.d.y);
            }
            if (i == OL1.f.n0) {
                return k(context);
            }
            if (i == OL1.f.i) {
                return j(context);
            }
            if (i == OL1.f.c) {
                return g(context);
            }
            if (i == OL1.f.h) {
                return i(context);
            }
            if (i != OL1.f.j0 && i != OL1.f.k0) {
                if (f(this.b, i)) {
                    return C8112mn2.f(context, OL1.b.H0);
                }
                if (f(this.e, i)) {
                    return C3220Ic.a(context, OL1.d.u);
                }
                if (f(this.f, i)) {
                    return C3220Ic.a(context, OL1.d.t);
                }
                if (i == OL1.f.g0) {
                    return C3220Ic.a(context, OL1.d.w);
                }
                return null;
            }
            return C3220Ic.a(context, OL1.d.x);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
        @Override // o.C9010qT1.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean c(Context context, int i, Drawable drawable) {
            PorterDuff.Mode mode;
            int i2;
            boolean z;
            int round;
            PorterDuff.Mode mode2 = C9038qc.d;
            if (f(this.a, i)) {
                i2 = OL1.b.H0;
            } else if (f(this.c, i)) {
                i2 = OL1.b.F0;
            } else {
                if (f(this.d, i)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else if (i == OL1.f.L) {
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    mode = mode2;
                    z = true;
                    if (z) {
                        return false;
                    }
                    Drawable mutate = drawable.mutate();
                    mutate.setColorFilter(C9038qc.e(C8112mn2.d(context, i2), mode));
                    if (round != -1) {
                        mutate.setAlpha(round);
                    }
                    return true;
                } else if (i != OL1.f.t) {
                    mode = mode2;
                    i2 = 0;
                    z = false;
                    round = -1;
                    if (z) {
                    }
                }
                mode = mode2;
                round = -1;
                i2 = 16842801;
                z = true;
                if (z) {
                }
            }
            mode = mode2;
            z = true;
            round = -1;
            if (z) {
            }
        }

        @Override // o.C9010qT1.f
        public PorterDuff.Mode d(int i) {
            if (i == OL1.f.n0) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // o.C9010qT1.f
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == OL1.f.i0) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = OL1.b.H0;
                m(findDrawableByLayerId, C8112mn2.d(context, i2), C9038qc.d);
                m(layerDrawable.findDrawableByLayerId(16908303), C8112mn2.d(context, i2), C9038qc.d);
                m(layerDrawable.findDrawableByLayerId(16908301), C8112mn2.d(context, OL1.b.F0), C9038qc.d);
                return true;
            } else if (i != OL1.f.Z && i != OL1.f.Y && i != OL1.f.a0) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), C8112mn2.c(context, OL1.b.H0), C9038qc.d);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = OL1.b.F0;
                m(findDrawableByLayerId2, C8112mn2.d(context, i3), C9038qc.d);
                m(layerDrawable2.findDrawableByLayerId(16908301), C8112mn2.d(context, i3), C9038qc.d);
                return true;
            }
        }

        public final boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i) {
            int d = C8112mn2.d(context, OL1.b.G0);
            return new ColorStateList(new int[][]{C8112mn2.c, C8112mn2.f, C8112mn2.d, C8112mn2.j}, new int[]{C8112mn2.c(context, OL1.b.E0), C9205rG.v(d, i), C9205rG.v(d, i), i});
        }

        public final ColorStateList i(Context context) {
            return h(context, C8112mn2.d(context, OL1.b.C0));
        }

        public final ColorStateList j(Context context) {
            return h(context, C8112mn2.d(context, OL1.b.E0));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = OL1.b.L0;
            ColorStateList f = C8112mn2.f(context, i);
            if (f != null && f.isStateful()) {
                int[] iArr3 = C8112mn2.c;
                iArr[0] = iArr3;
                iArr2[0] = f.getColorForState(iArr3, 0);
                iArr[1] = C8112mn2.g;
                iArr2[1] = C8112mn2.d(context, OL1.b.F0);
                iArr[2] = C8112mn2.j;
                iArr2[2] = f.getDefaultColor();
            } else {
                iArr[0] = C8112mn2.c;
                iArr2[0] = C8112mn2.c(context, i);
                iArr[1] = C8112mn2.g;
                iArr2[1] = C8112mn2.d(context, OL1.b.F0);
                iArr[2] = C8112mn2.j;
                iArr2[2] = C8112mn2.d(context, i);
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(C9010qT1 c9010qT1, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = c9010qT1.j(context, OL1.f.abc_star_black_48dp);
            Drawable j2 = c9010qT1.j(context, OL1.f.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C9038qc.d;
            }
            mutate.setColorFilter(C9038qc.e(i, mode));
        }
    }

    public static synchronized C9038qc b() {
        C9038qc c9038qc;
        synchronized (C9038qc.class) {
            try {
                if (e == null) {
                    i();
                }
                c9038qc = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9038qc;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C9038qc.class) {
            l = C9010qT1.l(i, mode);
        }
        return l;
    }

    public static synchronized void i() {
        synchronized (C9038qc.class) {
            if (e == null) {
                C9038qc c9038qc = new C9038qc();
                e = c9038qc;
                c9038qc.a = C9010qT1.h();
                e.a.u(new a());
            }
        }
    }

    public static void j(Drawable drawable, C2676Cp2 c2676Cp2, int[] iArr) {
        C9010qT1.w(drawable, c2676Cp2, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.j(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }

    public synchronized Drawable h(Context context, NE2 ne2, int i) {
        return this.a.t(context, ne2, i);
    }

    public boolean k(Context context, int i, Drawable drawable) {
        return this.a.x(context, i, drawable);
    }
}
