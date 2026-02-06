package o;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.nN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8256nN1 {
    @NotNull
    public static final C8256nN1 a = new C8256nN1();

    /* renamed from: o.nN1$a */
    /* loaded from: classes2.dex */
    public static final class a implements View.OnTouchListener {
        @NotNull
        public final C2532Be0 X;
        @NotNull
        public final WeakReference<View> Y;
        @Nullable
        public final View.OnTouchListener Y0;
        @NotNull
        public final WeakReference<View> Z;
        public boolean Z0;

        public a(@NotNull C2532Be0 c2532Be0, @NotNull View view, @NotNull View view2) {
            C6562gT0.p(c2532Be0, "mapping");
            C6562gT0.p(view, "rootView");
            C6562gT0.p(view2, "hostView");
            this.X = c2532Be0;
            this.Y = new WeakReference<>(view2);
            this.Z = new WeakReference<>(view);
            C9455sH2 c9455sH2 = C9455sH2.a;
            this.Y0 = C9455sH2.h(view2);
            this.Z0 = true;
        }

        public final boolean a() {
            return this.Z0;
        }

        public final void b(boolean z) {
            this.Z0 = z;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            C6562gT0.p(view, C9698tH2.A);
            C6562gT0.p(motionEvent, "motionEvent");
            View view2 = this.Z.get();
            View view3 = this.Y.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                PE pe = PE.a;
                PE.d(this.X, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.Y0;
            if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
                return true;
            }
            return false;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final a a(@NotNull C2532Be0 c2532Be0, @NotNull View view, @NotNull View view2) {
        if (SQ.e(C8256nN1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c2532Be0, "mapping");
            C6562gT0.p(view, "rootView");
            C6562gT0.p(view2, "hostView");
            return new a(c2532Be0, view, view2);
        } catch (Throwable th) {
            SQ.c(th, C8256nN1.class);
            return null;
        }
    }
}
