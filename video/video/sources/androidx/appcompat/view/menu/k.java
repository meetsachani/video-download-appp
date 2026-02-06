package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface k {

    /* loaded from: classes.dex */
    public interface a {
        void d(boolean z, char c);

        void g(h hVar, int i);

        h getItemData();

        boolean r();

        boolean s();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void c(e eVar);

    int getWindowAnimations();
}
