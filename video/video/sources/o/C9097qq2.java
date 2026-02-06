package o;

import android.os.Build;
import android.view.View;

/* renamed from: o.qq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9097qq2 {

    /* renamed from: o.qq2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            View$OnLongClickListenerC9832tq2.g(view, charSequence);
        }
    }
}
