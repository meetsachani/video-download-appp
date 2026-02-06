package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import o.OL1;

/* renamed from: o.Jc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3318Jc extends SeekBar {
    public final C3416Kc Y0;

    public C3318Jc(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.Y0.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.Y0.l();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.Y0.g(canvas);
    }

    public C3318Jc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.O2);
    }

    public C3318Jc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8112mn2.a(this, getContext());
        C3416Kc c3416Kc = new C3416Kc(this);
        this.Y0 = c3416Kc;
        c3416Kc.c(attributeSet, i);
    }
}
