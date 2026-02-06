package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.j;
import java.util.Arrays;
import java.util.HashMap;
import o.AbstractC4253Sp2;
import o.C9696tH0;
import o.InterfaceC8961qH0;
import o.UK;
import o.VK;

/* loaded from: classes.dex */
public abstract class b extends View {
    public static final String h1 = "CONSTRAINT_LAYOUT_HELPER_CHILD";
    public int[] Y0;
    public int Z0;
    public Context a1;
    public InterfaceC8961qH0 b1;
    public boolean c1;
    public String d1;
    public String e1;
    public View[] f1;
    public HashMap<Integer, String> g1;

    public b(Context context) {
        super(context);
        this.Y0 = new int[32];
        this.c1 = false;
        this.f1 = null;
        this.g1 = new HashMap<>();
        this.a1 = context;
        z(null);
    }

    public static boolean A(View view) {
        if (h1 == view.getTag()) {
            return true;
        }
        return false;
    }

    public void B(e.a aVar, C9696tH0 c9696tH0, ConstraintLayout.b bVar, SparseArray<UK> sparseArray) {
        e.b bVar2 = aVar.e;
        int[] iArr = bVar2.k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.l0;
            if (str != null) {
                if (str.length() > 0) {
                    e.b bVar3 = aVar.e;
                    bVar3.k0 = u(bVar3.l0);
                } else {
                    aVar.e.k0 = null;
                }
            }
        }
        if (c9696tH0 != null) {
            c9696tH0.c();
            if (aVar.e.k0 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = aVar.e.k0;
                    if (i < iArr2.length) {
                        UK uk = sparseArray.get(iArr2[i]);
                        if (uk != null) {
                            c9696tH0.a(uk);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public int C(View view) {
        int i;
        int id = view.getId();
        int i2 = -1;
        if (id == -1) {
            return -1;
        }
        this.d1 = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.Z0) {
                break;
            } else if (this.Y0[i3] == id) {
                int i4 = i3;
                while (true) {
                    i = this.Z0;
                    if (i4 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.Y0;
                    int i5 = i4 + 1;
                    iArr[i4] = iArr[i5];
                    i4 = i5;
                }
                this.Y0[i - 1] = 0;
                this.Z0 = i - 1;
                i2 = i3;
            } else {
                i3++;
            }
        }
        requestLayout();
        return i2;
    }

    public void E(ConstraintLayout constraintLayout) {
    }

    public void F(ConstraintLayout constraintLayout) {
    }

    public void G(ConstraintLayout constraintLayout) {
    }

    public void H(ConstraintLayout constraintLayout) {
    }

    public void I(ConstraintLayout constraintLayout) {
        String str;
        int v;
        if (isInEditMode()) {
            setIds(this.d1);
        }
        InterfaceC8961qH0 interfaceC8961qH0 = this.b1;
        if (interfaceC8961qH0 == null) {
            return;
        }
        interfaceC8961qH0.c();
        for (int i = 0; i < this.Z0; i++) {
            int i2 = this.Y0[i];
            View w = constraintLayout.w(i2);
            if (w == null && (v = v(constraintLayout, (str = this.g1.get(Integer.valueOf(i2))))) != 0) {
                this.Y0[i] = v;
                this.g1.put(Integer.valueOf(v), str);
                w = constraintLayout.w(v);
            }
            if (w != null) {
                this.b1.a(constraintLayout.x(w));
            }
        }
        this.b1.b(constraintLayout.a1);
    }

    public void J(VK vk, InterfaceC8961qH0 interfaceC8961qH0, SparseArray<UK> sparseArray) {
        interfaceC8961qH0.c();
        for (int i = 0; i < this.Z0; i++) {
            interfaceC8961qH0.a(sparseArray.get(this.Y0[i]));
        }
    }

    public void K() {
        if (this.b1 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).v0 = (UK) this.b1;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.Y0, this.Z0);
    }

    public final void l(String str) {
        if (str != null && str.length() != 0 && this.a1 != null) {
            String trim = str.trim();
            int w = w(trim);
            if (w != 0) {
                this.g1.put(Integer.valueOf(w), trim);
                m(w);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + AbstractC4253Sp2.b.x1);
        }
    }

    public final void m(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.Z0 + 1;
        int[] iArr = this.Y0;
        if (i2 > iArr.length) {
            this.Y0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.Y0;
        int i3 = this.Z0;
        iArr2[i3] = i;
        this.Z0 = i3 + 1;
    }

    public final void n(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.a1 != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        m(childAt.getId());
                    }
                }
            }
        }
    }

    public void o(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else if (view.getParent() == null) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
        } else {
            this.d1 = null;
            m(view.getId());
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.d1;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.e1;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.c1) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p() {
    }

    public void q() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            r((ConstraintLayout) parent);
        }
    }

    public void r(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.Z0; i++) {
            View w = constraintLayout.w(this.Y0[i]);
            if (w != null) {
                w.setVisibility(visibility);
                if (elevation > 0.0f) {
                    w.setTranslationZ(w.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    public void setIds(String str) {
        this.d1 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.Z0 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                l(str.substring(i));
                return;
            } else {
                l(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.e1 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.Z0 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                n(str.substring(i));
                return;
            } else {
                n(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.d1 = null;
        this.Z0 = 0;
        for (int i : iArr) {
            m(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.d1 == null) {
            m(i);
        }
    }

    public boolean t(int i) {
        for (int i2 : this.Y0) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final int[] u(String str) {
        String[] split = str.split(",");
        int[] iArr = new int[split.length];
        int i = 0;
        for (String str2 : split) {
            int w = w(str2.trim());
            if (w != 0) {
                iArr[i] = w;
                i++;
            }
        }
        if (i != split.length) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    public final int v(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.a1.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int w(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object r = constraintLayout.r(0, str);
            if (r instanceof Integer) {
                i = ((Integer) r).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = v(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = j.b.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.a1.getResources().getIdentifier(str, "id", this.a1.getPackageName());
        }
        return i;
    }

    public View[] x(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1;
        if (viewArr == null || viewArr.length != this.Z0) {
            this.f1 = new View[this.Z0];
        }
        for (int i = 0; i < this.Z0; i++) {
            this.f1[i] = constraintLayout.w(this.Y0[i]);
        }
        return this.f1;
    }

    public int y(int i) {
        int i2 = -1;
        for (int i3 : this.Y0) {
            i2++;
            if (i3 == i) {
                return i2;
            }
        }
        return i2;
    }

    public void z(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.r2) {
                    String string = obtainStyledAttributes.getString(index);
                    this.d1 = string;
                    setIds(string);
                } else if (index == j.c.s2) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.e1 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new int[32];
        this.c1 = false;
        this.f1 = null;
        this.g1 = new HashMap<>();
        this.a1 = context;
        z(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = new int[32];
        this.c1 = false;
        this.f1 = null;
        this.g1 = new HashMap<>();
        this.a1 = context;
        z(attributeSet);
    }

    public void D(UK uk, boolean z) {
    }
}
