package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.widget.j;

/* renamed from: o.rl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9325rl1 extends C6370fk1 {
    public static final String q1 = "MotionTelltales";
    public Paint j1;
    public C7114il1 k1;
    public float[] l1;
    public Matrix m1;
    public int n1;
    public int o1;
    public float p1;

    public C9325rl1(Context context) {
        super(context);
        this.j1 = new Paint();
        this.l1 = new float[2];
        this.m1 = new Matrix();
        this.n1 = 0;
        this.o1 = -65281;
        this.p1 = 0.25f;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Qd);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.Rd) {
                    this.o1 = obtainStyledAttributes.getColor(index, this.o1);
                } else if (index == j.c.Td) {
                    this.n1 = obtainStyledAttributes.getInt(index, this.n1);
                } else if (index == j.c.Sd) {
                    this.p1 = obtainStyledAttributes.getFloat(index, this.p1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.j1.setColor(this.o1);
        this.j1.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // o.C6370fk1, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.m1);
        if (this.k1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof C7114il1) {
                this.k1 = (C7114il1) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.k1.K0(this, f2, f, this.l1, this.n1);
                this.m1.mapVectors(this.l1);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.l1;
                float f5 = fArr2[0];
                float f6 = this.p1;
                float f7 = f4 - (fArr2[1] * f6);
                this.m1.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.j1);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.d1 = charSequence.toString();
        requestLayout();
    }

    public C9325rl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j1 = new Paint();
        this.l1 = new float[2];
        this.m1 = new Matrix();
        this.n1 = 0;
        this.o1 = -65281;
        this.p1 = 0.25f;
        a(context, attributeSet);
    }

    public C9325rl1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j1 = new Paint();
        this.l1 = new float[2];
        this.m1 = new Matrix();
        this.n1 = 0;
        this.o1 = -65281;
        this.p1 = 0.25f;
        a(context, attributeSet);
    }
}
