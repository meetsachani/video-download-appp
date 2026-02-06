package o;

import android.os.Build;
import android.window.BackEvent;

/* renamed from: o.ap1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5177ap1 {
    public static final C4148Ro1 a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        long j;
        C6562gT0.p(backEvent, "backEvent");
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j = backEvent.getFrameTimeMillis();
        } else {
            j = 0;
        }
        return new C4148Ro1(swipeEdge, progress, touchX, touchY, j);
    }
}
