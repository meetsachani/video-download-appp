package o;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class K9 {
    public static final ViewGroup.MarginLayoutParams b;
    public LinearLayoutManager a;

    /* loaded from: classes.dex */
    public class a implements Comparator<int[]> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public K9(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int V = this.a.V();
        if (V == 0) {
            return true;
        }
        if (this.a.Q2() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, V, 2);
        for (int i3 = 0; i3 < V; i3++) {
            View U = this.a.U(i3);
            if (U != null) {
                ViewGroup.LayoutParams layoutParams = U.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = b;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = U.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = U.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = U.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = U.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new a());
        for (int i4 = 1; i4 < V; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        int i7 = i5 - i6;
        if (i6 <= 0 && iArr[V - 1][1] >= i7) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int V = this.a.V();
        for (int i = 0; i < V; i++) {
            if (c(this.a.U(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        if ((!a() || this.a.V() <= 1) && b()) {
            return true;
        }
        return false;
    }
}
