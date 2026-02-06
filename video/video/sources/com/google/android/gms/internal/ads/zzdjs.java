package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzdjs implements GestureDetector.OnGestureListener {
    @InterfaceC8710pF0("this")
    public final zzdij X;
    public final zzdjk Y;

    public zzdjs(zzdij zzdijVar, zzdjk zzdjkVar) {
        this.X = zzdijVar;
        this.Y = zzdjkVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0001, B:6:0x0008, B:10:0x001c, B:23:0x0064, B:25:0x006a, B:15:0x0030, B:19:0x0044, B:22:0x0057), top: B:32:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int y;
        try {
            zzdij zzdijVar = this.X;
            if (zzdijVar != null) {
                int i = -1;
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > 0.0f) {
                        y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                        i = 1;
                    } else {
                        if (f < 0.0f) {
                            y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                            i = 2;
                        }
                        y = 0;
                    }
                    if (i == zzdijVar.J()) {
                        zzdijVar.m(this.Y.X7(), y);
                        return false;
                    }
                } else {
                    if (f2 > 0.0f) {
                        y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                        i = 8;
                    } else {
                        if (f2 < 0.0f) {
                            y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                            i = 4;
                        }
                        y = 0;
                    }
                    if (i == zzdijVar.J()) {
                    }
                }
            }
            return false;
        } finally {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
