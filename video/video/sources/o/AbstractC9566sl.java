package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: o.sl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9566sl extends ValueAnimator {
    public final Set<ValueAnimator.AnimatorUpdateListener> X = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorListener> Y = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorPauseListener> Z = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.Y.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.Z.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.X.add(animatorUpdateListener);
    }

    public void b() {
        for (Animator.AnimatorListener animatorListener : this.Y) {
            animatorListener.onAnimationCancel(this);
        }
    }

    public void c(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.Y) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void d() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.Z) {
            animatorPauseListener.onAnimationPause(this);
        }
    }

    public void e() {
        for (Animator.AnimatorListener animatorListener : this.Y) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    public void f() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.Z) {
            animatorPauseListener.onAnimationResume(this);
        }
    }

    public void g(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.Y) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void h() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.X) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.Y.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.X.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.Y.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.Z.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.X.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
