package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: o.ni0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8333ni0 {
    @InterfaceC5670cr1
    public final View a;
    public boolean b = false;
    @PL0
    public int c = 0;

    public C8333ni0(InterfaceC8090mi0 interfaceC8090mi0) {
        this.a = (View) interfaceC8090mi0;
    }

    public final void a() {
        ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).j(this.a);
        }
    }

    @PL0
    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(@InterfaceC5670cr1 Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            a();
        }
    }

    @InterfaceC5670cr1
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }

    public boolean f(boolean z) {
        if (this.b != z) {
            this.b = z;
            a();
            return true;
        }
        return false;
    }

    public void g(@PL0 int i) {
        this.c = i;
    }
}
