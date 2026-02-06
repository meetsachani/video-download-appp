package o;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import o.C7025iN1;

/* loaded from: classes3.dex */
public class NI2 {
    public static final int[] a = {16843848};

    public static void a(@InterfaceC5670cr1 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(@InterfaceC5670cr1 View view, float f) {
        int integer = view.getResources().getInteger(C7025iN1.i.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, C7025iN1.c.state_liftable, -C7025iN1.c.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(@InterfaceC5670cr1 View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray k = C7608kn2.k(context, attributeSet, a, i, i2, new int[0]);
        try {
            if (k.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, k.getResourceId(0, 0)));
            }
            k.recycle();
        } catch (Throwable th) {
            k.recycle();
            throw th;
        }
    }
}
