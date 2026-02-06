package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class NE0 extends androidx.constraintlayout.widget.n {
    public static final String F1 = "Grid";
    public static final int G1 = 1;
    public static final int H1 = 0;
    public static final boolean I1 = false;
    public boolean A1;
    public boolean B1;
    public boolean[][] C1;
    public Set<Integer> D1;
    public int[] E1;
    public final int k1;
    public final int l1;
    public View[] m1;
    public ConstraintLayout n1;
    public int o1;
    public int p1;
    public int q1;
    public int r1;
    public String s1;
    public String t1;
    public String u1;
    public String v1;
    public float w1;
    public float x1;
    public int y1;
    public int z1;

    public NE0(Context context) {
        super(context);
        this.k1 = 50;
        this.l1 = 50;
        this.z1 = 0;
        this.D1 = new HashSet();
    }

    private int getNextPosition() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.z1;
            if (i >= this.o1 * this.q1) {
                return -1;
            }
            int T = T(i);
            int S = S(this.z1);
            boolean[] zArr = this.C1[T];
            if (zArr[S]) {
                zArr[S] = false;
                z = true;
            }
            this.z1++;
        }
        return i;
    }

    public final boolean M() {
        View[] x = x(this.n1);
        for (int i = 0; i < this.Z0; i++) {
            if (!this.D1.contains(Integer.valueOf(this.Y0[i]))) {
                int nextPosition = getNextPosition();
                int T = T(nextPosition);
                int S = S(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                Q(x[i], T, S, 1, 1);
            }
        }
        return true;
    }

    public final void N() {
        int max = Math.max(this.o1, this.q1);
        View[] viewArr = this.m1;
        int i = 0;
        if (viewArr == null) {
            this.m1 = new View[max];
            int i2 = 0;
            while (true) {
                View[] viewArr2 = this.m1;
                if (i2 >= viewArr2.length) {
                    break;
                }
                viewArr2[i2] = a0();
                i2++;
            }
        } else if (max != viewArr.length) {
            View[] viewArr3 = new View[max];
            for (int i3 = 0; i3 < max; i3++) {
                View[] viewArr4 = this.m1;
                if (i3 < viewArr4.length) {
                    viewArr3[i3] = viewArr4[i3];
                } else {
                    viewArr3[i3] = a0();
                }
            }
            int i4 = max;
            while (true) {
                View[] viewArr5 = this.m1;
                if (i4 >= viewArr5.length) {
                    break;
                }
                this.n1.removeView(viewArr5[i4]);
                i4++;
            }
            this.m1 = viewArr3;
        }
        this.E1 = new int[max];
        while (true) {
            View[] viewArr6 = this.m1;
            if (i < viewArr6.length) {
                this.E1[i] = viewArr6[i].getId();
                i++;
            } else {
                f0();
                e0();
                return;
            }
        }
    }

    public final void O(View view) {
        ConstraintLayout.b b0 = b0(view);
        b0.L = -1.0f;
        b0.f = -1;
        b0.e = -1;
        b0.g = -1;
        b0.h = -1;
        ((ViewGroup.MarginLayoutParams) b0).leftMargin = -1;
        view.setLayoutParams(b0);
    }

    public final void P(View view) {
        ConstraintLayout.b b0 = b0(view);
        b0.M = -1.0f;
        b0.j = -1;
        b0.i = -1;
        b0.k = -1;
        b0.l = -1;
        ((ViewGroup.MarginLayoutParams) b0).topMargin = -1;
        view.setLayoutParams(b0);
    }

    public final void Q(View view, int i, int i2, int i3, int i4) {
        ConstraintLayout.b b0 = b0(view);
        int[] iArr = this.E1;
        b0.e = iArr[i2];
        b0.i = iArr[i];
        b0.h = iArr[(i2 + i4) - 1];
        b0.l = iArr[(i + i3) - 1];
        view.setLayoutParams(b0);
    }

    public final boolean R(boolean z) {
        boolean z2;
        int[][] c0;
        int[][] c02;
        if (this.n1 == null || this.o1 < 1 || this.q1 < 1) {
            return false;
        }
        if (z) {
            for (int i = 0; i < this.C1.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.C1;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            this.D1.clear();
        }
        this.z1 = 0;
        N();
        String str = this.t1;
        if (str != null && !str.trim().isEmpty() && (c02 = c0(this.t1)) != null) {
            z2 = U(c02);
        } else {
            z2 = true;
        }
        String str2 = this.s1;
        if (str2 != null && !str2.trim().isEmpty() && (c0 = c0(this.s1)) != null) {
            z2 &= V(this.Y0, c0);
        }
        if (!(z2 & M()) && this.A1) {
            return false;
        }
        return true;
    }

    public final int S(int i) {
        if (this.y1 == 1) {
            return i / this.o1;
        }
        return i % this.q1;
    }

    public final int T(int i) {
        if (this.y1 == 1) {
            return i % this.o1;
        }
        return i / this.q1;
    }

    public final boolean U(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int T = T(iArr[i][0]);
            int S = S(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!X(T, S, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean V(int[] iArr, int[][] iArr2) {
        View[] x = x(this.n1);
        for (int i = 0; i < iArr2.length; i++) {
            int T = T(iArr2[i][0]);
            int S = S(iArr2[i][0]);
            int[] iArr3 = iArr2[i];
            if (!X(T, S, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = x[i];
            int[] iArr4 = iArr2[i];
            Q(view, T, S, iArr4[1], iArr4[2]);
            this.D1.add(Integer.valueOf(iArr[i]));
        }
        return true;
    }

    public final void W() {
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, this.o1, this.q1);
        this.C1 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final boolean X(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.C1;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean Y(CharSequence charSequence) {
        return true;
    }

    public final boolean Z(String str) {
        return true;
    }

    public final View a0() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.n1.addView(view, new ConstraintLayout.b(0, 0));
        return view;
    }

    public final ConstraintLayout.b b0(View view) {
        return (ConstraintLayout.b) view.getLayoutParams();
    }

    public final int[][] c0(String str) {
        if (!Y(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, split.length, 3);
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].trim().split(":");
            String[] split3 = split2[1].split("x");
            iArr[i][0] = Integer.parseInt(split2[0]);
            iArr[i][1] = Integer.parseInt(split3[0]);
            iArr[i][2] = Integer.parseInt(split3[1]);
        }
        return iArr;
    }

    public final float[] d0(int i, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] split = str.split(",");
            if (split.length != i) {
                return null;
            }
            fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr[i2] = Float.parseFloat(split[i2].trim());
            }
        }
        return fArr;
    }

    public final void e0() {
        int i;
        int id = getId();
        int max = Math.max(this.o1, this.q1);
        float[] d0 = d0(this.q1, this.v1);
        int i2 = 0;
        ConstraintLayout.b b0 = b0(this.m1[0]);
        if (this.q1 == 1) {
            O(this.m1[0]);
            b0.e = id;
            b0.h = id;
            this.m1[0].setLayoutParams(b0);
            return;
        }
        while (true) {
            i = this.q1;
            if (i2 >= i) {
                break;
            }
            ConstraintLayout.b b02 = b0(this.m1[i2]);
            O(this.m1[i2]);
            if (d0 != null) {
                b02.L = d0[i2];
            }
            if (i2 > 0) {
                b02.f = this.E1[i2 - 1];
            } else {
                b02.e = id;
            }
            if (i2 < this.q1 - 1) {
                b02.g = this.E1[i2 + 1];
            } else {
                b02.h = id;
            }
            if (i2 > 0) {
                ((ViewGroup.MarginLayoutParams) b02).leftMargin = (int) this.w1;
            }
            this.m1[i2].setLayoutParams(b02);
            i2++;
        }
        while (i < max) {
            ConstraintLayout.b b03 = b0(this.m1[i]);
            O(this.m1[i]);
            b03.e = id;
            b03.h = id;
            this.m1[i].setLayoutParams(b03);
            i++;
        }
    }

    public final void f0() {
        int i;
        int id = getId();
        int max = Math.max(this.o1, this.q1);
        float[] d0 = d0(this.o1, this.u1);
        int i2 = 0;
        if (this.o1 == 1) {
            ConstraintLayout.b b0 = b0(this.m1[0]);
            P(this.m1[0]);
            b0.i = id;
            b0.l = id;
            this.m1[0].setLayoutParams(b0);
            return;
        }
        while (true) {
            i = this.o1;
            if (i2 >= i) {
                break;
            }
            ConstraintLayout.b b02 = b0(this.m1[i2]);
            P(this.m1[i2]);
            if (d0 != null) {
                b02.M = d0[i2];
            }
            if (i2 > 0) {
                b02.j = this.E1[i2 - 1];
            } else {
                b02.i = id;
            }
            if (i2 < this.o1 - 1) {
                b02.k = this.E1[i2 + 1];
            } else {
                b02.l = id;
            }
            if (i2 > 0) {
                ((ViewGroup.MarginLayoutParams) b02).topMargin = (int) this.w1;
            }
            this.m1[i2].setLayoutParams(b02);
            i2++;
        }
        while (i < max) {
            ConstraintLayout.b b03 = b0(this.m1[i]);
            P(this.m1[i]);
            b03.i = id;
            b03.l = id;
            this.m1[i].setLayoutParams(b03);
            i++;
        }
    }

    public final void g0() {
        int i;
        int i2 = this.p1;
        if (i2 != 0 && (i = this.r1) != 0) {
            this.o1 = i2;
            this.q1 = i;
            return;
        }
        int i3 = this.r1;
        if (i3 > 0) {
            this.q1 = i3;
            this.o1 = ((this.Z0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.o1 = i2;
            this.q1 = ((this.Z0 + i2) - 1) / i2;
        } else {
            int sqrt = (int) (Math.sqrt(this.Z0) + 1.5d);
            this.o1 = sqrt;
            this.q1 = ((this.Z0 + sqrt) - 1) / sqrt;
        }
    }

    public String getColumnWeights() {
        return this.v1;
    }

    public int getColumns() {
        return this.r1;
    }

    public float getHorizontalGaps() {
        return this.w1;
    }

    public int getOrientation() {
        return this.y1;
    }

    public String getRowWeights() {
        return this.u1;
    }

    public int getRows() {
        return this.p1;
    }

    public String getSkips() {
        return this.t1;
    }

    public String getSpans() {
        return this.s1;
    }

    public float getVerticalGaps() {
        return this.x1;
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n1 = (ConstraintLayout) getParent();
        R(false);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onDraw(Canvas canvas) {
        View[] viewArr;
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(InterfaceMenuC9553sh2.c);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.m1) {
                int top2 = view.getTop() - top;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(view.getLeft() - left, 0.0f, view.getRight() - left, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        if (Z(str)) {
            String str2 = this.v1;
            if (str2 != null && str2.equals(str)) {
                return;
            }
            this.v1 = str;
            R(true);
            invalidate();
        }
    }

    public void setColumns(int i) {
        if (i > 50 || this.r1 == i) {
            return;
        }
        this.r1 = i;
        g0();
        W();
        R(false);
        invalidate();
    }

    public void setHorizontalGaps(float f) {
        if (f < 0.0f || this.w1 == f) {
            return;
        }
        this.w1 = f;
        R(true);
        invalidate();
    }

    public void setOrientation(int i) {
        if ((i != 0 && i != 1) || this.y1 == i) {
            return;
        }
        this.y1 = i;
        R(true);
        invalidate();
    }

    public void setRowWeights(String str) {
        if (Z(str)) {
            String str2 = this.u1;
            if (str2 != null && str2.equals(str)) {
                return;
            }
            this.u1 = str;
            R(true);
            invalidate();
        }
    }

    public void setRows(int i) {
        if (i > 50 || this.p1 == i) {
            return;
        }
        this.p1 = i;
        g0();
        W();
        R(false);
        invalidate();
    }

    public void setSkips(String str) {
        if (Y(str)) {
            String str2 = this.t1;
            if (str2 != null && str2.equals(str)) {
                return;
            }
            this.t1 = str;
            R(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        if (Y(charSequence)) {
            String str = this.s1;
            if (str != null && str.contentEquals(charSequence)) {
                return;
            }
            this.s1 = charSequence.toString();
            R(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f) {
        if (f < 0.0f || this.x1 == f) {
            return;
        }
        this.x1 = f;
        R(true);
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.c1 = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.M8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.S8) {
                    this.p1 = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == j.c.O8) {
                    this.r1 = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == j.c.U8) {
                    this.s1 = obtainStyledAttributes.getString(index);
                } else if (index == j.c.T8) {
                    this.t1 = obtainStyledAttributes.getString(index);
                } else if (index == j.c.R8) {
                    this.u1 = obtainStyledAttributes.getString(index);
                } else if (index == j.c.N8) {
                    this.v1 = obtainStyledAttributes.getString(index);
                } else if (index == j.c.Q8) {
                    this.y1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == j.c.P8) {
                    this.w1 = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == j.c.X8) {
                    this.x1 = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == j.c.W8) {
                    this.A1 = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == j.c.V8) {
                    this.B1 = obtainStyledAttributes.getBoolean(index, false);
                }
            }
            g0();
            W();
            obtainStyledAttributes.recycle();
        }
    }

    public NE0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k1 = 50;
        this.l1 = 50;
        this.z1 = 0;
        this.D1 = new HashSet();
    }

    public NE0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k1 = 50;
        this.l1 = 50;
        this.z1 = 0;
        this.D1 = new HashSet();
    }
}
