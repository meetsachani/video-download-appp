package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabn implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ zzabp b;

    public zzabn(zzabp zzabpVar, DisplayManager displayManager) {
        this.b = zzabpVar;
        this.a = displayManager;
    }

    public final void a() {
        this.a.registerDisplayListener(this, zzeu.T(null));
        zzabp.b(this.b, c());
    }

    public final void b() {
        this.a.unregisterDisplayListener(this);
    }

    public final Display c() {
        return this.a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            zzabp.b(this.b, c());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
