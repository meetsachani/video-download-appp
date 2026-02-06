package o;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class U4 {
    public static final String d = "ActionProvider(support)";
    public final Context a;
    public a b;
    public b c;

    /* loaded from: classes.dex */
    public interface a {
        void b(boolean z);
    }

    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public U4(Context context) {
        this.a = context;
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.c != null && h()) {
            this.c.onActionProviderVisibilityChanged(c());
        }
    }

    public void j() {
        this.c = null;
        this.b = null;
    }

    public void k(a aVar) {
        this.b = aVar;
    }

    public void l(b bVar) {
        if (this.c != null && bVar != null) {
            Log.w(d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = bVar;
    }

    public void m(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    public void g(SubMenu subMenu) {
    }
}
