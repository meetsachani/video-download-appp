package o;

import android.view.View;
import android.widget.ListPopupWindow;

/* renamed from: o.e11  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5953e11 {
    @JR1(expression = "listPopupWindow.createDragToOpenListener(src)")
    @Deprecated
    public static View.OnTouchListener a(ListPopupWindow listPopupWindow, View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}
