package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ql1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9076ql1 {
    public static final String c = "MotionSpec";
    public final C9654t62<String, C9568sl1> a = new C9654t62<>();
    public final C9654t62<String, PropertyValuesHolder[]> b = new C9654t62<>();

    public static void a(@InterfaceC5670cr1 C9076ql1 c9076ql1, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c9076ql1.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c9076ql1.m(objectAnimator.getPropertyName(), C9568sl1.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @InterfaceC11300zs1
    public static C9076ql1 c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return d(context, resourceId);
        }
        return null;
    }

    @InterfaceC11300zs1
    public static C9076ql1 d(@InterfaceC5670cr1 Context context, @InterfaceC6826ha int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return e(arrayList);
        } catch (Exception e) {
            Log.w(c, "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @InterfaceC5670cr1
    public static C9076ql1 e(@InterfaceC5670cr1 List<Animator> list) {
        C9076ql1 c9076ql1 = new C9076ql1();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(c9076ql1, list.get(i));
        }
        return c9076ql1;
    }

    @InterfaceC5670cr1
    public final PropertyValuesHolder[] b(@InterfaceC5670cr1 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9076ql1)) {
            return false;
        }
        return this.a.equals(((C9076ql1) obj).a);
    }

    @InterfaceC5670cr1
    public <T> ObjectAnimator f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 T t, @InterfaceC5670cr1 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @InterfaceC5670cr1
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public C9568sl1 h(String str) {
        if (k(str)) {
            return this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public long i() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C9568sl1 l = this.a.l(i);
            j = Math.max(j, l.c() + l.d());
        }
        return j;
    }

    public boolean j(String str) {
        if (this.b.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean k(String str) {
        if (this.a.get(str) != null) {
            return true;
        }
        return false;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @InterfaceC11300zs1 C9568sl1 c9568sl1) {
        this.a.put(str, c9568sl1);
    }

    @InterfaceC5670cr1
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
