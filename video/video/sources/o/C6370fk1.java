package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.j;

/* renamed from: o.fk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6370fk1 extends View {
    public Paint Y0;
    public Paint Z0;
    public Paint a1;
    public boolean b1;
    public boolean c1;
    public String d1;
    public Rect e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;

    public C6370fk1(Context context) {
        super(context);
        this.Y0 = new Paint();
        this.Z0 = new Paint();
        this.a1 = new Paint();
        this.b1 = true;
        this.c1 = true;
        this.d1 = null;
        this.e1 = new Rect();
        this.f1 = Color.argb(255, 0, 0, 0);
        this.g1 = Color.argb(255, 200, 200, 200);
        this.h1 = Color.argb(255, 50, 50, 50);
        this.i1 = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Cc);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.Ec) {
                    this.d1 = obtainStyledAttributes.getString(index);
                } else if (index == j.c.Hc) {
                    this.b1 = obtainStyledAttributes.getBoolean(index, this.b1);
                } else if (index == j.c.Dc) {
                    this.f1 = obtainStyledAttributes.getColor(index, this.f1);
                } else if (index == j.c.Fc) {
                    this.h1 = obtainStyledAttributes.getColor(index, this.h1);
                } else if (index == j.c.Gc) {
                    this.g1 = obtainStyledAttributes.getColor(index, this.g1);
                } else if (index == j.c.Ic) {
                    this.c1 = obtainStyledAttributes.getBoolean(index, this.c1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.d1 == null) {
            try {
                this.d1 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.Y0.setColor(this.f1);
        this.Y0.setAntiAlias(true);
        this.Z0.setColor(this.g1);
        this.Z0.setAntiAlias(true);
        this.a1.setColor(this.h1);
        this.i1 = Math.round(this.i1 * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b1) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f, f2, this.Y0);
            canvas2.drawLine(0.0f, f2, f, 0.0f, this.Y0);
            canvas2.drawLine(0.0f, 0.0f, f, 0.0f, this.Y0);
            canvas2.drawLine(f, 0.0f, f, f2, this.Y0);
            canvas2.drawLine(f, f2, 0.0f, f2, this.Y0);
            canvas2.drawLine(0.0f, f2, 0.0f, 0.0f, this.Y0);
        } else {
            canvas2 = canvas;
        }
        String str = this.d1;
        if (str != null && this.c1) {
            this.Z0.getTextBounds(str, 0, str.length(), this.e1);
            float width2 = (width - this.e1.width()) / 2.0f;
            float height2 = ((height - this.e1.height()) / 2.0f) + this.e1.height();
            this.e1.offset((int) width2, (int) height2);
            Rect rect = this.e1;
            int i = rect.left;
            int i2 = this.i1;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas2.drawRect(this.e1, this.a1);
            canvas2.drawText(this.d1, width2, height2, this.Z0);
        }
    }

    public C6370fk1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new Paint();
        this.Z0 = new Paint();
        this.a1 = new Paint();
        this.b1 = true;
        this.c1 = true;
        this.d1 = null;
        this.e1 = new Rect();
        this.f1 = Color.argb(255, 0, 0, 0);
        this.g1 = Color.argb(255, 200, 200, 200);
        this.h1 = Color.argb(255, 50, 50, 50);
        this.i1 = 4;
        a(context, attributeSet);
    }

    public C6370fk1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = new Paint();
        this.Z0 = new Paint();
        this.a1 = new Paint();
        this.b1 = true;
        this.c1 = true;
        this.d1 = null;
        this.e1 = new Rect();
        this.f1 = Color.argb(255, 0, 0, 0);
        this.g1 = Color.argb(255, 200, 200, 200);
        this.h1 = Color.argb(255, 50, 50, 50);
        this.i1 = 4;
        a(context, attributeSet);
    }
}
