package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.UC;

/* loaded from: classes3.dex */
public class OC extends CoordinatorLayout implements UC {
    @InterfaceC5670cr1
    public final RC D1;

    public OC(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @Override // o.UC
    public void a() {
        this.D1.a();
    }

    @Override // o.UC
    public void b() {
        this.D1.b();
    }

    @Override // o.RC.a
    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // o.RC.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View, o.UC
    public void draw(Canvas canvas) {
        RC rc = this.D1;
        if (rc != null) {
            rc.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // o.UC
    @InterfaceC11300zs1
    public Drawable getCircularRevealOverlayDrawable() {
        return this.D1.g();
    }

    @Override // o.UC
    public int getCircularRevealScrimColor() {
        return this.D1.h();
    }

    @Override // o.UC
    @InterfaceC11300zs1
    public UC.e getRevealInfo() {
        return this.D1.j();
    }

    @Override // android.view.View, o.UC
    public boolean isOpaque() {
        RC rc = this.D1;
        if (rc != null) {
            return rc.l();
        }
        return super.isOpaque();
    }

    @Override // o.UC
    public void setCircularRevealOverlayDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.D1.m(drawable);
    }

    @Override // o.UC
    public void setCircularRevealScrimColor(@JF int i) {
        this.D1.n(i);
    }

    @Override // o.UC
    public void setRevealInfo(@InterfaceC11300zs1 UC.e eVar) {
        this.D1.o(eVar);
    }

    public OC(@InterfaceC5670cr1 Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D1 = new RC(this);
    }
}
