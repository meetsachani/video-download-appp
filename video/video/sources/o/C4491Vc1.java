package o;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: o.Vc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4491Vc1 {
    @InterfaceC5670cr1
    public static ZP a(int i) {
        if (i != 0) {
            if (i != 1) {
                return b();
            }
            return new QT();
        }
        return new C7540kV1();
    }

    @InterfaceC5670cr1
    public static ZP b() {
        return new C7540kV1();
    }

    @InterfaceC5670cr1
    public static A90 c() {
        return new A90();
    }

    public static void d(@InterfaceC5670cr1 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C4394Uc1) {
            ((C4394Uc1) background).x0(f);
        }
    }

    public static void e(@InterfaceC5670cr1 View view) {
        Drawable background = view.getBackground();
        if (background instanceof C4394Uc1) {
            f(view, (C4394Uc1) background);
        }
    }

    public static void f(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 C4394Uc1 c4394Uc1) {
        if (c4394Uc1.k0()) {
            c4394Uc1.D0(C10920yI2.p(view));
        }
    }
}
