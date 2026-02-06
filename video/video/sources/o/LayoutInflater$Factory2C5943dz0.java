package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import o.XL1;

/* renamed from: o.dz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C5943dz0 implements LayoutInflater.Factory2 {
    public static final String Y = "FragmentManager";
    public final FragmentManager X;

    public LayoutInflater$Factory2C5943dz0(FragmentManager fragmentManager) {
        this.X = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        androidx.fragment.app.h D;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.X);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, com.facebook.applinks.c.f);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XL1.d.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(XL1.d.b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(XL1.d.c, -1);
            String string = obtainStyledAttributes.getString(XL1.d.d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !androidx.fragment.app.e.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment r0 = resourceId != -1 ? this.X.r0(resourceId) : null;
            if (r0 == null && string != null) {
                r0 = this.X.s0(string);
            }
            if (r0 == null && id != -1) {
                r0 = this.X.r0(id);
            }
            if (r0 == null) {
                r0 = this.X.H0().a(context.getClassLoader(), attributeValue);
                r0.j1 = true;
                r0.s1 = resourceId != 0 ? resourceId : id;
                r0.t1 = id;
                r0.u1 = string;
                r0.k1 = true;
                FragmentManager fragmentManager = this.X;
                r0.o1 = fragmentManager;
                r0.p1 = fragmentManager.K0();
                r0.Z0(this.X.K0().g(), attributeSet, r0.Y);
                D = this.X.n(r0);
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Fragment " + r0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!r0.k1) {
                r0.k1 = true;
                FragmentManager fragmentManager2 = this.X;
                r0.o1 = fragmentManager2;
                r0.p1 = fragmentManager2.K0();
                r0.Z0(this.X.K0().g(), attributeSet, r0.Y);
                D = this.X.D(r0);
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + r0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            C2513Az0.j(r0, viewGroup);
            r0.C1 = viewGroup;
            D.m();
            D.j();
            View view2 = r0.D1;
            if (view2 == null) {
                throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
            }
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (r0.D1.getTag() == null) {
                r0.D1.setTag(string);
            }
            r0.D1.addOnAttachStateChangeListener(new a(D));
            return r0.D1;
        }
        return null;
    }

    /* renamed from: o.dz0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ androidx.fragment.app.h X;

        public a(androidx.fragment.app.h hVar) {
            this.X = hVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k = this.X.k();
            this.X.m();
            androidx.fragment.app.k.r((ViewGroup) k.D1.getParent(), LayoutInflater$Factory2C5943dz0.this.X).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
