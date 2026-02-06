package o;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.qQ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC8997qQ0 implements View.OnTouchListener {
    @InterfaceC5670cr1
    public final Dialog X;
    public final int Y;
    public final int Y0;
    public final int Z;

    public View$OnTouchListenerC8997qQ0(@InterfaceC5670cr1 Dialog dialog, @InterfaceC5670cr1 Rect rect) {
        this.X = dialog;
        this.Y = rect.left;
        this.Z = rect.top;
        this.Y0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.Y + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.Z + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.Y0;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.X.onTouchEvent(obtain);
    }
}
