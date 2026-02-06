package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import o.AbstractC9556si1;
import o.JE0;
import o.OL1;

/* loaded from: classes.dex */
public class i implements g {
    public static final int m = 48;
    public final Context a;
    public final e b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public j.a i;
    public AbstractC9556si1 j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.g();
        }
    }

    public i(Context context, e eVar) {
        this(context, eVar, null, false, OL1.b.z2, 0);
    }

    @Override // androidx.appcompat.view.menu.g
    public void a(j.a aVar) {
        this.i = aVar;
        AbstractC9556si1 abstractC9556si1 = this.j;
        if (abstractC9556si1 != null) {
            abstractC9556si1.d(aVar);
        }
    }

    public final AbstractC9556si1 b() {
        AbstractC9556si1 lVar;
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(OL1.e.w)) {
            lVar = new b(this.a, this.f, this.d, this.e, this.c);
        } else {
            lVar = new l(this.a, this.b, this.f, this.d, this.e, this.c);
        }
        lVar.m(this.b);
        lVar.w(this.l);
        lVar.r(this.f);
        lVar.d(this.i);
        lVar.t(this.h);
        lVar.u(this.g);
        return lVar;
    }

    public int c() {
        return this.g;
    }

    public ListView d() {
        return e().p();
    }

    @Override // androidx.appcompat.view.menu.g
    public void dismiss() {
        if (f()) {
            this.j.dismiss();
        }
    }

    public AbstractC9556si1 e() {
        if (this.j == null) {
            this.j = b();
        }
        return this.j;
    }

    public boolean f() {
        AbstractC9556si1 abstractC9556si1 = this.j;
        if (abstractC9556si1 != null && abstractC9556si1.b()) {
            return true;
        }
        return false;
    }

    public void g() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(View view) {
        this.f = view;
    }

    public void i(boolean z) {
        this.h = z;
        AbstractC9556si1 abstractC9556si1 = this.j;
        if (abstractC9556si1 != null) {
            abstractC9556si1.t(z);
        }
    }

    public void j(int i) {
        this.g = i;
    }

    public void k(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void l() {
        if (o()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public void m(int i, int i2) {
        if (p(i, i2)) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final void n(int i, int i2, boolean z, boolean z2) {
        AbstractC9556si1 e = e();
        e.x(z2);
        if (z) {
            if ((JE0.d(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            e.v(i);
            e.y(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e.s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        e.show();
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i, int i2) {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        n(i, i2, true, true);
        return true;
    }

    public i(Context context, e eVar, View view) {
        this(context, eVar, view, false, OL1.b.z2, 0);
    }

    public i(Context context, e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    public i(Context context, e eVar, View view, boolean z, int i, int i2) {
        this.g = JE0.b;
        this.l = new a();
        this.a = context;
        this.b = eVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
