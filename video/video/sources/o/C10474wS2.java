package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.wS2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10474wS2 {
    public static void a(Context context, ViewGroup viewGroup, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", i, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setStartDelay(500L);
        ofFloat.start();
    }

    public void b(Context context, ViewGroup viewGroup, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", i, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setStartDelay(500L);
        ofFloat.start();
    }
}
