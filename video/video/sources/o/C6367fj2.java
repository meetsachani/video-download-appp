package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import o.OL1;

/* renamed from: o.fj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6367fj2 extends CompoundButton implements InterfaceC10984ya0 {
    public static final int Q1 = 250;
    public static final int R1 = 0;
    public static final int S1 = 1;
    public static final int T1 = 2;
    public static final String U1 = "android.widget.Switch";
    public static final int V1 = 1;
    public static final int W1 = 2;
    public static final int X1 = 3;
    public static final Property<C6367fj2, Float> Y1 = new a(Float.class, "thumbPos");
    public static final int[] Z1 = {16842912};
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public final TextPaint G1;
    public ColorStateList H1;
    public Layout I1;
    public Layout J1;
    public TransformationMethod K1;
    public ObjectAnimator L1;
    public final C3904Pc M1;
    public C10016uc N1;
    public b O1;
    public final Rect P1;
    public Drawable Y0;
    public ColorStateList Z0;
    public PorterDuff.Mode a1;
    public boolean b1;
    public boolean c1;
    public Drawable d1;
    public ColorStateList e1;
    public PorterDuff.Mode f1;
    public boolean g1;
    public boolean h1;
    public int i1;
    public int j1;
    public int k1;
    public boolean l1;
    public CharSequence m1;
    public CharSequence n1;
    public CharSequence o1;
    public CharSequence p1;
    public boolean q1;
    public int r1;
    public int s1;
    public float t1;
    public float u1;
    public VelocityTracker v1;
    public int w1;
    public float x1;
    public int y1;
    public int z1;

    /* renamed from: o.fj2$a */
    /* loaded from: classes.dex */
    public class a extends Property<C6367fj2, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C6367fj2 c6367fj2) {
            return Float.valueOf(c6367fj2.x1);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C6367fj2 c6367fj2, Float f) {
            c6367fj2.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: o.fj2$b */
    /* loaded from: classes.dex */
    public static class b extends c.g {
        public final Reference<C6367fj2> a;

        public b(C6367fj2 c6367fj2) {
            this.a = new WeakReference(c6367fj2);
        }

        @Override // androidx.emoji2.text.c.g
        public void a(Throwable th) {
            C6367fj2 c6367fj2 = this.a.get();
            if (c6367fj2 != null) {
                c6367fj2.k();
            }
        }

        @Override // androidx.emoji2.text.c.g
        public void b() {
            C6367fj2 c6367fj2 = this.a.get();
            if (c6367fj2 != null) {
                c6367fj2.k();
            }
        }
    }

    public C6367fj2(Context context) {
        this(context, null);
    }

    public static float g(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    private C10016uc getEmojiTextViewHelper() {
        if (this.N1 == null) {
            this.N1 = new C10016uc(this);
        }
        return this.N1;
    }

    private boolean getTargetCheckedState() {
        if (this.x1 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (C11163zI2.b(this)) {
            f = 1.0f - this.x1;
        } else {
            f = this.x1;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.d1;
        if (drawable != null) {
            Rect rect2 = this.P1;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.Y0;
            if (drawable2 != null) {
                rect = X60.d(drawable2);
            } else {
                rect = X60.c;
            }
            return ((((this.y1 - this.A1) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.o1 = charSequence;
        this.p1 = h(charSequence);
        this.J1 = null;
        if (this.q1) {
            q();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.m1 = charSequence;
        this.n1 = h(charSequence);
        this.I1 = null;
        if (this.q1) {
            q();
        }
    }

    public final void a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, Y1, f);
        this.L1 = ofFloat;
        ofFloat.setDuration(250L);
        this.L1.setAutoCancel(true);
        this.L1.start();
    }

    @Override // o.InterfaceC10984ya0
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    public final void c() {
        Drawable drawable = this.Y0;
        if (drawable != null) {
            if (this.b1 || this.c1) {
                Drawable mutate = D60.r(drawable).mutate();
                this.Y0 = mutate;
                if (this.b1) {
                    D60.o(mutate, this.Z0);
                }
                if (this.c1) {
                    D60.p(this.Y0, this.a1);
                }
                if (this.Y0.isStateful()) {
                    this.Y0.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        Drawable drawable = this.d1;
        if (drawable != null) {
            if (this.g1 || this.h1) {
                Drawable mutate = D60.r(drawable).mutate();
                this.d1 = mutate;
                if (this.g1) {
                    D60.o(mutate, this.e1);
                }
                if (this.h1) {
                    D60.p(this.d1, this.f1);
                }
                if (this.d1.isStateful()) {
                    this.d1.setState(getDrawableState());
                }
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.P1;
        int i3 = this.B1;
        int i4 = this.C1;
        int i5 = this.D1;
        int i6 = this.E1;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.Y0;
        if (drawable != null) {
            rect = X60.d(drawable);
        } else {
            rect = X60.c;
        }
        Drawable drawable2 = this.d1;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.d1.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.d1.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.Y0;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A1 + rect2.right;
            this.Y0.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                D60.l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.Y0;
        if (drawable != null) {
            D60.k(drawable, f, f2);
        }
        Drawable drawable2 = this.d1;
        if (drawable2 != null) {
            D60.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.Y0;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.d1;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        ObjectAnimator objectAnimator = this.L1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void f(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C11163zI2.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.y1;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.k1;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C11163zI2.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.y1;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.k1;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4930Zm2.F(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.q1;
    }

    public boolean getSplitTrack() {
        return this.l1;
    }

    public int getSwitchMinWidth() {
        return this.j1;
    }

    public int getSwitchPadding() {
        return this.k1;
    }

    public CharSequence getTextOff() {
        return this.o1;
    }

    public CharSequence getTextOn() {
        return this.m1;
    }

    public Drawable getThumbDrawable() {
        return this.Y0;
    }

    public final float getThumbPosition() {
        return this.x1;
    }

    public int getThumbTextPadding() {
        return this.i1;
    }

    public ColorStateList getThumbTintList() {
        return this.Z0;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.a1;
    }

    public Drawable getTrackDrawable() {
        return this.d1;
    }

    public ColorStateList getTrackTintList() {
        return this.e1;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1;
    }

    public final CharSequence h(CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().f(this.K1);
        if (f != null) {
            return f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    public final boolean i(float f, float f2) {
        if (this.Y0 == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.Y0.getPadding(this.P1);
        int i = this.C1;
        int i2 = this.s1;
        int i3 = i - i2;
        int i4 = (this.B1 + thumbOffset) - i2;
        Rect rect = this.P1;
        int i5 = this.A1 + i4 + rect.left + rect.right + i2;
        int i6 = this.E1 + i2;
        if (f <= i4 || f >= i5 || f2 <= i3 || f2 >= i6) {
            return false;
        }
        return true;
    }

    public final Layout j(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.G1;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.Y0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.d1;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L1;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L1.end();
            this.L1 = null;
        }
    }

    public void k() {
        setTextOnInternal(this.m1);
        setTextOffInternal(this.o1);
        requestLayout();
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.o1;
            if (charSequence == null) {
                charSequence = getResources().getString(OL1.k.g);
            }
            C6516gH2.B2(this, charSequence);
        }
    }

    public final void m() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.m1;
            if (charSequence == null) {
                charSequence = getResources().getString(OL1.k.h);
            }
            C6516gH2.B2(this, charSequence);
        }
    }

    public void n(Context context, int i) {
        C2872Ep2 E = C2872Ep2.E(context, i, OL1.m.a6);
        ColorStateList d = E.d(OL1.m.e6);
        if (d != null) {
            this.H1 = d;
        } else {
            this.H1 = getTextColors();
        }
        int g = E.g(OL1.m.b6, 0);
        if (g != 0) {
            float f = g;
            if (f != this.G1.getTextSize()) {
                this.G1.setTextSize(f);
                requestLayout();
            }
        }
        p(E.o(OL1.m.c6, -1), E.o(OL1.m.d6, -1));
        if (E.a(OL1.m.p6, false)) {
            this.K1 = new C9416s8(getContext());
        } else {
            this.K1 = null;
        }
        setTextOnInternal(this.m1);
        setTextOffInternal(this.o1);
        E.I();
    }

    public void o(Typeface typeface, int i) {
        Typeface create;
        int i2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            if (create != null) {
                i2 = create.getStyle();
            } else {
                i2 = 0;
            }
            int i3 = (~i2) & i;
            TextPaint textPaint = this.G1;
            if ((i3 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.G1;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.G1.setFakeBoldText(false);
        this.G1.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Z1);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.P1;
        Drawable drawable = this.d1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.C1;
        int i2 = this.E1;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.Y0;
        if (drawable != null) {
            if (this.l1 && drawable2 != null) {
                Rect d = X60.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.I1;
        } else {
            layout = this.J1;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H1;
            if (colorStateList != null) {
                this.G1.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G1.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(U1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(U1);
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.m1;
            } else {
                charSequence = this.o1;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.Y0 != null) {
            Rect rect = this.P1;
            Drawable drawable = this.d1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = X60.d(this.Y0);
            i5 = Math.max(0, d.left - rect.left);
            i9 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C11163zI2.b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.y1 + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.y1) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i7 = this.z1;
            } else {
                i8 = getHeight() - getPaddingBottom();
                paddingTop = i8 - this.z1;
                this.B1 = i6;
                this.C1 = paddingTop;
                this.E1 = i8;
                this.D1 = width;
            }
        } else {
            i7 = this.z1;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        }
        i8 = i7 + paddingTop;
        this.B1 = i6;
        this.C1 = paddingTop;
        this.E1 = i8;
        this.D1 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.q1) {
            if (this.I1 == null) {
                this.I1 = j(this.n1);
            }
            if (this.J1 == null) {
                this.J1 = j(this.p1);
            }
        }
        Rect rect = this.P1;
        Drawable drawable = this.Y0;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.Y0.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.Y0.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.q1) {
            i5 = Math.max(this.I1.getWidth(), this.J1.getWidth()) + (this.i1 * 2);
        } else {
            i5 = 0;
        }
        this.A1 = Math.max(i5, i3);
        Drawable drawable2 = this.d1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.d1.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.Y0;
        if (drawable3 != null) {
            Rect d = X60.d(drawable3);
            i8 = Math.max(i8, d.left);
            i9 = Math.max(i9, d.right);
        }
        if (this.F1) {
            i6 = Math.max(this.j1, (this.A1 * 2) + i8 + i9);
        } else {
            i6 = this.j1;
        }
        int max = Math.max(i7, i4);
        this.y1 = i6;
        this.z1 = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.m1;
        } else {
            charSequence = this.o1;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        this.v1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.r1;
                    if (i != 1) {
                        if (i == 2) {
                            float x = motionEvent.getX();
                            int thumbScrollRange = getThumbScrollRange();
                            float f2 = x - this.t1;
                            if (thumbScrollRange != 0) {
                                f = f2 / thumbScrollRange;
                            } else if (f2 > 0.0f) {
                                f = 1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (C11163zI2.b(this)) {
                                f = -f;
                            }
                            float g = g(this.x1 + f, 0.0f, 1.0f);
                            if (g != this.x1) {
                                this.t1 = x;
                                setThumbPosition(g);
                            }
                            return true;
                        }
                    } else {
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x2 - this.t1) > this.s1 || Math.abs(y - this.u1) > this.s1) {
                            this.r1 = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.t1 = x2;
                            this.u1 = y;
                            return true;
                        }
                    }
                }
            }
            if (this.r1 == 2) {
                r(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.r1 = 0;
            this.v1.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && i(x3, y2)) {
                this.r1 = 1;
                this.t1 = x3;
                this.u1 = y2;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(int i, int i2) {
        Typeface typeface;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        o(typeface, i2);
    }

    public final void q() {
        if (this.O1 == null && this.N1.b() && androidx.emoji2.text.c.q()) {
            androidx.emoji2.text.c c = androidx.emoji2.text.c.c();
            int i = c.i();
            if (i == 3 || i == 0) {
                b bVar = new b(this);
                this.O1 = bVar;
                c.B(bVar);
            }
        }
    }

    public final void r(MotionEvent motionEvent) {
        boolean z;
        this.r1 = 0;
        boolean z2 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.v1.computeCurrentVelocity(1000);
            float xVelocity = this.v1.getXVelocity();
            if (Math.abs(xVelocity) > this.w1) {
                if (!C11163zI2.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
            } else {
                z2 = getTargetCheckedState();
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        f(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m();
        } else {
            l();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(isChecked);
            return;
        }
        e();
        if (isChecked) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4930Zm2.G(this, callback));
    }

    @Override // o.InterfaceC10984ya0
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.m1);
        setTextOffInternal(this.o1);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.F1 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.q1 != z) {
            this.q1 = z;
            requestLayout();
            if (z) {
                q();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.l1 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.j1 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.k1 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.G1.getTypeface() != null && !this.G1.getTypeface().equals(typeface)) || (this.G1.getTypeface() == null && typeface != null)) {
            this.G1.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            l();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.Y0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.Y0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.x1 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3220Ic.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.i1 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.Z0 = colorStateList;
        this.b1 = true;
        c();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.a1 = mode;
        this.c1 = true;
        c();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.d1;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3220Ic.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.e1 = colorStateList;
        this.g1 = true;
        d();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1 = mode;
        this.h1 = true;
        d();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.Y0 && drawable != this.d1) {
            return false;
        }
        return true;
    }

    public C6367fj2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.l3);
    }

    public C6367fj2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Z0 = null;
        this.a1 = null;
        this.b1 = false;
        this.c1 = false;
        this.e1 = null;
        this.f1 = null;
        this.g1 = false;
        this.h1 = false;
        this.v1 = VelocityTracker.obtain();
        this.F1 = true;
        this.P1 = new Rect();
        C8112mn2.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.G1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = OL1.m.L5;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i, 0);
        C6516gH2.G1(this, context, iArr, attributeSet, G.B(), i, 0);
        Drawable h = G.h(OL1.m.O5);
        this.Y0 = h;
        if (h != null) {
            h.setCallback(this);
        }
        Drawable h2 = G.h(OL1.m.X5);
        this.d1 = h2;
        if (h2 != null) {
            h2.setCallback(this);
        }
        setTextOnInternal(G.x(OL1.m.M5));
        setTextOffInternal(G.x(OL1.m.N5));
        this.q1 = G.a(OL1.m.P5, true);
        this.i1 = G.g(OL1.m.U5, 0);
        this.j1 = G.g(OL1.m.R5, 0);
        this.k1 = G.g(OL1.m.S5, 0);
        this.l1 = G.a(OL1.m.Q5, false);
        ColorStateList d = G.d(OL1.m.V5);
        if (d != null) {
            this.Z0 = d;
            this.b1 = true;
        }
        PorterDuff.Mode e = X60.e(G.o(OL1.m.W5, -1), null);
        if (this.a1 != e) {
            this.a1 = e;
            this.c1 = true;
        }
        if (this.b1 || this.c1) {
            c();
        }
        ColorStateList d2 = G.d(OL1.m.Y5);
        if (d2 != null) {
            this.e1 = d2;
            this.g1 = true;
        }
        PorterDuff.Mode e2 = X60.e(G.o(OL1.m.Z5, -1), null);
        if (this.f1 != e2) {
            this.f1 = e2;
            this.h1 = true;
        }
        if (this.g1 || this.h1) {
            d();
        }
        int u = G.u(OL1.m.T5, 0);
        if (u != 0) {
            n(context, u);
        }
        C3904Pc c3904Pc = new C3904Pc(this);
        this.M1 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        G.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.s1 = viewConfiguration.getScaledTouchSlop();
        this.w1 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
