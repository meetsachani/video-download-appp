package o;

import android.widget.ListView;

/* renamed from: o.m11  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7907m11 extends AbstractView$OnTouchListenerC5632ci {
    public final ListView D1;

    public C7907m11(ListView listView) {
        super(listView);
        this.D1 = listView;
    }

    @Override // o.AbstractView$OnTouchListenerC5632ci
    public boolean a(int i) {
        return false;
    }

    @Override // o.AbstractView$OnTouchListenerC5632ci
    public boolean b(int i) {
        ListView listView = this.D1;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o.AbstractView$OnTouchListenerC5632ci
    public void v(int i, int i2) {
        this.D1.scrollListBy(i2);
    }
}
