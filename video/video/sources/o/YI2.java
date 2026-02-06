package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import o.HT1;

@HT1({HT1.a.Y})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class YI2 extends ImageButton {
    public int Y0;

    public YI2(Context context) {
        this(context, null);
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.Y0 = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.Y0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }

    public YI2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YI2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = getVisibility();
    }
}
