package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class P3 extends ClickableSpan {
    public static final String Y0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    public final int X;
    public final C10861y4 Y;
    public final int Z;

    public P3(int i, C10861y4 c10861y4, int i2) {
        this.X = i;
        this.Y = c10861y4;
        this.Z = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(Y0, this.X);
        this.Y.T0(this.Z, bundle);
    }
}
