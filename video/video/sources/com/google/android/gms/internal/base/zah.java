package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zah extends Drawable.ConstantState {
    public int a;
    public int b;

    public zah(@InterfaceC11300zs1 zah zahVar) {
        if (zahVar != null) {
            this.a = zahVar.a;
            this.b = zahVar.b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}
