package o;

import android.view.View;

/* loaded from: classes.dex */
public class JI2 extends HI2 {
    public static boolean l = true;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    @Override // o.DI2
    public void f(View view, int i, int i2, int i3, int i4) {
        if (l) {
            try {
                a.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}
