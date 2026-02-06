package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements c {
    public c.a Y0;

    public FitWindowsLinearLayout(Context context) {
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

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
