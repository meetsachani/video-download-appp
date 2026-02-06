package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Po1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3954Po1 extends FrameLayout implements InterfaceC3564Lo1 {
    public final TextView Y0;
    public boolean Z0;
    public boolean a1;
    @InterfaceC11300zs1
    public androidx.appcompat.view.menu.h b1;
    @InterfaceC11300zs1
    public ColorStateList c1;

    public C3954Po1(@InterfaceC5670cr1 Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C7025iN1.k.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.Y0 = (TextView) findViewById(C7025iN1.h.navigation_menu_subheader_label);
    }

    private void b() {
        int i;
        androidx.appcompat.view.menu.h hVar = this.b1;
        if (hVar != null) {
            if (hVar.isVisible() && (this.Z0 || !this.a1)) {
                i = 0;
            } else {
                i = 8;
            }
            setVisibility(i);
        }
    }

    @Override // o.InterfaceC3564Lo1
    public boolean a() {
        return this.Z0;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(@InterfaceC5670cr1 androidx.appcompat.view.menu.h hVar, int i) {
        this.b1 = hVar;
        hVar.setCheckable(false);
        this.Y0.setText(hVar.getTitle());
        b();
    }

    @Override // androidx.appcompat.view.menu.k.a
    @InterfaceC11300zs1
    public androidx.appcompat.view.menu.h getItemData() {
        return this.b1;
    }

    @Override // o.InterfaceC3564Lo1
    public boolean q() {
        return this.a1;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean r() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean s() {
        return false;
    }

    @Override // o.InterfaceC3564Lo1
    public void setExpanded(boolean z) {
        this.Z0 = z;
        b();
    }

    @Override // o.InterfaceC3564Lo1
    public void setOnlyShowWhenExpanded(boolean z) {
        this.a1 = z;
        b();
    }

    public void setTextAppearance(@InterfaceC4698Xf2 int i) {
        C4930Zm2.D(this.Y0, i);
        ColorStateList colorStateList = this.c1;
        if (colorStateList != null) {
            this.Y0.setTextColor(colorStateList);
        }
    }

    public void setTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.c1 = colorStateList;
        if (colorStateList != null) {
            this.Y0.setTextColor(colorStateList);
        }
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
