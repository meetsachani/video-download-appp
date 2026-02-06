package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: o.o9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8441o9 extends Animatable {
    boolean b(a aVar);

    void c(a aVar);

    void clearAnimationCallbacks();

    /* renamed from: o.o9$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public Animatable2.AnimationCallback a;

        /* renamed from: o.o9$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0314a extends Animatable2.AnimationCallback {
            public C0314a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        public Animatable2.AnimationCallback a() {
            if (this.a == null) {
                this.a = new C0314a();
            }
            return this.a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }
}
