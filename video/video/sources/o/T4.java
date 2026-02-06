package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class T4 {
    public Object X;
    public boolean Y;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(T4 t4, Menu menu);

        void b(T4 t4);

        boolean c(T4 t4, MenuItem menuItem);

        boolean d(T4 t4, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.X;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.Y;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.X = obj;
    }

    public abstract void r(int i);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z) {
        this.Y = z;
    }
}
