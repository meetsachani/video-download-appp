package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

@Deprecated
/* renamed from: o.Xg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4702Xg2 {
    public static final String K = "SubtitlePainter";
    public static final float L = 0.125f;
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    @InterfaceC11300zs1
    public CharSequence i;
    @InterfaceC11300zs1
    public Layout.Alignment j;
    @InterfaceC11300zs1
    public Bitmap k;
    public float l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public float f663o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public C4702Xg2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = round;
        this.b = round;
        this.c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public static boolean a(@InterfaceC11300zs1 CharSequence charSequence, @InterfaceC11300zs1 CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            if (charSequence == null || !charSequence.equals(charSequence2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void b(C7284jS c7284jS, C3010Fy c3010Fy, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        if (c7284jS.Y0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextUtils.isEmpty(c7284jS.X)) {
                return;
            }
            if (c7284jS.g1) {
                i5 = c7284jS.h1;
            } else {
                i5 = c3010Fy.c;
            }
        } else {
            i5 = -16777216;
        }
        if (a(this.i, c7284jS.X) && TD2.g(this.j, c7284jS.Y) && this.k == c7284jS.Y0 && this.l == c7284jS.Z0 && this.m == c7284jS.a1 && TD2.g(Integer.valueOf(this.n), Integer.valueOf(c7284jS.b1)) && this.f663o == c7284jS.c1 && TD2.g(Integer.valueOf(this.p), Integer.valueOf(c7284jS.d1)) && this.q == c7284jS.e1 && this.r == c7284jS.f1 && this.s == c3010Fy.a && this.t == c3010Fy.b && this.u == i5 && this.w == c3010Fy.d && this.v == c3010Fy.e && TD2.g(this.f.getTypeface(), c3010Fy.f) && this.x == f && this.y == f2 && this.z == f3 && this.A == i && this.B == i2 && this.C == i3 && this.D == i4) {
            d(canvas, z);
            return;
        }
        this.i = c7284jS.X;
        this.j = c7284jS.Y;
        this.k = c7284jS.Y0;
        this.l = c7284jS.Z0;
        this.m = c7284jS.a1;
        this.n = c7284jS.b1;
        this.f663o = c7284jS.c1;
        this.p = c7284jS.d1;
        this.q = c7284jS.e1;
        this.r = c7284jS.f1;
        this.s = c3010Fy.a;
        this.t = c3010Fy.b;
        this.u = i5;
        this.w = c3010Fy.d;
        this.v = c3010Fy.e;
        this.f.setTypeface(c3010Fy.f);
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = i;
        this.B = i2;
        this.C = i3;
        this.D = i4;
        if (z) {
            C9542sf.g(this.i);
            g();
        } else {
            C9542sf.g(this.k);
            f();
        }
        d(canvas, z);
    }

    @HS1({"cueBitmap", "bitmapRect"})
    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.k, (Rect) null, this.J, this.h);
    }

    public final void d(Canvas canvas, boolean z) {
        if (z) {
            e(canvas);
            return;
        }
        C9542sf.g(this.J);
        C9542sf.g(this.k);
        c(canvas);
    }

    public final void e(Canvas canvas) {
        Canvas canvas2;
        int i;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate(this.G, this.H);
            if (Color.alpha(this.u) > 0) {
                this.g.setColor(this.u);
                canvas2 = canvas;
                canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.g);
            } else {
                canvas2 = canvas;
            }
            int i2 = this.w;
            boolean z = true;
            if (i2 == 1) {
                this.f.setStrokeJoin(Paint.Join.ROUND);
                this.f.setStrokeWidth(this.a);
                this.f.setColor(this.v);
                this.f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas2);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f;
                float f = this.b;
                float f2 = this.c;
                textPaint.setShadowLayer(f, f2, f2, this.v);
            } else if (i2 == 3 || i2 == 4) {
                if (i2 != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.v;
                }
                if (z) {
                    i3 = this.v;
                }
                float f3 = this.b / 2.0f;
                this.f.setColor(this.s);
                this.f.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                this.f.setShadowLayer(this.b, f4, f4, i);
                staticLayout2.draw(canvas2);
                this.f.setShadowLayer(this.b, f3, f3, i3);
            }
            this.f.setColor(this.s);
            this.f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas2);
            this.f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas2.restoreToCount(save);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @HS1({"cueBitmap"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int round;
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.k;
        int i2 = this.C;
        int i3 = this.A;
        int i4 = this.D;
        int i5 = this.B;
        float f3 = i2 - i3;
        float f4 = i3 + (this.f663o * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.l * f5);
        int round2 = Math.round(f3 * this.q);
        float f7 = this.r;
        if (f7 != -3.4028235E38f) {
            round = Math.round(f5 * f7);
        } else {
            round = Math.round(round2 * (bitmap.getHeight() / bitmap.getWidth()));
        }
        int i6 = this.p;
        if (i6 == 2) {
            f = round2;
        } else {
            if (i6 == 1) {
                f = round2 / 2;
            }
            int round3 = Math.round(f4);
            i = this.n;
            if (i != 2) {
                f2 = round;
            } else {
                if (i == 1) {
                    f2 = round / 2;
                }
                int round4 = Math.round(f6);
                this.J = new Rect(round3, round4, round2 + round3, round + round4);
            }
            f6 -= f2;
            int round42 = Math.round(f6);
            this.J = new Rect(round3, round42, round2 + round3, round + round42);
        }
        f4 -= f;
        int round32 = Math.round(f4);
        i = this.n;
        if (i != 2) {
        }
        f6 -= f2;
        int round422 = Math.round(f6);
        this.J = new Rect(round32, round422, round2 + round32, round + round422);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    @HS1({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        SpannableStringBuilder spannableStringBuilder;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        CharSequence charSequence = this.i;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(this.i);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i6 = this.C - this.A;
        int i7 = this.D - this.B;
        this.f.setTextSize(this.x);
        int i8 = (int) ((this.x * 0.125f) + 0.5f);
        int i9 = i8 * 2;
        int i10 = i6 - i9;
        float f = this.q;
        float f2 = -3.4028235E38f;
        if (f != -3.4028235E38f) {
            i10 = (int) (i10 * f);
        }
        int i11 = i10;
        String str = K;
        if (i11 <= 0) {
            I31.n(K, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.y > 0.0f) {
            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) this.y), 0, spannableStringBuilder2.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
        if (this.w == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(0, spannableStringBuilder3.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i12 = 0;
            while (i12 < length) {
                spannableStringBuilder3.removeSpan(foregroundColorSpanArr[i12]);
                i12++;
                f2 = f2;
            }
        }
        float f3 = f2;
        if (Color.alpha(this.t) > 0) {
            int i13 = this.w;
            if (i13 != 0 && i13 != 2) {
                spannableStringBuilder3.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder3.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder2, this.f, i11, alignment2, this.d, this.e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int i14 = 0;
        int i15 = 0;
        while (i15 < lineCount) {
            i14 = Math.max((int) Math.ceil(this.E.getLineWidth(i15)), i14);
            i15++;
            str = str;
        }
        String str2 = str;
        if (this.q == f3 || i14 >= i11) {
            i11 = i14;
        }
        int i16 = i11 + i9;
        float f4 = this.f663o;
        if (f4 != f3) {
            int round = Math.round(i6 * f4);
            int i17 = this.A;
            int i18 = round + i17;
            int i19 = this.p;
            if (i19 != 1) {
                if (i19 == 2) {
                    i18 -= i16;
                }
            } else {
                i18 = ((i18 * 2) - i16) / 2;
            }
            i = Math.max(i18, i17);
            i2 = Math.min(i16 + i, this.C);
        } else {
            i = ((i6 - i16) / 2) + this.A;
            i2 = i + i16;
        }
        int i20 = i2 - i;
        if (i20 <= 0) {
            I31.n(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f5 = this.l;
        if (f5 != f3) {
            if (this.m == 0) {
                i3 = Math.round(i7 * f5) + this.B;
                int i21 = this.n;
                if (i21 != 2) {
                    if (i21 == 1) {
                        i3 = ((i3 * 2) - height) / 2;
                    }
                    i4 = i3 + height;
                    i5 = this.D;
                    if (i4 <= i5) {
                        i3 = i5 - height;
                    } else {
                        int i22 = this.B;
                        if (i3 < i22) {
                            i3 = i22;
                        }
                    }
                }
                i3 -= height;
                i4 = i3 + height;
                i5 = this.D;
                if (i4 <= i5) {
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f6 = this.l;
                if (f6 >= 0.0f) {
                    i3 = Math.round(f6 * lineBottom) + this.B;
                    i4 = i3 + height;
                    i5 = this.D;
                    if (i4 <= i5) {
                    }
                } else {
                    i3 = Math.round((f6 + 1.0f) * lineBottom) + this.D;
                    i3 -= height;
                    i4 = i3 + height;
                    i5 = this.D;
                    if (i4 <= i5) {
                    }
                }
            }
        } else {
            i3 = (this.D - height) - ((int) (i7 * this.z));
        }
        this.E = new StaticLayout(spannableStringBuilder2, this.f, i20, alignment2, this.d, this.e, true);
        this.F = new StaticLayout(spannableStringBuilder3, this.f, i20, alignment2, this.d, this.e, true);
        this.G = i;
        this.H = i3;
        this.I = i8;
    }
}
