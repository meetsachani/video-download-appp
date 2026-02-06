package o;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class A60 {
    public final View a;
    public final a b;
    public int c;
    public int d;
    public boolean e;
    public final View.OnLongClickListener f = new View.OnLongClickListener() { // from class: o.y60
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return A60.this.d(view);
        }
    };
    public final View.OnTouchListener g = new View.OnTouchListener() { // from class: o.z60
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return A60.this.e(view, motionEvent);
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        boolean a(View view, A60 a60);
    }

    public A60(View view, a aVar) {
        this.a = view;
        this.b = aVar;
    }

    public void a() {
        this.a.setOnLongClickListener(this.f);
        this.a.setOnTouchListener(this.g);
    }

    public void b() {
        this.a.setOnLongClickListener(null);
        this.a.setOnTouchListener(null);
    }

    public void c(Point point) {
        point.set(this.c, this.d);
    }

    public boolean d(View view) {
        if (this.e) {
            return true;
        }
        boolean a2 = this.b.a(view, this);
        this.e = a2;
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (C4717Xk1.l(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.e && (this.c != x || this.d != y)) {
                        this.c = x;
                        this.d = y;
                        boolean a2 = this.b.a(view, this);
                        this.e = a2;
                        return a2;
                    }
                }
            }
            this.e = false;
        } else {
            this.c = x;
            this.d = y;
        }
        return false;
    }
}
