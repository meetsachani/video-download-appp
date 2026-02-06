package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import o.C2872Ep2;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {
    public static final int[] a1 = {16842964, 16843049};
    public e Y0;
    public int Z0;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(h hVar) {
        return this.Y0.P(hVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(e eVar) {
        this.Y0 = eVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public int getWindowAnimations() {
        return this.Z0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b((h) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, a1, i, 0);
        if (G.C(0)) {
            setBackgroundDrawable(G.h(0));
        }
        if (G.C(1)) {
            setDivider(G.h(1));
        }
        G.I();
    }
}
