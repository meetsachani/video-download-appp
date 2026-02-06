package o;

import android.view.View;

/* renamed from: o.k32  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7430k32 extends AbstractC7187j32 {
    @Override // o.AbstractC7187j32
    public void b(@InterfaceC5670cr1 View view) {
        if (this.c != null && !this.d.isEmpty() && j()) {
            view.invalidate();
        }
    }

    @Override // o.AbstractC7187j32
    public boolean j() {
        return true;
    }
}
