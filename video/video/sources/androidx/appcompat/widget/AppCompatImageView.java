package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import o.C10991yc;
import o.C2578Bp2;
import o.C3705Nb;
import o.C8112mn2;
import o.InterfaceC2981Fp2;
import o.InterfaceC3373Jp2;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC2981Fp2, InterfaceC3373Jp2 {
    public final C3705Nb Y0;
    public final C10991yc Z0;
    public boolean a1;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.b();
        }
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            c10991yc.c();
        }
    }

    @Override // o.InterfaceC2981Fp2
    public ColorStateList getSupportBackgroundTintList() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.c();
        }
        return null;
    }

    @Override // o.InterfaceC2981Fp2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.d();
        }
        return null;
    }

    @Override // o.InterfaceC3373Jp2
    public ColorStateList getSupportImageTintList() {
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            return c10991yc.d();
        }
        return null;
    }

    @Override // o.InterfaceC3373Jp2
    public PorterDuff.Mode getSupportImageTintMode() {
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            return c10991yc.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.Z0.f() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            c10991yc.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null && drawable != null && !this.a1) {
            c10991yc.h(drawable);
        }
        super.setImageDrawable(drawable);
        C10991yc c10991yc2 = this.Z0;
        if (c10991yc2 != null) {
            c10991yc2.c();
            if (!this.a1) {
                this.Z0.b();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.a1 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            c10991yc.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            c10991yc.c();
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.i(colorStateList);
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.j(mode);
        }
    }

    @Override // o.InterfaceC3373Jp2
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            c10991yc.k(colorStateList);
        }
    }

    @Override // o.InterfaceC3373Jp2
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C10991yc c10991yc = this.Z0;
        if (c10991yc != null) {
            c10991yc.l(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C2578Bp2.b(context), attributeSet, i);
        this.a1 = false;
        C8112mn2.a(this, getContext());
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Y0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C10991yc c10991yc = new C10991yc(this);
        this.Z0 = c10991yc;
        c10991yc.g(attributeSet, i);
    }
}
