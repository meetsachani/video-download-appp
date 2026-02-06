package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.j;

/* renamed from: o.Rk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4132Rk1 extends AppCompatButton {
    public float b1;
    public float c1;
    public Path d1;
    public ViewOutlineProvider e1;
    public RectF f1;

    /* renamed from: o.Rk1$a */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = C4132Rk1.this.getWidth();
            int height = C4132Rk1.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * C4132Rk1.this.b1) / 2.0f);
        }
    }

    /* renamed from: o.Rk1$b */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, C4132Rk1.this.getWidth(), C4132Rk1.this.getHeight(), C4132Rk1.this.c1);
        }
    }

    public C4132Rk1(Context context) {
        super(context);
        this.b1 = 0.0f;
        this.c1 = Float.NaN;
        d(context, null);
    }

    private void d(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Y8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.j9) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.k9) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.c1;
    }

    public float getRoundPercent() {
        return this.b1;
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.c1 = f;
            float f2 = this.b1;
            this.b1 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.c1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.c1 = f;
        if (f != 0.0f) {
            if (this.d1 == null) {
                this.d1 = new Path();
            }
            if (this.f1 == null) {
                this.f1 = new RectF();
            }
            if (this.e1 == null) {
                b bVar = new b();
                this.e1 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1.set(0.0f, 0.0f, getWidth(), getHeight());
            this.d1.reset();
            Path path = this.d1;
            RectF rectF = this.f1;
            float f3 = this.c1;
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
        if (this.b1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.b1 = f;
        if (f != 0.0f) {
            if (this.d1 == null) {
                this.d1 = new Path();
            }
            if (this.f1 == null) {
                this.f1 = new RectF();
            }
            if (this.e1 == null) {
                a aVar = new a();
                this.e1 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.b1) / 2.0f;
            this.f1.set(0.0f, 0.0f, width, height);
            this.d1.reset();
            this.d1.addRoundRect(this.f1, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public C4132Rk1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b1 = 0.0f;
        this.c1 = Float.NaN;
        d(context, attributeSet);
    }

    public C4132Rk1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = 0.0f;
        this.c1 = Float.NaN;
        d(context, attributeSet);
    }
}
