package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: o.p30 */
/* loaded from: classes.dex */
public class C8662p30 {
    public final Context a;
    public final InterfaceC8905q30 b;
    public final b c;
    public final a d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    /* renamed from: o.p30$a */
    /* loaded from: classes.dex */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* renamed from: o.p30$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public C8662p30(Context context, InterfaceC8905q30 interfaceC8905q30) {
        this(context, interfaceC8905q30, new b() { // from class: o.n30
            @Override // o.C8662p30.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                C8662p30.a(context2, iArr, motionEvent, i);
            }
        }, new a() { // from class: o.o30
            @Override // o.C8662p30.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return C8662p30.b(velocityTracker, motionEvent, i);
            }
        });
    }

    public static /* synthetic */ void a(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        c(context, iArr, motionEvent, i);
    }

    public static /* synthetic */ float b(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        return f(velocityTracker, motionEvent, i);
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C7486kH2.i(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = C7486kH2.h(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        QE2.a(velocityTracker, motionEvent);
        QE2.c(velocityTracker, 1000);
        return QE2.e(velocityTracker, i);
    }

    public final boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean d = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float e = e(motionEvent, i) * this.b.b();
        float signum = Math.signum(e);
        float f = 0.0f;
        if (d || (signum != Math.signum(this.f) && signum != 0.0f)) {
            this.b.c();
        }
        float abs = Math.abs(e);
        int[] iArr = this.j;
        if (abs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float max = Math.max(-i2, Math.min(e, i2));
        if (this.b.a(max)) {
            f = max;
        }
        this.f = f;
    }

    public C8662p30(Context context, InterfaceC8905q30 interfaceC8905q30, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.a = context;
        this.b = interfaceC8905q30;
        this.c = bVar;
        this.d = aVar;
    }
}
