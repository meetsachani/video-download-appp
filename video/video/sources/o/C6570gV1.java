package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: o.gV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6570gV1 extends AbstractC6813hV1 {
    public C6570gV1(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // o.AbstractC6813hV1
    public void f(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        t();
        outline.setRoundRect(this.h, c());
    }

    @Override // o.AbstractC6813hV1
    public boolean h() {
        Bitmap bitmap = this.a;
        if (bitmap != null && bitmap.hasMipMap()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC6813hV1
    public void o(boolean z) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
