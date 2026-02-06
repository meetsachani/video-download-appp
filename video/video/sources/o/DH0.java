package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class DH0 extends HH0 {
    @Override // o.HH0
    public <V extends View> int a(@InterfaceC5670cr1 V v, @InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // o.HH0
    public int b() {
        return 0;
    }

    @Override // o.HH0
    public int c() {
        return 1;
    }

    @Override // o.HH0
    public <V extends View> ViewPropertyAnimator d(@InterfaceC5670cr1 V v, int i) {
        return v.animate().translationY(i);
    }

    @Override // o.HH0
    public <V extends View> void e(@InterfaceC5670cr1 V v, int i, int i2) {
        v.setTranslationY(i + i2);
    }

    @Override // o.HH0
    public <V extends View> void f(@InterfaceC5670cr1 V v, int i) {
        v.setTranslationY(i);
    }
}
