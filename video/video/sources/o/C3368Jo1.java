package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Jo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3368Jo1 extends androidx.appcompat.view.menu.e {
    public static final int T = Integer.MAX_VALUE;
    @InterfaceC5670cr1
    public final Class<?> Q;
    public final int R;
    public final boolean S;

    public C3368Jo1(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Class<?> cls, int i, boolean z) {
        super(context);
        this.Q = cls;
        this.R = i;
        this.S = z;
    }

    @Override // androidx.appcompat.view.menu.e
    @InterfaceC5670cr1
    public MenuItem a(int i, int i2, int i3, @InterfaceC5670cr1 CharSequence charSequence) {
        if (size() + 1 <= this.R) {
            n0();
            MenuItem a = super.a(i, i2, i3, charSequence);
            m0();
            return a;
        }
        String simpleName = this.Q.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.R + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    @InterfaceC5670cr1
    public SubMenu addSubMenu(int i, int i2, int i3, @InterfaceC5670cr1 CharSequence charSequence) {
        if (this.S) {
            androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) a(i, i2, i3, charSequence);
            C3857Oo1 c3857Oo1 = new C3857Oo1(x(), this, hVar);
            hVar.A(c3857Oo1);
            return c3857Oo1;
        }
        throw new UnsupportedOperationException(this.Q.getSimpleName() + " does not support submenus");
    }

    public int o0() {
        return this.R;
    }
}
