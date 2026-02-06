package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import o.InterfaceC8136mt2;

/* renamed from: o.xN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10695xN0<Z> extends AbstractC7247jI2<ImageView, Z> implements InterfaceC8136mt2.a {
    public Animatable e1;

    public AbstractC10695xN0(ImageView imageView) {
        super(imageView);
    }

    @Override // o.InterfaceC8136mt2.a
    public void b(Drawable drawable) {
        ((ImageView) this.Y).setImageDrawable(drawable);
    }

    @Override // o.InterfaceC8136mt2.a
    public Drawable c() {
        return ((ImageView) this.Y).getDrawable();
    }

    @Override // o.AbstractC7247jI2, o.AbstractC3843Ol, o.InterfaceC2856El2
    public void i(Drawable drawable) {
        super.i(drawable);
        w(null);
        b(drawable);
    }

    @Override // o.AbstractC7247jI2, o.AbstractC3843Ol, o.InterfaceC2856El2
    public void k(Drawable drawable) {
        super.k(drawable);
        Animatable animatable = this.e1;
        if (animatable != null) {
            animatable.stop();
        }
        w(null);
        b(drawable);
    }

    @Override // o.AbstractC3843Ol, o.InterfaceC2856El2
    public void m(Drawable drawable) {
        super.m(drawable);
        w(null);
        b(drawable);
    }

    @Override // o.InterfaceC2856El2
    public void o(Z z, InterfaceC8136mt2<? super Z> interfaceC8136mt2) {
        if (interfaceC8136mt2 != null && interfaceC8136mt2.a(z, this)) {
            u(z);
        } else {
            w(z);
        }
    }

    @Override // o.AbstractC3843Ol, o.IZ0
    public void onStart() {
        Animatable animatable = this.e1;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // o.AbstractC3843Ol, o.IZ0
    public void onStop() {
        Animatable animatable = this.e1;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void u(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.e1 = animatable;
            animatable.start();
            return;
        }
        this.e1 = null;
    }

    public abstract void v(Z z);

    public final void w(Z z) {
        v(z);
        u(z);
    }

    @Deprecated
    public AbstractC10695xN0(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
