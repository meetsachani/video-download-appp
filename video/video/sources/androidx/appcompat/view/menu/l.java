package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import o.AbstractC9556si1;
import o.C9799ti1;
import o.OL1;

/* loaded from: classes.dex */
public final class l extends AbstractC9556si1 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {
    public static final int q1 = OL1.j.t;
    public final Context Y;
    public final d Y0;
    public final e Z;
    public final boolean Z0;
    public final int a1;
    public final int b1;
    public final int c1;
    public final C9799ti1 d1;
    public PopupWindow.OnDismissListener g1;
    public View h1;
    public View i1;
    public j.a j1;
    public ViewTreeObserver k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public boolean p1;
    public final ViewTreeObserver.OnGlobalLayoutListener e1 = new a();
    public final View.OnAttachStateChangeListener f1 = new b();
    public int o1 = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (l.this.b() && !l.this.d1.K()) {
                View view = l.this.i1;
                if (view != null && view.isShown()) {
                    l.this.d1.show();
                } else {
                    l.this.dismiss();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.k1;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.k1 = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.k1.removeGlobalOnLayoutListener(lVar.e1);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.Y = context;
        this.Z = eVar;
        this.Z0 = z;
        this.Y0 = new d(eVar, LayoutInflater.from(context), z, q1);
        this.b1 = i;
        this.c1 = i2;
        Resources resources = context.getResources();
        this.a1 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(OL1.e.x));
        this.h1 = view;
        this.d1 = new C9799ti1(context, null, i, i2);
        eVar.c(this, context);
    }

    public final boolean B() {
        View view;
        boolean z;
        if (b()) {
            return true;
        }
        if (this.l1 || (view = this.h1) == null) {
            return false;
        }
        this.i1 = view;
        this.d1.d0(this);
        this.d1.e0(this);
        this.d1.c0(true);
        View view2 = this.i1;
        if (this.k1 == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.k1 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.e1);
        }
        view2.addOnAttachStateChangeListener(this.f1);
        this.d1.R(view2);
        this.d1.V(this.o1);
        if (!this.m1) {
            this.n1 = AbstractC9556si1.q(this.Y0, null, this.Y, this.a1);
            this.m1 = true;
        }
        this.d1.T(this.n1);
        this.d1.Z(2);
        this.d1.W(o());
        this.d1.show();
        ListView p = this.d1.p();
        p.setOnKeyListener(this);
        if (this.p1 && this.Z.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.Y).inflate(OL1.j.s, (ViewGroup) p, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.Z.A());
            }
            frameLayout.setEnabled(false);
            p.addHeaderView(frameLayout, null, false);
        }
        this.d1.n(this.Y0);
        this.d1.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        if (eVar == this.Z) {
            dismiss();
            j.a aVar = this.j1;
            if (aVar != null) {
                aVar.a(eVar, z);
            }
        }
    }

    @Override // o.T52
    public boolean b() {
        if (!this.l1 && this.d1.b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.j1 = aVar;
    }

    @Override // o.T52
    public void dismiss() {
        if (b()) {
            this.d1.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.Y, mVar, this.i1, this.Z0, this.b1, this.c1);
            iVar.a(this.j1);
            iVar.i(AbstractC9556si1.z(mVar));
            iVar.k(this.g1);
            this.g1 = null;
            this.Z.f(false);
            int c = this.d1.c();
            int l = this.d1.l();
            if ((Gravity.getAbsoluteGravity(this.o1, this.h1.getLayoutDirection()) & 7) == 5) {
                c += this.h1.getWidth();
            }
            if (iVar.p(c, l)) {
                j.a aVar = this.j1;
                if (aVar != null) {
                    aVar.b(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        this.m1 = false;
        d dVar = this.Y0;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC9556si1
    public void m(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.l1 = true;
        this.Z.close();
        ViewTreeObserver viewTreeObserver = this.k1;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.k1 = this.i1.getViewTreeObserver();
            }
            this.k1.removeGlobalOnLayoutListener(this.e1);
            this.k1 = null;
        }
        this.i1.removeOnAttachStateChangeListener(this.f1);
        PopupWindow.OnDismissListener onDismissListener = this.g1;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // o.T52
    public ListView p() {
        return this.d1.p();
    }

    @Override // o.AbstractC9556si1
    public void r(View view) {
        this.h1 = view;
    }

    @Override // o.T52
    public void show() {
        if (B()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // o.AbstractC9556si1
    public void t(boolean z) {
        this.Y0.e(z);
    }

    @Override // o.AbstractC9556si1
    public void u(int i) {
        this.o1 = i;
    }

    @Override // o.AbstractC9556si1
    public void v(int i) {
        this.d1.e(i);
    }

    @Override // o.AbstractC9556si1
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.g1 = onDismissListener;
    }

    @Override // o.AbstractC9556si1
    public void x(boolean z) {
        this.p1 = z;
    }

    @Override // o.AbstractC9556si1
    public void y(int i) {
        this.d1.i(i);
    }
}
