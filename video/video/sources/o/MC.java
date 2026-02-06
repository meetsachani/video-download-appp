package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import o.UC;

/* loaded from: classes3.dex */
public class MC extends C7453k91 implements UC {
    @InterfaceC5670cr1
    public final RC w1;

    public MC(Context context) {
        this(context, null);
    }

    @Override // o.UC
    public void a() {
        this.w1.a();
    }

    @Override // o.UC
    public void b() {
        this.w1.b();
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
        RC rc = this.w1;
        if (rc != null) {
            rc.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // o.UC
    @InterfaceC11300zs1
    public Drawable getCircularRevealOverlayDrawable() {
        return this.w1.g();
    }

    @Override // o.UC
    public int getCircularRevealScrimColor() {
        return this.w1.h();
    }

    @Override // o.UC
    @InterfaceC11300zs1
    public UC.e getRevealInfo() {
        return this.w1.j();
    }

    @Override // android.view.View, o.UC
    public boolean isOpaque() {
        RC rc = this.w1;
        if (rc != null) {
            return rc.l();
        }
        return super.isOpaque();
    }

    @Override // o.UC
    public void setCircularRevealOverlayDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.w1.m(drawable);
    }

    @Override // o.UC
    public void setCircularRevealScrimColor(@JF int i) {
        this.w1.n(i);
    }

    @Override // o.UC
    public void setRevealInfo(@InterfaceC11300zs1 UC.e eVar) {
        this.w1.o(eVar);
    }

    public MC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w1 = new RC(this);
    }
}
