package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import java.util.HashMap;

/* renamed from: o.Yk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4814Yk1 extends androidx.constraintlayout.widget.b implements InterfaceC4921Zk1 {
    public boolean i1;
    public boolean j1;
    public float k1;
    public View[] l1;

    public C4814Yk1(Context context) {
        super(context);
        this.i1 = false;
        this.j1 = false;
    }

    @Override // o.InterfaceC4921Zk1
    public boolean g() {
        return this.i1;
    }

    @Override // o.InterfaceC8685p9
    public float getProgress() {
        return this.k1;
    }

    @Override // o.InterfaceC4921Zk1
    public boolean h() {
        return this.j1;
    }

    public boolean k() {
        return false;
    }

    @Override // o.InterfaceC8685p9
    public void setProgress(float f) {
        this.k1 = f;
        int i = 0;
        if (this.Z0 > 0) {
            this.l1 = x((ConstraintLayout) getParent());
            while (i < this.Z0) {
                L(this.l1[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof C4814Yk1)) {
                L(childAt, f);
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.dd);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.fd) {
                    this.i1 = obtainStyledAttributes.getBoolean(index, this.i1);
                } else if (index == j.c.ed) {
                    this.j1 = obtainStyledAttributes.getBoolean(index, this.j1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C4814Yk1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i1 = false;
        this.j1 = false;
        z(attributeSet);
    }

    public C4814Yk1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i1 = false;
        this.j1 = false;
        z(attributeSet);
    }

    @Override // o.InterfaceC4921Zk1
    public void b(Canvas canvas) {
    }

    @Override // o.InterfaceC4921Zk1
    public void c(Canvas canvas) {
    }

    @Override // o.InterfaceC4921Zk1
    public void j(C7114il1 c7114il1) {
    }

    public void L(View view, float f) {
    }

    @Override // o.C7114il1.k
    public void d(C7114il1 c7114il1, int i) {
    }

    public void f(C7114il1 c7114il1, HashMap<View, C4523Vk1> hashMap) {
    }

    @Override // o.C7114il1.k
    public void a(C7114il1 c7114il1, int i, int i2) {
    }

    @Override // o.C7114il1.k
    public void e(C7114il1 c7114il1, int i, boolean z, float f) {
    }

    @Override // o.C7114il1.k
    public void i(C7114il1 c7114il1, int i, int i2, float f) {
    }
}
