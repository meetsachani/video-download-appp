package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
import o.OL1;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {
    public static final String f1 = "ListMenuPresenter";
    public static final String g1 = "android:menu:list";
    public Context X;
    public LayoutInflater Y;
    public ExpandedMenuView Y0;
    public e Z;
    public int Z0;
    public int a1;
    public int b1;
    public j.a c1;
    public a d1;
    public int e1;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        public int X = -1;

        public a() {
            a();
        }

        public void a() {
            h y = c.this.Z.y();
            if (y != null) {
                ArrayList<h> C = c.this.Z.C();
                int size = C.size();
                for (int i = 0; i < size; i++) {
                    if (C.get(i) == y) {
                        this.X = i;
                        return;
                    }
                }
            }
            this.X = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public h getItem(int i) {
            ArrayList<h> C = c.this.Z.C();
            int i2 = i + c.this.Z0;
            int i3 = this.X;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return C.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.Z.C().size() - c.this.Z0;
            if (this.X < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.Y.inflate(cVar.b1, viewGroup, false);
            }
            ((k.a) view).g(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i) {
        this(i, 0);
        this.X = context;
        this.Y = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        j.a aVar = this.c1;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    public ListAdapter b() {
        if (this.d1 == null) {
            this.d1 = new a();
        }
        return this.d1;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.c1 = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
        n((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).e(null);
        j.a aVar = this.c1;
        if (aVar != null) {
            aVar.b(mVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public k g(ViewGroup viewGroup) {
        if (this.Y0 == null) {
            this.Y0 = (ExpandedMenuView) this.Y.inflate(OL1.j.n, viewGroup, false);
            if (this.d1 == null) {
                this.d1 = new a();
            }
            this.Y0.setAdapter((ListAdapter) this.d1);
            this.Y0.setOnItemClickListener(this);
        }
        return this.Y0;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.e1;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        if (this.Y0 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        a aVar = this.d1;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        if (this.a1 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.a1);
            this.X = contextThemeWrapper;
            this.Y = LayoutInflater.from(contextThemeWrapper);
        } else if (this.X != null) {
            this.X = context;
            if (this.Y == null) {
                this.Y = LayoutInflater.from(context);
            }
        }
        this.Z = eVar;
        a aVar = this.d1;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public int m() {
        return this.Z0;
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.Y0.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.Y0;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.Z.Q(this.d1.getItem(i), this, 0);
    }

    public void p(int i) {
        this.e1 = i;
    }

    public void q(int i) {
        this.Z0 = i;
        if (this.Y0 != null) {
            i(false);
        }
    }

    public c(int i, int i2) {
        this.b1 = i;
        this.a1 = i2;
    }
}
