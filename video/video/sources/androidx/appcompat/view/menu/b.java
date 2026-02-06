package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC9556si1;
import o.C9799ti1;
import o.InterfaceC8821pi1;
import o.JE0;
import o.OL1;

/* loaded from: classes.dex */
public final class b extends AbstractC9556si1 implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int w1 = OL1.j.l;
    public static final int x1 = 0;
    public static final int y1 = 1;
    public static final int z1 = 200;
    public final Context Y;
    public final int Y0;
    public final int Z;
    public final int Z0;
    public final boolean a1;
    public final Handler b1;
    public View j1;
    public View k1;
    public boolean m1;
    public boolean n1;
    public int o1;
    public int p1;
    public boolean r1;
    public j.a s1;
    public ViewTreeObserver t1;
    public PopupWindow.OnDismissListener u1;
    public boolean v1;
    public final List<androidx.appcompat.view.menu.e> c1 = new ArrayList();
    public final List<d> d1 = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener e1 = new a();
    public final View.OnAttachStateChangeListener f1 = new View$OnAttachStateChangeListenerC0007b();
    public final InterfaceC8821pi1 g1 = new c();
    public int h1 = 0;
    public int i1 = 0;
    public boolean q1 = false;
    public int l1 = F();

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (b.this.b() && b.this.d1.size() > 0 && !b.this.d1.get(0).a.K()) {
                View view = b.this.k1;
                if (view != null && view.isShown()) {
                    for (d dVar : b.this.d1) {
                        dVar.a.show();
                    }
                    return;
                }
                b.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0007b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0007b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.t1;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.t1 = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.t1.removeGlobalOnLayoutListener(bVar.e1);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements InterfaceC8821pi1 {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ d X;
            public final /* synthetic */ MenuItem Y;
            public final /* synthetic */ androidx.appcompat.view.menu.e Z;

            public a(d dVar, MenuItem menuItem, androidx.appcompat.view.menu.e eVar) {
                this.X = dVar;
                this.Y = menuItem;
                this.Z = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.X;
                if (dVar != null) {
                    b.this.v1 = true;
                    dVar.b.f(false);
                    b.this.v1 = false;
                }
                if (this.Y.isEnabled() && this.Y.hasSubMenu()) {
                    this.Z.P(this.Y, 4);
                }
            }
        }

        public c() {
        }

        @Override // o.InterfaceC8821pi1
        public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.b1.removeCallbacksAndMessages(null);
            int size = b.this.d1.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (eVar == b.this.d1.get(i).b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < b.this.d1.size()) {
                dVar = b.this.d1.get(i2);
            }
            b.this.b1.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // o.InterfaceC8821pi1
        public void o(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.this.b1.removeCallbacksAndMessages(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final C9799ti1 a;
        public final androidx.appcompat.view.menu.e b;
        public final int c;

        public d(C9799ti1 c9799ti1, androidx.appcompat.view.menu.e eVar, int i) {
            this.a = c9799ti1;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.p();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.Y = context;
        this.j1 = view;
        this.Y0 = i;
        this.Z0 = i2;
        this.a1 = z;
        Resources resources = context.getResources();
        this.Z = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(OL1.e.x));
        this.b1 = new Handler();
    }

    public final C9799ti1 B() {
        C9799ti1 c9799ti1 = new C9799ti1(this.Y, null, this.Y0, this.Z0);
        c9799ti1.q0(this.g1);
        c9799ti1.e0(this);
        c9799ti1.d0(this);
        c9799ti1.R(this.j1);
        c9799ti1.V(this.i1);
        c9799ti1.c0(true);
        c9799ti1.Z(2);
        return c9799ti1;
    }

    public final int C(androidx.appcompat.view.menu.e eVar) {
        int size = this.d1.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.d1.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    public final MenuItem D(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View E(d dVar, androidx.appcompat.view.menu.e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i;
        int firstVisiblePosition;
        MenuItem D = D(dVar.b, eVar);
        if (D == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 < count) {
                if (D == dVar2.getItem(i2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    public final int F() {
        if (this.j1.getLayoutDirection() != 1) {
            return 1;
        }
        return 0;
    }

    public final int G(int i) {
        List<d> list = this.d1;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.k1.getWindowVisibleDisplayFrame(rect);
        if (this.l1 == 1) {
            if (iArr[0] + a2.getWidth() + i <= rect.right) {
                return 1;
            }
            return 0;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public final void H(androidx.appcompat.view.menu.e eVar) {
        d dVar;
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.Y);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.a1, w1);
        if (!b() && this.q1) {
            dVar2.e(true);
        } else if (b()) {
            dVar2.e(AbstractC9556si1.z(eVar));
        }
        int q = AbstractC9556si1.q(dVar2, null, this.Y, this.Z);
        C9799ti1 B = B();
        B.n(dVar2);
        B.T(q);
        B.V(this.i1);
        if (this.d1.size() > 0) {
            List<d> list = this.d1;
            dVar = list.get(list.size() - 1);
            view = E(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B.r0(false);
            B.o0(null);
            int G = G(q);
            if (G == 1) {
                z = true;
            } else {
                z = false;
            }
            this.l1 = G;
            if (Build.VERSION.SDK_INT >= 26) {
                B.R(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.j1.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.i1 & 7) == 5) {
                    iArr[0] = iArr[0] + this.j1.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.i1 & 5) == 5) {
                if (!z) {
                    q = view.getWidth();
                    i3 = i - q;
                }
                i3 = i + q;
            } else {
                if (z) {
                    q = view.getWidth();
                    i3 = i + q;
                }
                i3 = i - q;
            }
            B.e(i3);
            B.g0(true);
            B.i(i2);
        } else {
            if (this.m1) {
                B.e(this.o1);
            }
            if (this.n1) {
                B.i(this.p1);
            }
            B.W(o());
        }
        this.d1.add(new d(B, eVar, this.l1));
        B.show();
        ListView p = B.p();
        p.setOnKeyListener(this);
        if (dVar == null && this.r1 && eVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(OL1.j.s, (ViewGroup) p, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.A());
            p.addHeaderView(frameLayout, null, false);
            B.show();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        int C = C(eVar);
        if (C >= 0) {
            int i = C + 1;
            if (i < this.d1.size()) {
                this.d1.get(i).b.f(false);
            }
            d remove = this.d1.remove(C);
            remove.b.T(this);
            if (this.v1) {
                remove.a.p0(null);
                remove.a.S(0);
            }
            remove.a.dismiss();
            int size = this.d1.size();
            if (size > 0) {
                this.l1 = this.d1.get(size - 1).c;
            } else {
                this.l1 = F();
            }
            if (size == 0) {
                dismiss();
                j.a aVar = this.s1;
                if (aVar != null) {
                    aVar.a(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.t1;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.t1.removeGlobalOnLayoutListener(this.e1);
                    }
                    this.t1 = null;
                }
                this.k1.removeOnAttachStateChangeListener(this.f1);
                this.u1.onDismiss();
            } else if (z) {
                this.d1.get(0).b.f(false);
            }
        }
    }

    @Override // o.T52
    public boolean b() {
        if (this.d1.size() <= 0 || !this.d1.get(0).a.b()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.s1 = aVar;
    }

    @Override // o.T52
    public void dismiss() {
        int size = this.d1.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.d1.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        for (d dVar : this.d1) {
            if (mVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            m(mVar);
            j.a aVar = this.s1;
            if (aVar != null) {
                aVar.b(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        for (d dVar : this.d1) {
            AbstractC9556si1.A(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC9556si1
    public void m(androidx.appcompat.view.menu.e eVar) {
        eVar.c(this, this.Y);
        if (b()) {
            H(eVar);
        } else {
            this.c1.add(eVar);
        }
    }

    @Override // o.AbstractC9556si1
    public boolean n() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.d1.size();
        int i = 0;
        while (true) {
            if (i < size) {
                dVar = this.d1.get(i);
                if (!dVar.a.b()) {
                    break;
                }
                i++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.b.f(false);
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
        if (this.d1.isEmpty()) {
            return null;
        }
        List<d> list = this.d1;
        return list.get(list.size() - 1).a();
    }

    @Override // o.AbstractC9556si1
    public void r(View view) {
        if (this.j1 != view) {
            this.j1 = view;
            this.i1 = JE0.d(this.h1, view.getLayoutDirection());
        }
    }

    @Override // o.T52
    public void show() {
        boolean z;
        if (!b()) {
            for (androidx.appcompat.view.menu.e eVar : this.c1) {
                H(eVar);
            }
            this.c1.clear();
            View view = this.j1;
            this.k1 = view;
            if (view != null) {
                if (this.t1 == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.t1 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.e1);
                }
                this.k1.addOnAttachStateChangeListener(this.f1);
            }
        }
    }

    @Override // o.AbstractC9556si1
    public void t(boolean z) {
        this.q1 = z;
    }

    @Override // o.AbstractC9556si1
    public void u(int i) {
        if (this.h1 != i) {
            this.h1 = i;
            this.i1 = JE0.d(i, this.j1.getLayoutDirection());
        }
    }

    @Override // o.AbstractC9556si1
    public void v(int i) {
        this.m1 = true;
        this.o1 = i;
    }

    @Override // o.AbstractC9556si1
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.u1 = onDismissListener;
    }

    @Override // o.AbstractC9556si1
    public void x(boolean z) {
        this.r1 = z;
    }

    @Override // o.AbstractC9556si1
    public void y(int i) {
        this.n1 = true;
        this.p1 = i;
    }
}
