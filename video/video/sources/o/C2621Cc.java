package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import o.OL1;

/* renamed from: o.Cc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2621Cc extends PopupWindow {
    public static final boolean b = false;
    public boolean a;

    public C2621Cc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, OL1.m.S4, i, i2);
        int i3 = OL1.m.V4;
        if (G.C(i3)) {
            b(G.a(i3, false));
        }
        setBackgroundDrawable(G.h(OL1.m.T4));
        G.I();
    }

    public final void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            IE1.c(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public C2621Cc(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
