package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {
    public Context X;
    public Context Y;
    public LayoutInflater Y0;
    public e Z;
    public LayoutInflater Z0;
    public j.a a1;
    public int b1;
    public int c1;
    public k d1;
    public int e1;

    public a(Context context, int i, int i2) {
        this.X = context;
        this.Y0 = LayoutInflater.from(context);
        this.b1 = i;
        this.c1 = i2;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        j.a aVar = this.a1;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.a1 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        j.a aVar = this.a1;
        m mVar2 = mVar;
        if (aVar != null) {
            if (mVar == null) {
                mVar2 = this.Z;
            }
            return aVar.b(mVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public k g(ViewGroup viewGroup) {
        if (this.d1 == null) {
            k kVar = (k) this.Y0.inflate(this.b1, viewGroup, false);
            this.d1 = kVar;
            kVar.c(this.Z);
            i(true);
        }
        return this.d1;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.e1;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        h hVar;
        ViewGroup viewGroup = (ViewGroup) this.d1;
        if (viewGroup != null) {
            e eVar = this.Z;
            int i = 0;
            if (eVar != null) {
                eVar.u();
                ArrayList<h> H = this.Z.H();
                int size = H.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    h hVar2 = H.get(i3);
                    if (t(i2, hVar2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View r = r(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            r.setPressed(false);
                            r.jumpDrawablesToCurrentState();
                        }
                        if (r != childAt) {
                            m(r, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!p(viewGroup, i)) {
                    i++;
                }
            }
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
        this.Y = context;
        this.Z0 = LayoutInflater.from(context);
        this.Z = eVar;
    }

    public void m(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.d1).addView(view, i);
    }

    public abstract void n(h hVar, k.a aVar);

    public k.a o(ViewGroup viewGroup) {
        return (k.a) this.Y0.inflate(this.c1, viewGroup, false);
    }

    public boolean p(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public j.a q() {
        return this.a1;
    }

    public View r(h hVar, View view, ViewGroup viewGroup) {
        k.a o2;
        if (view instanceof k.a) {
            o2 = (k.a) view;
        } else {
            o2 = o(viewGroup);
        }
        n(hVar, o2);
        return (View) o2;
    }

    public void s(int i) {
        this.e1 = i;
    }

    public boolean t(int i, h hVar) {
        return true;
    }
}
