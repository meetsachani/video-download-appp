package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import o.UC;

/* loaded from: classes3.dex */
public class QC extends GridLayout implements UC {
    @InterfaceC5670cr1
    public final RC Y0;

    public QC(Context context) {
        this(context, null);
    }

    @Override // o.UC
    public void a() {
        this.Y0.a();
    }

    @Override // o.UC
    public void b() {
        this.Y0.b();
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
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        RC rc = this.Y0;
        if (rc != null) {
            rc.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // o.UC
    @InterfaceC11300zs1
    public Drawable getCircularRevealOverlayDrawable() {
        return this.Y0.g();
    }

    @Override // o.UC
    public int getCircularRevealScrimColor() {
        return this.Y0.h();
    }

    @Override // o.UC
    @InterfaceC11300zs1
    public UC.e getRevealInfo() {
        return this.Y0.j();
    }

    @Override // android.view.View, o.UC
    public boolean isOpaque() {
        RC rc = this.Y0;
        if (rc != null) {
            return rc.l();
        }
        return super.isOpaque();
    }

    @Override // o.UC
    public void setCircularRevealOverlayDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.Y0.m(drawable);
    }

    @Override // o.UC
    public void setCircularRevealScrimColor(@JF int i) {
        this.Y0.n(i);
    }

    @Override // o.UC
    public void setRevealInfo(@InterfaceC11300zs1 UC.e eVar) {
        this.Y0.o(eVar);
    }

    public QC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new RC(this);
    }
}
