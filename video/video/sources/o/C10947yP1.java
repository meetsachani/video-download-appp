package o;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.yP1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10947yP1 implements TypeEvaluator<Rect> {
    public final Rect a;

    public C10947yP1(@InterfaceC5670cr1 Rect rect) {
        this.a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public Rect evaluate(float f, @InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = rect.bottom;
        int i7 = i6 + ((int) ((rect2.bottom - i6) * f));
        this.a.set(i2, i4, i5 + ((int) ((rect2.right - i5) * f)), i7);
        return this.a;
    }
}
