package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DC extends androidx.constraintlayout.widget.n {
    public static final String u1 = "CircularFlow";
    public static int v1;
    public static float w1;
    public ConstraintLayout k1;
    public int l1;
    public float[] m1;
    public int[] n1;
    public int o1;
    public int p1;
    public String q1;
    public String r1;
    public Float s1;
    public Integer t1;

    public DC(Context context) {
        super(context);
    }

    public static float[] S(float[] fArr, int i) {
        float[] fArr2 = new float[fArr.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (i3 != i) {
                fArr2[i2] = fArr[i3];
                i2++;
            }
        }
        return fArr2;
    }

    public static int[] T(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != i) {
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return iArr2;
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.p1 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                M(str.substring(i).trim());
                return;
            } else {
                M(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.o1 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                N(str.substring(i).trim());
                return;
            } else {
                N(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public int C(View view) {
        int C = super.C(view);
        if (C == -1) {
            return C;
        }
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.H(this.k1);
        eVar.F(view.getId(), 8);
        eVar.r(this.k1);
        float[] fArr = this.m1;
        if (C < fArr.length) {
            this.m1 = R(fArr, C);
            this.p1--;
        }
        int[] iArr = this.n1;
        if (C < iArr.length) {
            this.n1 = U(iArr, C);
            this.o1--;
        }
        P();
        return C;
    }

    public final void M(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.a1 != null && (fArr = this.m1) != null) {
            if (this.p1 + 1 > fArr.length) {
                this.m1 = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.m1[this.p1] = Integer.parseInt(str);
            this.p1++;
        }
    }

    public final void N(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.a1 != null && (iArr = this.n1) != null) {
            if (this.o1 + 1 > iArr.length) {
                this.n1 = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.n1[this.o1] = (int) (Integer.parseInt(str) * this.a1.getResources().getDisplayMetrics().density);
            this.o1++;
        }
    }

    public void O(View view, int i, float f) {
        if (t(view.getId())) {
            return;
        }
        o(view);
        this.p1++;
        float[] angles = getAngles();
        this.m1 = angles;
        angles[this.p1 - 1] = f;
        this.o1++;
        int[] radius = getRadius();
        this.n1 = radius;
        radius[this.o1 - 1] = (int) (i * this.a1.getResources().getDisplayMetrics().density);
        P();
    }

    public final void P() {
        this.k1 = (ConstraintLayout) getParent();
        for (int i = 0; i < this.Z0; i++) {
            View w = this.k1.w(this.Y0[i]);
            if (w != null) {
                int i2 = v1;
                float f = w1;
                int[] iArr = this.n1;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num = this.t1;
                    if (num != null && num.intValue() != -1) {
                        this.o1++;
                        if (this.n1 == null) {
                            this.n1 = new int[1];
                        }
                        int[] radius = getRadius();
                        this.n1 = radius;
                        radius[this.o1 - 1] = i2;
                    } else {
                        Log.e(u1, "Added radius to view with id: " + this.g1.get(Integer.valueOf(w.getId())));
                    }
                }
                float[] fArr = this.m1;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    Float f2 = this.s1;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.p1++;
                        if (this.m1 == null) {
                            this.m1 = new float[1];
                        }
                        float[] angles = getAngles();
                        this.m1 = angles;
                        angles[this.p1 - 1] = f;
                    } else {
                        Log.e(u1, "Added angle to view with id: " + this.g1.get(Integer.valueOf(w.getId())));
                    }
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) w.getLayoutParams();
                bVar.r = f;
                bVar.p = this.l1;
                bVar.q = i2;
                w.setLayoutParams(bVar);
            }
        }
        q();
    }

    public boolean Q(View view) {
        if (!t(view.getId()) || y(view.getId()) == -1) {
            return false;
        }
        return true;
    }

    public final float[] R(float[] fArr, int i) {
        if (fArr != null && i >= 0 && i < this.p1) {
            return S(fArr, i);
        }
        return fArr;
    }

    public final int[] U(int[] iArr, int i) {
        if (iArr != null && i >= 0 && i < this.o1) {
            return T(iArr, i);
        }
        return iArr;
    }

    public void V(View view, float f) {
        if (!Q(view)) {
            Log.e(u1, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int y = y(view.getId());
        if (y > this.m1.length) {
            return;
        }
        float[] angles = getAngles();
        this.m1 = angles;
        angles[y] = f;
        P();
    }

    public void W(View view, int i) {
        if (!Q(view)) {
            Log.e(u1, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int y = y(view.getId());
        if (y > this.n1.length) {
            return;
        }
        int[] radius = getRadius();
        this.n1 = radius;
        radius[y] = (int) (i * this.a1.getResources().getDisplayMetrics().density);
        P();
    }

    public void X(View view, int i, float f) {
        if (!Q(view)) {
            Log.e(u1, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int y = y(view.getId());
        if (getAngles().length > y) {
            float[] angles = getAngles();
            this.m1 = angles;
            angles[y] = f;
        }
        if (getRadius().length > y) {
            int[] radius = getRadius();
            this.n1 = radius;
            radius[y] = (int) (i * this.a1.getResources().getDisplayMetrics().density);
        }
        P();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.m1, this.p1);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.n1, this.o1);
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.q1;
        if (str != null) {
            this.m1 = new float[1];
            setAngles(str);
        }
        String str2 = this.r1;
        if (str2 != null) {
            this.n1 = new int[1];
            setRadius(str2);
        }
        Float f = this.s1;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.t1;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        P();
    }

    public void setDefaultAngle(float f) {
        w1 = f;
    }

    public void setDefaultRadius(int i) {
        v1 = i;
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.p2) {
                    this.l1 = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == j.c.l2) {
                    String string = obtainStyledAttributes.getString(index);
                    this.q1 = string;
                    setAngles(string);
                } else if (index == j.c.o2) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.r1 = string2;
                    setRadius(string2);
                } else if (index == j.c.m2) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, w1));
                    this.s1 = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == j.c.n2) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, v1));
                    this.t1 = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public DC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
