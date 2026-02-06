package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

/* renamed from: o.nl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8346nl1 extends androidx.constraintlayout.widget.n {
    public static final String l1 = "MotionPlaceholder";
    public C6001eD1 k1;

    public C8346nl1(Context context) {
        super(context);
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

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.b1 = new C6001eD1();
        K();
    }

    public C8346nl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8346nl1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C8346nl1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.b
    public void J(VK vk, InterfaceC8961qH0 interfaceC8961qH0, SparseArray<UK> sparseArray) {
    }
}
