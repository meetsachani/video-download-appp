package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import o.T4;

/* renamed from: o.qh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9061qh2 extends ActionMode {
    public final Context a;
    public final T4 b;

    /* renamed from: o.qh2$a */
    /* loaded from: classes.dex */
    public static class a implements T4.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<C9061qh2> c = new ArrayList<>();
        public final C9654t62<Menu, Menu> d = new C9654t62<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // o.T4.a
        public boolean a(T4 t4, Menu menu) {
            return this.a.onCreateActionMode(e(t4), f(menu));
        }

        @Override // o.T4.a
        public void b(T4 t4) {
            this.a.onDestroyActionMode(e(t4));
        }

        @Override // o.T4.a
        public boolean c(T4 t4, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(t4), new MenuItemC9064qi1(this.b, (InterfaceMenuItemC10039uh2) menuItem));
        }

        @Override // o.T4.a
        public boolean d(T4 t4, Menu menu) {
            return this.a.onPrepareActionMode(e(t4), f(menu));
        }

        public ActionMode e(T4 t4) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                C9061qh2 c9061qh2 = this.c.get(i);
                if (c9061qh2 != null && c9061qh2.b == t4) {
                    return c9061qh2;
                }
            }
            C9061qh2 c9061qh22 = new C9061qh2(this.b, t4);
            this.c.add(c9061qh22);
            return c9061qh22;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                MenuC10531wi1 menuC10531wi1 = new MenuC10531wi1(this.b, (InterfaceMenuC9553sh2) menu);
                this.d.put(menu, menuC10531wi1);
                return menuC10531wi1;
            }
            return menu2;
        }
    }

    public C9061qh2(Context context, T4 t4) {
        this.a = context;
        this.b = t4;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC10531wi1(this.a, (InterfaceMenuC9553sh2) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.s(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.t(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.o(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.r(i);
    }
}
