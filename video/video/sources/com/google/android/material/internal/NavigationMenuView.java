package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements k {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(e eVar) {
    }

    @Override // androidx.appcompat.view.menu.k
    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
