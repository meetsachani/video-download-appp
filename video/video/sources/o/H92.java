package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import o.H92;

/* loaded from: classes.dex */
public final class H92 {
    public final c a;

    /* loaded from: classes.dex */
    public static class a extends c {
        public final View a;

        public a(View view) {
            this.a = view;
        }

        public static /* synthetic */ void c(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // o.H92.c
        public void a() {
            View view = this.a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
            }
        }

        @Override // o.H92.c
        public void b() {
            final View view = this.a;
            if (view != null) {
                if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                    view = view.getRootView().findFocus();
                } else {
                    view.requestFocus();
                }
                if (view == null) {
                    view = this.a.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new Runnable() { // from class: o.G92
                        @Override // java.lang.Runnable
                        public final void run() {
                            H92.a.c(view);
                        }
                    });
                }
            }
        }
    }

    public H92(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(view);
        } else {
            this.a = new a(view);
        }
    }

    public void a() {
        this.a.a();
    }

    public void b() {
        this.a.b();
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public View b;
        public WindowInsetsController c;

        public b(View view) {
            super(view);
            this.b = view;
        }

        public static /* synthetic */ void d(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            boolean z;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            atomicBoolean.set(z);
        }

        @Override // o.H92.a, o.H92.c
        public void a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: o.O92
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                        H92.b.d(atomicBoolean, windowInsetsController2, i);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                if (!atomicBoolean.get() && (view = this.b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                ime = WindowInsets.Type.ime();
                windowInsetsController.hide(ime);
                return;
            }
            super.a();
        }

        @Override // o.H92.a, o.H92.c
        public void b() {
            int ime;
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.c = windowInsetsController;
        }
    }

    @Deprecated
    public H92(WindowInsetsController windowInsetsController) {
        this.a = new b(windowInsetsController);
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a() {
        }

        public void b() {
        }
    }
}
