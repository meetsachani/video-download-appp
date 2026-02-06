package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.j;
import o.C4327Tk;
import o.C9696tH0;
import o.UK;
import o.VK;

/* loaded from: classes.dex */
public class Barrier extends b {
    public static final int l1 = 0;
    public static final int m1 = 2;
    public static final int n1 = 1;
    public static final int o1 = 3;
    public static final int p1 = 5;
    public static final int q1 = 6;
    public int i1;
    public int j1;
    public C4327Tk k1;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public void B(e.a aVar, C9696tH0 c9696tH0, ConstraintLayout.b bVar, SparseArray<UK> sparseArray) {
        super.B(aVar, c9696tH0, bVar, sparseArray);
        if (c9696tH0 instanceof C4327Tk) {
            C4327Tk c4327Tk = (C4327Tk) c9696tH0;
            M(c4327Tk, aVar.e.h0, ((VK) c9696tH0.U()).P2());
            c4327Tk.u2(aVar.e.p0);
            c4327Tk.w2(aVar.e.i0);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void D(UK uk, boolean z) {
        M(uk, this.i1, z);
    }

    @Deprecated
    public boolean L() {
        return this.k1.p2();
    }

    public final void M(UK uk, int i, boolean z) {
        this.j1 = i;
        if (z) {
            int i2 = this.i1;
            if (i2 == 5) {
                this.j1 = 1;
            } else if (i2 == 6) {
                this.j1 = 0;
            }
        } else {
            int i3 = this.i1;
            if (i3 == 5) {
                this.j1 = 0;
            } else if (i3 == 6) {
                this.j1 = 1;
            }
        }
        if (uk instanceof C4327Tk) {
            ((C4327Tk) uk).v2(this.j1);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.k1.p2();
    }

    public int getMargin() {
        return this.k1.r2();
    }

    public int getType() {
        return this.i1;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.k1.u2(z);
    }

    public void setDpMargin(int i) {
        C4327Tk c4327Tk = this.k1;
        c4327Tk.w2((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.k1.w2(i);
    }

    public void setType(int i) {
        this.i1 = i;
    }

    @Override // androidx.constraintlayout.widget.b
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.k1 = new C4327Tk();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.i2) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.h2) {
                    this.k1.u2(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == j.c.j2) {
                    this.k1.w2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b1 = this.k1;
        K();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
