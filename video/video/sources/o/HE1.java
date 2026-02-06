package o;

import android.view.View;
import android.widget.PopupMenu;

/* loaded from: classes.dex */
public final class HE1 {
    public static View.OnTouchListener a(Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
