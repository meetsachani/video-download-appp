package o;

import android.animation.TimeInterpolator;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.yU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10967yU1 implements TimeInterpolator {
    public final TimeInterpolator a;

    public C10967yU1(@InterfaceC5670cr1 TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    @InterfaceC5670cr1
    public static TimeInterpolator a(boolean z, @InterfaceC5670cr1 TimeInterpolator timeInterpolator) {
        if (z) {
            return timeInterpolator;
        }
        return new C10967yU1(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
