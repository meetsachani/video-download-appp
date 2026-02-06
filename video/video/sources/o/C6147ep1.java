package o;

import android.content.Context;
import android.view.View;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.ep1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6147ep1 extends AbstractC3270Io1 {
    public C6147ep1(@InterfaceC5670cr1 Context context) {
        super(context);
    }

    @Override // o.AbstractC3270Io1
    @InterfaceC9154r30
    public int getItemDefaultMarginResId() {
        return C7025iN1.f.mtrl_navigation_rail_icon_margin;
    }

    @Override // o.AbstractC3270Io1
    @BY0
    public int getItemLayoutResId() {
        return C7025iN1.k.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
