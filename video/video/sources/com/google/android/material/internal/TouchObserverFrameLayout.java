package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class TouchObserverFrameLayout extends FrameLayout {
    @InterfaceC11300zs1
    public View.OnTouchListener Y0;

    public TouchObserverFrameLayout(@InterfaceC5670cr1 Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.Y0;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnTouchListener(@InterfaceC11300zs1 View.OnTouchListener onTouchListener) {
        this.Y0 = onTouchListener;
    }

    public TouchObserverFrameLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchObserverFrameLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
