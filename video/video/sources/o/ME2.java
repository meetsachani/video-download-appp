package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import o.C9624sz1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ME2 extends LE2 {
    public static final String f1 = "VectorDrawableCompat";
    public static final PorterDuff.Mode g1 = PorterDuff.Mode.SRC_IN;
    public static final String h1 = "clip-path";
    public static final String i1 = "group";
    public static final String j1 = "path";
    public static final String k1 = "vector";
    public static final int l1 = 0;
    public static final int m1 = 1;
    public static final int n1 = 2;
    public static final int o1 = 0;
    public static final int p1 = 1;
    public static final int q1 = 2;
    public static final int r1 = 2048;
    public static final boolean s1 = false;
    public h Y;
    public ColorFilter Y0;
    public PorterDuffColorFilter Z;
    public boolean Z0;
    public boolean a1;
    public Drawable.ConstantState b1;
    public final float[] c1;
    public final Matrix d1;
    public final Rect e1;

    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = C9624sz1.d(string2);
            }
            this.c = C5206aw2.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // o.ME2.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!C5206aw2.r(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.I);
            j(s, xmlPullParser);
            s.recycle();
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public int[] g;
        public ColorStateList h;
        public PorterDuff.Mode i;
        public int j;
        public boolean k;
        public boolean l;
        public Paint m;

        public h(h hVar) {
            this.c = null;
            this.d = ME2.g1;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.e != null) {
                    gVar.e = new Paint(hVar.b.e);
                }
                if (hVar.b.d != null) {
                    this.b.d = new Paint(hVar.b.d);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a(int i, int i2) {
            if (i == this.f.getWidth() && i2 == this.f.getHeight()) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (!this.l && this.h == this.c && this.i == this.d && this.k == this.e && this.j == this.b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public void c(int i, int i2) {
            if (this.f != null && a(i, i2)) {
                return;
            }
            this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.l = true;
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.m == null) {
                Paint paint = new Paint();
                this.m = paint;
                paint.setFilterBitmap(true);
            }
            this.m.setAlpha(this.b.getRootAlpha());
            this.m.setColorFilter(colorFilter);
            return this.m;
        }

        public boolean f() {
            if (this.b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g = this.b.g(iArr);
            this.l |= g;
            return g;
        }

        public void i() {
            this.h = this.c;
            this.i = this.d;
            this.j = this.b.getRootAlpha();
            this.k = this.e;
            this.l = false;
        }

        public void j(int i, int i2) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ME2(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new ME2(this);
        }

        public h() {
            this.c = null;
            this.d = ME2.g1;
            this.b = new g();
        }
    }

    public ME2() {
        this.a1 = true;
        this.c1 = new float[9];
        this.d1 = new Matrix();
        this.e1 = new Rect();
        this.Y = new h();
    }

    public static int a(int i2, float f2) {
        return (i2 & C6516gH2.x) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static ME2 d(Resources resources, int i2, Resources.Theme theme) {
        ME2 me2 = new ME2();
        me2.X = C10231vT1.g(resources, i2, theme);
        me2.b1 = new i(me2.X.getConstantState());
        return me2;
    }

    public static ME2 e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ME2 me2 = new ME2();
        me2.inflate(resources, xmlPullParser, attributeSet, theme);
        return me2;
    }

    public static PorterDuff.Mode j(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.b(drawable);
            return false;
        }
        return false;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.e1);
        if (this.e1.width() > 0 && this.e1.height() > 0) {
            ColorFilter colorFilter = this.Y0;
            if (colorFilter == null) {
                colorFilter = this.Z;
            }
            canvas.getMatrix(this.d1);
            this.d1.getValues(this.c1);
            float abs = Math.abs(this.c1[0]);
            float abs2 = Math.abs(this.c1[4]);
            float abs3 = Math.abs(this.c1[1]);
            float abs4 = Math.abs(this.c1[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.e1.width() * abs));
            int min2 = Math.min(2048, (int) (this.e1.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.e1;
                canvas.translate(rect.left, rect.top);
                if (i()) {
                    canvas.translate(this.e1.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.e1.offsetTo(0, 0);
                this.Y.c(min, min2);
                if (!this.a1) {
                    this.Y.j(min, min2);
                } else if (!this.Y.b()) {
                    this.Y.j(min, min2);
                    this.Y.i();
                }
                this.Y.d(canvas, colorFilter, this.e1);
                canvas.restoreToCount(save);
            }
        }
    }

    public float f() {
        g gVar;
        h hVar = this.Y;
        if (hVar != null && (gVar = hVar.b) != null) {
            float f2 = gVar.i;
            if (f2 != 0.0f) {
                float f3 = gVar.j;
                if (f3 != 0.0f) {
                    float f4 = gVar.l;
                    if (f4 != 0.0f) {
                        float f5 = gVar.k;
                        if (f5 != 0.0f) {
                            return Math.min(f5 / f2, f4 / f3);
                        }
                        return 1.0f;
                    }
                    return 1.0f;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public Object g(String str) {
        return this.Y.b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return D60.d(drawable);
        }
        return this.Y.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.Y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return D60.e(drawable);
        }
        return this.Y0;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.X != null) {
            return new i(this.X.getConstantState());
        }
        this.Y.a = getChangingConfigurations();
        return this.Y;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.Y.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.Y.b.i;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.Y;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    hVar.a = cVar.d | hVar.a;
                    z = false;
                } else if (h1.equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.p.put(bVar.getPathName(), bVar);
                    }
                    hVar.a = bVar.d | hVar.a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.a = dVar2.k | hVar.a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    public final boolean i() {
        if (isAutoMirrored() && D60.f(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return D60.h(drawable);
        }
        return this.Y.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            h hVar = this.Y;
            if (hVar != null) {
                if (!hVar.g()) {
                    ColorStateList colorStateList = this.Y.c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final void k(d dVar, int i2) {
        String str = "";
        for (int i3 = 0; i3 < i2; i3++) {
            str = str + "    ";
        }
        Log.v(f1, str + "current group is :" + dVar.getGroupName() + " rotation is " + dVar.c);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("matrix is :");
        sb.append(dVar.getLocalMatrix().toString());
        Log.v(f1, sb.toString());
        for (int i4 = 0; i4 < dVar.b.size(); i4++) {
            e eVar = dVar.b.get(i4);
            if (eVar instanceof d) {
                k((d) eVar, i2 + 1);
            } else {
                ((f) eVar).g(i2 + 1);
            }
        }
    }

    public void l(boolean z) {
        this.a1 = z;
    }

    public final void m(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.Y;
        g gVar = hVar.b;
        hVar.d = j(C5206aw2.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g2 = C5206aw2.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g2 != null) {
            hVar.c = g2;
        }
        hVar.e = C5206aw2.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.k = C5206aw2.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float j = C5206aw2.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = j;
        if (gVar.k > 0.0f) {
            if (j > 0.0f) {
                gVar.i = typedArray.getDimension(3, gVar.i);
                float dimension = typedArray.getDimension(2, gVar.j);
                gVar.j = dimension;
                if (gVar.i > 0.0f) {
                    if (dimension > 0.0f) {
                        gVar.setAlpha(C5206aw2.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            gVar.n = string;
                            gVar.p.put(string, gVar);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.Z0 && super.mutate() == this) {
            this.Y = new h(this.Y);
            this.Z0 = true;
        }
        return this;
    }

    public PorterDuffColorFilter n(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.Y;
        ColorStateList colorStateList = hVar.c;
        if (colorStateList != null && (mode = hVar.d) != null) {
            this.Z = n(this.Z, colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.Y.b.getRootAlpha() != i2) {
            this.Y.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.j(drawable, z);
        } else {
            this.Y.e = z;
        }
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTint(int i2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.o(drawable, colorStateList);
            return;
        }
        h hVar = this.Y;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.Z = n(this.Z, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.p(drawable, mode);
            return;
        }
        h hVar = this.Y;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.Z = n(this.Z, hVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            ME2 me2 = new ME2();
            me2.X = (VectorDrawable) this.a.newDrawable();
            return me2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            ME2 me2 = new ME2();
            me2.X = (VectorDrawable) this.a.newDrawable(resources);
            return me2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            ME2 me2 = new ME2();
            me2.X = (VectorDrawable) this.a.newDrawable(resources, theme);
            return me2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.Y0 = colorFilter;
        invalidateSelf();
    }

    /* loaded from: classes.dex */
    public static abstract class f extends e {
        public static final int e = 0;
        public C9624sz1.b[] a;
        public String b;
        public int c;
        public int d;

        public f() {
            super();
            this.a = null;
            this.c = 0;
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(C9624sz1.b[] bVarArr) {
            float[] fArr;
            String str = C4500Ve2.b;
            for (int i = 0; i < bVarArr.length; i++) {
                str = str + bVarArr[i].a + ":";
                for (int i2 = 0; i2 < bVarArr[i].b.length; i2++) {
                    str = str + fArr[i2] + ",";
                }
            }
            return str;
        }

        public void g(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "    ";
            }
            Log.v(ME2.f1, str + "current path is :" + this.b + " pathData is " + f(this.a));
        }

        public C9624sz1.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void h(Path path) {
            path.reset();
            C9624sz1.b[] bVarArr = this.a;
            if (bVarArr != null) {
                C9624sz1.b.k(bVarArr, path);
            }
        }

        public void setPathData(C9624sz1.b[] bVarArr) {
            if (!C9624sz1.b(this.a, bVarArr)) {
                this.a = C9624sz1.f(bVarArr);
            } else {
                C9624sz1.m(this.a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.a = null;
            this.c = 0;
            this.b = fVar.b;
            this.d = fVar.d;
            this.a = C9624sz1.f(fVar.a);
        }

        public void c(Resources.Theme theme) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.Y;
        hVar.b = new g();
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.a);
        m(s, xmlPullParser, theme);
        s.recycle();
        hVar.a = getChangingConfigurations();
        hVar.l = true;
        h(resources, xmlPullParser, attributeSet, theme);
        this.Z = n(this.Z, hVar.c, hVar.d);
    }

    public ME2(h hVar) {
        this.a1 = true;
        this.c1 = new float[9];
        this.d1 = new Matrix();
        this.e1 = new Rect();
        this.Y = hVar;
        this.Z = n(this.Z, hVar.c, hVar.d);
    }

    /* loaded from: classes.dex */
    public static class c extends f {
        public int[] f;
        public UH g;
        public float h;
        public UH i;
        public float j;
        public float k;
        public float l;
        public float m;
        public float n;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Cap f541o;
        public Paint.Join p;
        public float q;

        public c() {
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.f541o = Paint.Cap.BUTT;
            this.p = Paint.Join.MITER;
            this.q = 4.0f;
        }

        @Override // o.ME2.e
        public boolean a() {
            if (!this.i.i() && !this.g.i()) {
                return false;
            }
            return true;
        }

        @Override // o.ME2.e
        public boolean b(int[] iArr) {
            return this.g.j(iArr) | this.i.j(iArr);
        }

        @Override // o.ME2.f
        public boolean d() {
            if (this.f != null) {
                return true;
            }
            return false;
        }

        public float getFillAlpha() {
            return this.k;
        }

        public int getFillColor() {
            return this.i.e();
        }

        public float getStrokeAlpha() {
            return this.j;
        }

        public int getStrokeColor() {
            return this.g.e();
        }

        public float getStrokeWidth() {
            return this.h;
        }

        public float getTrimPathEnd() {
            return this.m;
        }

        public float getTrimPathOffset() {
            return this.n;
        }

        public float getTrimPathStart() {
            return this.l;
        }

        public final Paint.Cap i(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        public final Paint.Join j(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.t);
            l(s, xmlPullParser, theme);
            s.recycle();
        }

        public final void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f = null;
            if (!C5206aw2.r(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.a = C9624sz1.d(string2);
            }
            this.i = C5206aw2.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.k = C5206aw2.j(typedArray, xmlPullParser, "fillAlpha", 12, this.k);
            this.f541o = i(C5206aw2.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f541o);
            this.p = j(C5206aw2.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.p);
            this.q = C5206aw2.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.q);
            this.g = C5206aw2.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.j = C5206aw2.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.j);
            this.h = C5206aw2.j(typedArray, xmlPullParser, "strokeWidth", 4, this.h);
            this.m = C5206aw2.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.m);
            this.n = C5206aw2.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.n);
            this.l = C5206aw2.j(typedArray, xmlPullParser, "trimPathStart", 5, this.l);
            this.c = C5206aw2.k(typedArray, xmlPullParser, "fillType", 13, this.c);
        }

        public void setFillAlpha(float f) {
            this.k = f;
        }

        public void setFillColor(int i) {
            this.i.k(i);
        }

        public void setStrokeAlpha(float f) {
            this.j = f;
        }

        public void setStrokeColor(int i) {
            this.g.k(i);
        }

        public void setStrokeWidth(float f) {
            this.h = f;
        }

        public void setTrimPathEnd(float f) {
            this.m = f;
        }

        public void setTrimPathOffset(float f) {
            this.n = f;
        }

        public void setTrimPathStart(float f) {
            this.l = f;
        }

        public c(c cVar) {
            super(cVar);
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.f541o = Paint.Cap.BUTT;
            this.p = Paint.Join.MITER;
            this.q = 4.0f;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.j = cVar.j;
            this.i = cVar.i;
            this.c = cVar.c;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.f541o = cVar.f541o;
            this.p = cVar.p;
            this.q = cVar.q;
        }

        @Override // o.ME2.f
        public void c(Resources.Theme theme) {
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static final Matrix q = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f542o;
        public final C2531Be<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.f542o = null;
            this.p = new C2531Be<>();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c(this.h, q, canvas, i, i2, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.a.set(matrix);
            dVar2.a.preConcat(dVar2.j);
            canvas.save();
            int i3 = 0;
            while (i3 < dVar2.b.size()) {
                e eVar = dVar2.b.get(i3);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i, i2, colorFilter);
                }
                i3++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = i / this.k;
            float f2 = i2 / this.l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f, f2);
            float e = e(matrix);
            if (e != 0.0f) {
                fVar.h(this.a);
                Path path = this.a;
                this.b.reset();
                if (fVar.e()) {
                    Path path2 = this.b;
                    if (fVar.c == 0) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                    this.b.addPath(path, this.c);
                    canvas.clipPath(this.b);
                    return;
                }
                c cVar = (c) fVar;
                float f3 = cVar.l;
                if (f3 != 0.0f || cVar.m != 1.0f) {
                    float f4 = cVar.n;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.m + f4) % 1.0f;
                    if (this.f == null) {
                        this.f = new PathMeasure();
                    }
                    this.f.setPath(this.a, false);
                    float length = this.f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f.getSegment(f7, length, path, true);
                        this.f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.b.addPath(path, this.c);
                if (cVar.i.l()) {
                    UH uh = cVar.i;
                    if (this.e == null) {
                        Paint paint = new Paint(1);
                        this.e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.e;
                    if (uh.h()) {
                        Shader f9 = uh.f();
                        f9.setLocalMatrix(this.c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.k * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(ME2.a(uh.e(), cVar.k));
                    }
                    paint2.setColorFilter(colorFilter);
                    Path path3 = this.b;
                    if (cVar.c == 0) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    path3.setFillType(fillType);
                    canvas.drawPath(this.b, paint2);
                }
                if (cVar.g.l()) {
                    UH uh2 = cVar.g;
                    if (this.d == null) {
                        Paint paint3 = new Paint(1);
                        this.d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.d;
                    Paint.Join join = cVar.p;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f541o;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.q);
                    if (uh2.h()) {
                        Shader f10 = uh2.f();
                        f10.setLocalMatrix(this.c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.j * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(ME2.a(uh2.e(), cVar.j));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.h * min * e);
                    canvas.drawPath(this.b, paint4);
                }
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(a) / max;
        }

        public boolean f() {
            if (this.f542o == null) {
                this.f542o = Boolean.valueOf(this.h.a());
            }
            return this.f542o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.f542o = null;
            C2531Be<String, Object> c2531Be = new C2531Be<>();
            this.p = c2531Be;
            this.h = new d(gVar.h, c2531Be);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                c2531Be.put(str, this);
            }
            this.f542o = gVar.f542o;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {
        public final Matrix a;
        public final ArrayList<e> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public int[] l;
        public String m;

        public d(d dVar, C2531Be<String, Object> c2531Be) {
            super();
            f bVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.m = null;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                c2531Be.put(str, this);
            }
            matrix.set(dVar.j);
            ArrayList<e> arrayList = dVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, c2531Be));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(bVar);
                    String str2 = bVar.b;
                    if (str2 != null) {
                        c2531Be.put(str2, bVar);
                    }
                }
            }
        }

        @Override // o.ME2.e
        public boolean a() {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.ME2.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.b.size(); i++) {
                z |= this.b.get(i).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.k);
            e(s, xmlPullParser);
            s.recycle();
        }

        public final void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = C5206aw2.j(typedArray, xmlPullParser, AbstractC6818hX0.i, 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = C5206aw2.j(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = C5206aw2.j(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = C5206aw2.j(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = C5206aw2.j(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }

        public d() {
            super();
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
    }
}
