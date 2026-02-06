package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import o.C6315fV1;

/* renamed from: o.fz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6428fz extends C6926hz {

    /* renamed from: o.fz$a */
    /* loaded from: classes.dex */
    public class a implements C6315fV1.a {
        public a() {
        }

        @Override // o.C6315fV1.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // o.C6926hz, o.InterfaceC7410jz
    public void n() {
        C6315fV1.s = new a();
    }
}
