package o;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class LI2 extends JI2 {
    public static boolean m = true;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // o.DI2
    public void h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i);
        } else if (m) {
            try {
                a.a(view, i);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }
}
