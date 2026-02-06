package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class h extends View {
    public boolean Y0;

    public h(Context context) {
        super(context);
        this.Y0 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.Y0 = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.Y0 && bVar.a == i) {
            return;
        }
        bVar.a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.Y0 && bVar.b == i) {
            return;
        }
        bVar.b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.Y0 && bVar.c == f) {
            return;
        }
        bVar.c = f;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = true;
        super.setVisibility(8);
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = true;
        super.setVisibility(8);
    }

    public h(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Y0 = true;
        super.setVisibility(8);
    }
}
