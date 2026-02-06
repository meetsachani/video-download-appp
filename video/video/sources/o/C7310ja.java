package o;

import android.animation.Animator;

/* renamed from: o.ja  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7310ja {
    @InterfaceC11300zs1
    public Animator a;

    public void a() {
        Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.a = null;
    }

    public void c(Animator animator) {
        a();
        this.a = animator;
    }
}
