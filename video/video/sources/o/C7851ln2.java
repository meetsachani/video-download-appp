package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.ln2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7851ln2 {
    public static void a(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i) {
        Resources.Theme b;
        context.getTheme().applyStyle(i, true);
        if ((context instanceof Activity) && (b = b((Activity) context)) != null) {
            b.applyStyle(i, true);
        }
    }

    @InterfaceC11300zs1
    public static Resources.Theme b(@InterfaceC5670cr1 Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window != null && (peekDecorView = window.peekDecorView()) != null && (context = peekDecorView.getContext()) != null) {
            return context.getTheme();
        }
        return null;
    }
}
