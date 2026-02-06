package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {
    public e X;
    public int Y = -1;
    public final boolean Y0;
    public boolean Z;
    public final LayoutInflater Z0;
    public final int a1;

    public d(e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.Y0 = z;
        this.Z0 = layoutInflater;
        this.X = eVar;
        this.a1 = i;
        a();
    }

    public void a() {
        h y = this.X.y();
        if (y != null) {
            ArrayList<h> C = this.X.C();
            int size = C.size();
            for (int i = 0; i < size; i++) {
                if (C.get(i) == y) {
                    this.Y = i;
                    return;
                }
            }
        }
        this.Y = -1;
    }

    public e b() {
        return this.X;
    }

    public boolean c() {
        return this.Z;
    }

    @Override // android.widget.Adapter
    /* renamed from: d */
    public h getItem(int i) {
        ArrayList<h> H;
        if (this.Y0) {
            H = this.X.C();
        } else {
            H = this.X.H();
        }
        int i2 = this.Y;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return H.get(i);
    }

    public void e(boolean z) {
        this.Z = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<h> H;
        if (this.Y0) {
            H = this.X.C();
        } else {
            H = this.X.H();
        }
        if (this.Y < 0) {
            return H.size();
        }
        return H.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.Z0.inflate(this.a1, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.X.J() && groupId != i2) {
            z = true;
        } else {
            z = false;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        k.a aVar = (k.a) view;
        if (this.Z) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.g(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
