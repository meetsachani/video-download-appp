package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.ia  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7069ia {
    public static void a(@InterfaceC5670cr1 AnimatorSet animatorSet, @InterfaceC5670cr1 List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
