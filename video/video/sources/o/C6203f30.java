package o;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* renamed from: o.f30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6203f30 {

    /* renamed from: o.f30$a */
    /* loaded from: classes.dex */
    public static class a {
        public static <T> T a(Dialog dialog, int i) {
            return (T) dialog.requireViewById(i);
        }
    }

    public static View a(Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
