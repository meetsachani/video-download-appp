package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import o.UK;

/* loaded from: classes.dex */
public class i extends View {
    public int Y0;
    public View Z0;
    public int a1;

    public i(Context context) {
        super(context);
        this.Y0 = -1;
        this.Z0 = null;
        this.a1 = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.a1);
        this.Y0 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.Y3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.Z3) {
                    this.Y0 = obtainStyledAttributes.getResourceId(index, this.Y0);
                } else if (index == j.c.a4) {
                    this.a1 = obtainStyledAttributes.getInt(index, this.a1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.Z0 == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.Z0.getLayoutParams();
        bVar2.v0.c2(0);
        UK.b H = bVar.v0.H();
        UK.b bVar3 = UK.b.FIXED;
        if (H != bVar3) {
            bVar.v0.d2(bVar2.v0.m0());
        }
        if (bVar.v0.j0() != bVar3) {
            bVar.v0.z1(bVar2.v0.D());
        }
        bVar2.v0.c2(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.Y0 == -1 && !isInEditMode()) {
            setVisibility(this.a1);
        }
        View findViewById = constraintLayout.findViewById(this.Y0);
        this.Z0 = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).j0 = true;
            this.Z0.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.Z0;
    }

    public int getEmptyVisibility() {
        return this.a1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.Y0 != i) {
            View view = this.Z0;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.Z0.getLayoutParams()).j0 = false;
                this.Z0 = null;
            }
            this.Y0 = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.a1 = i;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = -1;
        this.Z0 = null;
        this.a1 = 4;
        a(attributeSet);
    }

    public i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = -1;
        this.Z0 = null;
        this.a1 = 4;
        a(attributeSet);
    }

    public i(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Y0 = -1;
        this.Z0 = null;
        this.a1 = 4;
        a(attributeSet);
    }
}
