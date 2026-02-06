package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Fo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2976Fo1 extends FrameLayout implements InterfaceC3564Lo1 {
    public boolean Y0;
    public boolean Z0;
    public boolean a1;

    public C2976Fo1(@InterfaceC5670cr1 Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C7025iN1.k.m3_navigation_menu_divider, (ViewGroup) this, true);
        b();
    }

    @Override // o.InterfaceC3564Lo1
    public boolean a() {
        return this.Y0;
    }

    public void b() {
        int i;
        if (this.a1 && (this.Y0 || !this.Z0)) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(@InterfaceC5670cr1 androidx.appcompat.view.menu.h hVar, int i) {
        b();
    }

    @Override // androidx.appcompat.view.menu.k.a
    @InterfaceC11300zs1
    public androidx.appcompat.view.menu.h getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // o.InterfaceC3564Lo1
    public boolean q() {
        return this.Z0;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean r() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean s() {
        return false;
    }

    public void setDividersEnabled(boolean z) {
        this.a1 = z;
        b();
    }

    @Override // o.InterfaceC3564Lo1
    public void setExpanded(boolean z) {
        this.Y0 = z;
        b();
    }

    @Override // o.InterfaceC3564Lo1
    public void setOnlyShowWhenExpanded(boolean z) {
        this.Z0 = z;
        b();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z) {
    }

    @Override // android.view.View, androidx.appcompat.view.menu.k.a
    public void setEnabled(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(@InterfaceC11300zs1 Drawable drawable) {
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(@InterfaceC11300zs1 CharSequence charSequence) {
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(boolean z, char c) {
    }
}
