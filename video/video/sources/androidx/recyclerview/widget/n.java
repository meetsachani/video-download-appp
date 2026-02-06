package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class n {
    public static final int j = -1;
    public static final int k = 1;
    public static final int l = Integer.MIN_VALUE;
    public static final int m = -1;
    public static final int n = 1;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public boolean a(RecyclerView.D d) {
        int i = this.c;
        if (i >= 0 && i < d.d()) {
            return true;
        }
        return false;
    }

    public View b(RecyclerView.x xVar) {
        View p = xVar.p(this.c);
        this.c += this.d;
        return p;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
