package o;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

@ES1(22)
/* renamed from: o.l32  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7673l32 extends AbstractC7187j32 {
    public boolean f = false;
    public float g = 0.0f;

    /* renamed from: o.l32$a */
    /* loaded from: classes3.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C7673l32 c7673l32 = C7673l32.this;
            if (c7673l32.c != null && !c7673l32.d.isEmpty()) {
                C7673l32 c7673l322 = C7673l32.this;
                RectF rectF = c7673l322.d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c7673l322.g);
            }
        }
    }

    public C7673l32(@InterfaceC5670cr1 View view) {
        o(view);
    }

    @K40
    private void o(View view) {
        view.setOutlineProvider(new a());
    }

    public static boolean r(O22 o22) {
        if ((o22.q() instanceof C7540kV1) && (o22.s() instanceof C7540kV1) && (o22.i() instanceof C7540kV1) && (o22.k() instanceof C7540kV1)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC7187j32
    public void b(@InterfaceC5670cr1 View view) {
        boolean z;
        this.g = n();
        if (!p() && !q()) {
            z = false;
        } else {
            z = true;
        }
        this.f = z;
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // o.AbstractC7187j32
    public boolean j() {
        if (this.f && !this.a) {
            return false;
        }
        return true;
    }

    @InterfaceC5056aJ2
    public float m() {
        return this.g;
    }

    public final float n() {
        RectF rectF;
        O22 o22 = this.c;
        if (o22 != null && (rectF = this.d) != null) {
            return o22.f.a(rectF);
        }
        return 0.0f;
    }

    public final boolean p() {
        O22 o22;
        if (!this.d.isEmpty() && (o22 = this.c) != null) {
            return o22.v(this.d);
        }
        return false;
    }

    public final boolean q() {
        O22 o22;
        if (!this.d.isEmpty() && (o22 = this.c) != null && this.b && !o22.v(this.d) && r(this.c)) {
            float a2 = this.c.r().a(this.d);
            float a3 = this.c.t().a(this.d);
            float a4 = this.c.j().a(this.d);
            float a5 = this.c.l().a(this.d);
            int i = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
            if (i == 0 && a4 == 0.0f && a3 == a5) {
                RectF rectF = this.d;
                rectF.set(rectF.left - a3, rectF.top, rectF.right, rectF.bottom);
                this.g = a3;
                return true;
            } else if (i == 0 && a3 == 0.0f && a4 == a5) {
                RectF rectF2 = this.d;
                rectF2.set(rectF2.left, rectF2.top - a4, rectF2.right, rectF2.bottom);
                this.g = a4;
                return true;
            } else if (a3 == 0.0f && a5 == 0.0f && a2 == a4) {
                RectF rectF3 = this.d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + a2, rectF3.bottom);
                this.g = a2;
                return true;
            } else if (a4 == 0.0f && a5 == 0.0f && a2 == a3) {
                RectF rectF4 = this.d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + a2);
                this.g = a2;
                return true;
            }
        }
        return false;
    }
}
