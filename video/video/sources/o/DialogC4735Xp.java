package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

@Deprecated
/* renamed from: o.Xp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC4735Xp extends Dialog {
    public static final long Y = 250;
    public static final long Z = 150;
    public final View X;

    /* renamed from: o.Xp$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                DialogC4735Xp.super.dismiss();
            }
        }
    }

    public DialogC4735Xp(Context context, View view) {
        super(context);
        this.X = view;
    }

    public final void b(boolean z) {
        float f;
        long j;
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (!z) {
            f2 = 0.0f;
        }
        if (z) {
            j = 250;
        } else {
            j = 150;
        }
        this.X.setScaleX(f);
        this.X.setScaleY(f);
        this.X.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new C9143r01()).setListener(new a(z)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}
