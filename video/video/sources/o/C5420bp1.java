package o;

import android.content.Context;
import android.view.SubMenu;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.bp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5420bp1 extends androidx.appcompat.view.menu.e {
    public C5420bp1(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    @InterfaceC5670cr1
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) a(i, i2, i3, charSequence);
        C7130ip1 c7130ip1 = new C7130ip1(x(), this, hVar);
        hVar.A(c7130ip1);
        return c7130ip1;
    }
}
