package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: o.si1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9556si1 implements T52, androidx.appcompat.view.menu.j, AdapterView.OnItemClickListener {
    public Rect X;

    public static androidx.appcompat.view.menu.d A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (androidx.appcompat.view.menu.d) listAdapter;
    }

    public static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean z(androidx.appcompat.view.menu.e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public androidx.appcompat.view.menu.k g(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public abstract void m(androidx.appcompat.view.menu.e eVar);

    public boolean n() {
        return true;
    }

    public Rect o() {
        return this.X;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        androidx.appcompat.view.menu.e eVar = A(listAdapter).X;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (n()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        eVar.Q(menuItem, this, i2);
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.X = rect;
    }

    public abstract void t(boolean z);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z);

    public abstract void y(int i);

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.e eVar) {
    }
}
