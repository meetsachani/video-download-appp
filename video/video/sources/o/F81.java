package o;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public interface F81 {
    @InterfaceC5670cr1
    RectF getMaskRectF();

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@InterfaceC5670cr1 RectF rectF);

    @Deprecated
    void setMaskXPercentage(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f);

    void setOnMaskChangedListener(@InterfaceC11300zs1 InterfaceC4960Zu1 interfaceC4960Zu1);
}
