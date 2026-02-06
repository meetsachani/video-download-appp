package o;

import android.graphics.Canvas;
import android.graphics.RectF;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Cy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2705Cy {

    /* renamed from: o.Cy$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@InterfaceC5670cr1 Canvas canvas);
    }

    public static int a(@InterfaceC5670cr1 Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    public static int b(@InterfaceC5670cr1 Canvas canvas, @InterfaceC11300zs1 RectF rectF, int i) {
        return canvas.saveLayerAlpha(rectF, i);
    }
}
