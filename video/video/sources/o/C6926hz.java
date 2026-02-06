package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import o.C6315fV1;

/* renamed from: o.hz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6926hz implements InterfaceC7410jz {
    public final RectF a = new RectF();

    /* renamed from: o.hz$a */
    /* loaded from: classes.dex */
    public class a implements C6315fV1.a {
        public a() {
        }

        @Override // o.C6315fV1.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C6926hz.this.a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C6926hz.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C6926hz.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C6926hz.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C6926hz.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    @Override // o.InterfaceC7410jz
    public float a(InterfaceC7167iz interfaceC7167iz) {
        return q(interfaceC7167iz).k();
    }

    @Override // o.InterfaceC7410jz
    public void b(InterfaceC7167iz interfaceC7167iz) {
        q(interfaceC7167iz).m(interfaceC7167iz.g());
        k(interfaceC7167iz);
    }

    @Override // o.InterfaceC7410jz
    public float c(InterfaceC7167iz interfaceC7167iz) {
        return q(interfaceC7167iz).g();
    }

    @Override // o.InterfaceC7410jz
    public void d(InterfaceC7167iz interfaceC7167iz, float f) {
        q(interfaceC7167iz).r(f);
    }

    @Override // o.InterfaceC7410jz
    public ColorStateList e(InterfaceC7167iz interfaceC7167iz) {
        return q(interfaceC7167iz).f();
    }

    @Override // o.InterfaceC7410jz
    public float f(InterfaceC7167iz interfaceC7167iz) {
        return q(interfaceC7167iz).i();
    }

    @Override // o.InterfaceC7410jz
    public float g(InterfaceC7167iz interfaceC7167iz) {
        return q(interfaceC7167iz).j();
    }

    @Override // o.InterfaceC7410jz
    public void h(InterfaceC7167iz interfaceC7167iz, float f) {
        q(interfaceC7167iz).p(f);
        k(interfaceC7167iz);
    }

    @Override // o.InterfaceC7410jz
    public void j(InterfaceC7167iz interfaceC7167iz, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C6315fV1 p = p(context, colorStateList, f, f2, f3);
        p.m(interfaceC7167iz.g());
        interfaceC7167iz.c(p);
        k(interfaceC7167iz);
    }

    @Override // o.InterfaceC7410jz
    public void k(InterfaceC7167iz interfaceC7167iz) {
        Rect rect = new Rect();
        q(interfaceC7167iz).h(rect);
        interfaceC7167iz.f((int) Math.ceil(a(interfaceC7167iz)), (int) Math.ceil(g(interfaceC7167iz)));
        interfaceC7167iz.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // o.InterfaceC7410jz
    public float l(InterfaceC7167iz interfaceC7167iz) {
        return q(interfaceC7167iz).l();
    }

    @Override // o.InterfaceC7410jz
    public void m(InterfaceC7167iz interfaceC7167iz, float f) {
        q(interfaceC7167iz).q(f);
        k(interfaceC7167iz);
    }

    @Override // o.InterfaceC7410jz
    public void n() {
        C6315fV1.s = new a();
    }

    @Override // o.InterfaceC7410jz
    public void o(InterfaceC7167iz interfaceC7167iz, ColorStateList colorStateList) {
        q(interfaceC7167iz).o(colorStateList);
    }

    public final C6315fV1 p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C6315fV1(context.getResources(), colorStateList, f, f2, f3);
    }

    public final C6315fV1 q(InterfaceC7167iz interfaceC7167iz) {
        return (C6315fV1) interfaceC7167iz.e();
    }

    @Override // o.InterfaceC7410jz
    public void i(InterfaceC7167iz interfaceC7167iz) {
    }
}
