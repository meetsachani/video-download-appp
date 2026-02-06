package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import o.C11178zM1;

/* renamed from: o.sC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9432sC extends ImageView {
    public static final int b1 = -328966;
    public static final int c1 = 1023410176;
    public static final int d1 = 503316480;
    public static final float e1 = 0.0f;
    public static final float f1 = 1.75f;
    public static final float g1 = 3.5f;
    public static final int h1 = 4;
    public Animation.AnimationListener Y0;
    public int Z0;
    public int a1;

    /* renamed from: o.sC$a */
    /* loaded from: classes.dex */
    public static class a extends OvalShape {
        public Paint X = new Paint();
        public int Y;
        public C9432sC Z;

        public a(C9432sC c9432sC, int i) {
            this.Z = c9432sC;
            this.Y = i;
            b((int) rect().width());
        }

        public final void b(int i) {
            float f = i / 2;
            this.X.setShader(new RadialGradient(f, f, this.Y, new int[]{C9432sC.c1, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.Z.getWidth() / 2;
            float height = this.Z.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.X);
            canvas.drawCircle(width2, height, width - this.Y, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            b((int) f);
        }
    }

    public C9432sC(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.Z0 = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C11178zM1.j.Q);
        this.a1 = obtainStyledAttributes.getColor(C11178zM1.j.R, b1);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C6516gH2.W1(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.Z0));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.Z0, i2, i, d1);
            int i3 = this.Z0;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.a1);
        C6516gH2.Q1(this, shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public int b() {
        return this.a1;
    }

    public void c(Animation.AnimationListener animationListener) {
        this.Y0 = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.Y0;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.Y0;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.Z0 * 2), getMeasuredHeight() + (this.Z0 * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.a1 = i;
        }
    }
}
