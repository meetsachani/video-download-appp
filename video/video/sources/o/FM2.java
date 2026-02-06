package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class FM2 {

    /* loaded from: classes3.dex */
    public static class a {
        @InterfaceC5670cr1
        public static Rect a(@InterfaceC5670cr1 WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    @ES1(api = 30)
    /* loaded from: classes3.dex */
    public static class b {
        @InterfaceC5670cr1
        public static Rect a(@InterfaceC5670cr1 WindowManager windowManager) {
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
    }

    @InterfaceC5670cr1
    public static Rect a(@InterfaceC5670cr1 Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(windowManager);
        }
        return a.a(windowManager);
    }
}
