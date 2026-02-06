package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import o.BM1;

/* renamed from: o.eD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6000eD0 extends FrameLayout {
    public ViewGroup Y0;
    public boolean Z0;

    /* renamed from: o.eD0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static float a(View view) {
            return view.getZ();
        }
    }

    public C6000eD0(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.Y0 = viewGroup;
        viewGroup.setTag(BM1.a.ghost_view_holder, this);
        this.Y0.getOverlay().add(this);
        this.Z0 = true;
    }

    public static C6000eD0 b(ViewGroup viewGroup) {
        return (C6000eD0) viewGroup.getTag(BM1.a.ghost_view_holder);
    }

    public static void d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (a.a(view) != a.a(view2)) {
            if (a.a(view) <= a.a(view2)) {
                return false;
            }
            return true;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(C8963qH2.a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    public static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    public void a(C6498gD0 c6498gD0) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(c6498gD0.a1, arrayList);
        int c = c(arrayList);
        if (c >= 0 && c < getChildCount()) {
            addView(c6498gD0, c);
        } else {
            addView(c6498gD0);
        }
    }

    public final int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            d(((C6498gD0) getChildAt(i2)).a1, arrayList2);
            if (f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    public void g() {
        if (this.Z0) {
            this.Y0.getOverlay().remove(this);
            this.Y0.getOverlay().add(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.Z0) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.Y0.setTag(BM1.a.ghost_view_holder, null);
            this.Y0.getOverlay().remove(this);
            this.Z0 = false;
        }
    }
}
