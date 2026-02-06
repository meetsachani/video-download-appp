package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.j;
import androidx.constraintlayout.widget.n;
import o.C3785Nv0;
import o.C9696tH0;
import o.UI2;
import o.UK;

/* loaded from: classes.dex */
public class Flow extends n {
    public static final int A1 = 3;
    public static final String l1 = "Flow";
    public static final int m1 = 0;
    public static final int n1 = 1;
    public static final int o1 = 0;
    public static final int p1 = 1;
    public static final int q1 = 2;
    public static final int r1 = 0;
    public static final int s1 = 1;
    public static final int t1 = 2;
    public static final int u1 = 0;
    public static final int v1 = 1;
    public static final int w1 = 2;
    public static final int x1 = 0;
    public static final int y1 = 1;
    public static final int z1 = 2;
    public C3785Nv0 k1;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public void B(e.a aVar, C9696tH0 c9696tH0, ConstraintLayout.b bVar, SparseArray<UK> sparseArray) {
        super.B(aVar, c9696tH0, bVar, sparseArray);
        if (c9696tH0 instanceof C3785Nv0) {
            C3785Nv0 c3785Nv0 = (C3785Nv0) c9696tH0;
            int i = bVar.Z;
            if (i != -1) {
                c3785Nv0.y3(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void D(UK uk, boolean z) {
        this.k1.n2(z);
    }

    @Override // androidx.constraintlayout.widget.n
    public void L(UI2 ui2, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (ui2 != null) {
            ui2.w2(mode, size, mode2, size2);
            setMeasuredDimension(ui2.r2(), ui2.q2());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onMeasure(int i, int i2) {
        L(this.k1, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.k1.l3(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.k1.m3(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.k1.n3(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.k1.o3(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.k1.p3(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.k1.q3(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.k1.r3(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.k1.s3(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.k1.t3(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.k1.u3(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.k1.v3(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.k1.w3(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.k1.x3(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.k1.y3(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.k1.C2(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.k1.D2(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.k1.F2(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.k1.G2(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.k1.I2(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.k1.z3(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.k1.A3(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.k1.B3(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.k1.C3(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.k1.D3(i);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.k1 = new C3785Nv0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.I1) {
                    this.k1.y3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.J1) {
                    this.k1.C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.a2) {
                    this.k1.H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.b2) {
                    this.k1.E2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.K1) {
                    this.k1.F2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.L1) {
                    this.k1.I2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.M1) {
                    this.k1.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.N1) {
                    this.k1.D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.K2) {
                    this.k1.D3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.A2) {
                    this.k1.s3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.J2) {
                    this.k1.C3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.u2) {
                    this.k1.m3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.C2) {
                    this.k1.u3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.w2) {
                    this.k1.o3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.E2) {
                    this.k1.w3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.y2) {
                    this.k1.q3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.c.t2) {
                    this.k1.l3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.c.B2) {
                    this.k1.t3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.c.v2) {
                    this.k1.n3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.c.D2) {
                    this.k1.v3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.c.H2) {
                    this.k1.A3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.c.x2) {
                    this.k1.p3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == j.c.G2) {
                    this.k1.z3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == j.c.z2) {
                    this.k1.r3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.I2) {
                    this.k1.B3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.c.F2) {
                    this.k1.x3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b1 = this.k1;
        K();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
