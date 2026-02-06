package o;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import o.C10830xw1;

@Deprecated
/* renamed from: o.Yq2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnTouchListenerC4839Yq2 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C10830xw1.a {
    public static final float b1 = 45.0f;
    public final float Y0;
    public final a Z;
    public final GestureDetector Z0;
    public final PointF X = new PointF();
    public final PointF Y = new PointF();
    public volatile float a1 = 3.1415927f;

    /* renamed from: o.Yq2$a */
    /* loaded from: classes2.dex */
    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public View$OnTouchListenerC4839Yq2(Context context, a aVar, float f) {
        this.Z = aVar;
        this.Y0 = f;
        this.Z0 = new GestureDetector(context, this);
    }

    @Override // o.C10830xw1.a
    @InterfaceC9817tn
    public void a(float[] fArr, float f) {
        this.a1 = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.X.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.X.x) / this.Y0;
        float y = motionEvent2.getY();
        PointF pointF = this.X;
        float f3 = (y - pointF.y) / this.Y0;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.a1;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.Y;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = pointF2.y + (sin * x) + (cos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.Z.b(this.Y);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.Z.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.Z0.onTouchEvent(motionEvent);
    }
}
