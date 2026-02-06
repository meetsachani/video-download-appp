package o;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* renamed from: o.ri1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9313ri1 {

    /* renamed from: o.ri1$a */
    /* loaded from: classes.dex */
    public static final class a implements B02<MenuItem> {
        public final /* synthetic */ Menu a;

        public a(Menu menu) {
            this.a = menu;
        }

        @Override // o.B02
        public Iterator<MenuItem> iterator() {
            return C9313ri1.i(this.a);
        }
    }

    /* renamed from: o.ri1$b */
    /* loaded from: classes.dex */
    public static final class b implements Iterator<MenuItem>, JW0 {
        public int X;
        public final /* synthetic */ Menu Y;

        public b(Menu menu) {
            this.Y = menu;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public MenuItem next() {
            Menu menu = this.Y;
            int i = this.X;
            this.X = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            C7458kA2 c7458kA2;
            Menu menu = this.Y;
            int i = this.X - 1;
            this.X = i;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                menu.removeItem(item.getItemId());
                c7458kA2 = C7458kA2.a;
            } else {
                c7458kA2 = null;
            }
            if (c7458kA2 != null) {
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean a(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (C6562gT0.g(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(Menu menu, HA0<? super MenuItem, C7458kA2> ha0) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            ha0.invoke(menu.getItem(i));
        }
    }

    public static final void c(Menu menu, VA0<? super Integer, ? super MenuItem, C7458kA2> va0) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            va0.i(Integer.valueOf(i), menu.getItem(i));
        }
    }

    public static final MenuItem d(Menu menu, int i) {
        return menu.getItem(i);
    }

    public static final B02<MenuItem> e(Menu menu) {
        return new a(menu);
    }

    public static final int f(Menu menu) {
        return menu.size();
    }

    public static final boolean g(Menu menu) {
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(Menu menu) {
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<MenuItem> i(Menu menu) {
        return new b(menu);
    }

    public static final void j(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void k(Menu menu, int i) {
        C7458kA2 c7458kA2;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            c7458kA2 = C7458kA2.a;
        } else {
            c7458kA2 = null;
        }
        if (c7458kA2 != null) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
