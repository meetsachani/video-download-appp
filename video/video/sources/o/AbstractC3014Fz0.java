package o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.Fz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3014Fz0 {

    /* renamed from: o.Fz0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int X;
        public final /* synthetic */ ArrayList Y;
        public final /* synthetic */ ArrayList Y0;
        public final /* synthetic */ ArrayList Z;
        public final /* synthetic */ ArrayList Z0;

        public a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.X = i;
            this.Y = arrayList;
            this.Z = arrayList2;
            this.Y0 = arrayList3;
            this.Z0 = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.X; i++) {
                C6516gH2.E2((View) this.Y.get(i), (String) this.Z.get(i));
                C6516gH2.E2((View) this.Y0.get(i), (String) this.Z0.get(i));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (!g(list, view, size)) {
            if (C6516gH2.C0(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!g(list, childAt, size) && C6516gH2.C0(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean g(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public void h(View view, Rect rect) {
        if (!C6516gH2.T0(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    public ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C6516gH2.C0(view));
            C6516gH2.E2(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view);

    public abstract void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void o(Object obj, View view, ArrayList<View> arrayList);

    public abstract void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void q(Object obj, Rect rect);

    public abstract void r(Object obj, View view);

    public void s(Fragment fragment, Object obj, C10593wy c10593wy, Runnable runnable) {
        runnable.run();
    }

    public void t(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String C0 = C6516gH2.C0(view2);
            arrayList4.add(C0);
            if (C0 != null) {
                C6516gH2.E2(view2, null);
                String str = map.get(C0);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C6516gH2.E2(arrayList2.get(i2), C0);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC10826xv1.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void u(Object obj, View view, ArrayList<View> arrayList);

    public abstract void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object w(Object obj);
}
