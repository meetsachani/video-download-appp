package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.c;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements c {
    public c.a Y0;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        c.a aVar = this.Y0;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.c
    public void setOnFitSystemWindowsListener(c.a aVar) {
        this.Y0 = aVar;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
