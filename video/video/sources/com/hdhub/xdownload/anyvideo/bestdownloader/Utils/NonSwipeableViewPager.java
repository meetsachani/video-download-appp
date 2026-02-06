package com.hdhub.xdownload.anyvideo.bestdownloader.Utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class NonSwipeableViewPager extends FrameLayout {
    public ViewPager2 Y0;

    public NonSwipeableViewPager(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        ViewPager2 viewPager2 = new ViewPager2(getContext());
        this.Y0 = viewPager2;
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.Y0.setUserInputEnabled(false);
        addView(this.Y0);
    }

    public ViewPager2 getViewPager() {
        return this.Y0;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
