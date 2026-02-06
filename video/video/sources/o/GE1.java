package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
import o.OL1;

/* loaded from: classes.dex */
public class GE1 {
    public final Context a;
    public final androidx.appcompat.view.menu.e b;
    public final View c;
    public final androidx.appcompat.view.menu.i d;
    public e e;
    public d f;
    public View.OnTouchListener g;

    /* loaded from: classes.dex */
    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            GE1 ge1 = GE1.this;
            d dVar = ge1.f;
            if (dVar != null) {
                dVar.a(ge1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractView$OnTouchListenerC8397ny0 {
        public c(View view) {
            super(view);
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public T52 b() {
            return GE1.this.d.e();
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public boolean c() {
            GE1.this.l();
            return true;
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public boolean d() {
            GE1.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(GE1 ge1);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public GE1(Context context, View view) {
        this(context, view, 0);
    }

    public void a() {
        this.d.dismiss();
    }

    public View.OnTouchListener b() {
        if (this.g == null) {
            this.g = new c(this.c);
        }
        return this.g;
    }

    public int c() {
        return this.d.c();
    }

    public Menu d() {
        return this.b;
    }

    public MenuInflater e() {
        return new C9796th2(this.a);
    }

    public ListView f() {
        if (!this.d.f()) {
            return null;
        }
        return this.d.d();
    }

    public void g(int i) {
        e().inflate(i, this.b);
    }

    public void h(boolean z) {
        this.d.i(z);
    }

    public void i(int i) {
        this.d.j(i);
    }

    public void j(d dVar) {
        this.f = dVar;
    }

    public void k(e eVar) {
        this.e = eVar;
    }

    public void l() {
        this.d.l();
    }

    public GE1(Context context, View view, int i) {
        this(context, view, i, OL1.b.z2, 0);
    }

    public GE1(Context context, View view, int i, int i2, int i3) {
        this.a = context;
        this.c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.b = eVar;
        eVar.Y(new a());
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(context, eVar, view, false, i2, i3);
        this.d = iVar;
        iVar.j(i);
        iVar.k(new b());
    }

    /* loaded from: classes.dex */
    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = GE1.this.e;
            if (eVar2 != null) {
                return eVar2.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }
}
