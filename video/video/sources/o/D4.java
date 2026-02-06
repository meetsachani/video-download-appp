package o;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class D4 {
    public static final int b = -1;
    public final Object a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {
        public final D4 a;

        public a(D4 d4) {
            this.a = d4;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C10861y4 b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.s2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C10861y4> c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).s2());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C10861y4 d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.s2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(D4 d4) {
            super(d4);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, C10861y4.t2(accessibilityNodeInfo), str, bundle);
        }
    }

    public D4() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new b(this);
        } else {
            this.a = new a(this);
        }
    }

    public C10861y4 b(int i) {
        return null;
    }

    public List<C10861y4> c(String str, int i) {
        return null;
    }

    public C10861y4 d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public D4(Object obj) {
        this.a = obj;
    }

    public void a(int i, C10861y4 c10861y4, String str, Bundle bundle) {
    }
}
