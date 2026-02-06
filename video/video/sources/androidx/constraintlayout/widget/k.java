package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import androidx.constraintlayout.widget.l;
import o.C7114il1;

/* loaded from: classes.dex */
public class k extends View implements l.a {
    public int Y0;
    public boolean Z0;
    public int a1;
    public boolean b1;

    public k(Context context) {
        super(context);
        this.Y0 = -1;
        this.Z0 = false;
        this.a1 = 0;
        this.b1 = true;
        super.setVisibility(8);
        c(null);
    }

    @Override // androidx.constraintlayout.widget.l.a
    public void a(int i, int i2, int i3) {
        setGuidelineBegin(i2);
        int id = getId();
        if (id > 0 && (getParent() instanceof C7114il1)) {
            C7114il1 c7114il1 = (C7114il1) getParent();
            int currentState = c7114il1.getCurrentState();
            int i4 = this.a1;
            if (i4 != 0) {
                currentState = i4;
            }
            int i5 = 0;
            if (this.Z0) {
                if (this.b1) {
                    int[] constraintSetIds = c7114il1.getConstraintSetIds();
                    while (i5 < constraintSetIds.length) {
                        int i6 = constraintSetIds[i5];
                        if (i6 != currentState) {
                            b(i2, id, c7114il1, i6);
                        }
                        i5++;
                    }
                }
                e r0 = c7114il1.r0(currentState);
                r0.g1(id, i2);
                c7114il1.r1(currentState, r0, 1000);
            } else if (this.b1) {
                int[] constraintSetIds2 = c7114il1.getConstraintSetIds();
                while (i5 < constraintSetIds2.length) {
                    b(i2, id, c7114il1, constraintSetIds2[i5]);
                    i5++;
                }
            } else {
                b(i2, id, c7114il1, currentState);
            }
        }
    }

    public final void b(int i, int i2, C7114il1 c7114il1, int i3) {
        e F0 = c7114il1.F0(i3);
        F0.g1(i2, i);
        c7114il1.q1(i3, F0);
    }

    public final void c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.T3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.X3) {
                    this.Y0 = obtainStyledAttributes.getResourceId(index, this.Y0);
                } else if (index == j.c.U3) {
                    this.Z0 = obtainStyledAttributes.getBoolean(index, this.Z0);
                } else if (index == j.c.W3) {
                    this.a1 = obtainStyledAttributes.getResourceId(index, this.a1);
                } else if (index == j.c.V3) {
                    this.b1 = obtainStyledAttributes.getBoolean(index, this.b1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.Y0 != -1) {
            ConstraintLayout.getSharedValues().a(this.Y0, this);
        }
    }

    public boolean d() {
        return this.Z0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.a1;
    }

    public int getAttributeId() {
        return this.Y0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.Z0 = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.a1 = i;
    }

    public void setAttributeId(int i) {
        l sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.Y0;
        if (i2 != -1) {
            sharedValues.e(i2, this);
        }
        this.Y0 = i;
        if (i != -1) {
            sharedValues.a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.c = f;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = -1;
        this.Z0 = false;
        this.a1 = 0;
        this.b1 = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = -1;
        this.Z0 = false;
        this.a1 = 0;
        this.b1 = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public k(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Y0 = -1;
        this.Z0 = false;
        this.a1 = 0;
        this.b1 = true;
        super.setVisibility(8);
        c(attributeSet);
    }
}
