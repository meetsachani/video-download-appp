package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class EH0 extends HH0 {
    @Override // o.HH0
    public <V extends View> int a(@InterfaceC5670cr1 V v, @InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override // o.HH0
    public int b() {
        return 0;
    }

    @Override // o.HH0
    public int c() {
        return 2;
    }

    @Override // o.HH0
    public <V extends View> ViewPropertyAnimator d(@InterfaceC5670cr1 V v, int i) {
        return v.animate().translationX(-i);
    }

    @Override // o.HH0
    public <V extends View> void e(@InterfaceC5670cr1 V v, int i, int i2) {
        v.setTranslationX(i - i2);
    }

    @Override // o.HH0
    public <V extends View> void f(@InterfaceC5670cr1 V v, int i) {
        v.setTranslationX(-i);
    }
}
