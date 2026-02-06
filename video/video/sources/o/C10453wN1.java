package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C7025iN1;

/* renamed from: o.wN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10453wN1 extends ConstraintLayout {
    public static final String I1 = "skip";
    public static final int J1 = 1;
    public static final int K1 = 2;
    public static final float L1 = 0.66f;
    public final Runnable F1;
    public int G1;
    public C4394Uc1 H1;

    public C10453wN1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static boolean R(View view) {
        return I1.equals(view.getTag());
    }

    public final void M(List<View> list, androidx.constraintlayout.widget.e eVar, int i) {
        float f = 0.0f;
        for (View view : list) {
            eVar.M(view.getId(), C7025iN1.h.circle_center, i, f);
            f += 360.0f / list.size();
        }
    }

    public final Drawable N() {
        C4394Uc1 c4394Uc1 = new C4394Uc1();
        this.H1 = c4394Uc1;
        c4394Uc1.u0(new YQ1(0.5f));
        this.H1.y0(ColorStateList.valueOf(-1));
        return this.H1;
    }

    @InterfaceC9397s30
    public int O(int i) {
        if (i == 2) {
            return Math.round(this.G1 * 0.66f);
        }
        return this.G1;
    }

    @InterfaceC9397s30
    public int P() {
        return this.G1;
    }

    public void Q(@InterfaceC9397s30 int i) {
        this.G1 = i;
        S();
    }

    public void S() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.H(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C7025iN1.h.circle_center && !R(childAt)) {
                int i2 = (Integer) childAt.getTag(C7025iN1.h.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            M((List) entry.getValue(), eVar, O(((Integer) entry.getKey()).intValue()));
        }
        eVar.r(this);
    }

    public final void T() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.F1);
            handler.post(this.F1);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        T();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        S();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        T();
    }

    @Override // android.view.View
    public void setBackgroundColor(@JF int i) {
        this.H1.y0(ColorStateList.valueOf(i));
    }

    public C10453wN1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10453wN1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C7025iN1.k.material_radial_view_group, this);
        setBackground(N());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.F9, i, 0);
        this.G1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.G9, 0);
        this.F1 = new Runnable() { // from class: o.vN1
            @Override // java.lang.Runnable
            public final void run() {
                C10453wN1.this.S();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
