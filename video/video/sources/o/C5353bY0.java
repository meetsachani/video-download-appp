package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: o.bY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5353bY0 extends Paint {
    public C5353bY0() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((C4713Xj1.d(i, 0, 255) << 24) | (getColor() & C6516gH2.x));
            return;
        }
        super.setAlpha(C4713Xj1.d(i, 0, 255));
    }

    public C5353bY0(int i) {
        super(i);
    }

    public C5353bY0(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C5353bY0(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
