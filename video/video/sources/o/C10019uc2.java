package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.uc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10019uc2 {
    public final ArrayList<b> a = new ArrayList<>();
    @InterfaceC11300zs1
    public b b = null;
    @InterfaceC11300zs1
    public ValueAnimator c = null;
    public final Animator.AnimatorListener d = new a();

    /* renamed from: o.uc2$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C10019uc2 c10019uc2 = C10019uc2.this;
            if (c10019uc2.c == animator) {
                c10019uc2.c = null;
            }
        }
    }

    /* renamed from: o.uc2$b */
    /* loaded from: classes3.dex */
    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i < size) {
                bVar = this.a.get(i);
                if (StateSet.stateSetMatches(bVar.a, iArr)) {
                    break;
                }
                i++;
            } else {
                bVar = null;
                break;
            }
        }
        b bVar2 = this.b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.b = bVar;
            if (bVar != null) {
                e(bVar);
            }
        }
    }

    public final void e(@InterfaceC5670cr1 b bVar) {
        ValueAnimator valueAnimator = bVar.b;
        this.c = valueAnimator;
        valueAnimator.start();
    }
}
