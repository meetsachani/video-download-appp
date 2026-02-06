package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import o.OL1;

/* renamed from: o.Gc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3024Gc extends RatingBar {
    public final C2719Dc Y0;

    public C3024Gc(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.Y0.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C3024Gc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.I2);
    }

    public C3024Gc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8112mn2.a(this, getContext());
        C2719Dc c2719Dc = new C2719Dc(this);
        this.Y0 = c2719Dc;
        c2719Dc.c(attributeSet, i);
    }
}
