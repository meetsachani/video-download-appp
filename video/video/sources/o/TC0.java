package o;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

@Deprecated
/* loaded from: classes.dex */
public final class TC0 {
    public final GestureDetector a;

    public TC0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.a.isLongpressEnabled();
    }

    public boolean b(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    public void c(boolean z) {
        this.a.setIsLongpressEnabled(z);
    }

    public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public TC0(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new GestureDetector(context, onGestureListener, handler);
    }
}
