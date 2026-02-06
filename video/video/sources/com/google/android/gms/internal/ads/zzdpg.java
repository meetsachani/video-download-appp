package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzdpg extends FrameLayout {
    public final com.google.android.gms.ads.internal.util.zzau Y0;

    public zzdpg(Context context, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 com.google.android.gms.ads.internal.util.zzau zzauVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.Y0 = zzauVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.Y0.m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof zzcfb)) {
                arrayList.add((zzcfb) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzcfb) arrayList.get(i2)).destroy();
        }
    }
}
