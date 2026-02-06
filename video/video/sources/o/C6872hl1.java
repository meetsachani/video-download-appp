package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.j;
import java.util.Objects;
import o.OL1;

/* renamed from: o.hl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6872hl1 extends View implements InterfaceC8872pv0 {
    public static final String T1 = "MotionLabel";
    public static final int U1 = 1;
    public static final int V1 = 2;
    public static final int W1 = 3;
    public float A1;
    public Drawable B1;
    public Matrix C1;
    public Bitmap D1;
    public BitmapShader E1;
    public Matrix F1;
    public float G1;
    public float H1;
    public float I1;
    public float J1;
    public Paint K1;
    public int L1;
    public Rect M1;
    public Paint N1;
    public float O1;
    public float P1;
    public float Q1;
    public float R1;
    public float S1;
    public TextPaint Y0;
    public Path Z0;
    public int a1;
    public int b1;
    public boolean c1;
    public float d1;
    public float e1;
    public ViewOutlineProvider f1;
    public RectF g1;
    public float h1;
    public float i1;
    public int j1;
    public int k1;
    public float l1;
    public String m1;
    public boolean n1;
    public Rect o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public String t1;
    public Layout u1;
    public int v1;
    public int w1;
    public boolean x1;
    public float y1;
    public float z1;

    /* renamed from: o.hl1$a */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = C6872hl1.this.getWidth();
            int height = C6872hl1.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * C6872hl1.this.d1) / 2.0f);
        }
    }

    /* renamed from: o.hl1$b */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, C6872hl1.this.getWidth(), C6872hl1.this.getHeight(), C6872hl1.this.e1);
        }
    }

    public C6872hl1(Context context) {
        super(context);
        this.Y0 = new TextPaint();
        this.Z0 = new Path();
        this.a1 = 65535;
        this.b1 = 65535;
        this.c1 = false;
        this.d1 = 0.0f;
        this.e1 = Float.NaN;
        this.h1 = 48.0f;
        this.i1 = Float.NaN;
        this.l1 = 0.0f;
        this.m1 = "Hello World";
        this.n1 = true;
        this.o1 = new Rect();
        this.p1 = 1;
        this.q1 = 1;
        this.r1 = 1;
        this.s1 = 1;
        this.v1 = 8388659;
        this.w1 = 0;
        this.x1 = false;
        this.G1 = Float.NaN;
        this.H1 = Float.NaN;
        this.I1 = 0.0f;
        this.J1 = 0.0f;
        this.K1 = new Paint();
        this.L1 = 0;
        this.P1 = Float.NaN;
        this.Q1 = Float.NaN;
        this.R1 = Float.NaN;
        this.S1 = Float.NaN;
        g(context, null);
    }

    private float getHorizontalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.i1)) {
            f = 1.0f;
        } else {
            f = this.h1 / this.i1;
        }
        TextPaint textPaint = this.Y0;
        String str = this.m1;
        float measureText = f * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.z1)) {
            f2 = getMeasuredWidth();
        } else {
            f2 = this.z1;
        }
        return ((((f2 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.I1 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.i1)) {
            f = 1.0f;
        } else {
            f = this.h1 / this.i1;
        }
        Paint.FontMetrics fontMetrics = this.Y0.getFontMetrics();
        if (Float.isNaN(this.A1)) {
            f2 = getMeasuredHeight();
        } else {
            f2 = this.A1;
        }
        float paddingTop = (f2 - getPaddingTop()) - getPaddingBottom();
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((paddingTop - ((f3 - f4) * f)) * (1.0f - this.J1)) / 2.0f) - (f * f4);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(OL1.b.J0, typedValue, true);
        TextPaint textPaint = this.Y0;
        int i = typedValue.data;
        this.a1 = i;
        textPaint.setColor(i);
    }

    @Override // o.InterfaceC8872pv0
    public void a(float f, float f2, float f3, float f4) {
        float f5;
        int i = (int) (f + 0.5f);
        this.y1 = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f6 = f3 - f;
        this.z1 = f6;
        float f7 = f4 - f2;
        this.A1 = f7;
        d(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.x1) {
            if (this.M1 == null) {
                this.N1 = new Paint();
                this.M1 = new Rect();
                this.N1.set(this.Y0);
                this.O1 = this.N1.getTextSize();
            }
            this.z1 = f6;
            this.A1 = f7;
            Paint paint = this.N1;
            String str = this.m1;
            paint.getTextBounds(str, 0, str.length(), this.M1);
            float height = this.M1.height() * 1.3f;
            float f8 = (f6 - this.q1) - this.p1;
            float f9 = (f7 - this.s1) - this.r1;
            float width = this.M1.width();
            if (width * f9 > height * f8) {
                this.Y0.setTextSize((this.O1 * f8) / width);
            } else {
                this.Y0.setTextSize((this.O1 * f9) / height);
            }
            if (this.c1 || !Float.isNaN(this.i1)) {
                if (Float.isNaN(this.i1)) {
                    f5 = 1.0f;
                } else {
                    f5 = this.h1 / this.i1;
                }
                f(f5);
            }
        }
    }

    public final void d(float f, float f2, float f3, float f4) {
        if (this.F1 == null) {
            return;
        }
        this.z1 = f3 - f;
        this.A1 = f4 - f2;
        k();
    }

    public Bitmap e(Bitmap bitmap, int i) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    public void f(float f) {
        if (!this.c1 && f == 1.0f) {
            return;
        }
        this.Z0.reset();
        String str = this.m1;
        int length = str.length();
        this.Y0.getTextBounds(str, 0, length, this.o1);
        this.Y0.getTextPath(str, 0, length, 0.0f, 0.0f, this.Z0);
        if (f != 1.0f) {
            Log.v(T1, AV.f() + " scale " + f);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            this.Z0.transform(matrix);
        }
        Rect rect = this.o1;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.n1 = false;
    }

    public final void g(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.gd);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.md) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == j.c.od) {
                    this.t1 = obtainStyledAttributes.getString(index);
                } else if (index == j.c.sd) {
                    this.i1 = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.i1);
                } else if (index == j.c.hd) {
                    this.h1 = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.h1);
                } else if (index == j.c.jd) {
                    this.j1 = obtainStyledAttributes.getInt(index, this.j1);
                } else if (index == j.c.id) {
                    this.k1 = obtainStyledAttributes.getInt(index, this.k1);
                } else if (index == j.c.kd) {
                    this.a1 = obtainStyledAttributes.getColor(index, this.a1);
                } else if (index == j.c.qd) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.e1);
                    this.e1 = dimension;
                    setRound(dimension);
                } else if (index == j.c.rd) {
                    float f = obtainStyledAttributes.getFloat(index, this.d1);
                    this.d1 = f;
                    setRoundPercent(f);
                } else if (index == j.c.ld) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == j.c.pd) {
                    this.w1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == j.c.yd) {
                    this.b1 = obtainStyledAttributes.getInt(index, this.b1);
                    this.c1 = true;
                } else if (index == j.c.zd) {
                    this.l1 = obtainStyledAttributes.getDimension(index, this.l1);
                    this.c1 = true;
                } else if (index == j.c.td) {
                    this.B1 = obtainStyledAttributes.getDrawable(index);
                    this.c1 = true;
                } else if (index == j.c.ud) {
                    this.P1 = obtainStyledAttributes.getFloat(index, this.P1);
                } else if (index == j.c.vd) {
                    this.Q1 = obtainStyledAttributes.getFloat(index, this.Q1);
                } else if (index == j.c.Ad) {
                    this.I1 = obtainStyledAttributes.getFloat(index, this.I1);
                } else if (index == j.c.Bd) {
                    this.J1 = obtainStyledAttributes.getFloat(index, this.J1);
                } else if (index == j.c.wd) {
                    this.S1 = obtainStyledAttributes.getFloat(index, this.S1);
                } else if (index == j.c.xd) {
                    this.R1 = obtainStyledAttributes.getFloat(index, this.R1);
                } else if (index == j.c.Ed) {
                    this.G1 = obtainStyledAttributes.getDimension(index, this.G1);
                } else if (index == j.c.Fd) {
                    this.H1 = obtainStyledAttributes.getDimension(index, this.H1);
                } else if (index == j.c.Dd) {
                    this.L1 = obtainStyledAttributes.getInt(index, this.L1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        j();
        i();
    }

    public float getRound() {
        return this.e1;
    }

    public float getRoundPercent() {
        return this.d1;
    }

    public float getScaleFromTextSize() {
        return this.i1;
    }

    public float getTextBackgroundPanX() {
        return this.P1;
    }

    public float getTextBackgroundPanY() {
        return this.Q1;
    }

    public float getTextBackgroundRotate() {
        return this.S1;
    }

    public float getTextBackgroundZoom() {
        return this.R1;
    }

    public int getTextOutlineColor() {
        return this.b1;
    }

    public float getTextPanX() {
        return this.I1;
    }

    public float getTextPanY() {
        return this.J1;
    }

    public float getTextureHeight() {
        return this.G1;
    }

    public float getTextureWidth() {
        return this.H1;
    }

    public Typeface getTypeface() {
        return this.Y0.getTypeface();
    }

    public final void h(String str, int i, int i2) {
        Typeface typeface;
        Typeface create;
        int i3;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i2);
            } else {
                create = Typeface.create(typeface, i2);
            }
            setTypeface(create);
            if (create != null) {
                i3 = create.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (~i3) & i2;
            TextPaint textPaint = this.Y0;
            if ((i4 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.Y0;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.Y0.setFakeBoldText(false);
        this.Y0.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    public void i() {
        this.p1 = getPaddingLeft();
        this.q1 = getPaddingRight();
        this.r1 = getPaddingTop();
        this.s1 = getPaddingBottom();
        h(this.t1, this.k1, this.j1);
        this.Y0.setColor(this.a1);
        this.Y0.setStrokeWidth(this.l1);
        this.Y0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.Y0.setFlags(128);
        setTextSize(this.h1);
        this.Y0.setAntiAlias(true);
    }

    public final void j() {
        if (this.B1 != null) {
            this.F1 = new Matrix();
            int intrinsicWidth = this.B1.getIntrinsicWidth();
            int intrinsicHeight = this.B1.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.H1)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.H1;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.G1)) {
                    i = (int) this.G1;
                }
                intrinsicHeight = i;
            }
            if (this.L1 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.D1 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.D1);
            this.B1.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.B1.setFilterBitmap(true);
            this.B1.draw(canvas);
            if (this.L1 != 0) {
                this.D1 = e(this.D1, 4);
            }
            Bitmap bitmap = this.D1;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.E1 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void k() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (Float.isNaN(this.P1)) {
            f = 0.0f;
        } else {
            f = this.P1;
        }
        if (Float.isNaN(this.Q1)) {
            f2 = 0.0f;
        } else {
            f2 = this.Q1;
        }
        if (Float.isNaN(this.R1)) {
            f3 = 1.0f;
        } else {
            f3 = this.R1;
        }
        if (!Float.isNaN(this.S1)) {
            f7 = this.S1;
        }
        this.F1.reset();
        float width = this.D1.getWidth();
        float height = this.D1.getHeight();
        if (Float.isNaN(this.H1)) {
            f4 = this.z1;
        } else {
            f4 = this.H1;
        }
        if (Float.isNaN(this.G1)) {
            f5 = this.A1;
        } else {
            f5 = this.G1;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.F1.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f4 - f9;
        float f11 = f8 * height;
        float f12 = f5 - f11;
        if (!Float.isNaN(this.G1)) {
            f12 = this.G1 / 2.0f;
        }
        if (!Float.isNaN(this.H1)) {
            f10 = this.H1 / 2.0f;
        }
        this.F1.postTranslate((((f * f10) + f4) - f9) * 0.5f, (((f2 * f12) + f5) - f11) * 0.5f);
        this.F1.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.E1.setLocalMatrix(this.F1);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        float f;
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.i1);
        if (isNaN) {
            f = 1.0f;
        } else {
            f = this.h1 / this.i1;
        }
        this.z1 = i3 - i;
        this.A1 = i4 - i2;
        if (this.x1) {
            if (this.M1 == null) {
                this.N1 = new Paint();
                this.M1 = new Rect();
                this.N1.set(this.Y0);
                this.O1 = this.N1.getTextSize();
            }
            Paint paint = this.N1;
            String str = this.m1;
            paint.getTextBounds(str, 0, str.length(), this.M1);
            int width = this.M1.width();
            int height = (int) (this.M1.height() * 1.3f);
            float f2 = (this.z1 - this.q1) - this.p1;
            float f3 = (this.A1 - this.s1) - this.r1;
            if (isNaN) {
                float f4 = width;
                float f5 = height;
                if (f4 * f3 > f5 * f2) {
                    this.Y0.setTextSize((this.O1 * f2) / f4);
                } else {
                    this.Y0.setTextSize((this.O1 * f3) / f5);
                }
            } else {
                float f6 = width;
                float f7 = height;
                if (f6 * f3 > f7 * f2) {
                    f = f2 / f6;
                } else {
                    f = f3 / f7;
                }
            }
        }
        if (!this.c1 && isNaN) {
            return;
        }
        d(i, i2, i3, i4);
        f(f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.i1)) {
            f = 1.0f;
        } else {
            f = this.h1 / this.i1;
        }
        super.onDraw(canvas);
        if (!this.c1 && f == 1.0f) {
            canvas.drawText(this.m1, this.y1 + this.p1 + getHorizontalOffset(), this.r1 + getVerticalOffset(), this.Y0);
            return;
        }
        if (this.n1) {
            f(f);
        }
        if (this.C1 == null) {
            this.C1 = new Matrix();
        }
        if (this.c1) {
            this.K1.set(this.Y0);
            this.C1.reset();
            float horizontalOffset = this.p1 + getHorizontalOffset();
            float verticalOffset = this.r1 + getVerticalOffset();
            this.C1.postTranslate(horizontalOffset, verticalOffset);
            this.C1.preScale(f, f);
            this.Z0.transform(this.C1);
            if (this.E1 != null) {
                this.Y0.setFilterBitmap(true);
                this.Y0.setShader(this.E1);
            } else {
                this.Y0.setColor(this.a1);
            }
            this.Y0.setStyle(Paint.Style.FILL);
            this.Y0.setStrokeWidth(this.l1);
            canvas.drawPath(this.Z0, this.Y0);
            if (this.E1 != null) {
                this.Y0.setShader(null);
            }
            this.Y0.setColor(this.b1);
            this.Y0.setStyle(Paint.Style.STROKE);
            this.Y0.setStrokeWidth(this.l1);
            canvas.drawPath(this.Z0, this.Y0);
            this.C1.reset();
            this.C1.postTranslate(-horizontalOffset, -verticalOffset);
            this.Z0.transform(this.C1);
            this.Y0.set(this.K1);
            return;
        }
        float horizontalOffset2 = this.p1 + getHorizontalOffset();
        float verticalOffset2 = this.r1 + getVerticalOffset();
        this.C1.reset();
        this.C1.preTranslate(horizontalOffset2, verticalOffset2);
        this.Z0.transform(this.C1);
        this.Y0.setColor(this.a1);
        this.Y0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.Y0.setStrokeWidth(this.l1);
        canvas.drawPath(this.Z0, this.Y0);
        this.C1.reset();
        this.C1.preTranslate(-horizontalOffset2, -verticalOffset2);
        this.Z0.transform(this.C1);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.x1 = false;
        this.p1 = getPaddingLeft();
        this.q1 = getPaddingRight();
        this.r1 = getPaddingTop();
        this.s1 = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.w1 != 0) {
                this.x1 = true;
            }
        } else {
            TextPaint textPaint = this.Y0;
            String str = this.m1;
            textPaint.getTextBounds(str, 0, str.length(), this.o1);
            if (mode != 1073741824) {
                size = (int) (this.o1.width() + 0.99999f);
            }
            size += this.p1 + this.q1;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.Y0.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.r1 + this.s1 + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i) {
        if ((i & JE0.d) == 0) {
            i |= JE0.b;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.v1) {
            invalidate();
        }
        this.v1 = i;
        int i2 = i & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.J1 = 0.0f;
            } else {
                this.J1 = 1.0f;
            }
        } else {
            this.J1 = -1.0f;
        }
        int i3 = i & JE0.d;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.I1 = 0.0f;
                        return;
                    }
                }
            }
            this.I1 = 1.0f;
            return;
        }
        this.I1 = -1.0f;
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.e1 = f;
            float f2 = this.d1;
            this.d1 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.e1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.e1 = f;
        if (f != 0.0f) {
            if (this.Z0 == null) {
                this.Z0 = new Path();
            }
            if (this.g1 == null) {
                this.g1 = new RectF();
            }
            if (this.f1 == null) {
                b bVar = new b();
                this.f1 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.g1.set(0.0f, 0.0f, getWidth(), getHeight());
            this.Z0.reset();
            Path path = this.Z0;
            RectF rectF = this.g1;
            float f3 = this.e1;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.d1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.d1 = f;
        if (f != 0.0f) {
            if (this.Z0 == null) {
                this.Z0 = new Path();
            }
            if (this.g1 == null) {
                this.g1 = new RectF();
            }
            if (this.f1 == null) {
                a aVar = new a();
                this.f1 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.d1) / 2.0f;
            this.g1.set(0.0f, 0.0f, width, height);
            this.Z0.reset();
            this.Z0.addRoundRect(this.g1, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.i1 = f;
    }

    public void setText(CharSequence charSequence) {
        this.m1 = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.P1 = f;
        k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.Q1 = f;
        k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.S1 = f;
        k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.R1 = f;
        k();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.a1 = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.b1 = i;
        this.c1 = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.l1 = f;
        this.c1 = true;
        if (Float.isNaN(f)) {
            this.l1 = 1.0f;
            this.c1 = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.I1 = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.J1 = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        this.h1 = f;
        TextPaint textPaint = this.Y0;
        if (!Float.isNaN(this.i1)) {
            f = this.i1;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.i1)) {
            f2 = 1.0f;
        } else {
            f2 = this.h1 / this.i1;
        }
        f(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.G1 = f;
        k();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.H1 = f;
        k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (!Objects.equals(this.Y0.getTypeface(), typeface)) {
            this.Y0.setTypeface(typeface);
            if (this.u1 != null) {
                this.u1 = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public C6872hl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new TextPaint();
        this.Z0 = new Path();
        this.a1 = 65535;
        this.b1 = 65535;
        this.c1 = false;
        this.d1 = 0.0f;
        this.e1 = Float.NaN;
        this.h1 = 48.0f;
        this.i1 = Float.NaN;
        this.l1 = 0.0f;
        this.m1 = "Hello World";
        this.n1 = true;
        this.o1 = new Rect();
        this.p1 = 1;
        this.q1 = 1;
        this.r1 = 1;
        this.s1 = 1;
        this.v1 = 8388659;
        this.w1 = 0;
        this.x1 = false;
        this.G1 = Float.NaN;
        this.H1 = Float.NaN;
        this.I1 = 0.0f;
        this.J1 = 0.0f;
        this.K1 = new Paint();
        this.L1 = 0;
        this.P1 = Float.NaN;
        this.Q1 = Float.NaN;
        this.R1 = Float.NaN;
        this.S1 = Float.NaN;
        g(context, attributeSet);
    }

    public C6872hl1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = new TextPaint();
        this.Z0 = new Path();
        this.a1 = 65535;
        this.b1 = 65535;
        this.c1 = false;
        this.d1 = 0.0f;
        this.e1 = Float.NaN;
        this.h1 = 48.0f;
        this.i1 = Float.NaN;
        this.l1 = 0.0f;
        this.m1 = "Hello World";
        this.n1 = true;
        this.o1 = new Rect();
        this.p1 = 1;
        this.q1 = 1;
        this.r1 = 1;
        this.s1 = 1;
        this.v1 = 8388659;
        this.w1 = 0;
        this.x1 = false;
        this.G1 = Float.NaN;
        this.H1 = Float.NaN;
        this.I1 = 0.0f;
        this.J1 = 0.0f;
        this.K1 = new Paint();
        this.L1 = 0;
        this.P1 = Float.NaN;
        this.Q1 = Float.NaN;
        this.R1 = Float.NaN;
        this.S1 = Float.NaN;
        g(context, attributeSet);
    }
}
