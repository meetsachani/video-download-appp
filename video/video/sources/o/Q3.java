package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o.C10861y4;
import o.HL1;

/* loaded from: classes.dex */
public class Q3 {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    public final View.AccessibilityDelegate b;

    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {
        public final Q3 a;

        public a(Q3 q3) {
            this.a = q3;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            D4 b = this.a.b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C10861y4 t2 = C10861y4.t2(accessibilityNodeInfo);
            t2.Y1(C6516gH2.f1(view));
            t2.B1(C6516gH2.S0(view));
            t2.Q1(C6516gH2.L(view));
            t2.e2(C6516gH2.A0(view));
            this.a.g(view, t2);
            t2.f(accessibilityNodeInfo.getText(), view);
            List<C10861y4.a> c = Q3.c(view);
            for (int i = 0; i < c.size(); i++) {
                t2.b(c.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.a.l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    public Q3() {
        this(c);
    }

    public static List<C10861y4.a> c(View view) {
        List<C10861y4.a> list = (List) view.getTag(HL1.e.f0);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public D4 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new D4(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] z = C10861y4.z(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; z != null && i < z.length; i++) {
                if (clickableSpan.equals(z[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, C10861y4 c10861y4) {
        this.a.onInitializeAccessibilityNodeInfo(view, c10861y4.s2());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List<C10861y4.a> c2 = c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c2.size()) {
                break;
            }
            C10861y4.a aVar = c2.get(i2);
            if (aVar.b() == i) {
                z = aVar.d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = this.a.performAccessibilityAction(view, i, bundle);
        }
        if (!z && i == HL1.e.a && bundle != null) {
            return k(bundle.getInt(P3.Y0, -1), view);
        }
        return z;
    }

    public final boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(HL1.e.g0);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (e(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public void l(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public Q3(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }
}
